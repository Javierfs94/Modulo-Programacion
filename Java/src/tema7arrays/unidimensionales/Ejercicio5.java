package tema7arrays.unidimensionales;

import java.util.Scanner;

/**
 * Escribe un programa que pida 10 n�meros por teclado y que luego muestre los
 * n�meros introducidos junto con las palabras �m�ximo� y �m�nimo� al lado del
 * m�ximo y del m�nimo respectivamente.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio5 {

  public static void main(String[] args) {

    // Variables
    int[] numeros = new int[10];
    int maximo;
    int minimo;

    Scanner entrada = new Scanner(System.in);

     System.out.println("Introduzca 10 n�meros: ");
    // Pedir los 10 numeros
     for (int i = 0; i < numeros.length; i++) {
     numeros[i] = entrada.nextInt();
     }

    maximo = numeros[0];
    minimo = numeros[0];

    // Comprobacion de maximo y minimo
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] > maximo) {
        maximo = numeros[i];
      } else if (numeros[i] < minimo) {
        minimo = numeros[i];
      }

    }

    // Mostrar la lista de numeros
    System.out.println("### Mostrando lista de n�meros ###");
    for (int j : numeros) {
      if (j == maximo) {
        System.out.println(j + " m�ximo");
      } else if (j == minimo) {
        System.out.println(j + " m�nimo");
      } else {
        System.out.println(j + " ");
      }
    }
  }

}
