package listados.listado3;
import java.util.Scanner;

/**
 * Pide una cadena y dos caracteres por teclado (valida que sea un car�cter),
 * sustituye la aparici�n del primer car�cter en la cadena por el segundo
 * car�cter.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio12 {

	public static void main(String[] args) {

   //Variables
   String cadena;
   String caracterABuscar;
   String caracterASustituir;
   String nuevaCadena = "";
  
   Scanner entrada = new Scanner(System.in);
  
  //Pedimos datos
   System.out.println("Introduzca una cadena: ");
   cadena = entrada.nextLine();
  do{
   System.out.println("Introduzca el caracter a sustituir: ");
   caracterABuscar = entrada.next();
  }while(caracterABuscar.length() != 1);
 
  do{
   System.out.println("Introduzca el caracter sustituto: ");
   caracterASustituir = entrada.next();  
   }while(caracterASustituir.length() != 1);

  nuevaCadena=cadena.replace(caracterABuscar.charAt(0),caracterASustituir.charAt(0));    
	System.out.println("La cadena modificada es: "+nuevaCadena);

	}

}
