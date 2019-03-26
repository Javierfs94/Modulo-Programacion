package listados.listado1;
import java.util.Scanner;

/**
 * Un vendedor recibe un sueldo base mas un 10% extra por comisi�n de sus
 * ventas,�el vendedor desea saber cuanto dinero obtendr� por concepto de
 * comisiones por�las tres ventas que realiza en el mes y el total que recibir�
 * en el mes tomando�en cuenta su sueldo base y comisiones.
 * 
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio8 {

	public static void main(String[] args) {

		double sueldo, comision, venta1, venta2, venta3, total;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el sueldo base del vendedor");
		sueldo = sc.nextDouble();
		System.out.println("Introduzca la ganancia de la primera venta");
		venta1 = sc.nextDouble();
		System.out.println("Introduzca la ganancia de la segunda venta");
		venta2 = sc.nextDouble();
		System.out.println("Introduzca la ganancia de la tercera venta");
		venta3 = sc.nextDouble();

		comision = (venta1 * 0.1) + (venta2 * 0.1) + (venta3 * 0.1);
		total = sueldo + comision;

		System.out.println("El sueldo base del vendedor es: " + sueldo + " euros");
		System.out.println("La comisi�n del vendedor es: " + comision + " euros");
		System.out.println("El total que recibir� el vendedor es: " + total + " euros");

	}

}
