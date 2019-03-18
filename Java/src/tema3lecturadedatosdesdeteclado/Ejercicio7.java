package tema3lecturadedatosdesdeteclado;

import java.util.Scanner;

/**
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca la base imponible: ");
		int base = entrada.nextInt();
		
		double iva = base * 0.21;
		double total = base + iva;
		
		System.out.println("Subtotal sin IVA " + base);
		System.out.println("IVA " + iva);
		System.out.println("Total EUR " + total);

	}

}
