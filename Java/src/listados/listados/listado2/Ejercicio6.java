package listados.listado2;
import java.util.Scanner;

/**
* Programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
*
* @author Fco Javier Frias Serrano
* @version 1.0
*/

class Ejercicio6{
	public static void main(String[] args){

	Scanner s = new Scanner(System.in);

	System.out.println("Ingrese letra: ");	
	char letra = s.nextLine().charAt(0);

	if (Character.isUpperCase(letra)) {
			System.out.println("Mayuscula");
		}	else{
		System.out.println("Minuscula");			
		}
	
	}

}