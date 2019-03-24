package tema9programacionorientadaaobjetos.tiempo;

import tema9programacionorientadaaobjetos.tiempo.excepciones.TiempoNoValidoException;

/**
 * Programa para testear la clase tiempo
 * 
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class TestTiempo {

	public static void main(String[] args) throws TiempoNoValidoException {

		Tiempo t1 = new Tiempo(1, 20, -30);
		Tiempo t2 = new Tiempo(6, 60, 0);
		TiempoMejorado tiempo = new TiempoMejorado();

		System.out.println(t1);
		t1.sumar(2, 40, 30);
		System.out.println(t1);
		t1.restar(2, 40, 30);
		System.out.println(t1);
		t1.sumar(t2);
		System.out.println(t1);

		System.out.println(tiempo);
		tiempo.modificar(1, 1, 60);
		System.out.println(tiempo);
		tiempo.modificar(-1, -1, -60);
		System.out.println(tiempo);

	}

}
