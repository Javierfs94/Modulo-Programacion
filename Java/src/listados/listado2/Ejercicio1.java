package listados.listado2;
import java.util.Scanner;

/**
* Algoritmo que pida dos números e indique si el primero es mayor que el segundo o no.
*
* @author Fco Javier Frias Serrano
* @version 1.0
*/

class Ejercicio1{
	public static void main(String[] args){

	int num1;
	int num2;

	Scanner s = new Scanner(System.in);

	System.out.println("Introduzca el primer numero");
	num1=s.nextInt();
	System.out.println("Introduzca el segundo numero");
	num2=s.nextInt();
	
	System.out.println("Vamos ha comprobar cual es mayor");
	if (num1>num2) {
			System.out.println(num1+" es mayor que "+num2);
		}	else{
		System.out.println(num2+" es mayor que "+num1);
			
		}
	
	}

}