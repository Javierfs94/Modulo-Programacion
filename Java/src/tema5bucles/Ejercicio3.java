package tema5bucles;

/**
 * Muestra los n�meros m�ltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		int i = 0;
		
		do {
			if (i%5==0) {
				System.out.println(i);
			}
			i++;
		} while (i<100);
	}

}
