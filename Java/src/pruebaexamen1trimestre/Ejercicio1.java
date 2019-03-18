package pruebaexamen1trimestre;

import java.util.Scanner;

/**
 * Haz un programa en Java y Python que calcule el combinatorio de dos números.
 * Si hay un error en la introducción debe indicarlos.
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		/**
		 * Variables
		 */
		int m;
		int n;
		int factorialM = 1;
		int factorialN = 1;
		int factorialA = 1;
		int resultadoCombinatorio;
		Scanner entrada = new Scanner(System.in);

		// Pedimos los numeros m y n al usuario
		System.out.println("Vamos a calcular el combinatorio de dos números");
		do {
			m = pedirM(entrada);
			n = pedirN(entrada);
			comprobarMyN(m, n);
		} while (m < n | m < 0 | n < 0);

		factorialM = factorial(m, factorialM); // Factorial de m
		factorialN = factorial(n, factorialN); // Factorial de n
		int a = m - n; // Una de las partes de la formula (perteneciente de la parte del divisor)
		factorialA = factorial(a, factorialA); // Factorial de a
		// Calculamos el resultado de la formula
		resultadoCombinatorio = calcularCombinatorio(factorialM, factorialN, factorialA);

		mostrarResultado(factorialM, factorialN, resultadoCombinatorio);
	}

	/**
	 * Calculo de combinatorio
	 * 
	 * @param factorialM
	 *          Resultado del factorial de M
	 * @param factorialN
	 *          Resultado del factorial de N
	 * @param factorialA
	 *          Resultado del factorial de A
	 * @return Devuelve el combinatorio
	 */
	private static int calcularCombinatorio(int factorialM, int factorialN, int factorialA) {
		int resultadoCombinatorio;
		resultadoCombinatorio = factorialM / (factorialN * (factorialA));
		return resultadoCombinatorio;
	}

	/**
	 * Muestra el resultado del ejercicio
	 * 
	 * @param totalM
	 *          Resultado total de M
	 * @param totalN
	 *          Resultado total de N
	 * @param resultadoCombinatorio
	 *          Resultado de la suma de los totales
	 */
	private static void mostrarResultado(int totalM, int totalN, int resultadoCombinatorio) {
		System.out.println("total de m = " + totalM + "\ntotal de n = " + totalN);
		System.out.println("Resultado = " + resultadoCombinatorio);
	}

	/**
	 * Calcula el factorial de un numero
	 * 
	 * @param x
	 *          Numero introducido por el usuario
	 * @param totalX
	 *          Valor total de x
	 * @return Devuelve el valor total de x
	 */
	private static int factorial(int x, int totalX) {
		for (int i = 1; i <= x; i++) {
			totalX *= i;
		}
		return totalX;
	}

	/**
	 * Comprueba que m sea mayor que n
	 * 
	 * @param m
	 *          Numero m introducido por el usuario
	 * @param n
	 *          Numero n introducido por el usuario
	 */
	private static void comprobarMyN(int m, int n) {
		if (m < n) {
			System.out.println("n no puede ser mayor que m");
			System.out.println("Vuelva a introducirlos");
		}
	}

	/**
	 * Peticion del numero n
	 * 
	 * @param entrada
	 *          Objecto Scanner
	 * @return Devuelve el valor n introducido por el usuario
	 */
	private static int pedirN(Scanner entrada) {
		int n;
		System.out.print("Introduzca el número n: ");
		n = entrada.nextInt();
		return n;
	}

	/**
	 * Peticion del numero m
	 * 
	 * @param entrada
	 *          Objecto Scanner
	 * @return El numero m
	 */
	private static int pedirM(Scanner entrada) {
		int m;
		System.out.print("Introduzca el número m: ");
		m = entrada.nextInt();
		return m;
	}

}
