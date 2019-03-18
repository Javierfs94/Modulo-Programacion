package tema7arrays.unidimensionales;

import java.util.Scanner;

/**
 * Escribe un programa que lea 10 n�meros por teclado y que luego los muestre en
 * orden inverso, es decir, el primero que se introduce es el �ltimo en
 * mostrarse y viceversa.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio3 {

  public static void main(String[] args) {
    
    // Variables
    int i = 0;
    int[] numeros = new int[10];

    Scanner entrada = new Scanner(System.in);

    System.out.println("### Proceso de introducci�n de 10 n�meros ###");

    for (i = 0; i < 10; i++) {
      System.out.println("Introduzca un n�mero: ");
      numeros[i] = entrada.nextInt();
    }

    System.out.println("### N�meros mostrados en orden inverso ###");
    for (i = 9; i >= 0; i--) {
      System.out.println(numeros[i]);
    }

  }

}
