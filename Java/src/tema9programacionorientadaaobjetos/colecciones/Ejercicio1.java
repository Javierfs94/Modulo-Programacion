package tema9programacionorientadaaobjetos.colecciones;

import java.util.ArrayList;

/**
 * <p>
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
 * muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
 * todo el ArrayList sin usar ningún índice.
 * </p>
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		ArrayList<String> compañeros = new ArrayList<>();

		compañeros.add("Javi");
		compañeros.add("Rafa");
		compañeros.add("Cristina");
		compañeros.add("Jose Luis");
		compañeros.add("Adria");
		compañeros.add("Juanbu");

		for (String recorrerCompañeros : compañeros) {
			System.out.println(recorrerCompañeros);
		}

		
	}
}
