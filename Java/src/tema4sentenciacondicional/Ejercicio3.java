package tema4sentenciacondicional;

import java.util.Scanner;

/**
 * Escribe un programa en que dado un n�mero del 1 a 7 escriba el
 * correspondiente nombre del d�a de la semana.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		int numero;

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca el n�mero de un d�a: ");
		numero = entrada.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Mi�rcoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("S�bado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Ha introducido un d�a err�neo");
			break;
		}

	}

}
