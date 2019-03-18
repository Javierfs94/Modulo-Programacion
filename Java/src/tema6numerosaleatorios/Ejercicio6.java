package tema6numerosaleatorios;

/**
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * tambi�n la suma total (los puntos que suman entre los tres dados).
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		int tirada;
		int suma = 0;

		System.out.println("Tirada de 3 dados");
		for (int i = 1; i <= 3; i++) {
			tirada = (int) (Math.random() * 6 + 1);
			System.out.println("Tirada dado " + i + " resultado " + tirada + " ");
			suma += tirada;

		}
		System.out.println("El total de las 3 tiradas es: " + suma);

	}

}
