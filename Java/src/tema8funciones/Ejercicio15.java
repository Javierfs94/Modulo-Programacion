package tema8funciones;

/**
 * Muestra los números primos que hay entre 1 y 1000.
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Ejercicio15 {

	public static void main(String[] args) {

		for (int i = 1; i <= 1000; i++) {
			if (Matematicas.esPrimo(i)) {
				System.out.println(i);
			}
		}

	}

}
