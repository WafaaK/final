package com.example.demo.Controllers;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repositories.AppUserRepository;
import com.example.demo.beans.AppUser;

@RestController
@RequestMapping("/api/users")
public class AppUserController {

    @Autowired
    private AppUser userService;

    @GetMapping
    public List<AppUser> getAllUsers() {
        return userService.findAll();
    }

    @PostMapping
    public AppUser createUser(@RequestBody AppUser user) {
        user.setId(0);
        return userService.create(user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getUserById(@PathVariable long id) {
        AppUser user = userService.findById(id);
        if (user == null) {
            return new ResponseEntity<>("Utilisateur avec ID = " + id + " n'existe pas", HttpStatus.BAD_REQUEST);
        } else {
            return ResponseEntity.ok(user);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable long id, @RequestBody AppUser newUser) {
        AppUser oldUser = userService.findById(id);
        if (oldUser == null) {
            return new ResponseEntity<>("Utilisateur avec ID = " + id + " n'existe pas", HttpStatus.BAD_REQUEST);
        } else {
            newUser.setId(id);
            return ResponseEntity.ok(userService.update(newUser));
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable long id) {
        AppUser user = userService.findById(id);
        if (user == null) {
            return new ResponseEntity<>("Utilisateur avec ID = " + id + " n'existe pas", HttpStatus.BAD_REQUEST);
        } else {
            userService.delete(user);
            return ResponseEntity.ok("Utilisateur supprimé");
        }
    }
}