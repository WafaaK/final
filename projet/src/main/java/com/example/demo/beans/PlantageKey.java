package com.example.demo.beans;

import java.io.Serializable;
 
import java.sql.Date;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class PlantageKey implements Serializable {

    private Date date;
    private int plantes;

    private int parcelle;
    private int nombre;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlantageKey that = (PlantageKey) o;
        return plantes == that.plantes && parcelle == that.parcelle && nombre == that.nombre && date.equals(that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, plantes, parcelle, nombre);
    }
}