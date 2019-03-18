package tema9programacionorientadaaobjetos.tiempo;

/**
 * Clase Main para probar la funcionalidad del programa
 * 
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class TestTiempo {

	public static void main(String[] args) {

		Tiempo t = new Tiempo(1, 20, 30);

		System.out.println(t);
		t.sumar(2, 40, 30);
		System.out.println(t);
		t.restar(2, 40, 30);
		System.out.println(t);

	}

}
