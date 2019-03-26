package listados.listado3;

import java.util.Scanner;

/**
 * Realizar un programa que lea una cadena por teclado y convierta las
 * may�sculas a min�sculas y viceversa.
 * 
 * @author Fco Javier Frias Serrano
 */

class Ejercicio13 {
  public static void main(String[] args) {

    // Variables
    String cadena;
    String cadenaNueva = "";

    Scanner entrada = new Scanner(System.in);

    // Peticion de datos al usuario
    System.out.println("Introduzca una cadena: ");
    cadena = entrada.nextLine();

    for (int posicion = 0; posicion <= cadena.length() - 1; posicion++) {

      String letra = cadena.substring(posicion, posicion + 1);

      if (letra.equals(letra.toUpperCase())) {
        cadenaNueva += letra.toLowerCase();
      } else {
        cadenaNueva += letra.toUpperCase();
      }

    }
    System.out.println("La cadena convertida es: " + cadenaNueva);
  }
}
