package listados.listado4;

import java.util.Scanner;

/**
 * Define la clase Sumar que realice una suma y la muestre. Para ello implementa
 * el método sumar que devuelva la suma de dos números, solicitados por teclado
 * (sin argumentos) . Documéntalo correctamente (@return)
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Sumar {

	public static void main(String[] args) {

		System.out.println("La suma de los números es: " + suma());

	}

	/**
	 * Metodo para sumar 2 numeros
	 * 
	 * @return suma de x + y
	 */
	public static int suma() {
		int x;
		int y;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduzca el numero x: ");
		x = entrada.nextInt();
		System.out.print("Introduzca el numero y: ");
		y = entrada.nextInt();

		return x + y;

	}

}
