package tema2variables;

/**
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible (precio sin IVA). La base imponible estar� almacenada en una
 * variable.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio6 {

	public static void main(String[] args) {

		int base = 400;
		double iva = base * 0.21;
		double total = base + iva;

		System.out.println("Subtotal sin IVA " + base);
		System.out.println("IVA " + iva);
		System.out.println("Total EUR " + total);

	}

}
