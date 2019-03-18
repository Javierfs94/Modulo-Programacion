package listados.listado1;
import java.util.Scanner;

/**
 * Dos veh�culos viajan a diferentes velocidades (v1 y v2) y est�n
 * distanciados�por una distancia d.� El que est� detr�s viaja a una velocidad
 * mayor. Se pide hacer un algoritmo�para ingresar la distancia entre los dos
 * veh�culos (km) y sus respectivas�velocidades (km/h) y con esto determinar y
 * mostrar en que tiempo (minutos)�alcanzar� el veh�culo m�s r�pido al otro.
 * Formula Distancia / v1 - v2
 * 
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio16 {

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
