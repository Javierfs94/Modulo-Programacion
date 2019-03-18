package tema9programacionorientadaaobjetos.colecciones;

import java.util.ArrayList;
import java.util.Collections;
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
 * <p>
 * Realiza un programa que escoja al azar 5 palabras en español del
 * minidiccionario del ejercicio anterior. El programa irá pidiendo que el
 * usuario teclee la traducción al inglés de cada una de las palabras y
 * comprobará si son correctas. Al final, el programa deberá mostrar cuántas
 * respuestas son válidas y cuántas erróneas.
 * </p>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class Ejercicio11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		HashMap<String, String> diccionario = new HashMap<String, String>();
		ArrayList<String> diccionarioCompleto = new ArrayList<String>();
		ArrayList<String> palabrasAleatorioas = new ArrayList<String>();

		int aciertos = 0;
		int fallos = 0;
		int indice = 0;

		annadirDiccionario(diccionario);

		diccionarioCompleto.addAll(diccionario.keySet());

		Collections.shuffle(diccionarioCompleto);

		for (int i = 0; i < 5; i++) {
			palabrasAleatorioas.add(diccionarioCompleto.remove(0));
		}

		for (String palabra : palabrasAleatorioas) {
			System.out.println("Introduzca la traducción de la palabra: - " + palabra + ": ");
			String respuesta = entrada.nextLine();

			if (respuesta.contains(diccionario.get(palabrasAleatorioas.get(indice)))) {
				aciertos++;
			} else {
				fallos++;
			}
			indice++;

		}

		System.out.println("Has acertado " + aciertos + " palabras y has fallado " + fallos + " palabras.");

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
