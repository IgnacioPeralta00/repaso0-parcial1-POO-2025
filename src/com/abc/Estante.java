package com.abc;

import java.util.ArrayList;
import java.util.List;

public class Estante {
    private List<Libro> libros;

    public Estante() {
        this.libros = new ArrayList<>();
    }

    // Getters & setters
    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
