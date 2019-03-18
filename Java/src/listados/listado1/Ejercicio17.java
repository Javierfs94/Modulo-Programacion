package listados.listado1;
import java.util.Scanner;

/**
 * Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS
 * segundos.�El tiempo de viaje hasta llegar a otra ciudad B es de T
 * segundos.�Escribir un algoritmo que determine la hora de llegada a la ciudad
 * B.
 * 
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio17 {

	public static void main(String[] args) {
		int horaPartida, minPartida, segPartida, segInicial, segFinal, segViaje, horaLlegada, minLlegada, segLlegada;
		Scanner sc = new Scanner(System.in);

		System.out.println("Hora de salida");
		horaPartida = sc.nextInt();
		System.out.println("Minutos de salida");
		minPartida = sc.nextInt();
		System.out.println("Segundos de salida");
		segPartida = sc.nextInt();
		System.out.println("Tiempo que ha tardado en  segundos");
		segViaje = sc.nextInt();

		segInicial = horaPartida * 3600 + minPartida * 60 + segPartida;
		segFinal = segInicial + segViaje;
		horaLlegada = Math.round(segFinal / 3600);
		minLlegada = Math.round((segFinal % 3600) / 60);
		segLlegada = (segFinal % 3600) % 60;

		System.out.println("Hora de llegada: " + horaLlegada + ":" + minLlegada + ":" + segLlegada);
	}

}
