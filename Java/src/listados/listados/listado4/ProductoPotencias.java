package listados.listado4;

/**
 * Define la clase ProductoPotencias que calcule y visualice el producto de las
 * potencias de 2 entre 0 y 10.
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class ProductoPotencias {

	public static void main(String[] args) {
		/**
		 * Variables
		 */
		long resultado;
		long producto = 1;

		for (int i = 0; i <= 10; i++) {
			resultado = calcularPotencia(i);
			System.out.println("2 elevado a " + i + " = " + resultado);
			producto *= resultado;
		}
		System.out.println("El producto total es: " + producto);
	}

	/**
	 * Calcula la potencia de 2 elevado al numero pasado como argumento de un bucle
	 * 
	 * @param i
	 *          numero del bucle de 0 a 10
	 * @return potencia de 2 elevado a i
	 */
	private static long calcularPotencia(int i) {

		return (long) Math.pow(2, i);

	}

}
