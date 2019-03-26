package listados.listado2;
import java.util.Scanner;

/**
*	Escribir un programa que lea un año indicar si es bisiesto. Nota: un año es bisiesto si es un número 
*	divisible por 4, pero no si es divisible por 100, excepto que también sea divisible por 400.
*
* @author Fco Javier Frias Serrano
* @version 1.0
*/

class Ejercicio12{
	
	public static void main(String[] args){

	int anno;
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Introduzca un anno para saber si es o no bisiesto");
 
	anno = s.nextInt();
	
	if ((anno % 4)==0 || (anno % 400)==0) {
		System.out.println("Es un anno Bisiesto");		
	} else{
		System.out.println("No es un anno Bisiesto");
	}
		
	
	}	
	
}