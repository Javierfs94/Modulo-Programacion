package tema9programacionorientadaaobjetos.colecciondiscos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ColeccionDeDiscosPrincipal.java Gestión de una colección de discos.
 * 
 * *
 * <p>
 * Modifica el programa “Colección de discos” como se indica a continuación:
 * </p>
 * <p>
 * a) Mejora la opción “Nuevo disco” de tal forma que cuando se llenen todas las
 * posiciones del array, el programa muestre un mensaje de error. No se
 * permitirá introducir los datos de ningún disco hasta que no se borre alguno
 * de la lista.
 * </p>
 * <p>
 * b) Mejora la opción “Borrar” de tal forma que se verifique que el código
 * introducido por el usuario existe.
 * </p>
 * <p>
 * c) Modifica el programa de tal forma que el código del disco sea único, es
 * decir que no se pueda repetir.
 * </p>
 * <p>
 * d) Crea un submenú dentro dentro de “Listado” de tal forma que exista un
 * listado completo, un listado por autor (todos los discos que ha publicado un
 * determinado autor), un listado por género (todos los discos de un género
 * determinado) y un listado de discos cuya duración esté en un rango
 * determinado por el usuario.
 * </p>
 * 
 * @author Fco Javier Frías Serrano
 * @author Rafa Cruz
 * @version 1.0
 */
public class ColeccionDeDiscosPrincipal {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion;
		int opcionListado;

		ArrayList<Disco> discos = new ArrayList<Disco>();

		discosDePrueba(discos);

