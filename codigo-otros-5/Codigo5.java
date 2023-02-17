//package com.generation;

// Importación de librería scanner
import java.util.Scanner;


public class Codigo5 {

	// Se agrega la clase Main como el principal método de entrada
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Se especifica la entrada del scanner con system.in

        // Cierre con comilla simple corregido, el mensaje abre y cierra con comillas dobles
        System.out.print("Introduzca un número: ");
        String numStr = s.nextLine();
        // Cambio de nombre de variable tipo Int
        int num = Integer.parseInt(numStr);

        int afortunado = 0; // variable afortunado corregida para legibilidad
        int noAfortunado = 0; // variable noAfortunado corregida para legibilidad

        while (num > 0) {
            int digito = num % 10;
            if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
            	afortunado++;
            } else {
            	noAfortunado++;
            }
            num /= 10;
        }

        if (afortunado > noAfortunado)
            System.out.println("El " + numStr + " es un número afortunado.");
        else
            System.out.println("El " + numStr + " no es un número afortunado.");

        s.close(); // Cerrar el Scanner cuando no se necesite más
    }
}
