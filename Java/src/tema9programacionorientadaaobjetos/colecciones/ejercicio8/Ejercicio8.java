package tema9programacionorientadaaobjetos.colecciones.ejercicio8;

import java.util.ArrayList;
import java.util.Collections;

/**
 * <p>
 * Realiza un programa que escoja al azar 10 cartas de la baraja española (10
 * objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 * </p>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class Ejercicio8 {

	public static void main(String[] args) {

		ArrayList<Carta> Baraja = new ArrayList<Carta>();
		ArrayList<Carta> Descartes = new ArrayList<Carta>();

		crearBaraja(Baraja);

		barajar(Baraja); 

		sacarCartas(Baraja, Descartes);

		mostrarCartas(Descartes);

	}

	/**
	 * Genera la baraja. Recorre cada figura y cada palo, y luego añade la carta a
	 * la baraja.
	 * 
	 * @param Baraja
	 */
	private static void crearBaraja(ArrayList<Carta> Baraja) {
		for (Figura figura : Figura.values()) {
			for (Palo palo : Palo.values()) {
				Baraja.add(new Carta(figura, palo));
			}
		}
	}

	/**
	 * Baraja las cartas de la baraja
	 * 
	 * @param Baraja
	 */
	private static void barajar(ArrayList<Carta> Baraja) {
		Collections.shuffle(Baraja);
	}

	/**
	 * Saca 10 cartas de la Baraja
	 * 
	 * @param Baraja
	 * @param Descartes
	 */
	private static void sacarCartas(ArrayList<Carta> Baraja, ArrayList<Carta> Descartes) {
		for (int i = 0; i < 10; i++) {
			Descartes.add(Baraja.remove(0)); // elimina la 1º carta del ArrayList Baraja y la añade al ArrayList Descartes
		}
	}

	/**
	 * Muestra las cartas sacadas de la baraja
	 * 
	 * @param Descartes
	 */
	private static void mostrarCartas(ArrayList<Carta> Descartes) {
		for (Carta carta : Descartes) {
			System.out.println(carta);
		}
	}
}
