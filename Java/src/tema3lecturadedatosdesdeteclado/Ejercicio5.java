package tema3lecturadedatosdesdeteclado;

import java.util.Scanner;

/**
 * Escribe un programa que calcule el �rea de un rect�ngulo.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		int a;
		int b;
		int area;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca el lado A: ");
		a = entrada.nextInt();
		System.out.println("Introduzca el lado B: ");
		b = entrada.nextInt();

		area = a * b;

		System.out.println("�rea = " + area);

	}

}
