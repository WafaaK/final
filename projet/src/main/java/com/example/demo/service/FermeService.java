package com.example.demo.service;

import com.example.demo.Repositories.FermeRepository;
import com.example.demo.beans.Ferme;
import com.example.demo.IDao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FermeService implements IDao<Ferme> {
    @Autowired
    private FermeRepository fermeRepository;

    @Override
    public Ferme create(Ferme ferme) {
        return fermeRepository.save(ferme);
    }

    @Override
    public boolean delete(Ferme ferme) {
        fermeRepository.delete(ferme);
        return true;
    }

    @Override
    public Ferme update(Ferme ferme) {
        return fermeRepository.save(ferme);
    }

    @Override
    public Ferme findById(int id) {
        return fermeRepository.findById((long) id).orElse(null);
    }

    @Override
    public List<Ferme> findAll() {
        return fermeRepository.findAll();
    }

    
}
