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

    boolean esPrimo;
    int rangoInicial = 1;
    int rangoFinal = 500;
    BufferedWriter bw;
    try {
      bw = new BufferedWriter(new FileWriter("primos.dat"));

      for (int i = rangoInicial; i <= rangoFinal; i++) {
        esPrimo = true;
        for (int j = 2; j < i; j++) {
          if (i % j == 0) {
            esPrimo = false;
          }
        }
        if (esPrimo) {
          System.out.println(i + "\n");
          bw.write(i + "\n");
        }
      }
      System.out.println("Archivo guardado con éxito");
      bw.close();
    } catch (IOException e) {
      System.err.println("No se ha podido escribir el archivo");
    }

  }

}
