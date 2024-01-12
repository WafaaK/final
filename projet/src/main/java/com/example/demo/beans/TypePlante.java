package com.example.demo.beans;

import java.util.List; 

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity  @Data @NoArgsConstructor @AllArgsConstructor
public class TypePlante {

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private float humiditeMax;
	private float humiditeMin;
	private float temperature;
	private float luminosite;

	@OneToMany
	@JoinColumn(name="type_plante_id", nullable = true)
	private List<Plante> plantes;
	
}
