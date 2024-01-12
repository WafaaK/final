package com.example.demo.service;

import com.example.demo.repositories.PlantageRepository;
import com.example.demo.beans.Plantage;
import com.example.demo.IDao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlantageService implements IDao<Plantage> {
    @Autowired
    private PlantageRepository plantageRepository;

    @Override
    public Plantage create(Plantage plantage) {
        return plantageRepository.save(plantage);
    }

    @Override
    public boolean delete(Plantage plantage) {
        plantageRepository.delete(plantage);
        return true;
    }

    @Override
    public Plantage update(Plantage plantage) {
        return plantageRepository.save(plantage);
    }

    @Override
    public Plantage findById(int id) {
        return plantageRepository.findById(id).orElse(null);
    }

    @Override
    public List<Plantage> findAll() {
        return plantageRepository.findAll();
    }

}
