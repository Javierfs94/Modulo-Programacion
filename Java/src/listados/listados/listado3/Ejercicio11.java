package listados.listado3;
import java.util.Scanner;

/**
*Suponiendo que hemos introducido una cadena por teclado que representa una frase (palabras separadas por espacios), 
*realiza un programa que cuente cuantas palabras tiene.
* 
*@author Fco Javier Frias Serrano
*/

class Ejercicio11{
  public static void main(String[] args){
    
    //Variables
    String cadena;
    int numPalabras=0;
    
    Scanner entrada=new Scanner (System.in);
    
    System.out.println("Introduzca una cadena.");
    cadena=entrada.nextLine();
        
    for (int i=0; i<cadena.length(); i++) {
      if (cadena.charAt(i) == ' '){
        numPalabras ++;
      }
    }
    System.out.println("La cantidad de palabras en la cadena es: " + (numPalabras));
  }
}
