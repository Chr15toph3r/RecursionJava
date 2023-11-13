/*
Algoritmo recursivo que encuentre la serie Fibonacci, mostrando por pantalla todos los
procesos necesarios para la Fibonacci
 */
package recusividad.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public void iniciar() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba el numero para calcular su Fibonacci: ");
        int n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i)+" ");
        }
    }
    private int fibonacci(int n) {
        if (n <= 1) {
            return n;
            
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}