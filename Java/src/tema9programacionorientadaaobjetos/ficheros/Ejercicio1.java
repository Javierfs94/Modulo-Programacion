package tema9programacionorientadaaobjetos.ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * <p>
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 * </p>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class Ejercicio1 {

  public static void main(String[] args) {

    String ruta = "C:\\Users\\d18frsej2\\eclipse-workspace\\PGNJava\\src\\tema9programacionorientadaaobjetos\\ficheros\\primos.txt";

    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));

      calcularPrimos(bw);
      System.out.println("Archivo guardado con éxito");

      bw.close();

    } catch (IOException e) {
      System.err.println("No se ha podido escribir el archivo");
    }
  }

  /**
   * Calcular los números primos
   * 
   * @param rangoInicial
   * @param rangoFinal
   * @param bw
   * @throws IOException
   */
  public static void calcularPrimos(BufferedWriter bw) throws IOException {
    boolean esPrimo;
    for (int i = 1; i < 501; i++) {
      esPrimo = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          esPrimo = false;
        }
      }
      comprobarPrimo(esPrimo, bw, i);
    }
  }

  /**
   * Comprueba si un número es primo o no
   * 
   * @param esPrimo
   * @param bw
   * @param i
   * @throws IOException
   */
  public static void comprobarPrimo(boolean esPrimo, BufferedWriter bw, int i) throws IOException {
    if (esPrimo) {
      bw.write(i + "\n");
    }
  }

}
