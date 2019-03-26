package listados.listado1;
import java.util.Scanner;

/**
 * Escribir un programa que convierta un valor dado en grados Fahrenheit a
 * grados�Celsius. Formula: a^2 + b^2 = c^2
 * Formula: C= (F-32)x5/9
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio5 {
	 
	public static void main(String[] args) {
		/**
		 * Atributos
		 */
		double c, f;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca los grados Fahrenheit a convertir en Celcius");
		f = sc.nextDouble();

		c = (f - 32) * 5 / 9;
		System.out.println(f + " grados Fahrenheit son " + c + " grados Celcius");

	}

}
