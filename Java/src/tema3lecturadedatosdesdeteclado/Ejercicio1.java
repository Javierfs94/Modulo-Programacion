package tema3lecturadedatosdesdeteclado;

import java.util.Scanner;

/**
 * Realiza un programa que pida dos n�meros y que luego muestre el resultado de
 * su multiplicaci�n.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		
		int num1;
		int num2;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca el primer n�mero: ");
		num1 = entrada.nextInt();
		System.out.println("Introduzca el segundo n�mero: ");
		num2 = entrada.nextInt();
		
		System.out.println(num1 + " * " + num2 + " = " + num1 * num2);

	}

}
