package listados.listado4;

import java.util.Scanner;

/**
 * <p>
 * Define la clase DeseaContinuar que realice la siguiente pregunta: “¿Desea
 * continuar? (s/n)”. En caso de que el usuario indique una “s” (minúscula o
 * mayúscula) el programa seguirá preguntando. En otro caso, que se salga del
 * programa. Para ello implementa el método continuar que devuelva true en caso
 * de introducir una s, y false en caso contrario. Documéntalo correctamente
 * (@return)
 * </p>
 * <p>
 * NOTA: Voy a cambiarle el nombre a la clase de DeseaContinuar a
 * ComunicacionUsuario para usarla en otros ejercicios con un nombre más
 * adecuado.
 * </p>
 * 
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class ComunicacionUsuario {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		boolean respuesta = true;

		do {
			respuesta = continuar();
		} while (respuesta);
	}

	/**
	 * Pide al usuario si desea continuar ejecutando el programa o no
	 * 
	 * @return true o false en funcion de la respuesta dada
	 */
	public static boolean continuar() {
		String letra;

		System.out.println("¿Desea continuar? (s/n)");
		letra = entrada.nextLine();

		if (letra.equals("s") || letra.equals("S")) {
			return true;
		} else {
			return false;
		}

	}

}
