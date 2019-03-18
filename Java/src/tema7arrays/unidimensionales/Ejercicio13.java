package tema7arrays.unidimensionales;

import java.util.Scanner;

/**
 * Escribe un programa que rellene un array de 100 elementos con n�meros enteros
 * aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuaci�n el
 * programa mostrar� el array y preguntar� si el usuario quiere destacar el
 * m�ximo o el m�nimo. Seguidamente se volver� a mostrar el array escribiendo el
 * n�mero destacado entre dobles asteriscos.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio13 {

  public static void main(String[] args) {
    
    // Variables
    int[] n = new int[100];
    int maximo = 0;
    int minimo = 100;
    
    Scanner entrada = new Scanner(System.in);

    // Genera los números y calcula el máximo y el mínimo
    for (int i = 0; i < 100; i++) {
      n[i] = (int) (Math.random() * 501);

      if (n[i] < minimo) {
        minimo = n[i];
      }

      if (n[i] > maximo) {
        maximo = n[i];
      }
    }

    // Muestra el array original
    for (int elemento : n) {
      System.out.println(elemento + " ");
    }

    System.out.print("\n¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
    int opcion = entrada.nextInt();

    int destacado; // número que se va a destacar del resto

    if (opcion == 1) {
      destacado = minimo;
    } else {
      destacado = maximo;
    }

    System.out.println();

    // Muestra el resultado.
    for (int elemento : n) {
      if (elemento == destacado) {
        System.out.println("**" + elemento + "** ");
      } else {
        System.out.println(elemento + " ");
      }
    }
  }

}
