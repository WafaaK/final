package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.beans.Parcelle;

@Repository
public interface ParcelleRepository extends JpaRepository<Parcelle, Long> {
 
}