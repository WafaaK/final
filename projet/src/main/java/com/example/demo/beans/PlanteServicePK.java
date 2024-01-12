package com.example.demo.beans;

import java.io.Serializable; 
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class PlanteServicePK implements Serializable {

    private String date;

    private int parcelle;

    private int plante;

    private int nombre;





    public PlanteServicePK() {
    }

    public PlanteServicePK(String date, int parcelle, int plante, int nombre) {
        this.date = date;
        this.parcelle = parcelle;
        this.plante = plante;
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlanteServicePK that = (PlanteServicePK) o;
        return parcelle == that.parcelle && plante == that.plante && nombre == that.nombre && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, parcelle, plante, nombre);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getParcelle() {
        return parcelle;
    }

    public void setParcelle(int parcelle) {
        this.parcelle = parcelle;
    }

    public int getPlante() {
        return plante;
    }

    public void setPlante(int plante) {
        this.plante = plante;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
}
