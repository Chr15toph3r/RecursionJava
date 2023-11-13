/*
Crea un programa donde se pida en el principal la tabla de multiplicar deseada, en un
método recursivo generar la tabla de multiplicar. Se multiplicará hasta querer llegar al
número 12 como resultado. El formato de salida es el siguiente:
5 x 1 = 5
5 x 2 = 10 
 */
package recusividad.ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public void iniciar() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero y se mostrara su tabla correspondiente.\nNumero a ingresar: ");
        int numero = entrada.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");
        TablaDeMultiplicar(numero, 1);
    }

    private void TablaDeMultiplicar(int numero, int multiplicador) {
        if (multiplicador <= 12) {
            System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
            TablaDeMultiplicar(numero, multiplicador + 1);
        }
    }
}
