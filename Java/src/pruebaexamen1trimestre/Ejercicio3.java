package pruebaexamen1trimestre;

import java.util.Scanner;

/**
 * Escribe un programa que rellene un array de 20 elementos con números enteros
 * aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
 * programa mostrará el array y preguntará si el usuario quiere resaltar los
 * múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
 * array escribiendo los números que se quieren resaltar entre corchetes[].
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Ejercicio3 {

	private static final int NUM_ARRAY = 20;

	public static void main(String[] args) {
		/**
		 * Variables
		 */
		int[] num = new int[NUM_ARRAY];
		int numIntroducido = 0;
		Scanner entrada = new Scanner(System.in);

		// Genera los 20 numeros aleatorios
		for (int i = 0; i < num.length; i++) {
			generarNumerosAleatorios(num, i);
		}

		// Aseguramos que el numero introducido sea 5 o 7
		do {
			numIntroducido = peticionMultiplo(entrada);
		} while (numIntroducido != 5 && numIntroducido != 7);

		// Comprueba numero a numero y muestra entre corchetes los multimos del numero
		// introducido por el usuario
		for (int i = 0; i < num.length; i++) {
			comprobarMultiplo(num, numIntroducido, i);
		}

	}

	/**
	 * Comprobar multiplo
	 * 
	 * @param num
	 *          Array de numeros
	 * @param numIntroducido
	 *          Numero introducido por el usuario
	 * @param i
	 *          Contador de posicion
	 */
	private static void comprobarMultiplo(int[] num, int numIntroducido, int i) {
		if (num[i] % numIntroducido == 0) {
			System.out.println("[" + num[i] + "]");
		} else {
			System.out.println(num[i]);
		}
	}

	/**
	 * Pedir multiplo
	 * 
	 * @param entrada
	 * @return Devuelve el numero introducido por el usuario
	 */
	private static int peticionMultiplo(Scanner entrada) {
		int numIntroducido;
		System.out.println("¿Quiere resaltar los múltiplos de 5 o 7?: ");
		numIntroducido = entrada.nextInt();
		return numIntroducido;
	}

	/**
	 * Genera los números aleatorios
	 * 
	 * @param num
	 *          Array de números
	 * @param i
	 *          Contador de posicion
	 */
	private static void generarNumerosAleatorios(int[] num, int i) {
		num[i] = (int) (Math.random() * 401);
		System.out.println(num[i]);
	}
}
