package listados.listado1;
import java.util.Scanner;

/**
 * Dadas dos variables num�ricas A y B, que el usuario debe teclear,�se pide
 * realizar un algoritmo que intercambie los valores de ambas variables�y
 * muestre cuanto valen al final las dos variables.
 * 
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		double distancia, vel1, vel2, alcance;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca la distancia en km: ");
		distancia = sc.nextDouble();
		System.out.println("Introduzca la velocidad del coche 1 km/h: ");
		vel1 = sc.nextDouble();
		System.out.println("Introduzca la velocidad del coche 2 km/h: ");
		vel2 = sc.nextDouble();

		alcance = distancia / (vel1 - vel2);

		System.out.println("El coche 1 alcanzar� al coche 2 en " + alcance + " minutos");
	}

}
