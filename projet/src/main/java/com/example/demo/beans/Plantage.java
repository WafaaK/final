package com.example.demo.beans;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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

