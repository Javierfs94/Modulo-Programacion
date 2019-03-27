package tema9programacionorientadaaobjetos.ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * <p>
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que
 * muestre los números por pantalla.
 * </p>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class Ejercicio2 {

  public static void main(String[] args) {

    try {
      BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
      String linea = "";
      while (linea != null) {
        System.out.println(linea);
        linea = br.readLine();
      }
      br.close();
    } catch (FileNotFoundException fnfe) {
      System.err.println("No se encuentra el fichero primos.dat");
    } catch (IOException ioe) {
      System.err.println("No se puede leer el fichero primos.dat");
    }
  }

}
