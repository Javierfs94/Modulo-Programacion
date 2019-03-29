package tema9programacionorientadaaobjetos.ficheros;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * <p>
 * Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
 * fichero. Tanto el nombre del fichero como la palabra se deben pasar como
 * argumentos en la línea de comandos.
 * </p>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class Ejercicio6 {

  public static void main(String[] args) {
    
    try {
      BufferedReader br = new BufferedReader(new FileReader(args[0] + ".txt"));
      String linea = "";
      String palabraDeseada = "" + args[1]; // Palabra la cual queremos buscar en el fichero
      int coincidencias = 0; // Numero de veces que se encuentra la palabra
      while (linea != null) {
        linea = br.readLine();
        String[] palabras = linea.split(" "); // Separa las palabras separadas por espacios y las almacena en un array
                                              // de string
        for (String x : palabras) { // Recorre el array y si coincide con la palabra deseada, aumenta el contador
          if (x.equals(palabraDeseada)) {
            coincidencias++;
          }
        }
      }

      System.out.println("La palabra " + palabraDeseada + " se ha encontrado " + coincidencias + " veces.");
      System.out.println("Programa terminado");
      br.close(); // Cierre de archivo
    } catch (Exception e) {
      System.err.println("Error, no se ha podido encontrar esas coincidencias.");
    }

  }
}
