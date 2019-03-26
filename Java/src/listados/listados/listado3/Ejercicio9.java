package listados.listado3;
import java.util.Scanner;

/**
 * Mostrar en pantalla los N primero n�mero primos. Se pide por teclado la
 * cantidad de n�meros primos que queremos mostrar.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		//Variables
		int cantidadAMostrar;
		int cantidadMostrados;

		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("Introduzca cuantos numeros primos quiere mostrar: ");
			cantidadAMostrar = entrada.nextInt();
		} while (cantidadAMostrar <= 0);

		System.out.println("1: 2");
		cantidadMostrados = 1;

		int num = 3;
		while (cantidadMostrados < cantidadAMostrar) {

			boolean esPrimo = true;

			for (int divisor = 3; divisor <= Math.sqrt(num) && esPrimo; divisor += 2) {
				if (num % divisor == 0) {
					esPrimo = false;
				}
			}
			if (esPrimo) {
				cantidadMostrados++;
				System.out.println(cantidadMostrados + ": " + num);
			}
			num += 2;
		}


  
	}

}
