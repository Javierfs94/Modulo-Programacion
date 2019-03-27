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

    String ruta = "C:\\Users\\d18frsej2\\eclipse-workspace\\PGNJava\\src\\tema9programacionorientadaaobjetos\\ficheros\\primos.txt";

    try {
      BufferedReader br = new BufferedReader(new FileReader(ruta));

      leerLineas(br);

      br.close();

    } catch (FileNotFoundException fnfe) {
      System.err.println("No se encuentra el fichero primos.dat");
    } catch (IOException ioe) {
      System.err.println("No se puede leer el fichero primos.dat");
    }
  }

  /**
   * Lee las líneas del archivo
   * 
   * @param br
   * @throws IOException
   */
  public static void leerLineas(BufferedReader br) throws IOException {
    String linea = "";

    while (linea != null) {
      System.out.println(linea);
      linea = br.readLine();
    }

  }

}
