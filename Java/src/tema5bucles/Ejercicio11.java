package tema5bucles;

import java.util.Scanner;

/**
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros n�meros enteros a partir de uno que se introduce por teclado.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio11 {

	public static void main(String[] args) {

		int num = 0;

		Scanner s = new Scanner(System.in);

		System.out.println(
				"Introduzca un n�mero y le doy el cuadrado y el cubo de los 5 primeros n�meros enteros siguientes: ");
		num = s.nextInt();

		System.out.println("N�mero"+"\tCuadrado"+"\tCubo");
		for (int i = num; i < num + 5; i++) {
			System.out.println(i +"\t"+Math.pow(i, 2)+"\t\t"+Math.pow(i, 3));

		}

	}

}
