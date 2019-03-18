package tema5bucles;

/**
 * Muestra los n�meros del 320 al 160, contando de 20 en 20 hacia atr�s
 * utilizando un bucle while.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		int i = 320;

		while (i >= 160) {
			System.out.println(i);
			i -= 20;
		}
		
	}

}
