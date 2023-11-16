package com.example.IntArtVerbos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="verbo")
public class verbo extends word {
    protected String terminacion;

    public String getTerminacion() {
        return terminacion;
    }

    public void setTerminacion(String terminacion) {
        this.terminacion = terminacion;
    }
    

    public verbo() {
    }

    public verbo(String word) {
        super(word);
    }
    
}
