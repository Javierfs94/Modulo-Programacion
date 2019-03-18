package tema9programacionorientadaaobjetos.vehiculo;

import java.util.Scanner;

/**
 * Clase Main para probar la funcionalidad del programa
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Test {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// atributos
		int opcion;
		int km;
		// objetos
		Bicicleta bici1 = new Bicicleta(3);
		Coche coche1 = new Coche(50);

		do {
			mostrarMenu();
			opcion = pedirOpcion();

			switch (opcion) {
			case 1:
				km = pedirKm();
				bici1.recorrer(km);
				break;
			case 2:
				bici1.hacerCaballito();
				break;
			case 3:
				km = pedirKm();
				coche1.recorrer(km);
				break;
			case 4:
				coche1.quemarRueda();
				break;
			case 5:
				System.out.println("La bicicleta lleva recorrida " + bici1.getKilometrosRecorridos() + " km");
				break;
			case 6:
				System.out.println("El coche lleva recorrido " + coche1.getKilometrosRecorridos() + " km");
				break;
			case 7:
				System.out.println("Los vehículos llevan recorridos " + Vehiculo.getKilometrosTotales() + " km");
				break;
			case 8:
				salir();
				break;
			default:
				System.err.println("Ha introducido una opción inválida.");
				break;
			}
		} while (opcion != 8);

	}

	/**
	 * Pide por entrada los km a recorrer
	 * 
	 * @return los kilometros introducidos
	 */
	private static int pedirKm() {
		int km;
		System.out.println("¿Cuántos km quiere recorrer?");
		km = entrada.nextInt();
		return km;
	}

	/**
	 * Sale del programa
	 */
	private static void salir() {
		System.out.println("Ha seleccionado salir. ¡Hasta luego!");
		System.out.println("Vehículos creados en total: " + Vehiculo.getVehiculosCreados() + " vehículos");
	}

	/**
	 * Muestra el Menu de opciones
	 */
	public static void mostrarMenu() {
		System.out.println("VEHÍCULOS");
		System.out.println("=========");
		System.out.println("1. Anda con la bicicleta");
		System.out.println("2. Haz el caballito con la bicicleta");
		System.out.println("3. Anda con el coche");
		System.out.println("4. Quema rueda con el coche");
		System.out.println("5. Ver kilometraje de la bicicleta");
		System.out.println("6. Ver kilometraje del coche");
		System.out.println("7. Ver kilometraje total");
		System.out.println("8. Salir");
		System.out.print("Elige una opción (1-8):");

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
