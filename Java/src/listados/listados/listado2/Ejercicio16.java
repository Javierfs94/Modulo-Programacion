package listados.listado2;
import java.util.Scanner;

/**
//La política de cobro de una compañía telefónica es: cuando se realiza una llamada, el cobro es 
//por el tiempo que ésta dura, de tal forma que los primeros cinco minutos cuestan 1 euro, los 
//siguientes tres, 80 céntimos, los siguientes dos minutos, 70 céntimos, y a partir del décimo minuto, 
//50 céntimos. Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día, en turno 
//de mañana, 15 %, y en turno de tarde, 10 %. Realice un algoritmo para determinar cuánto debe 
//pagar por cada concepto unavpersona que realiza una llamada..
*
* @author Fco Javier Frias Serrano
* @version 1.0
*/

class Ejercicio16{
	
	public static void main(String[] args){
				
    int timellamada;
    int dia;
		double costellamada;
    double acumulacoste;
		String turno;

		Scanner s = new Scanner(System.in);

		System.out.println("Introduce el tiempo de la llamada en minutos");
		timellamada = s.nextInt();
		System.out.println("Introduce el numero correspondiente al dia de la semana (1 a 7)");
		dia = s.nextInt();
		System.out.println("Introduzca el turno, mañana o tarde");
		turno = s.next();

		if (timellamada > 10) {
			costellamada = 0.50 + 0.70 + 0.80 + 1;
			if (dia == 7) {
				costellamada = costellamada + 0.03;
				System.out.println("Coste llamada: " + costellamada + "€");
			}
			if ((dia >= 1) && (dia <= 6)) {
				if (turno == "mañana") {
					costellamada = costellamada + 0.15;
					System.out.println("Coste llamada: " + costellamada + "€");
				}
				if (turno == "tarde") {
					costellamada = costellamada + 0.10;
					System.out.println("Coste llamada: " + costellamada + "€");
				}
			}
		}

		if ((timellamada >= 9) && (timellamada <= 10)) {
			costellamada = 0.70 + 0.80 + 1;
			if (dia == 7) {
				costellamada = costellamada + 0.03;
				System.out.println("Coste llamada: " + costellamada + "€");
			}
			if ((dia >= 1) && (dia <= 6)) {
				if (turno == "mañana") {
					costellamada = costellamada + 0.15;
					System.out.println("Coste llamada: " + costellamada + "€");
				}
				if (turno == "tarde") {
					costellamada = costellamada + 0.10;
					System.out.println("Coste llamada: " + costellamada + "€");
				}
			}
		}
		if ((timellamada >= 6) && (timellamada <= 8)) {
			costellamada = 0.80 + 1;
			if (dia == 7) {
				costellamada = costellamada + 0.03;
				System.out.println("Coste llamada: " + costellamada + "€");
			}
			if ((dia >= 1) && (dia <= 6)) {
				if (turno == "mañana") {
					costellamada = costellamada + 0.15;
					System.out.println("Coste llamada: " + costellamada + "€");
				}
				if (turno == "tarde") {
					costellamada = costellamada + 0.10;
					System.out.println("Coste llamada: " + costellamada + "€");
				}
			}
		}
		if ((timellamada >= 0) && (timellamada <= 5)) {
			costellamada = 1;
			if (dia == 7) {
				costellamada = costellamada + 0.03;
				System.out.println("Coste llamada: " + costellamada + "€");
			}
			if ((dia >= 1) && (dia <= 6)) {
				if (turno == "mañana") {
					costellamada = costellamada + 0.15;
					System.out.println("Coste llamada: " + costellamada + "€");
				}
				if (turno == "tarde") {
					costellamada = costellamada + 0.10;
					System.out.println("Coste llamada: " + costellamada + "€");
				}
			}
		}
	
		
	}
	
}


