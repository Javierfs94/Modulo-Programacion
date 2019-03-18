package listados.listado1;
import java.util.Scanner;

/**
 * Calcular el per�metro y �rea de un rect�ngulo dada su base y su altura.
 * Formula: P = 2� a + 2� b
 * 
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		
	int base;
	int	altura;
	int perimetro;

		Scanner sc = new Scanner(System.in);

		// Pedimos la base y altura al usuario y la almacenamos
		System.out.println("Introduzca la base: ");
		base = sc.nextInt();

		System.out.println("Introduzca la altura");
		altura = sc.nextInt();
		// Realizamos la formula
		
		perimetro = 2 * altura + 2 * base;
		
		// Mostramos el resultado
		System.out.println("El Per�metro de la rect�ngulo es: " + perimetro);
	}

}
