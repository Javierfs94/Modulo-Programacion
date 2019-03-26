package listados.listado4;

/**
 * <p>
 * El siguiente código muestra el funcionamiento de las palabras reservadas
 * break y continue. Similar a este código, crea la clase Multiplos17Hasta200
 * que utilice el bucle for, y Multiplos73Hasta1000 que utilice el bucle
 * do-while.
 * </p>
 * <p>
 * Nota: codigo original
 * </p>
 * 
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Multiplos7Hasta100 {

	public static void main(String[] args) {
		
		int i = 0;
		
		System.out.println("Múltiplos de 7 hasta 100: ");
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
