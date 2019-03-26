package listados.listado2;

import java.util.Scanner;

/**
 * Escribir un programa que lea un año indicar si es bisiesto. Nota: un año es
 * bisiesto si es un número divisible por 4, pero no si es divisible por 100,
 * excepto que también sea divisible por 400.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */

class Ejercicio14 {
  public static void main(String[] args) {

    char tipo;
    int tamanno;
    int kilos;
    double precio;
    double ganancia;

    Scanner s = new Scanner(System.in);

    System.out.println("Tipo de kilo de uva, A o B");
    tipo = s.nextLine().charAt(0);
    System.out.println("tamanno de kilo de uva, 1 o 2");
    tamanno = s.nextInt();
    System.out.println("Precio");
    precio = s.nextDouble();
    System.out.println("Kilos de uva");
    kilos = s.nextInt();

    if (tipo == 'A' || tipo == 'a') {
      if (tamanno == 1) {
        precio = precio + 0.20;
      } else if (tamanno == 2) {
        precio = precio + 0.30;
      }

      if (tipo == 'B' || tipo == 'b') {
        if (tamanno == 1) {
          precio = precio - 0.30;
        } else if (tamanno == 2) {
          precio = precio - 0.50;
        }
      }

    }

    ganancia = precio * kilos;

    System.out.println("La ganacia es: " + ganancia);

  }

}