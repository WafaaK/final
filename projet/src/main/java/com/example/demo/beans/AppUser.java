package com.example.demo.beans;

import java.sql.Blob; 
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String username;
	private String address;
	private String phone;
	private String email;
	private String password;
	private Blob image;
	private String role = "agriculture";
	
	@OneToMany
	@JoinColumn(name="user_id", nullable = true)
	private List<Ferme> listeFerme;
	
	
	
}
