package listados.listado4;

import java.util.Scanner;

/**
 * Define la clase Sumar2 que realice una suma y la muestre. Para ello
 * implementa el método sumar con los dos argumentos que sean los sumandos. Ha
 * de devolver su suma. Documéntalo correctamente (@param y @return)
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Sumar2 {

	public static void main(String[] args) {
		/**
		 * Variables
		 */
		int x;
		int y;
		Scanner entrada = new Scanner(System.in);

		// Solicitamos la x e y al usuario
		System.out.print("Introduzca el numero x: ");
		x = entrada.nextInt();
		System.out.print("Introduzca el numero y: ");
		y = entrada.nextInt();
		// Mostramos el resultado
		System.out.println("La suma de los números es: " + suma(x, y));// a suma(x,y) le introducimos commo argumentos la
																																	 // variable x e y
	}

	/**
	 * Metodo para sumar 2 numeros pasados como argumentos
	 * 
	 * @param x
	 *          primer numero
	 * @param y
	 *          segundo numero
	 * @return suma de x + y
	 */
	public static int suma(int x, int y) {

		return x + y;

	}
}
