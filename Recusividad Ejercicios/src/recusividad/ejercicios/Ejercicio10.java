/*
Escriba una función recursiva que sume una N cantidad de números ingresados por el
usuario, debe sumar por separado los positivos y negativos, luego de realizar la suma debe
mostrar cuantos de ellos eran pares e impares.
 */
package recusividad.ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public void iniciar(){
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Calcular factorial.");
            System.out.println("2 - Realizar Potenciacion.");
            System.out.println("3 - Salir.");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    calcularFactorial(entrada);
                    break;
                case 2:
                    potenciacion(entrada);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no válida.");
            }
        } while (opcion != 3);
    }

    private static void calcularFactorial(Scanner entrada) {
        System.out.print("Ingrese un número para calcular su factorial: ");
        int n = entrada.nextInt();
        int resultado = factorial(n);
        System.out.println("El factorial de " + n + " es: " + resultado);
    }

    private static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    private static void potenciacion(Scanner entrada) {
        System.out.print("Ingrese la base: ");
        int base = entrada.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente = entrada.nextInt();
        int resultado = potencia(base, exponente);
        System.out.println(base + " elevado a " + exponente + " es: " + resultado);
    }

    private static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }
}

