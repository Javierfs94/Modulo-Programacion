package listados.listado4;

import java.util.Scanner;

/**
 * <p>
 * Define la clase IvaConMetodos que calcule los impuestos que se aplican a un
 * precio base en función de si el iva es superreducido (4%), reducido (10%) o
 * general (21%).
 * </p>
 * <p>
 * Para ello define y usa los siguientes métodos:
 * </p>
 * <ul>
 * <li>a. pedirIVA()</li>
 * <li>b. pedirPrecio()</li>
 * <li>c. continuar()</li>
 * <li>d. calcularIva(double, char)</li>
 * </ul>
 * 
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class IvaConMetodos {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		/**
		 * Variables
		 */
		double precioBase;
		double precioIva = 0;
		String iva;

		// PROGRAMA
		do {
			precioBase = pedirPrecio();
			iva = pedirIva();
			precioIva = calcularIva(precioBase, iva);

			System.out.println("El IVA a aplicar sobre " + precioBase + " es " + precioIva);

		} while (ComunicacionUsuario.continuar());
	}

	// METODOS

	/**
	 * Calcula el iva del producto
	 * 
	 * @param precioBase
	 *          precio inicial del producto
	 * @param iva
	 *          tipo de iva
	 * @return el iva a pagar del producto
	 */
	private static double calcularIva(double precioBase, String iva) {
		double precioIva = 0;
		if (iva.equals("s")) {
			precioIva = precioBase * 0.04;
		} else if (iva.equals("r")) {
			precioIva = precioBase * 0.1;
		} else if (iva.equals("g")) {
			precioIva = precioBase * 0.21;
		} else {
			System.out.println("Error al introducir el IVA");
		}
		return precioIva;
	}

	/**
	 * Pide el tipo de iva
	 * 
	 * @return el tipo de iva
	 */
	private static String pedirIva() {
		String iva;
		System.out.print("indique el tipo del IVA: super reducido, reducido o general (s/r/g): ");
		iva = entrada.next();
		while (!iva.equals("s") && !iva.equals("r") && !iva.equals("g")) {
			System.out.println("Ha introducido un IVA incorrecto. Ingrese de nuevo el tipo de IVA");
			System.out.print("indique el tipo del IVA: super reducido, reducido o general (s/r/g): ");
			iva = entrada.next();
		}
		return iva;
	}

	/**
	 * Pide el precio base del producto
	 * 
	 * @return el precio base del articulo
	 */
	private static double pedirPrecio() {
		double precioBase;
		System.out.println("Vamos a calcular el IVA sobre  un precio base.");
		System.out.print("Precio base del artículo (mayor que cero): ");
		precioBase = entrada.nextDouble();
		while (precioBase <= 0) {
			System.out.println("El precio base ha sido menor que cero. Vuelva a introducirlo");
			System.out.print("Precio base del artículo (mayor que cero): ");
			precioBase = entrada.nextDouble();
		}
		return precioBase;
	}

}
