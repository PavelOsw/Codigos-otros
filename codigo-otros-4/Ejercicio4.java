package com.generation;

// Implementación de librería scanner
import java.util.Scanner;

public class Codigo4 {
  // Función Main no existía
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in); // Faltaba el argumento System.in para capturar ingreso de datos
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    // Modificacion en el mensaje de salida para jugador 2
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    // Instanciamiento de s2 no necesario 
    String j2 = s.nextLine();
    // Cierre de scanner
    s.close();
    
    // Cambio de expreesión por equals para comparaciones 
    if (j1.equals(j2)) { 
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
        // Cambiamos signo por igualdad y no comparación
          if (j2.equals("tijeras")) 
            g = 1;
        case "papel":
        // Cambiamos signo por igualdad y no comparación
          if (j2.equals("piedra"))
            g = 1;
        case "tijera":
          if (j2.equals("papel"))
            g = 1;
          break;
        default:
          } // Correción de identación
        System.out.println("Gana el jugador " + g);
      } // Correción de identación
  } // Faltaba llave de cierre para función Main
}