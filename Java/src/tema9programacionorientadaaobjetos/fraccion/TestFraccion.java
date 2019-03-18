package tema9programacionorientadaaobjetos.fraccion;

/**
 * Test de la clase Fraccion
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class TestFraccion {

	public static void main(String[] args) {

		Fraccion fraccion1 = new Fraccion(10, 3);
		Fraccion fraccion2 = new Fraccion(4, 5);
		Fraccion fraccion3 = new Fraccion(4, 0);
		System.out.println(fraccion3);
		System.out.println(fraccion3.getDenominador());
		System.out.println(Fraccion.sumar(fraccion1, fraccion2));
		System.out.println(Fraccion.restar(fraccion1, fraccion2));
		System.out.println(fraccion1.multiplicarPorNumero(5));
		System.out.println(Fraccion.multiplicarFracciones(fraccion1, fraccion2));
	}

}
