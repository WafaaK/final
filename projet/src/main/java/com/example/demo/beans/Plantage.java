package com.example.demo.beans;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Plantage {

	@EmbeddedId
	private PlanteServicePK pk;

	@ManyToOne
	@JsonIgnore
	private Parcelle parcelle;

	@ManyToOne
	@JoinColumn(name="plante_id", nullable=true)
	private Plante plante;


	public PlanteServicePK getPk() {
		return pk;
	}

	public void setPk(PlanteServicePK pk) {
		this.pk = pk;
	}
}

