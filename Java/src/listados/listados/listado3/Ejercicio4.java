package listados.listado3;
import java.util.Scanner;

/**
 * Escribir un programa que imprima todos los n�meros pares entre dos n�meros
 * que se le pidan al usuario.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio4 {

	public static void main(String[] args) {
    //Variables
    int numInicio;
    int numFin;
        
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Introduzca el rango inicial: ");
    numInicio = entrada.nextInt();
    System.out.println("Introduzca el rango final: ");
    numFin = entrada.nextInt();
    
    for(int i = numInicio; i<=numFin; i++){
      if(i%2==0){
        System.out.println(i);
      }
    
    }

	}

}
