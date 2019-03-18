package listados.listado2;
import java.util.Scanner;

/**
*	Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. 
*	Si introducimos otro número nos da un error.
*
* @author Fco Javier Frias Serrano
* @version 1.0
*/

class Ejercicio18{
	
	public static void main(String[] args){
		
	int dia;
	
	Scanner s = new Scanner(System.in);

	
	System.out.println("Introduzca el dia de la semana en numero: ");
	dia = s.nextInt();
	
	switch(dia){
		
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes"); 
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves") ;
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Ese dia no existe"); ;
	
		
	} 
		
		
	}
	
}
