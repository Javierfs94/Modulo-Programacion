package listados.listado4;

import java.util.Scanner;

/**
 * Define la clase CerosYUnos que lea una secuencia de ceros y unos. Mostrará el
 * número de ceros de la secuencia. Dejará de leer cuando el usuario introduzca
 * el número 2.
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class CerosYUnos {

	public static void main(String[] args) {
		/**
		 * Variables
		 */
		int numero;
		int contador = 0;
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("Introduce 0 o 1 (2 para salir):");
			numero = entrada.nextInt();

			if (numero < 0 || numero > 2) {
				System.err.println("Número erróneo. Vuelva a introducir un número.");
			} else {
				contador = cuentaCeros(numero, contador);
			}

		} while (numero != 2);
		System.out.println("Se han introducido " + contador + " ceros");

	}

	/**
	 * Cuenta los ceros introducidos
	 * 
	 * @param numero
	 *          introducido por el usuario
	 * @param contador
	 *          de ceros introducidos
	 * @return el contador aumentado
	 */
	private static int cuentaCeros(int numero, int contador) {
		if (numero == 0) {
			contador++;
		}
		return contador;
	}

}
