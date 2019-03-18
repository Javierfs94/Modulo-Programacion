package tema7arrays.unidimensionales;

import java.util.Scanner;

/**
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de
 * un determinado a�o y que muestre a continuaci�n un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro car�cter.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio8 {

  public static void main(String[] args) {

    // Variables
    String[] mes = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre",
        "Noviembre", "Diciembre" };
    int[] temperatura = new int[12];

    Scanner entrada = new Scanner(System.in);

    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";

    for (int i = 0; i < 12; i++) {
      System.out.print("Introduzca la temperatura media de " + mes[i] + ": ");
      temperatura[i] = entrada.nextInt();
    }

    for (int i = 0; i < 12; i++) {
      System.out.printf(azul + "%12s " + verde + "│", mes[i]);
      for (int j = 0; j < temperatura[i]; j++) {
        System.out.print(morado + "▄");
      }
      System.out.println(naranja + " " + temperatura[i] + "ºC" + blanco);
    }

  }

}
