package tema7arrays.unidimensionales;

import java.util.Scanner;

/**
 * Escribe un programa que genere 100 n�meros aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedir� entonces por
 * teclado dos valores y a continuaci�n cambiar� todas las ocurrencias del
 * primer valor por el segundo en la lista generada anteriormente. Los n�meros
 * que se han cambiado deben aparecer entrecomillados.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio7 {

  public static void main(String[] args) {

    // Variables
    int[] numeros = new int[100];
    int numero1;
    int numero2;

    Scanner entrada = new Scanner(System.in);

    // Generacion de los 100 numeroos aleatorios de 0 a 20
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = (int) (Math.random() * 21);
      System.out.println(numeros[i] + " ");
    }

    // Peticion de los 2 valores
    System.out.println("Introduzca el valor que quiere cambiar:");
    numero1 = entrada.nextInt();
    System.out.println("Introduzca el valor por el que realizar el cambio:");
    numero2 = entrada.nextInt();

    // Cambio del valor 1 por el valor 2
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] == numero1) {
        numeros[i] = numero2;
        System.out.println("\"" + numeros[i] + "\"");
      } else {
        System.out.println(numeros[i]);
      }
    }

  }

}
