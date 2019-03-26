package listados.listado1;
import java.util.Scanner;

/**
 * Pedir el nombre y los dos apellidos de una persona y mostrar las iniciales.
 * 
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio18 {

	public static void main(String[] args) {
		String nombre;
		String apellido1;
		String apellido2;
		String inicial;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime tu nombre");
		nombre = sc.nextLine();
		System.out.println("Dime tu primer apellido");
		apellido1 = sc.nextLine();
		System.out.println("Dime tu segundo apellido");
		apellido2 = sc.nextLine();

		inicial = nombre.substring(0, 0);
		inicial = inicial.concat(apellido1.substring(0, 0));
		inicial = inicial.concat(apellido2.substring(0, 0));
		inicial = inicial.toUpperCase();

		System.out.println("Las iniciales son: " + inicial);
	}

}
