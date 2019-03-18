package tema4sentenciacondicional;

import java.util.Scanner;

/**
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
 * d�as, buenas tardes o buenas noches seg�n la hora. Se utilizar�n los tramos
 * de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. S�lo se tienen en cuenta
 * las horas, los minutos no se deben introducir por teclado.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		int hora;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca la hora: ");
		hora = entrada.nextInt();

		if (hora >= 6 &&  hora <= 12) {
			System.out.println("Buenos d�as");
		} else if (hora >= 13 && hora <= 20) {
			System.out.println("Buenas tardes");
		} else if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >= 0))) {
			System.out.println("Buenas noches");
		} else {
			System.out.println("La hora introducida es err�nea");
		}

	}

}
