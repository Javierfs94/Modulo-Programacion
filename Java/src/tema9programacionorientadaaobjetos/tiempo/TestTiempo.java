package tema9programacionorientadaaobjetos.tiempo;

/**
 * Programa para testear la clase tiempo
 * 
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class TestTiempo {

	public static void main(String[] args) {

		Tiempo t = new Tiempo(1, 50, 50);
		Tiempo t2 = new Tiempo(6, 60, 50);
		TiempoMejorado tiempo = new TiempoMejorado();

		System.out.println("Tiempo");
		System.out.println(t);
		t.sumar(2, 40, 30);
		System.out.println(t);
		t.restar(2, 40, 30);
		System.out.println(t);
		t.sumar(t2);
		System.out.println(t);

		System.out.println("\nTiempo mejorado");
		System.out.println(tiempo);
		tiempo.modificar(1, 1, 60);
		System.out.println(tiempo);
		tiempo.modificar(-1, -1, -60);
		System.out.println(tiempo);
	}

}
