package tema9programacionorientadaaobjetos.ejercicioexamen;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * <p>
 * 1.- Muestra un menú con las siguientes opciones:
 * </p>
 * <p>
 * - Introducir (por teclado) una fecha en formato dd/mm/aaaa.
 * <p>
 * Pide una fecha al usuario, si no se introduce correctamente se devuelve un
 * mensaje de error. Usa una función booleana para validar la fecha.
 * </p>
 * <p>
 * - Sumar días a la fecha.
 * </p>
 * <p>
 * Pide un número de días (positivo) para sumar a la fecha introducida
 * previamente y actualiza su valor. Esta opción sólo podrá realizarse si hay
 * una fecha introducida, si no la hay mostrará un mensaje de error, si el
 * número de días introducido no es positivo también. Usa una función que
 * recibirá la fecha, el número de días a sumarle y devolverá la nueva fecha.
 * </p>
 * <p>
 * - Restar días a la fecha.
 * </p>
 * <p>
 * Pide un número de días (negativo) para sumar a la fecha introducida
 * previamente y actualiza su valor. Esta opción sólo podrá realizarse si hay
 * una fecha introducida, si no la hay mostrará un mensaje de error, si el
 * número de días introducido no es negativo también. Usa la función del
 * apartado anterior.
 * </p>
 * <p>
 * - Comparar la fecha introducida con otra.
 * </p>
 * <p>
 * Pide una fecha al usuario (válida, si no lo es da error) y la comparará con
 * la que tenemos almacenada, posteriormente mostrará si esta fecha es anterior,
 * igual o posterior a la que tenemos almacenada, usará una función para ello a
 * la que le pasaremos las dos fechas y devolverá un valor negativo si la 1ª es
 * ANTERIOR a la 2ª, 0 si son IGUALES y un valor positivo si es POSTERIOR.
 * </p>
 * <p>
 * - Mostrar fecha.
 * </p>
 * <p>
 * - Terminar.
 * </p>
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */

public class Fecha {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // El formato con el que se mostrara la fecha.
		Calendar a = GregorianCalendar.getInstance();
		Calendar a2 = GregorianCalendar.getInstance();
		int opcion; // Variable entera que hace de selector del menu de eleccion.
		int diasSumRes; // Variable entera que suma o restat los dias a la fecha segum toque.
		String Fecha = "";

		do {
			mostrarMenu();
			opcion = pedirOpcion();

			switch (opcion) {
			case 1: // Opcion de Introduccion de fecha.
				a = Verifica();
				Fecha = sdf.format(a.getTime());
				break;
			case 2:
				if (Fecha == "") {
					System.out.println("No hay Fecha");
				} else {
					// Suma dias a la fecha guardada
					System.out.println("Introduce los dias a sumar a la fecha:");
					diasSumRes = entrada.nextInt();
					a.add(Calendar.DATE, diasSumRes);
					System.out.println("La fecha es:" + sdf.format(a.getTime()));
				}
				break;
			case 3:
				if (Fecha == "") {
					System.out.println("No hay Fecha");
				} else {
					System.out.println("Introduce los dias a restar a la fecha:");
					diasSumRes = entrada.nextInt();
					a.add(Calendar.DATE, -diasSumRes);
					System.out.println("La fecha es:" + sdf.format(a.getTime()));
				}
				break;
			case 4:
				if (Fecha == "") {
					System.out.println("No hay Fecha");
				} else {
					System.out.println("Comparamos dos fechas: La guardada y la introducida.");
					a2 = Verifica();
					if (a.compareTo(a2) > 0) {
						System.out.println("La fecha guardada es mayor que la introducida.");
					} else {
						System.out.println("La fecha guardada es menor que la introducida.");
					}
				}
				break;
			case 5:
				if (Fecha == "") {
					System.out.println("No hay Fecha");
				} else {
					System.out.println("La fecha guardada es:" + sdf.format(a.getTime()));
				}
				break;
			case 6:
				System.out.println("Adios :)");
				break;
			default:
				System.out.println("No existe esta opcion.");
				break;
			}

		} while (opcion != 6);

	}

	/**
	 * Pide una opción al usuario
	 * 
	 * @return numero entero
	 */
	public static int pedirOpcion() {
		int opcion;
		opcion = entrada.nextInt();
		entrada.nextLine();
		return opcion;
	}

	/**
	 * Muestra el menu del tiempo.
	 */
	public static void mostrarMenu() {
		System.out.println("Menu:");
		System.out.println("1 Añadir fecha al programa.");
		System.out.println("2 Sumar dias a la fecha guardada.");
		System.out.println("3 Restar dias a la fecha guardada.");
		System.out.println("4 Comprobar fecha con otra introducida.");
		System.out.println("5 Mostrar fecha.");
		System.out.println("6 Salir.");
		System.out.print("Elegir opcion entre (1-6):");
	}

	/**
	 * @param String
	 *          Fecha que hemos introducdo anteriormente
	 * @return Calendar Devuelve la fecha formateada
	 * 
	 *         Este formatea la fecha y la guarda en el objeto para su posterior
	 *         uso.
	 */
	public static Calendar obtenerFecha(String Fecha) {
		Calendar a = GregorianCalendar.getInstance();
		String[] partes;
		int d, m, y;

		if (Fecha.contains("/") && Fecha.length() == 10) {
			partes = Fecha.split("/");
			d = Integer.parseInt(partes[0]);
			m = Integer.parseInt(partes[1]);
			y = Integer.parseInt(partes[2]);

			switch (m) {
			case 1:
				a.set(y, Calendar.JANUARY, d);
				break;
			case 2:
				a.set(y, Calendar.FEBRUARY, d);
				break;
			case 3:
				a.set(y, Calendar.MARCH, d);
				break;
			case 4:
				a.set(y, Calendar.APRIL, d);
				break;
			case 5:
				a.set(y, Calendar.MAY, d);
				break;
			case 6:
				a.set(y, Calendar.JUNE, d);
				break;
			case 7:
				a.set(y, Calendar.JULY, d);
				break;
			case 8:
				a.set(y, Calendar.AUGUST, d);
				break;
			case 9:
				a.set(y, Calendar.SEPTEMBER, d);
				break;
			case 10:
				a.set(y, Calendar.OCTOBER, d);
				break;
			case 11:
				a.set(y, Calendar.NOVEMBER, d);
				break;
			case 12:
				a.set(y, Calendar.DECEMBER, d);
				break;
			default:
				a.set(0, 0, 0);
				break;
			}
		} else {
			a.set(0, 0, 0);
		}
		return a;
	}

	/**
	 * Verifica si la fecha introducida es correcta
	 * 
	 * @return Calendar
	 */
	public static Calendar Verifica() {

		Scanner s = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar a = GregorianCalendar.getInstance();
		String Fecha, Verifica;

		do {
			System.out.println("Introduzca la fecha: ");
			Fecha = s.nextLine();

			a = obtenerFecha(Fecha);

			Verifica = sdf.format(a.getTime());

			if (!Fecha.equals(Verifica)) {
				System.out.println("Fecha mal introducida");
			}
		} while (!Fecha.equals(Verifica));
		return a;
	}
}
