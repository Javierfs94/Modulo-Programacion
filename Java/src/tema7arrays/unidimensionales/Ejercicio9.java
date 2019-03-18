package tema7arrays.unidimensionales;

import java.util.Scanner;

/**
 * Realiza un programa que pida 8 n�meros enteros y que luego muestre esos
 * n�meros junto con la palabra �par� o �impar� seg�n proceda.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio9 {

  public static void main(String[] args) {

    // Variables
    int[] numeros = new int[8];

    Scanner entrada = new Scanner(System.in);
    
    //Peticion de numeros
    System.out.println("Introduzca 8 n�meros: ");
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = entrada.nextInt();
    }
    
    //Recorriendo el array para mostrar si es par o impar
    for (int j = 0; j < numeros.length; j++) {
      if (numeros[j] % 2 == 0) {
        System.out.println(numeros[j] + " par");
      }else  {
        System.out.println(numeros[j] + " impar");
      }
    }
    
   

    
    
  }

}
