package tema9programacionorientadaaobjetos.vehiculo;

/**
 * Clase hija de Vehiculo (Bicicleta)
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Bicicleta extends Vehiculo {
	// atributos
	private int platos;

	/**
	 * Constructor de Bicicleta
	 */
	public Bicicleta(int platos) {
		super();
		this.setPlatos(platos);
	}

	/**
	 * Devuelve los platos de la bicicleta
	 * 
	 * @return el número de platos
	 */
	public int getPlatos() {
		return platos;
	}

	/**
	 * Establece el número de platos
	 * 
	 * @param platos
	 *          a establecer
	 */
	public void setPlatos(int platos) {
		this.platos = platos;
	}

	/**
	 * Hace un caballito
	 */
	public void hacerCaballito() {
		System.out.println("Estoy haciendo el caballito");
	}

}
