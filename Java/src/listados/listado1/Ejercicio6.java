package listados.listado1;
import java.util.Scanner;

/**
 * Calcular la media de tres n�meros pedidos por teclado.
 * 
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio6 {
	// Formula: a^2 + b^2 = * c^2
	public static void main(String[] args) {

		int num1, num2, num3, media;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el primer n�mero: ");
		num1 = sc.nextInt();

		System.out.println("Introduzca el pen�ltimo n�mero: ");
		num2 =  sc.nextInt();

		System.out.println("Introduzca el �ltimo n�mero: ");
		num3 =  sc.nextInt();

		media = (num1 + num2 + num3) / 3;

		System.out.println("La media de " + num1 + " + " + num2 + " + " + num3 + " es " + media);

	}

}