		// Menu
		do {
			mostrarMenu();
			opcion = pedirOpcion();

			switch (opcion) {

			// LISTADO

			case 1:
				do {
					mostrarSubMenu();
					opcionListado = pedirOpcion();

					switch (opcionListado) {

					case 1: // Listado completo
						listarDiscos(discos);
						break;

					case 2: // Listado por autor
						listarAutor(discos);
						break;

					case 3: // Listado por género
						listarGenero(discos);
						break;

					case 4: // Listado en un rango de duración
						listarRango(discos);
						break;

					} // switch (opcionListado)
				} while (opcionListado != 5);

				break;
			// FIN LISTADO

			case 2:// NUEVO DISCO
				nuevoDisco(discos);
				break;

			case 3:// MODIFICAR
				modificarDisco(discos);
				break;

			case 4:// BORRAR
				borrarDisco(discos);
				break;

			} // switch
		} while (opcion != 5);
	}

  /**
   * @param discos
   */
  public static void discosDePrueba(ArrayList<Disco> discos) {
    discos.add(new Disco("Paco", "Prueba 1", "Pop", 120));
		discos.add(new Disco("Hulio", "Prueba 2", "Metal", 150));
		discos.add(new Disco("Paco", "Prueba 3", "Pop", 140));
		discos.add(new Disco("Julito", "Prueba 4", "Rock", 160));
  }

	/**
	 * @param discos
	 */
	public static void listarDiscos(ArrayList<Disco> discos) {
		for (Disco disco : discos) {
			mostrarDisco(disco);
		}
	}

	/**
	 * @param discos
	 */
	public static void listarAutor(ArrayList<Disco> discos) {
		String autorIntroducido;
		System.out.print("Introduzca el autor: ");
		autorIntroducido = entrada.next();
		entrada.nextLine();

		for (Disco disco : discos) {
			if ((disco.getAutor().equals(autorIntroducido))) {
				mostrarDisco(disco);
			}
		}
	}

	/**
	 * @param discos
	 */
	public static void listarGenero(ArrayList<Disco> discos) {
		String generoIntroducido;
		System.out.print("Introduzca el género: ");
		generoIntroducido = entrada.next();
		entrada.nextLine();
		for (Disco disco : discos) {
			if (((disco.getGenero().equals(generoIntroducido)))) {
				mostrarDisco(disco);
			}
		}
	}

	/**
	 * @param discos
	 */
	public static void listarRango(ArrayList<Disco> discos) {
		int limiteInferior;
		int limiteSuperior;
		System.out.println("Establezca el intervalo para la duración");
		System.out.print("Introduzca el límite inferior de duración en minutos: ");
		limiteInferior = entrada.nextInt();
		System.out.print("Introduzca el límite superior de duración en minutos: ");
		limiteSuperior = entrada.nextInt();

		for (Disco disco : discos) {
			if (((disco.getDuracion() <= limiteSuperior) && (disco.getDuracion() >= limiteInferior))) {
				mostrarDisco(disco);
			}
		}
	}

	/**
	 * Borra un disco
	 * 
	 * @param discos
	 * @return
	 */
	public static int borrarDisco(ArrayList<Disco> discos) {
		int i;
		System.out.println("\nBORRAR");
		System.out.println("======");

		System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
		int code = entrada.nextInt();
		entrada.nextLine();

		for (i = 0; i < discos.size(); i++) {
			discos.removeIf((auxDisco) -> auxDisco.getCodigoDisco() == code);
		}
		System.out.println("Artículo dado de baja correctamente.\n");
		return i;
	}

	/**
	 * Modifica un disco
	 * 
	 * @param discos
	 */
	public static void modificarDisco(ArrayList<Disco> discos) {
		int codigoIntroducido;
		String autorIntroducido;
		String tituloIntroducido;
		String generoIntroducido;
		String duracionIntroducidaString;
		System.out.println("\nMODIFICAR");
		System.out.println("===========");

		System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
		codigoIntroducido = entrada.nextInt();
		entrada.nextLine();

		for (Disco disco : discos) {

			if (disco.getCodigoDisco() == codigoIntroducido) {
				System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

				System.out.print("Nuevo autor: ");
				autorIntroducido = entrada.next();
				entrada.nextLine();
				if (!autorIntroducido.equals(" ")) {
					disco.setAutor(autorIntroducido);
				}
				System.out.print("Nuevo título: ");
				tituloIntroducido = entrada.next();
				entrada.nextLine();
				if (!tituloIntroducido.equals(" ")) {
					disco.setTitulo(tituloIntroducido);
				}
				System.out.print("Nuevo género: ");
				generoIntroducido = entrada.next();
				entrada.nextLine();
				if (!generoIntroducido.equals(" ")) {
					disco.setGenero(generoIntroducido);
				}
				System.out.print("Duración: ");
				duracionIntroducidaString = entrada.next();
				entrada.nextLine();
				if (!duracionIntroducidaString.equals(" ")) {
					disco.setDuracion(Integer.parseInt(duracionIntroducidaString));
				}

			}
		}
	}

	/**
	 * Crea un nuevo disco
	 * 
	 * @param discos
	 */
	public static void nuevoDisco(ArrayList<Disco> discos) {
		String autorIntroducido;
		String tituloIntroducido;
		String generoIntroducido;
		int duracionIntroducida;
		System.out.println("\nNUEVO DISCO");
		System.out.println("===========");

		System.out.print("Autor: ");
		autorIntroducido = entrada.next();
		entrada.nextLine();

		System.out.print("Título: ");
		tituloIntroducido = entrada.next();
		entrada.nextLine();

		System.out.print("Género: ");
		generoIntroducido = entrada.next();
		entrada.nextLine();

		System.out.print("Duración: ");
		duracionIntroducida = entrada.nextInt();

		discos.add(new Disco(autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducida));
		System.out.println("Disco introducido correctamente");
	}

	// METODOS

	/**
	 * Muestra el toString de Disco
	 * 
	 * @param disco
	 */
	public static void mostrarDisco(Disco disco) {
		System.out.println(disco);
	}

	/**
	 * Pide una opcion al usuario
	 * 
	 * @return numero entero
	 */
	public static int pedirOpcion() {
		int opcion;
		System.out.print("Introduzca una opción: ");
		opcion = entrada.nextInt();
		return opcion;
	}

	/**
	 * Menu principal
	 */
	public static void mostrarMenu() {
		System.out.println("\n\nCOLECCIÓN DE DISCOS");
		System.out.println("===================");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo disco");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
	}

	/**
	 * SubMenu. Menu de Listado
	 */
	public static void mostrarSubMenu() {
		System.out.println("\nLISTADO");
		System.out.println("=======");
		System.out.println("1. Completo");
		System.out.println("2. Por autor");
		System.out.println("3. Por género");
		System.out.println("4. En un rango de duración");
		System.out.println("5. Menú principal");
	}
}