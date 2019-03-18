package listados.listado3;
import java.util.Scanner;

/**
 * Pide una cadena y un car�cter por teclado y muestra cuantas veces aparece el
 * car�cter en la cadena.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio10 {

	public static void main(String[] args) {
    //Variables
    String cadena;
    String caracter;
    int contadorCaracteres = 0;
    
    Scanner entrada = new Scanner(System.in);
    //Peticion al usuario de la cadena y el caracter
    System.out.println("Introduzca una cadena: ");
    cadena = entrada.nextLine();
    System.out.println("Introduzca un caracter: ");
    caracter = entrada.next();
    

    for(int i = 0; i<cadena.length(); i++){
      if(cadena.charAt(i) == caracter.charAt(0)){
        contadorCaracteres++;
        }
      }
  
    if(contadorCaracteres != 0){
		System.out.println("La cadena " + cadena + " tiene el caracter " + caracter + " " + contadorCaracteres + " veces");
      } else{
			System.out.println("No se ha encontrado el caracter introducido");
        }

	}

}
