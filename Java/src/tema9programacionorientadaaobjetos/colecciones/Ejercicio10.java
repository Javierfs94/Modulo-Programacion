package tema9programacionorientadaaobjetos.colecciones;

import java.util.HashMap;
import java.util.Scanner;

/**
 * <p>
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap
 * para almacenar las parejas de palabras. El programa pedirá una palabra en
 * español y dará la correspondiente traducción en inglés.
 * </p>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		HashMap<String, String> diccionario = new HashMap<String, String>();

		annadirDiccionario(diccionario);

		System.out.println("Introduzca una palabra en español y te doy su traducción al inglés:");
		String palabra = entrada.nextLine();

		if (diccionario.containsKey(palabra)) {
			System.out.println(palabra + " en inglés es " + diccionario.get(palabra));
		} else {
			System.err.println("No existe la palabra introducida");
		}

		entrada.close();

	}

	/**
	 * Genera el diccionario
	 * 
	 * @param diccionario
	 */
	private static void annadirDiccionario(HashMap<String, String> diccionario) {
		diccionario.put("Casa", "House");
		diccionario.put("Perro", "Dog");
		diccionario.put("Gato", "Cat");
		diccionario.put("Flor", "Flower");
		diccionario.put("Comida", "Food");
		diccionario.put("Chico", "Boy");
		diccionario.put("Chica", "Girl");
		diccionario.put("Padre", "Dad");
		diccionario.put("Madre", "Mum");
		diccionario.put("Hijo", "Son");
		diccionario.put("Hija", "Daughter");
		diccionario.put("Abuelo", "Grandfather");
		diccionario.put("Abuela", "Grandmother");
		diccionario.put("Pajaro", "Bird");
		diccionario.put("Caballo", "Horse");
		diccionario.put("Volar", "Fly");
		diccionario.put("España", "Spain");
		diccionario.put("Español", "Spanish");
		diccionario.put("Iglesia", "Church");
		diccionario.put("Escuela", "School");
	}

}
