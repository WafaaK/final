package com.example.demo.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.beans.Plante;

@Repository
public interface PlanteRepository extends JpaRepository<Plante, Long> {

}
