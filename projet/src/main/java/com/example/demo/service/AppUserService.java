package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Repositories.AppUserRepository;
import com.example.demo.beans.AppUser;
import com.example.demo.IDao.IDao;

@Component
public class AppUserService implements IDao<AppUser> {
    @Autowired
    private AppUserRepository repository1;

    @Override
    public AppUser create(AppUser user) {
        return repository1.save(user);
    }

    @Override
    public boolean delete(AppUser user) {
        repository1.delete(user);
        return true;
    }

    @Override
    public AppUser update(AppUser user) {
        return repository1.save(user);
    }

    @Override
    public AppUser findById(int id) {
        return repository1.findById((long) id).orElse(null);
    }

    @Override
    public List<AppUser> findAll() {
        return repository1.findAll();
    }

    // Ajoutez d'autres méthodes spécifiques au service si nécessaire
}
