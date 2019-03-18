package tema3lecturadedatosdesdeteclado;

import java.util.Scanner;

/**
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado. 
 * 
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		double euros;
		double pesetas;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca una cantidad en euros y se la convierta en pesetas: ");
		euros = entrada.nextInt();
		
		pesetas = Math.round(166.486 * euros);
		
		System.out.println(euros + " euros son " + pesetas + " pesetas");

	}

}
