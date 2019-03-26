package listados.listado1;

import java.util.Scanner;

/**
 * Pide al usuario dos n�meros y muestra la "distancia" entre ellos (el valor
 * absoluto de su diferencia, de modo que el resultado sea siempre positivo).
 * 
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio11 {

	public static void main(String[] args) {

		int num1, num2, distancia;
		Scanner sc = new Scanner(System.in);

		System.out.println("Deme dos n�meros y le digo la distancia");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if (num1 - num2 >= 0) {
			distancia = num1 - num2;
			System.out.println("La distancia es: " + distancia);
		} else {
			distancia = num2 - num1;
			System.out.println("La distancia es: " + distancia);
		}

	}

}
