// Explicación: El programa pregunta al usuario el nombre de un país, si este se encuentra listado dentro le mostrará el nombre de su capital,
// en caso contrario, preguntará al usuario el nombre de la capital del país que ingreso, posteriormente guarda la nueva información en 
// la lista para una nueva consulta futura. El proceso termina hasta que el usuario escriba salir y no el nombre de otro país.

import java.util.Scanner; // Añadimos las librerías necesarias (Scanner para la captura de entradas 
import java.util.HashMap; // y HasMap para crear una estructura de datos)

public class Codigo7 {
    public static void main(String[] args) { // Se integró la clase principal para el funcionamiento del programa

      Scanner s = new Scanner(System.in); // Se especifica la entrada del scanner con System.in

      HashMap<String, String> capitales = new HashMap<>(); // Se corrige el nombre de la variable y se especifica el tipo de la clave y el valor

      capitales.put("Canadá", "Ottawa");
      capitales.put("Estados Unidos", "Washington DC");
      capitales.put("México", "CDMX"); // Cambiamos México DF por CDMX
      capitales.put("Belice", "Belmopán");
      capitales.put("Costa Rica", "San José");
      capitales.put("El Salvador", "San Salvador"); // Se corrige la inserción de la capital de El Salvador
      capitales.put("Guatemala", "Ciudad de Guatemala");
      capitales.put("Honduras", "Tegucigalpa");
      capitales.put("Nicaragua", "Managua");
      capitales.put("Panamá", "Panamá");

      String c = "";

      do {
          System.out.print("Escribe el nombre de un país y te diré su capital: ");
          c = s.nextLine();

          if (!c.equals("salir")) {
              if (capitales.containsKey(c)) { // Se utiliza el método containsKey para verificar si la clave existe en el HashMap
                  System.out.print("La capital de " + c);
                  System.out.println(" es " + capitales.get(c)); // Se utiliza el método get para obtener el valor correspondiente a la clave
              } else {
                  System.out.print("No conozco la respuesta ");
                  System.out.print("¿cuál es la capital de " + c + "?: ");
                  String ca = s.nextLine();
                  capitales.put(c, ca); // Se utiliza la clave c para agregar la capital al HashMap
                  System.out.println("Gracias por enseñarme nuevas capitales");
              }
            }
          } while (!c.equals("salir"));
          System.out.print("Gracias, nos vemos pronto"); // Añadí mensaje de despedida
      s.close(); // Cerrar el Scanner cuando no se necesite más
  }
}