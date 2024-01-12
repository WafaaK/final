package com.example.demo.service;


import com.example.demo.Repositories.ParcelleRepository;
import com.example.demo.beans.Parcelle;
import com.example.demo.IDao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ParcelleService implements IDao<Parcelle> {
    @Autowired
    private ParcelleRepository parcelleRepository;

    @Override
    public Parcelle create(Parcelle parcelle) {
        return parcelleRepository.save(parcelle);
    }

    @Override
    public boolean delete(Parcelle parcelle) {
        parcelleRepository.delete(parcelle);
        return true;
    }

    @Override
    public Parcelle update(Parcelle parcelle) {
        return parcelleRepository.save(parcelle);
    }

    @Override
    public Parcelle findById(int id) {
        return parcelleRepository.findById((long) id).orElse(null);
    }

    @Override
    public List<Parcelle> findAll() {
        return parcelleRepository.findAll();
    }

    // Ajoutez d'autres méthodes spécifiques au service si nécessaire
}
