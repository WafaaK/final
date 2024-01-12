package com.example.demo.beans;

import java.util.List; 


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Parcelle {
    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String libelle;

    @Column(nullable = true)
    private float superficie;

    @Lob
    @Column(name = "photo", nullable = true)
    private String image;


    @OneToMany
    @JoinColumn(name="parcelle_id", nullable = true)
    List<Plantage> plantages;

    @ManyToOne
    @JsonIgnore
    Ferme ferme;
}