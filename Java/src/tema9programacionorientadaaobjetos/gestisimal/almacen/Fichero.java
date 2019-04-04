package tema9programacionorientadaaobjetos.gestisimal.almacen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * <p>
 * Gestiona el tratamiento de ficheros del almacén
 * </p>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class Fichero {

  static String ruta = "C:\\Users\\d18frsej2\\eclipse-workspace\\PGNJava\\src\\tema9programacionorientadaaobjetos\\gestisimal\\";

  /**
   * Lee un fichero
   * 
   * @param ruta
   */
  public static void leerFichero(String fichero) {
    try {
      BufferedReader leer = new BufferedReader(new FileReader(ruta + fichero + ".txt"));
      String linea = "";
      while (linea != null) {
        System.out.println(linea);
        linea = leer.readLine();
      }
      leer.close();

    } catch (FileNotFoundException fnfe) {
      System.err.println("No se encuentra el fichero");
    } catch (IOException ioe) {
      System.err.println("No se puede leer el fichero");
    }
  }

  /**
   * Escribe un fichero
   * 
   * @param ruta
   */
  public static void escribirFichero(String fichero, Almacen almacen) {
    try {
      BufferedWriter escribir = new BufferedWriter(new FileWriter(ruta + fichero + ".txt"));
      escribir.write(almacen.toString());
      System.out.println("Archivo guardado con éxito");
      escribir.close();
    } catch (Exception e) {
      System.err.println("No se ha podido escribir el archivo");
    }
  }

  /**
   * Comprueba si existe el fichero
   * 
   * @param fichero
   */
  public static void comprobarExistenciaFichero(String fichero) {
    File archivo = new File(ruta + fichero + ".txt");
    if (archivo.exists()) {
      archivo.delete();
      System.out.println("El fichero se ha borrado correctamente.");
    } else {
      System.out.println("El fichero " + fichero + " no existe.");
    }
  }

}
