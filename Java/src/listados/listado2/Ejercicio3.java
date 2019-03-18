package listados.listado2;
import java.util.Scanner;

/**
* Escribe un programa que lea un número e indique si es par o impar.
*
* @author Fco Javier Frias Serrano
* @version 1.0
*/


class Ejercicio3{
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
	}else{
		System.out.println(num2+" es mayor que "+num1);
			
	}
	
	
	
	}

}