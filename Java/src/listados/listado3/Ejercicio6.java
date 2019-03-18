package listados.listado3;
import java.util.Scanner;

/**
 * Escribe un programa que dados dos n�meros, uno real (base) y un entero
 * positivo (exponente), saque por pantalla el resultado de la potencia. No se
 * puede utilizar el operador de potencia.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio6 {

	public static void main(String[] args) {
	//Variables
	int base;
	int exponente;
	int potencia = 1;
  
	Scanner s = new Scanner(System.in);

	//Peticion de la base al usuario
	System.out.println("Introduzca la base: ");
	base = s.nextInt();
	//Comprobacion del exxponente positivo
  do{
    System.out.println("Introduzca el exponente (tiene que ser positivo): ");
    exponente = s.nextInt();  
  if(exponente<0){
    System.err.println("El exponente no puede ser negativo");
    }  
  }while(exponente<=0);
  //Calculo de la potencia manual sin utilizar metodos 
  for(int i = 0 ; i<exponente; i++){
      potencia *= base;
  }
  //Mostrando el resultado de la potencia
  System.out.println(base + " ^ " + exponente + " = "+ potencia);
  
	}

}
