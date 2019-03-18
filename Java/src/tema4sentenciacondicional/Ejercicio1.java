package tema4sentenciacondicional;

import java.util.Scanner;

/**
 * Escribe un programa que pida por teclado un d�a de la semana y que diga qu�
 * asignatura toca a primera hora ese d�a.s
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		int dia;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el n�mero de un d�a y te digo la asignatura que hay a primera hora: ");
		dia = entrada.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("El Lunes a primera hora hay Lenguaje de Marcas");
			break;
		case 2:
			System.out.println("El Martes a primera hora hay Programaci�n");
			break;
		case 3:
			System.out.println("El Mi�rcoles a primera hora hay Sistemas");
			break;
		case 4:
			System.out.println("El Jueves a primera hora hay Hardware");
			break;
		case 5:
			System.out.println("El Viernes a primera hora hay Base de Datos");
			break;
		case 6:
			System.out.println("El S�bado no hay clase");
			break;
		case 7:
			System.out.println("El Domingo no hay clase");
			break;
		default:
			System.out.println("Ha introducido un d�a err�neo");
			break;
		}
		
	}

}
