package listados.listado3;
import java.util.Scanner;

/**
 * Algoritmo que pida caracteres e imprima �VOCAL� si son vocales y �NO VOCAL�
 * en caso contrario, el programa termina cuando se introduce un espacio.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio3 {

	public static void main(String[] args) {
  
	char caracter;
  
	Scanner entrada = new Scanner(System.in);
  
  
  do {
    System.out.println("Introduzca un caracter y le digo si es vocal o no");
    
    caracter = entrada.nextLine().charAt(0);
    
    if(caracter=='a'||caracter=='e'||caracter=='i'||caracter=='o'||caracter == 'u'||caracter=='A'||caracter=='E'||caracter=='I'||caracter=='O'||caracter == 'U'){
        System.out.println("VOCAL");
      } 
      else if(caracter == ' '){
       System.out.println("Ha introduciio un espacio en blanco. Saliendo del programa...");
      }
      
      else{
        System.out.println("NO VOCAL");
        }
   
  }while(caracter != ' ');

		
	}

}
