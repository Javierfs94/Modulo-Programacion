package listados.listado1;
import java.util.Scanner;

/**
 * Realizar un algoritmos que lea un n�mero y que muestre su ra�z cuadrada�y su
 * ra�z c�bica.� PSeInt no tiene ninguna funci�n predefinida que permita
 * calcular la ra�z c�bica,��c�mo se puede calcular?
 * 
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		
		int num;
		double raizCuadrada,raizCubica;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un n�mero para hacerle la ra�z cuadrada y c�bica: ");
		num=sc.nextInt();
		
		raizCuadrada=Math.sqrt(num);
		raizCubica=num^(1/3);
		
		System.out.println("La ra�z cuadrada es: "+raizCuadrada);
		System.out.println("La ra�z c�bica es: "+raizCubica);
	}

}
