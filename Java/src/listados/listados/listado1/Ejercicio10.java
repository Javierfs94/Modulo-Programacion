package listados.listado1;

import java.util.Scanner;

/**
 * Un alumno desea saber cual ser� su calificaci�n final en la materia de
 * Algoritmos. Dicha calificaci�n se compone de los siguientes porcentajes: 55%
 * del promedio de sus tres calificaciones parciales. 30% de la calificaci�n del
 * examen final. 15% de la calificaci�n de un trabajo final.
 * 
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio10 {

	public static void main(String[] args) {

		double parcial1, parcial2, parcial3, examen, trabajo, nota;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el parcial 1: ");
		parcial1 = sc.nextDouble();
		System.out.println("Introduzca el parcial 2: ");
		parcial2 = sc.nextDouble();
		System.out.println("Introduzca el parcial 3: ");
		parcial3 = sc.nextDouble();
		System.out.println("Introduzca la nota del examen final: ");
		examen = sc.nextDouble();
		System.out.println("Introduzca la nota del trabajo final: ");
		trabajo = sc.nextDouble();

		nota = ((parcial1 + parcial2 + parcial3) / 3) * 0.55 + examen * 0.3 + trabajo * 0.15;

		System.out.println("La nota final en la materia de Algoritmos es " + nota);
	}

}
