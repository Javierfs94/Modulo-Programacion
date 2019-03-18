package listados.listado1;
import java.util.Scanner;

/**
 * Una tienda ofrece un descuento del 15% sobre el total de la compra y un
 * cliente�desea saber cuanto deber� pagar finalmente por su compra.
 * 
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio9 {

	public static void main(String[] args) {

		double precioInicial, descuento, precioFinal;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el precio del producto");
		precioInicial = sc.nextDouble();

		descuento = precioInicial * 0.15;
		precioFinal = precioInicial - descuento;

		System.out.println("El precio del producto es " + precioInicial + " euros ");
		System.out.println("Con el descuento del 15% es " + descuento + " euros");
		System.out.println("El total ha pagar es " + precioFinal + " euros");

	}

}
