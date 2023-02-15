package com.generation;

// Implementación de librería scanner
import java.util.Scanner;

public class Codigo4 {

    Scanner s = new Scanner(System.in); // Faltaba el argumento System.in para capturar ingreso de datos
    
    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    // Modificacion en el mensaje de salida para jugador 2
    System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    // Nombre de variable s cambiada a s2
    Scanner s2 = new Scanner(System.in);
    String j2 = s2.nextLine();
    
    // Parentesis extra e igualación 
    if (j1 === j2) { 
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
          }

        case "papel":
          if (j2 == "piedra") {
            g = 1;
          
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
          } // Correción de identación
        System.out.println("Gana el jugador " + g);
      } // Correción de identación
  } // Faltaba llave de cierre para clase Codigo4
}