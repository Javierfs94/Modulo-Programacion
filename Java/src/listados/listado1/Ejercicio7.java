package listados.listado1;
import java.util.Scanner;

/**
 * Realiza un programa que reciba una cantidad de minutos y muestre por pantalla
 * a�cuantas horas y minutos corresponde.
 * 
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio7 {
	public static void main(String[] args) {

		double horas, minutos, minutosRestantes;
		Scanner sc = new Scanner(System.in);

		System.out.println("Escria una cantidad de minutos, para saber cuantas horas y minutos son");
		minutos = sc.nextDouble();

		horas = minutos / 60;
		minutosRestantes = minutos % 60;

		System.out.println(minutos + " minutos corresponden a " + horas + " horas " + minutosRestantes + " minutos");
	}

}
