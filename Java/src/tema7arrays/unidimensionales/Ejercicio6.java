package tema7arrays.unidimensionales;

import java.util.Scanner;

/**
 * Escribe un programa que lea 15 n�meros por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posici�n
 * 0 debe pasar a la posici�n 1, el de la 1 a la 2, etc. El n�mero que se
 * encuentra en la �ltima posici�n debe pasar a la posici�n 0. Finalmente,
 * muestra el contenido del array.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio6 {

  public static void main(String[] args) {

    // Variables
    // int[] numeros = new int[15];
    int[] numeros = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

    Scanner entrada = new Scanner(System.in);

    // Peticion de numeros
    // System.out.println("Introduzca 15 n�meros: ");
    // for (int i = 0; i < numeros.length; i++) {
    // numeros[i] = entrada.nextInt();
    // }

    // Cambio de la posicion de los elementos
    int aux = numeros[14]; // Guarda el valor de la posicion 15 en una variable auxiliar
    for (int i = numeros.length - 1; i > 0; i--) {
      numeros[i] = numeros[i - 1];
    }
    numeros[0] = aux; // El primer valor se cambia con el valor de la variable auxiliar

    // Mostrar el array
    for (int i = 0; i < numeros.length; i++) {
      System.out.println("Posici�n " + i + ": " + numeros[i]);
    }

  }

}
