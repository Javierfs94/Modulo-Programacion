package listados.listado3;

import java.util.Scanner;

/**
 * Introducir una cadena de caracteres e indicar si es un pal�ndroma. Una
 * palabra pal�ndroma es aquella que se lee igual adelante que atr�s.
 * 
 * @author Fco Javier Frias Serrano
 */

class Ejercicio15 {
  public static void main(String[] args) {

    // Variables
    String cadena; // cadena original
    int i; // �ndice inicial
    int j; // �ndice final
    final String VOCALES_CON_TILDE = "�����";
    final String VOCALES_SIN_TILDE = "AEIOU";

    Scanner entrada = new Scanner(System.in);

    // Pedimos datos
    System.out.print("Introduce una cadena para comprobar si es pal�ndroma: ");
    cadena = entrada.nextLine();

    // Proceso

    // quitamos espacios iniciales, finales e intermedios de la cadena y pasamos a
    // may�sculas
    cadena = cadena.trim().replace(" ", "").toUpperCase();

    // quitamos tildes
    for (int n = 0; n < VOCALES_CON_TILDE.length(); n++) { // vocales con tilde
      cadena = cadena.replace(VOCALES_CON_TILDE.charAt(n), VOCALES_SIN_TILDE.charAt(n));
    }

    // for SIN CUERPO, no lo necesitamos...
    for (i = 0, j = cadena.length() - 1; i < j && cadena.charAt(i) == cadena.charAt(j); i++, j--)
      ;

    // �Es pal�ndromo?
    if (i >= j) {
      System.out.println("Es un pal�ndromo");
    } else {
      System.out.println("No es un pal�ndromo");
    }
  }
}
