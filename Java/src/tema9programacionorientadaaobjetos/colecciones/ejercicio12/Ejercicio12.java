package tema9programacionorientadaaobjetos.colecciones.ejercicio12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import tema9programacionorientadaaobjetos.colecciones.ejercicio8.Carta;
import tema9programacionorientadaaobjetos.colecciones.ejercicio8.Figura;
import tema9programacionorientadaaobjetos.colecciones.ejercicio8.Palo;

/**
 * <p>
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja
 * española y que sume los puntos según el juego de la brisca. El valor de las
 * cartas se debe guardar en una estructura HashMap que debe contener parejas
 * (figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser
 * una estructura de la clase ArrayList que contiene objetos de la clase Carta.
 * El valor de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo
 * → 3, rey → 4; el resto de cartas no vale nada.
 * </p>
 * <p>
 * <ul>
 * <li>Ejemplo:</li>
 * <li>as de oros</li>
 * <li>cinco de bastos</li>
 * <li>caballo de espadas</li>
 * <li>sota de copas</li>
 * <li>tres de oros</li>
 * <li>Tienes 26 puntos</li>
 * </ul>
 * </p>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class Ejercicio12 {

	public static void main(String[] args) {

		ArrayList<Carta> Baraja = new ArrayList<Carta>();
		ArrayList<Carta> Descartes = new ArrayList<Carta>();
		HashMap<String, Integer> h = new HashMap<String, Integer>();

		int puntos = 0;

		h.put("as", 11);
		h.put("dos", 0);
		h.put("tres", 10);
		h.put("cuatro", 0);
		h.put("cinco", 0);
		h.put("seis", 0);
		h.put("siete", 0);
		h.put("sota", 2);
		h.put("caballo", 3);
		h.put("rey", 4);

		for (Figura figura : Figura.values()) {
			for (Palo palo : Palo.values()) {
				Baraja.add(new Carta(figura, palo));
			}
		}

		Collections.shuffle(Baraja);

		for (int i = 0; i < 5; i++) {
			Descartes.add(Baraja.remove(0));
		}

		for (Carta miCarta : Descartes) {
			System.out.println(miCarta);
			puntos += h.get(miCarta.getFigura());
		}

		System.out.println("Tienes " + puntos + " puntos");

	}

}
