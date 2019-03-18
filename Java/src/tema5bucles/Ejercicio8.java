package tema5bucles;

import java.util.Scanner;

/**
 * Muestra la tabla de multiplicar de un n�mero introducido por teclado.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);

		System.out.println("Inntroduzca un n�mero y le muestro la tabla de multiplicar");
		num = s.nextInt();

		System.out.println("#############################");
		System.out.println("Tabla de multiplicar del " + num);
		System.out.println("#############################");

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}

	}

}
