package tema9programacionorientadaaobjetos.terminal;

/**
 * <p>
 * Implementa la clase Terminal. Un terminal tiene asociado un número. Los
 * terminales se pueden llamar unos a otros y el tiempo de conversación corre
 * para ambos. A continuación se proporciona el contenido del main y el
 * resultado que debe aparecer por pantalla.
 * </p>
 * 
 * <p>
 * Contenido del main: (lo he trasladado a la clase Test)
 * </p>
 * <ul>
 * <li>Salida</li>
 * <li>Nº 678 11 22 33 - 0s de conversación</li>
 * <li>Nº 644 74 44 69 - 0s de conversación</li>
 * <li>Nº 678 11 22 33 - 520s de conversación</li>
 * <li>Nº 644 74 44 69 - 320s de conversación</li>
 * <li>Nº 622 32 89 09 - 200s de conversación</li>
 * <li>Nº 664 73 98 18 - 0s de conversación</li>
 * </ul>
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Terminal {

	private String numero;
	private int tiempo;

	/**
	 * Constructor
	 * 
	 * @param numero
	 */
	public Terminal(String numero) {
		setNumero(numero);
	}

	/**
	 * Devuelve el numero de telefono
	 * 
	 * @return numero de telefono
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Establece el numero de telefono
	 * 
	 * @param numero
	 *          de telefono a establecer
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * Devuelve el tiempo
	 * 
	 * @return the tiempo
	 */
	public int getTiempo() {
		return tiempo;
	}

	/**
	 * Establece el tiempo
	 * 
	 * @param tiempo
	 *          a establecer
	 */
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	/**
	 * Realiza una llamada de un terminal a otro.
	 * 
	 * Se suman los tiempos a ambos.
	 * 
	 * @param terminal
	 *          que recibe la llamada
	 * @param tiempo
	 *          en segundos de conversacion
	 */
	public void llama(Terminal terminal, int tiempo) {
		this.tiempo += tiempo;
		terminal.setTiempo(terminal.getTiempo() + tiempo);
	}

	@Override
	public String toString() {
		return "Nº " + getNumero() + " - " + getTiempo() + "s de conversación";
	}

}
