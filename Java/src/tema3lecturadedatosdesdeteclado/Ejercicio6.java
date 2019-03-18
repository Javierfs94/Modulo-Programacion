package tema3lecturadedatosdesdeteclado;

import java.util.Scanner;

/**
 * Escribe un programa que calcule el �rea de un tri�ngulo.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		int base;
		int altura;
		int area;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca la base:");
		base = entrada.nextInt();
		System.out.println("Introduzca la altura:");
		altura = entrada.nextInt();

		area = (base * altura) / 2;

		System.out.println("�rea = " + area);

	}

}
