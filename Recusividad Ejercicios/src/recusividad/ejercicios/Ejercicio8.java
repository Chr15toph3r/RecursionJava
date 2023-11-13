/*
) Verifique si un número es un palíndromo usando recursividad
o Un palíndromo es una secuencia que es igual cuando la leemos de izquierda a
derecha o de derecha a izquierda.

o Dado un número 121, vemos que cuando lo leemos de izquierda a derecha y de
derecha a izquierda, es igual. Por lo tanto, el número 121 es un palíndromo.

o Tomemos otro número, 1242. Cuando lo leemos de izquierda a derecha es 1242 y
cuando lo leemos de derecha a izquierda se lee como 2421. Por lo tanto, esto no
es un palíndromo.
 */
package recusividad.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public void iniciar() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Verificador de palindromos, ingrese un numero: ");
        int numero = entrada.nextInt();

        String numeroComoCadena = String.valueOf(numero);
        boolean esPalindromo = verificarPalindromo(numeroComoCadena, 0, numeroComoCadena.length() - 1);
        
        if (esPalindromo) {
            System.out.println("El numero: "+numero + " es un palindromo.");
        } else {
            System.out.println("El numero: "+numero + " no es un palindromo.");
        }
    }

    private boolean verificarPalindromo(String cadena, int inicio, int fin) {
        if (inicio >= fin) {
            return true;
        }
        if (cadena.charAt(inicio) != cadena.charAt(fin)) {
            return false;
        }
        return verificarPalindromo(cadena, inicio + 1, fin - 1);
    }
 }

