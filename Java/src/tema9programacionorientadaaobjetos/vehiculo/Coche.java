package tema9programacionorientadaaobjetos.vehiculo;

/**
 * Clase hija de Vehiculo (Coche)
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Coche extends Vehiculo {
	// atributos
	private int caballos;

	/**
	 * Constructor de Coche
	 */
	public Coche(int caballos) {
		super();
		this.setCaballos(caballos);
	}

	/**
	 * Devuelve los caballos del coche
	 * 
	 * @return el número caballos
	 */
	public int getCaballos() {
		return caballos;
	}

	/**
	 * Establece el número de caballos
	 * 
	 * @param caballos
	 *          a establecer
	 */
	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	/**
	 * Quema las ruedas del coche
	 */
	public void quemarRueda() {
		System.out.println("Estoy quemando las ruedas");
	}

}
