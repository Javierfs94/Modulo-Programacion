package listados.listado4;

import java.util.Scanner;

/**
 * Define la clase Aleatorios que de forma repetitiva muestre un número
 * aleatorio entre un mínimo y un máximo. Define el método generarAleatorio(min,
 * max).
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Aleatorios {

	public static void main(String[] args) {
		/**
		 * Variables
		 */
		int min;
		int max;
		boolean respuesta;
		Scanner entrada = new Scanner(System.in);

		do {

			System.out.print("Introduzca el mínimo: ");
			min = entrada.nextInt();
			System.out.print("Introduzca el máximo: ");
			max = entrada.nextInt();

			System.out.println("Número generado: " + generarAleatorio(min, max));

			respuesta = ComunicacionUsuario.continuar();
		} while (respuesta);

	}

	/**
	 * Genera un número aleatorio entre el máximo y el mínimo
	 * 
	 * @param min
	 *          numero minimo introducido
	 * @param max
	 *          numero maximo introducido
	 * @return un numero aleatorio entre el maxinom y el minimo
	 */
	public static int generarAleatorio(int min, int max) {

		return (int) Math.floor(Math.random() * (min - (max + 1)) + (max + 1));

	}
}
