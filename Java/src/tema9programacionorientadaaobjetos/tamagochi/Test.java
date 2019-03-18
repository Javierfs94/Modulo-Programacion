package tema9programacionorientadaaobjetos.tamagochi;

import java.util.Scanner;

/**
 * Programa que pruebo la clase Perro
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */

public class Test {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion;

		Perro perro = new Perro("Toby", "Rodbailer", Sexo.MACHO);
		do {
			mostrarMenu();
			opcion = pedirOpcion();

			switch (opcion) {
			case 1:
				perro.saludar();
				break;
			case 2:
				System.out.print("¿Cuantos kilos quiere darle de comer?: ");
				perro.comer(entrada.nextInt());
				entrada.nextLine();
				break;
			case 3:
				perro.jugar();
				break;
			case 4:
				mostrarDatosPerro(perro);
				break;
			case 5:
				ayuda();
				break;
			case 6:
				salir();
				break;
			default:
				System.err.println("No ha introducido una opción válida");
				break;
			}
		} while (opcion != 6);
	}

	private static void ayuda() {
		System.out.println("En este programa simulamos el funcionamiento de un Tamagochi, pero con un animal.");
	}

	/**
	 * Muestra los datos del animal
	 * 
	 * @param perro
	 *          objeto introducido
	 */
	private static void mostrarDatosPerro(Perro perro) {
		System.out.println(perro);
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
		System.out.println("4. Mostrar información del perro");
		System.out.println("5. Ayuda");
		System.out.println("6. Salir");
		System.out.print("Introduzca una opción: ");
	}

	/**
	 * Pide la opcion al usuario
	 * 
	 * @return opcion introducida
	 */
	private static int pedirOpcion() {
		int opcion = entrada.nextInt();
		entrada.nextLine();
		return opcion;
	}

}
