package listados.listado2;
import java.util.Scanner;

/**
//Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, 
//América Central, América del Sur, Europa y Asia. El costo por el servicio de transporte se basa 
//en el peso del paquete y la zona a la que va dirigido. Lo anterior se muestra en la tabla:
//	ZONA 						UBICACIÓN 							COSTO/GRAMO
//	1 							América del Norte 					24.00 euros
//	2 							América Central  					20.00 euros
//	3 							América del Sur  					21.00 euros
//	4 							Europa  							10.00 euros
//	5 							Asia  								18.00 euros
//Parte de su política implica que los paquetes con un peso superior a 5 kg no son transportados, 
//esto por cuestiones de logística y de seguridad. Realice un algoritmo para determinar el cobro por 
//la entrega de un paquete o, en su caso, el rechazo de la entrega.
*
* @author Fco Javier Frias Serrano
* @version 1.0
*/

class Ejercicio20{
	
	public static void main(String[] args){
	int pais;
		double peso, cobro;

		Scanner s = new Scanner(System.in);

		System.out.println("Elige la ubicacion para saber el coste de transporte");
		System.out.println("1: America del Norte");
		System.out.println("2: America Central");
		System.out.println("3: America del Sur");
		System.out.println("4: Europa");
		System.out.println("5: Asia");
		pais = s.nextInt();

		switch (pais) {
		case 1:
			System.out.println("Introduce el peso");
			peso = s.nextDouble();
			;
			if (peso < 5000) {
				cobro = 24000 * peso;
				System.out.println("Cobro: " + cobro + "€");
			} else {
				System.out.println("No se puede realizar el envio");
			}

		case 2:
			System.out.println("Introduce el peso");
			peso = s.nextDouble();
			;
			if (peso < 5000) {
				cobro = 20000 * peso;
				System.out.println("Cobro: " + cobro + "€");
			} else {
				System.out.println("No se puede realizar el envio");
			}

			break;
		case 3:
			System.out.println("Introduce el peso");
			peso = s.nextDouble();
			;
			if (peso < 5000) {
				cobro = 21000 * peso;
				System.out.println("Cobro: " + cobro + "€");
			} else {
				System.out.println("No se puede realizar el envio");

			}

			break;

		case 4:
			System.out.println("Introduce el peso");
			peso = s.nextDouble();
			if (peso < 5000) {
				cobro = 10000 * peso;
				System.out.println("Cobro: " + cobro + "€");
			} else {
				System.out.println("No se puede realizar el envio");
			}

			break;

		case 5:
			System.out.println("Introduce el peso");
			peso = s.nextDouble();
			if (peso < 5000) {
				cobro = 18000 * peso;
				System.out.println("Cobro: " + cobro + "€");
			} else {
				System.out.println("No se puede realizar el envio");
			}
			break;

		default:
			System.out.println("Ubicación no disponible");
		}
		
	}
	
}

