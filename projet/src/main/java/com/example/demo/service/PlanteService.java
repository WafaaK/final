package com.example.demo.service;

import com.example.demo.Repositories.PlanteRepository;
import com.example.demo.beans.Plante;
import com.example.demo.IDao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlanteService implements IDao<Plante> {
    @Autowired
    private PlanteRepository planteRepository;

    @Override
    public Plante create(Plante plante) {
        return planteRepository.save(plante);
    }

    @Override
    public boolean delete(Plante plante) {
        planteRepository.delete(plante);
        return true;
    }

    @Override
    public Plante update(Plante plante) {
        return planteRepository.save(plante);
    }

    @Override
    public Plante findById(int id) {
        return planteRepository.findById((long) id).orElse(null);
    }

    @Override
    public List<Plante> findAll() {
        return planteRepository.findAll();
    }

    // Ajoutez d'autres méthodes spécifiques au service si nécessaire
}
