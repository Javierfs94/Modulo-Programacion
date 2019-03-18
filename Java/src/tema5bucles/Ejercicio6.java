package tema5bucles;

/**
 * Muestra los n�meros del 320 al 160, contando de 20 en 20 utilizando un bucle
 * do-while.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		int i = 320;

		do {
			System.out.println(i);
			i -= 20;

		} while (i >= 160);
	}

}
