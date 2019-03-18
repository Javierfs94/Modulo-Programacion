package tema9programacionorientadaaobjetos.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * <p>
 * Escribe un programa que ordene 10 números enteros introducidos por teclado y
 * almacenados en un objeto de la clase ArrayList.
 * </p>
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Ejercicio3 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<>();

		System.out.println("Introduzca 10 números enteros: ");
		for (int i = 0; i < 10; i++) {
			System.out.print("Introduzca número " + i + ": ");
			numeros.add(entrada.nextInt());
		}

		Collections.sort(numeros);
		
		for (Integer numerosOrdenados : numeros) {
			System.out.println(numerosOrdenados);
		}
	}

}
