package listados.listado2;
import java.util.Scanner;

/**
* Escribe un programa que pida un número entero entre uno y doce e imprima el número de 
* días que tiene el mes correspondiente
*
* @author Fco Javier Frias Serrano
* @version 1.0
*/

class Ejercicio19{
	
	public static void main(String[] args){
		
	int num;
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Introduzca el numero del mes y le digo cuantos dias tiene: ");
	num=s.nextInt();
	
	switch (num) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 9:
	case 11:
		System.out.println("El mes correspondiente tiene 31 dias.");	
		break;
	case 4:
	case 6:
	case 8:
	case 10:
	case 12:
		System.out.println("El mes correspondiente tiene 30 dias.");
		break;
	case 2:
		System.out.println("El mes correspondiente tiene 28 dias.");
		break;
	default:
		System.out.println("Ese mes no existe");
		break;
	}
	
	}
	
}
