package listados.listado4;

/**
 * *
 * <p>
 * El siguiente código muestra el funcionamiento de las palabras reservadas
 * break y continue. Similar a este código, crea la clase Multiplos17Hasta200
 * que utilice el bucle for, y Multiplos73Hasta1000 que utilice el bucle
 * do-while.
 * </p>
 * <p>
 * Nota: Ejercicio modificado para incluir todo en la misma clase y con metodos
 * </p>
 * 
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Multiplos {

	public static void main(String[] args) {

		int i = 0;

		getMultiplos7Hasta100(i);

		getMultiplos17Hasta200();

		getMultiplos32Hasta1000(i);
	}

	/**
	 * @param i
	 */
	private static void getMultiplos32Hasta1000(int i) {
		System.out.println("\n Múltiplos de 73 hasta 1000: ");
		do {
			i++;

			if (i % 73 != 0) {
				continue;
			}
			System.out.print("\t" + i);

		} while (i < 1000);
	}

	/**
	 * 
	 */
	private static void getMultiplos17Hasta200() {
		System.out.println("\n Múltiplos de 7 hasta 100: ");
		for (int i = 1; i < 200; i++) {
			if (i % 17 != 0) {
				continue;
			}
			System.out.print("\t" + i);
		}
	}

	/**
	 * @param i
	 */
	private static void getMultiplos7Hasta100(int i) {
		System.out.println("\n Múltiplos de 7 hasta 100: ");
		while (true) {
			i++;
			if (i > 100)
				break;
			if (i % 7 != 0)
				continue;
			System.out.print("\t" + i);
		}
	}

}
