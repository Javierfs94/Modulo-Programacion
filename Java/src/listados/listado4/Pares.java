package listados.listado4;

import java.util.Scanner;

/**
 * Define la clase Pares que de forma repetitiva indique si un número es par o
 * impar. Define el método esPar(int)
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Pares {

	public static void main(String[] args) {
		/**
		 * Variables
		 */
		int numero;
		boolean par;
		boolean respuesta;
		Scanner entrada = new Scanner(System.in);

		do {

			System.out.print("Introduzca un número y le digo si es par o no: ");
			numero = entrada.nextInt();
			par = esPar(numero);

			if (par) {
				System.out.println("El número introducido es par.");
			} else {
				System.out.println("El número introducido no es es par.");
			}
			
			respuesta = ComunicacionUsuario.continuar();
			
		} while (respuesta);

	}

	/**
	 * Comprueba si un numero es par o no
	 * 
	 * @param numero
	 *          a comprobar si es par o no
	 * @return true si es par o false si no lo es
	 */
	public static boolean esPar(int numero) {
		boolean par = false;

		if (numero % 2 == 0) {
			par = true;
		}

		return par;

	}
}
