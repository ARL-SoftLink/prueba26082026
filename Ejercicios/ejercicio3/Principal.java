package Ejercicios.ejercicio3;

public class Principal {
   public static void main(String[] args) {
        //Crear tres contadores distintos
        ejercicio3 c1 = new ejercicio3();
        ejercicio3 c2 = new ejercicio3();
        ejercicio3 c3 = new ejercicio3();

        // Incrementar cada uno un número diferente de veces
        c1.incrementar();       // c1 = 1
        c1.incrementar();       // c1 = 2
        c2.incrementar();       // c2 = 1
        c3.incrementar();       // c3 = 1
        c3.incrementar();       // c3 = 2
        c3.incrementar();       // c3 = 3

        // Mostrar valores (cada objeto mantiene su estado)
        System.out.println("c1: " + c1.valor);
        System.out.println("c2: " + c2.valor);
        System.out.println("c3: " + c3.valor);
    } 
}
