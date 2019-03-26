package listados.listado1;

import java.util.Scanner;

/**
 * Escribir un programa que pregunte al usuario su nombre, y luego lo salude.
 * jsfvjnld
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio1 {
	public static void main(String[] args) {

		String nombre;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca su nombre para que pueda saludarle: ");

		nombre = sc.nextLine();

		System.out.println("Hola " + nombre + "!");

	}

}
