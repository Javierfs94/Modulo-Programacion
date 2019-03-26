package listados.listado4;

import java.util.Scanner;

/**
 * Define la clase Factorial que muestre el factorial de un número introducido
 * por teclado. (Factorial (4) = 4*3*2*1; Factorial (0) = 1) Realízalo con los
 * tres bucles (factorialFor(), factorialDoWhile(), factorialWhile())
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Factorial {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		/**
		 * Variables
		 */
		int numero;

		// PROGRAMA

		numero = pedirNumero();

		mostrarFactoriales(numero);

	}

	// METODOS

	/**
	 * Muestra los resultados de los factoriales
	 * 
	 * @param numero
	 *          introducido
	 */
	private static void mostrarFactoriales(int numero) {
		System.out.println("El factorial de " + numero + " con For es " + factorialFor(numero));
		System.out.println("El factorial de " + numero + " con While es " + factorialWhile(numero));
		System.out.println("El factorial de " + numero + " con Do While es " + factorialDoWhile(numero));
	}

	/**
	 * Pide el numero a introducir
	 * 
	 * @param entrada
	 *          numero entero
	 * @return numero introducido
	 */
	private static int pedirNumero() {
		int numero;

		System.out.print("Introduzca un número entero: ");
		numero = entrada.nextInt();

		return numero;
	}

	/**
	 * Factorial con el bucle For
	 * 
	 * @param numero
	 *          a calcular el factorial
	 * @return el resultado del factorial del numero introducido
	 */
	public static int factorialFor(int numero) {
		int resultado = 1;

		for (; numero > 0; numero--) {
			resultado *= numero;
		}

		return resultado;

	}

	/**
	 * Factorial con el bucle while
	 * 
	 * @param numero
	 *          a calcular el factorial
	 * @return el resultado del factorial del numero introducido
	 */
	public static int factorialWhile(int numero) {
		int resultado = 1;

		while (numero > 0) {
			resultado *= numero;
			numero--;
		}

		return resultado;

	}

	/**
	 * Factorial con el bucle do-while
	 * 
	 * @param numero
	 *          a calcular el factorial
	 * @return el resultado del factorial del numero introducido
	 */
	public static int factorialDoWhile(int numero) {
		int resultado = 1;

		do {
			resultado *= numero;
			numero--;
		} while (numero > 0);

		return resultado;

	}

}
