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

    // Métodos propios
    // Metodo que agrega un libro a un estante
    public void agregarLibro(Libro libro) {
        getLibros().add(libro); // Obtenemos la lista y agregamos el libro
        System.out.println("Libro" + libro.getTitulo() + "agregado");
    }
}
