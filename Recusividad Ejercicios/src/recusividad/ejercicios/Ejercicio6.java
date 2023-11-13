
package recusividad.ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
       public void iniciar() {
        Scanner entrada = new Scanner(System.in);
        String[] ciudades = new String[10];

        System.out.println("Ingrese 10 nombres de ciudades:");
        for (int i = 0; i < ciudades.length; i++) {
            System.out.print("Ciudad " + (i + 1) + ": ");
            ciudades[i] = entrada.nextLine();
        }

        System.out.println("\nCiudades en orden inverso:");
        CiudadesInvertido(ciudades, ciudades.length - 1);
    }

    public void CiudadesInvertido(String[] ciudades, int indice) {
        if (indice >= 0) {
            System.out.println(ciudades[indice]);
            CiudadesInvertido(ciudades, indice - 1);
        }
    }
}
