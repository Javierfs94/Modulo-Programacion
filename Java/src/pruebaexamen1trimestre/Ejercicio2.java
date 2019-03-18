package pruebaexamen1trimestre;

import java.util.Scanner;

/**
 * Haz un programa en Java y Python que calcule el elemento N (se pide al
 * usuario) de la serie de Fibonacci.
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		/**
		 * Variables
		 */
		int elementoN;
		int anterior = 1;
		int actual = 1;
		Scanner entrada = new Scanner(System.in);

		// Peticion al usuario de la posicion de Fibonacci
		elementoN = pedirN(entrada);

		System.out.print(anterior + "  ");
		System.out.print(actual + "  ");

		for (int i = 2; i < elementoN; i++) {
			actual += anterior;
			anterior = actual - anterior;
			System.out.print(actual + "  ");
		}
		mostrarElemento(elementoN, actual);
	}

	/**
	 * @param elementoN
	 *          Posicion a sacar pedida al usuario
	 * @param num2
	 *          Valor de la posicion de Fibonacci
	 */
	private static void mostrarElemento(int elementoN, int num2) {
		System.out.println("\nEl numero de la posicion " + elementoN + " es " + num2);
	}

	/**
	 * @param entrada
	 *          Introduccion del elemento N para la posicion de Fibonacci
	 * @return la posicion que ocupa quiere sacar el usuario
	 */
	private static int pedirN(Scanner entrada) {
		int elementoN;
		System.out.print("Introduzca el elemento de la serie Fibonacci a sacar: ");
		elementoN = entrada.nextInt();
		return elementoN;

	}
}
