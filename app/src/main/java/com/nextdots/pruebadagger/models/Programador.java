package com.nextdots.pruebadagger.models;

/**
 * Created by Ale on 28/02/2017.
 */
public class Programador {
    String nombre;

    public Programador(String nombre) {
        this.nombre = nombre;
    }

    public Programador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
