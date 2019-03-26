package listados.listado4;

import java.util.Scanner;

/**
 * Define la clase Resta que realice de forma repetitiva restas y las muestre,
 * siempre y cuando el usuario responda afirmativamente a la pregunta: “¿Desea
 * continuar? (s/n)”. Para ello utiliza un método continuar (ejercicio anterior)
 * e implementa también el método restar con los dos argumentos que sean los
 * operandos. Ha de devolver su diferencia. Documéntalo correctamente (@param
 * y @return)
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Resta {

	public static void main(String[] args) {
		/**
		 * Variables
		 */
		int num1;
		int num2;
		boolean respuesta;
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.print("Introduzca el número 1: ");
			num1 = entrada.nextInt();
			System.out.print("Introduzca el número 2: ");
			num2 = entrada.nextInt();
			
			System.out.println(num1 + " - " + num2 + " = " + restar(num1, num2));
			
			respuesta = ComunicacionUsuario.continuar();
		} while (respuesta);
	}

	/**
	 * Calcula la resta de 2 números
	 * 
	 * @param num1
	 *          numero 1 Introducido por teclado
	 * @param num2
	 *          numero 2 Introducido por teclado
	 * @return El resultado de la resta entre num1 y num2
	 */
	public static int restar(int num1, int num2) {

		return num1 - num2;

	}

}
