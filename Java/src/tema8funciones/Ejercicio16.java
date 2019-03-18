package tema8funciones;

/**
 * Muestra los números capicúa que hay entre 1 y 99999.
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Ejercicio16 {

	public static void main(String[] args) {

		for (int i = 1; i <= 99999; i++) {
			if (Matematicas.esCapicua(i)) {
				System.out.println(i);
			}
		}

	}

}
