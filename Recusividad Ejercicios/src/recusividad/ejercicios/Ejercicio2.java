/*suma los dígitos ingresados por el usuario de un numero de forma recursiva en una
cantidad de veces ingresada por el usuario*/
package recusividad.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public void iniciar(){
    Scanner entrada = new Scanner(System.in);
    System.out.print("Escriba el numero a sumar: ");
    int digito = entrada.nextInt();
    int digitoaux = digito;
    
    System.out.print("Escriba el numero de veces que se sumara: ");
    int n = entrada.nextInt();
    suma(n,digito,digitoaux);
    }
    public void suma(int n, int digito, int digitoaux){
        if (n==1){
            System.out.println(digito);
            System.out.println("numero inicial: "+digitoaux+".");
        } else {
            System.out.println(digito);
            digito=digito + digitoaux;
            suma(n-1,digito,digitoaux);
            }
    }   
}
