package tema5bucles;

import java.util.Scanner;

/**
 * Escribe un programa que calcule la media de un conjunto de n�meros positivos
 * introducidos por teclado. A priori, el programa no sabe cu�ntos n�meros se
 * introducir�n. El usuario indicar� que ha terminado de introducir los datos
 * cuando meta un n�mero negativo.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		double numeroIntroducido = 0;
		double suma = 0;
		int c = 0;
		Scanner s = new Scanner(System.in);

		System.out.println("Introduzca una serie de n�meros positivos para calcular  la media: ");
		System.out.println("Para salir introduzca un n�mero negativo");
		
		
		while (numeroIntroducido>=0) {
			numeroIntroducido = s.nextDouble();
			suma +=numeroIntroducido;
			c++;
		}
		
		System.out.println("La media de los n�meros introducidos es: "+((suma-numeroIntroducido)/(suma-1)));
		

	}

}
