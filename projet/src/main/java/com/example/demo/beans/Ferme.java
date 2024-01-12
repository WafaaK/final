package com.example.demo.beans;

import java.sql.Blob; 
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Ferme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY	)
	private long id;
	private String libelle;
	
    @Column(name = "photo")
	private Blob image;
	
	@OneToMany
	@JoinColumn(name="ferme_id", nullable = true)
	private List<Parcelle> parcelles;

	@ManyToOne
	@JsonIgnore
	private AppUser user;
	
	public boolean equals(Ferme e) {
		 
        if (e.getId() == this.getId()) {
            return true;
        }
		return false;
    }
}

