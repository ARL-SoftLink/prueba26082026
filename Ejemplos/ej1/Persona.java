package Ejemplos.ej1;

public class Persona {
    String nombre;
    int edad;
    public Persona(String nombre) {
    this.nombre = nombre;
    }
    public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
    }
    public void saludar() {
    System.out.println("Hola, soy " + nombre);
    }

}
