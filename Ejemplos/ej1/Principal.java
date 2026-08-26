package Ejemplos.ej1;

public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p = new Persona("Ana");
        p.edad = 25;
        p.saludar();
        System.out.println("Edad: " + p.edad);
    }
}
