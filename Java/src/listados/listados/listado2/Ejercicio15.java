package listados.listado2;
import java.util.Scanner;

/**
*	El director de una escuela está organizando un viaje de estudios, y requiere determinar 
*	cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. 
*	La forma de cobrar es la siguiente: si son 100 alumnos o más, el costo por cada alumno es de 65 euros; 
*	de 50 a 99 alumnos, el costo es de 70 euros, de 30 a 49, de 95 euros, y si son menos de 30, el costo 
*	de la renta del autobús es de 4000 euros, sin importar el número de alumnos. Realice un algoritmo 
*	que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada	alumno por el 
*	viaje.
*
* @author Fco Javier Frias Serrano
* @version 1.0
*/

class Ejercicio15{
	public static void main(String[] args){
		
	int numalumnos;
	double pagoalumno,pagocompanya;
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Introduce el numero de alumnos");
	numalumnos = s.nextInt();
	
	if (numalumnos>=100) {
		pagoalumno = 65;
		pagocompanya = numalumnos * pagoalumno;
		System.out.println("El pago a la compannia es: " + pagocompanya + "€");
	}
	if (numalumnos>=50 && numalumnos <= 99) {
		pagoalumno=70;
		pagocompanya = numalumnos * pagoalumno;
		System.out.println("El pago a la compannia es: " + pagocompanya + "€");
	}
	if (numalumnos>=30 && numalumnos <= 49) {	
		pagoalumno=95;
		pagocompanya = numalumnos * pagoalumno;
		System.out.println("El pago a la compannia es: " + pagocompanya + "€");
	}
	if (numalumnos<30)  {	
		System.out.println("El pago a la compannia es 4000€");
	}
	
	}	
}