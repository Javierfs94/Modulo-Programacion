package listados.listado1;
import java.util.Scanner;

/**
 * Dise�ar un algoritmo que nos diga el dinero que tenemos (en euros y
 * c�ntimos)�despu�s de pedirnos cuantas monedas tenemos de 2e, 1e, 50 c�ntimos,
 * 20 c�ntimos�o 10 c�ntimos).
 * 
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio20 {

	public static void main(String[] args) {
		double dosEuros; 
		double unEuro;
		double cincuentaCentimos; 
		double veinteCentimos;
		double diezCentimos;
		double euros;
		double centimos; 
		double totalEuros;				
		double totalCentimos;
				
		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantas monedas de 2 euros tiene: ");
		dosEuros = sc.nextDouble();
		System.out.println("Cuantas monedas de 1 euro tiene: ");
		unEuro = sc.nextDouble();
		System.out.println("Cuantas monedas de 50 centimostiene: ");
		cincuentaCentimos = sc.nextDouble();
		System.out.println("Cuantas monedas de 20 centimostiene tiene: ");
		veinteCentimos = sc.nextDouble();
		System.out.println("Cuantas monedas de 10 centimostiene tiene: ");
		diezCentimos = sc.nextDouble();
		
		dosEuros = dosEuros * 2;
		unEuro = unEuro * 1;
		cincuentaCentimos = cincuentaCentimos * 0.5;
		veinteCentimos = veinteCentimos * 0.2;
		diezCentimos = diezCentimos * 0.1;
		euros = dosEuros + unEuro;
		centimos = cincuentaCentimos + veinteCentimos + diezCentimos;

		totalEuros = Math.round(euros + centimos);
		totalCentimos = (centimos * 100) + (euros * 100);

		System.out.println("Tiene " + totalEuros + " euros");
		System.out.println("Tiene " + totalCentimos + " c�ntimos");

	}

}
