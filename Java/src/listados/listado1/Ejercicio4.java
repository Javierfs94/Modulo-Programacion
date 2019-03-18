package listados.listado1;
import java.util.Scanner;

/**
 * Dados dos n�meros, mostrar la suma, resta, divisi�n y multiplicaci�n de
 * ambos.
 * 
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		/**
		 * Variables
		 */
		double num1;
		double num2;
		double suma;
		double resta;
		double multiplicacion;
		double division;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el primer n�mero");
		num1 = sc.nextDouble();
		System.out.println("Introduzca el segundo n�mero");
		num2 = sc.nextDouble();

		suma = num1 + num2;
		resta = num1 - num2;
		multiplicacion = num1 * num2;
		division = num1 / num2;
		
		System.out.println("La suma entre " + num1 + "y" + num2 + " es " + suma);
		System.out.println("La resta entre " + num1 + "y" + num2 + " es " + resta);
		System.out.println("La multiplicaci�n entre " + num1 + "y" + num2 + " es " + multiplicacion);
		System.out.println("La divisi�n entre " + num1 + "y" + num2 + " es " + division);

	}

}
