package tema9programacionorientadaaobjetos.excepciones;

import java.util.Scanner;

/**
 * <p>
 * Realiza un programa que pida 6 números por teclado y nos diga cuál es el
 * máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
 * entero) el programa debe indicarlo y debe pedir de nuevo el número.
 * </p>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca 6 números enteros...");

		int maximo = Integer.MIN_VALUE;

		for (int i = 1; i < 7; i++) {

			int numero = 0;
			boolean entradaValida = false;

			do {

				try {
					System.out.print("Nº " + i + ": ");
					numero = entrada.nextInt();
					entradaValida = true;

				} catch (Exception e) {
					System.err.println("Dato introducido inválido. Debe introducir un número entero.");
					System.err.println("Vuelva a introducir el dato");
					entrada.nextLine();
				}

			} while (!entradaValida);

			if (numero > maximo) {
				maximo = numero;
			}
		}

		System.out.println("El número máximo es " + maximo);
		entrada.close();
	}
}
