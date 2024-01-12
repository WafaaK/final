package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository; 

import org.springframework.stereotype.Repository;

import com.example.demo.beans.Ferme;

@Repository
public interface FermeRepository extends JpaRepository<Ferme, Long> {
    List<Ferme> findByUserId(long userId); 
}
