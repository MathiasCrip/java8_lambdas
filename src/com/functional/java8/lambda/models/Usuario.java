package com.functional.java8.lambda.models;

import java.util.Objects;

/*Clase usuario con solo un atributo de tipo String, sus metodos getter y setter y sobreescribimos el equals y hashcode
 * para comparar por atributos*/
public class Usuario {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombre, usuario.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
