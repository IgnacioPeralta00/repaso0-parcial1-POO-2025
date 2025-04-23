package com.abc;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Crimen y Castigo", "Fiodor Dostoyevsky", 345);
        Libro libro2 = new Libro("Rayuela", "Julio Cortazar", 958);
        Libro libro3 = new Libro("El extranjero", "Albert Camus", 173);
        Estante estante1 = new Estante();
        estante1.agregarLibro(libro1);
        estante1.agregarLibro(libro2);
        estante1.agregarLibro(libro3);
        estante1.mostrarLibros();
        Libro libroBuscado = estante1.buscarLibro(520);
        if (libroBuscado != null) {
            System.out.println(libroBuscado.getTitulo());
        } else {
            System.out.println("No se encontro libro");
        }

    }
}
