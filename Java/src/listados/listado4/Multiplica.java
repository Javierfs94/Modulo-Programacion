package listados.listado4;

import java.util.Scanner;

/**
 * Define la clase Multiplica que realice de forma repetitiva multiplicaciones y
 * las muestre, siempre y cuando el usuario responda afirmativamente a la
 * pregunta: “¿Desea continuar? (s/n)”. Para ello utiliza un método continuar
 * (ejercicio anterior) e implementa también el método multiplicar con los dos
 * argumentos que sean los factores. Ha de devolver su producto. Documéntalo
 * correctamente (@param y @return)
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Multiplica {

	public static void main(String[] args) {
		/**
		 * Variables
		 */
		boolean respuesta;
		int num1;
		int num2;
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.print("Introduzca el número 1: ");
			num1 = entrada.nextInt();
			System.out.print("Introduzca el número 2: ");
			num2 = entrada.nextInt();

			System.out.println(num1 + " * " + num2 + " = " + multiplicar(num1, num2));
			respuesta = ComunicacionUsuario.continuar();
		} while (respuesta);
	}

	/**
	 * Multiplica los números pasados como argumentos
	 * 
	 * @param num1
	 *          el numero 1 introducido por el usuario
	 * @param num2
	 *          el numero 2 introducido por el usuario
	 * @return la multiplicacion de num1 y num2
	 */
	private static int multiplicar(int num1, int num2) {

		return num1 * num2;

	}

}
