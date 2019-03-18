package tema9programacionorientadaaobjetos.perro;

import java.util.Scanner;

/**
 * Programa que pruebo la clase Perro
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */

public class TestPerro {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		int opcion;
		
		Perro perro1 = new Perro("Toby", "Husky", "Macho", 6, 5);

		do {
			mostrarMenu();
			opcion = pedirOpcion();

			switch (opcion) {

			case 1:
				perro1.ladrar();
				break;
			case 2:
				System.out.print("¿Cuantos kilos quiere darle de comer?: ");
				perro1.alimentar(entrada.nextInt());
				entrada.nextLine();
				break;
			case 3:
				perro1.jugar();
				break;
			case 4:
				perro1.dormir();
				break;
			case 5:
				perro1.despertar();
				break;
			case 6:
				mostrarDatosPerro(perro1);
				break;
			case 7:
				ayuda();
				break;
			case 8:
				salir();
				break;
			default:
				System.err.println("No ha introducido una opción válida");
				break;
			}
		} while (opcion != 8);
	}

	private static void ayuda() {
		System.out.println("En este programa simulamos el funcionamiento de un Tamagochi, pero con un perro.");
		System.out.println("Puede hacerlo ladrar, alimentarlo, que juege, duerma y despierte.");
		System.out.println("Cada vez que juege con el animal, el peso se reducirá, hasta que no pueda jugar más por cansancio.");
		System.out.println("Si el animal está cansado, tendrá que dormir para dejar de estarlo.");
		System.out.println("Si el animal está dormido, no podrá hacer nada más hasta que se despierte.");
		System.out.println("El peso máximo del animal es 15 y el mínimo 5.");
	}

	/**
	 * @param perro1
	 */
	private static void mostrarDatosPerro(Perro perro1) {
		System.out.println(perro1.toString());
	}

	/**
	 * Sale del programa
	 */
	private static void salir() {
		System.out.println("Ha seleccionado Salir. ¡Hasta pronto!");
	}

	/**
	 * Muestra el menu de opciones
	 */
	private static void mostrarMenu() {
		System.out.println("### MENU ###");
		System.out.println("1. Ladrar");
		System.out.println("2. Alimentar");
		System.out.println("3. Jugar");
		System.out.println("4. Dormir");
		System.out.println("5. Despertar");
		System.out.println("6. Mostrar información del perro");
		System.out.println("7. Ayuda");
		System.out.println("8. Salir");
	}

	/**
	 * Pide la opcion al usuario
	 * 
	 * @return opcion introducida
	 */
	private static int pedirOpcion() {
		System.out.print("Introduzca una opción: ");
		int opcion = entrada.nextInt();
		entrada.nextLine();
		return opcion;
	}

}
