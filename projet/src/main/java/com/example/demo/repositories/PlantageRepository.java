package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.beans.Plantage;

@Repository
public interface PlantageRepository extends JpaRepository<Plantage, Integer> {
   
}
