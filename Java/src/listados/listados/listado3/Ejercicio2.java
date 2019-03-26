package listados.listado3;
import java.util.Scanner;

/**
 * Realizar un algoritmo que pida n�meros (se pedir� por teclado la cantidad de
 * n�meros a introducir). El programa debe informar de cuantos n�meros
 * introducidos son mayores que 0, menores que 0 e iguales a 0.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio2 {

	public static void main(String[] args) {

    int numeros; //Cuenta los numeros que el usuario debera introducir por teclado
    int numero; //Numero introducido por teclado
    int mayor = 0; //Total de numeros mayores que 0
    int menor = 0; //Total de numeros menores que 0
    int igual = 0; //Total de numeros iguales que 0
    
    Scanner entrada = new Scanner(System.in);
    
	//Pedimos el total de numeros a introducir por teclado al usuario
    System.out.println("Introduzca cuantos numeros va ha introducir: ");
    numeros = entrada.nextInt();
    
	for(int i=0; numeros>i; i++){
		System.out.println("Introduzca un numero: ");
		numero = entrada.nextInt();
    
		if(numero>0){
			mayor++;
		}else if(numero<0){
			menor++; 
		}else{
			igual++;  
		}
    
    }
    
      System.out.println("Hay " + mayor + " numeros mayores que 0 en total");
      System.out.println("Hay " + menor + " numeros menores que 0 en total");
      System.out.println("Hay " + igual + " numeros iguales que 0 en total");
    
  }
}
