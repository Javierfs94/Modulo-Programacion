package tema11gui.ejercicio6;

import java.util.Scanner;

public class Test {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int x1, x2, y1, y2;
    double distancia;
    System.out.println("Dime las coordenadas del punto 1: ");
    x1 = entrada.nextInt();
    y1 = entrada.nextInt();
    System.out.println("Dime las coordenadas del punto 2: ");
    x2 = entrada.nextInt();
    y2 = entrada.nextInt();
    distancia = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
    System.out.println("Distancia: " + distancia);
  }

}
