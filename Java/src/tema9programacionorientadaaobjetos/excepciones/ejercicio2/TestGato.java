package tema9programacionorientadaaobjetos.excepciones.ejercicio2;

/**
 * Programa que prueba la clase GatoSimple
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class TestGato {

	public static void main(String[] args) {

		Gato garfield = new Gato("macho");
		Gato tom = new Gato("macho");
		Gato lisa = new Gato("hembra");

		try {
			garfield.apareaCon(tom);
//			garfield.apareaCon(lisa);
		} catch (ApareamientoImposibleException e) {
			System.err.println("Imposible aparear. Los gatos solo pueden aparearse entre distintos sexos.");

		}

	}

}
