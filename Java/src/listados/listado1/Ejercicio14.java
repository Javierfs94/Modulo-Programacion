package listados.listado1;
import java.util.Scanner;

/**
 * Dado un n�mero de dos cifras, dise�e un algoritmo que permita obtener
 * el�n�mero invertido.
 * 
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		double cifra1,cifra2,x,inverso;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la cifra con 2 decimales");
		x=sc.nextDouble();
		//Realizamos la inversion de las cifras
		cifra1=x/10;
		cifra2=-x%10;
		inverso=Math.round((cifra2*10)+cifra1);

		System.out.println("La cifra "+x+" su inverso es "+inverso);
	}

}
