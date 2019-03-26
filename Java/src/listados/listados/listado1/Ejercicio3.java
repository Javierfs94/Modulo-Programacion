package listados.listado1;

import java.util.Scanner;

/**
 * Dados los catetos de un tri�ngulo rect�ngulo, calcular su hipotenusa.
 * 
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio3 {

	// Formula: a^2 + b^2 = c^2
	public static void main(String[] args) {
		/**
		 * Atributos
		 */
		double a;
		double b;
		double hipotenusa;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el cateto 1:");
		a = sc.nextDouble();
		System.out.println("Introduzca el cateto 2:");
		b = sc.nextDouble();

		hipotenusa = Math.sqrt(Math.pow(a, 2)) + Math.sqrt(Math.pow(b, 2));

		System.out.println("La hipotenusa = " + hipotenusa);
	}

}
