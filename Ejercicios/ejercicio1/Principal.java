package Ejercicios.ejercicio1;

public class Principal {
    public static void main(String[] args) {
         // Instanciar un objeto Libro usando new y el constructor
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez");
        // Imprimir los atributos
        System.out.println("Título: " + libro.titulo);
        System.out.println("Autor: " + libro.autor);
    }
}