package listados.listado2;
import java.util.Scanner;

/**
* Algoritmo que pida dos números ‘nota’ y ‘edad’ y un carácter ‘sexo’ y muestre el
* mensaje ‘ACEPTADA’ si la nota es mayor o igual a cinco, la edad es mayor o igual a
* dieciocho y el sexo es ‘F’. En caso de que se cumpla lo mismo, pero el sexo sea ‘M’, debe
* imprimir ‘POSIBLE’. Si no se cumplen dichas condiciones se debe mostrar ‘NO ACEPTADA’
* @author Fco Javier Frias Serrano
* @version 1.0
*/

class Ejercicio8{
	
	public static void main(String[] args){
	
		int nota,edad;
		char sexo;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca la nota: ");
		nota = s.nextInt();
		System.out.println("Introduzca la edad: ");
		edad = s.nextInt();
		System.out.println("Introduzca el sexo(F o M): ");
		sexo = s.next().charAt(0);

		if ((nota>=5) && (edad >=18)) {
			if ((sexo == 'F') || (sexo == 'f')){
				System.out.println("ACEPTADA");
			}  
			else if((sexo == 'M') || (sexo == 'm')){		
				System.out.println("POSIBLE");
			}	
		}else{
			System.out.println("NO ACEPTADA");
		}
		
	}
	
}