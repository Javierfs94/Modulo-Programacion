package listados.listado3;

import java.util.Scanner;

/**
 * Realizar un programa que compruebe si una cadena contiene una subcadena. Las
 * dos cadenas se introducen por teclado.
 * 
 * @author Fco Javier Frias Serrano
 */

class Ejercicio14 {
  public static void main(String[] args) {

    // Variables
    String cadena;
    String subcadena;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Introduzca una cadena: ");
    cadena = entrada.nextLine();
    System.out.println("Introduzca la subcadena: ");
    subcadena = entrada.nextLine();
    boolean resultado = cadena.contains(subcadena);

    if (resultado) {
      System.out.println("palabra encontrada");
    } else {
      System.out.println("palabra no encontrada");
    }
  }
}
