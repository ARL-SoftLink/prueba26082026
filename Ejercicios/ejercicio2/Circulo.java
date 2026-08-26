package Ejercicios.ejercicio2;

public class Circulo {
    double radio;               // atributo radio

    // Constructor que recibe el radio
    public Circulo(double radio) {
        this.radio = radio;     // asignar al atributo
    }

    // Método que calcula el área
    public double area() {
        return Math.PI * radio * radio;   // π * r²
    }
}
