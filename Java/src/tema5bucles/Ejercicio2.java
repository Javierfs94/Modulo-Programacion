package tema5bucles;

/**
 * Muestra los n�meros m�ltiplos de 5 de 0 a 100 utilizando un bucle while.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		int i = 0;

		while (i < 100) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
