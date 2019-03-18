package tema9programacionorientadaaobjetos.tiempocondate;

/**
 * Clase Main para probar la funcionalidad del programa
 * 
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class TestTiempoConDate {

	public static void main(String[] args) {

		TiempoConDate tiempo = new TiempoConDate();

		System.out.println(tiempo);
		tiempo.modificar(1, 1, 60);
		System.out.println(tiempo);
		tiempo.modificar(-1, -1, -60);
		System.out.println(tiempo);

	}
}
