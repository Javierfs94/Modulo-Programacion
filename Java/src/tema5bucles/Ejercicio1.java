package tema5bucles;

/**
 * Muestra los n�meros m�ltiplos de 5 de 0 a 100 utilizando un bucle for.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}

	}

}
