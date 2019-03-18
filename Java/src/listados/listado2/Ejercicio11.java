package listados.listado2;
import java.util.Scanner;

/**
*	Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones de los lados de un
*	triángulo. El programa debe determinar que tipo de triangulo es, teniendo en cuenta los siguiente:
*	•Si se cumple Pitágoras entonces es triángulo rectángulo
*	•Si sólo dos lados del triángulo son iguales entonces es isósceles.
*	•Si los 3 lados son iguales entonces es equilátero.
*	•Si no se cumple ninguna de las condiciones anteriores, es escaleno.
*
* @author Fco Javier Frias Serrano
* @version 1.0
*/

class Ejercicio11{

	public static void main(String[] args){
	
	double a;
  double b;
  double c;
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Valor del lado a");
	a = s.nextDouble();
	System.out.println("Valor del lado b");
	b = s.nextDouble();
	System.out.println("Valor del lado c");
	c = s.nextDouble();
	
	if(Math.pow(a,2) == (Math.pow(b,2) + Math.pow(c,2))){
		System.out.println("Triangulo rectangulo");
	} else if((a==b) || (a==c)|| (b==c)){
		System.out.println("Triangulo isosceles");	
	} else if((a==b) && (a==c) && (b==c)){
		System.out.println("Triangulo equilatero");		
	} else{
		System.out.println("Triangulo escaleno");	
	}
	
	
	}

}
