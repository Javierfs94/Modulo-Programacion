package listados.listado1;

import java.util.Scanner;

/**
 * Pide al usuario dos pares de n�meros x1,y2 y x2,y2, que representen dos
 * puntos�en el plano. Calcula y muestra la distancia entre ellos. Formula: Raiz
 * Cuadrada de (x2 - x1)^2 + (y2 - y1)^2
 * 
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio12 {

	public static void main(String[] args) {

		int x1, y1, x2, y2;
		double distancia;
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime las coordenadas del primer punto: ");
		x1 = sc.nextInt();
		y1 = sc.nextInt();

		System.out.println("Dime las coordenadas del segundo punto: ");
		x2 = sc.nextInt();
		y2 = sc.nextInt();

		distancia = Math.sqrt(((x2 - x1) ^ 2 + (y2 - y1) ^ 2));

		System.out.println("La distancia es: " + distancia);

	}

}
