package tema3lecturadedatosdesdeteclado;

import java.util.Scanner;

/**
 * Escribe un programa que sume, reste, multiplique y divida dos n�meros
 * introducidos por teclado.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		int num1;
		int num2;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca dos n�meros por teclado: ");
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();

		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2));

	}

}
