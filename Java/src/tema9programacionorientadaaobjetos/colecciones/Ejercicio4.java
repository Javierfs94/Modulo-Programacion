package tema9programacionorientadaaobjetos.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * <p>
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
 * debe ordenar palabras en lugar de números.
 * </p>
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Ejercicio4 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<String> palabras = new ArrayList<>();

		System.out.println("Introduzca 10 números enteros: ");
		for (int i = 0; i < 10; i++) {
			System.out.print("Introduzca la palabra número " + i + ": ");
			palabras.add(entrada.next());
		}

		Collections.sort(palabras);

		for (String palabrasOrdenadas : palabras) {
			System.out.println(palabrasOrdenadas);
		}
	}

}
