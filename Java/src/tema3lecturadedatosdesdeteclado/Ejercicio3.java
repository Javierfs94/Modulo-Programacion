package tema3lecturadedatosdesdeteclado;

import java.util.Scanner;

/**
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		double pesetas;
		double euros;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca una cantidad en pesetas y se la convierta en euros: ");
		pesetas = entrada.nextInt();

		euros = Math.round(pesetas / 166.386);

		System.out.println(pesetas + " pesetas son " + euros + " euros");

	}

}
