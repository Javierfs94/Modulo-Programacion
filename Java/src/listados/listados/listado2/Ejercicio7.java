package listados.listado2;

import java.util.Scanner;

/**
 * Realiza un algoritmo que calcule la potencia, para ello pide por teclado la
 * base y el exponente. Pueden ocurrir tres cosas: •El exponente sea positivo,
 * sólo tienes que imprimir la potencia. •El exponente sea 0, el resultado es 1.
 * •El exponente sea negativo, el resultado es 1/potencia con el exponente
 * positivo.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */

class Ejercicio7 {
	public static void main(String[] args) {

		double base;
		double exponente;
		double potencia;

		Scanner s = new Scanner(System.in);

		System.out.println("Introduzca la base: ");
		base = s.nextDouble();
		System.out.println("Introduzca el exponente: ");
		exponente = s.nextDouble();

		if (exponente > 0) {
			potencia = Math.pow(base, exponente);
			System.out.println("El resultado de la potencia es " + potencia);
		}

		else if (exponente == 0) {
			potencia = 1;
			System.out.println("El resultado de la potencia es " + potencia);
		}

		else if (exponente < 0) {
			potencia = 1 / Math.pow(base, exponente);
			System.out.println("El resultado de la potencia es " + potencia);
		}

	}

}