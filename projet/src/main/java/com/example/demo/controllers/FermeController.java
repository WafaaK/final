package com.example.demo.controllers;

import com.example.demo.beans.Ferme;
import com.example.demo.repositories.FermeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fermes")
public class FermeController {

    @Autowired
    private FermeRepository fermeRepository;

    @GetMapping
    public List<Ferme> getAllFermes() {
        return fermeRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ferme> getFermeById(@PathVariable Long id) {
        Ferme ferme = fermeRepository.findById(id).orElse(null);
        if (ferme == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(ferme);
    }

    @PostMapping
    public ResponseEntity<Ferme> createFerme(@RequestBody Ferme ferme) {
        Ferme createdFerme = fermeRepository.save(ferme);
        return ResponseEntity.ok(createdFerme);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ferme> updateFerme(@PathVariable Long id, @RequestBody Ferme updatedFerme) {
        Ferme existingFerme = fermeRepository.findById(id).orElse(null);
        if (existingFerme == null) {
            return ResponseEntity.notFound().build();
        }

        existingFerme.setLibelle(updatedFerme.getLibelle());
        existingFerme.setImage(updatedFerme.getImage()); 
      

        Ferme savedFerme = fermeRepository.save(existingFerme);
        return ResponseEntity.ok(savedFerme);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFerme(@PathVariable Long id) {
        Ferme ferme = fermeRepository.findById(id).orElse(null);
        if (ferme == null) {
            return ResponseEntity.notFound().build();
        }

        fermeRepository.delete(ferme);
        return ResponseEntity.noContent().build();
    }
}
