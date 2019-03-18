package tema5bucles;

import java.util.Scanner;

/**
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
 * calcule la potencia.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio14 {

	public static void main(String[] args) {

		int base;
		int exponente;
		int potencia = 1;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca la base: ");
		base = entrada.nextInt();
		System.out.println("Introduzca la base: ");
		exponente = entrada.nextInt();

		if (exponente == 0) {
			potencia = 1;
		} else if (exponente > 0) {

			for (int i = 0; i < exponente; i++) {
				potencia *= base;

			}

		}

		if (exponente < 0) {
			for (int i = 0; i < -exponente; i++) {
				potencia *= base;
			}

			potencia = 1 / potencia;
		}

		System.out.println(base + " ^ " + exponente + " = " + potencia);

	}

}
