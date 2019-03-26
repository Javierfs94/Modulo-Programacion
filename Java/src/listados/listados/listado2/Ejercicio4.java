package listados.listado2;
import java.util.Scanner;

/**
* Crea un programa que pida al usuario dos números y muestre su división si el segundo no es cero, o un mensaje de aviso en 
* caso contrario.
*
* @author Fco Javier Frias Serrano
* @version 1.0
*/

class Ejercicio4 {
	
	public static void main(String[] args){

	double num1;
	double num2;

	Scanner s = new Scanner(System.in);
	
	System.out.println("Introduzca el primer numero");
	num1=s.nextDouble();
	System.out.println ("Introduzca el segundo numero");
	num2=s.nextDouble();
	
	if (num1%num2!=0) {
	 	System.out.println("El resultado de la division no ha sido 0");
	 }  
	else{
		System.out.println("El resultado de la division ha sido 0");
	}		 
		
	
	}

}