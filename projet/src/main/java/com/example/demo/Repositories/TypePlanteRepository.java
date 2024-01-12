package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.beans.TypePlante;

@Repository
public interface TypePlanteRepository extends JpaRepository<TypePlante, Integer> {
    
}
