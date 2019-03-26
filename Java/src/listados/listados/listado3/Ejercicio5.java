package listados.listado3;
import java.util.Scanner;

/**
 * Escribe un programa que pida el limite inferior y superior de un intervalo. Si el l�mite inferior es mayor que el superior 
 * lo tiene que volver a pedir.�A continuaci�n se van introduciendo n�meros hasta que introduzcamos el 0. Cuando termine el programa dar� 
 * las siguientes informaciones:
 *  � La suma de los n�meros que est�n dentro del intervalo (intervalo abierto).
 *  � Cuantos n�meros est�n fuera del intervalo.
 *  � Informa si hemos introducido alg�n n�mero igual a los l�mites del intervalo.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio5 {

	public static void main(String[] args) {
    //Variables
    int limiteInferior;
    int limiteSuperior;
    int numIntroducido;
    int entreLimites = 0;
    int contadorFueraLimites = 0;
    int contadorIgualALimites = 0;
    
    Scanner entrada = new Scanner(System.in);   
       
    //Bucle para pedir limites correctos
    do{
      System.out.println("Introduzca el limite inferior: ");
      limiteInferior = entrada.nextInt();
      System.out.println("Introduzca el limite superior: ");
      limiteSuperior = entrada.nextInt();
    }while(limiteInferior>limiteSuperior);
    
    //Bucle para introducir numeros hasta 0
    do{
      System.out.println("Introduzca un numero: ");
      numIntroducido = entrada.nextInt();
      
      if(numIntroducido>limiteInferior && numIntroducido<limiteSuperior){
        entreLimites += numIntroducido;
      }else if (numIntroducido<limiteInferior|| numIntroducido>limiteSuperior){
        contadorFueraLimites++;
      }else if (numIntroducido==limiteInferior|| numIntroducido==limiteSuperior){
        contadorIgualALimites++;
      }
        
    }while(numIntroducido != 0);  
    
    //Mostrando los resultados pedidos
    System.out.println("Suma de los n�meros que est�n dentro del intervalo (intervalo abierto): " + entreLimites);
    System.out.println("Numeros que estan fuera del intervalo: " + contadorFueraLimites);
    System.out.println("Numeros introducidos igual a los limites del intervalo: " + contadorIgualALimites);

	}

}
