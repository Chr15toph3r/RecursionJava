/*Dada una cadena 'JAVA' tenemos que invertirla para que la cadena resultante 
sea 'AVAJ'.*/
package recusividad.ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public void iniciar() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba la cadena a invertir: ");
        String cadena = entrada.nextLine();
        
        StringBuilder cadenaInvertida = new StringBuilder();
        invertirCadena(cadena, cadena.length() - 1, cadenaInvertida);
        System.out.println("Cadena invertida: " + cadenaInvertida);
    }

    private void invertirCadena(String cadena, int indice, StringBuilder cadenaInvertida) {
        if (indice >= 0) {
            cadenaInvertida.append(cadena.charAt(indice));
            invertirCadena(cadena, indice - 1, cadenaInvertida);
        }
    }
}
