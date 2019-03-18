package tema9programacionorientadaaobjetos.terminal;

import java.text.DecimalFormat;

/**
 * <p>
 * Implementa la clase Movil como subclase de Terminal (la clase del ejercicio
 * anterior que ya no hace falta modificar). Cada móvil lleva asociada una
 * tarifa que puede ser “rata”, “mono” o “bisonte”. El coste por minuto es de 6,
 * 12 y 30 céntimos respectivamente. Se tarifican los segundos exactos.
 * Obviamente, cuando un móvil llama a otro, se le cobra al que llama, no al que
 * recibe la llamada. A continuación se proporciona el contenido del main y el
 * resultado que debe aparecer por pantalla. Para que el total tarificado
 * aparezca con dos decimales, puedes utilizar DecimalFormat.
 * </p>
 * <ul>
 * <li>Salida</li>
 * <li>Nº 678 11 22 33 - 0s de conversación - tarificados 0,00 euros</li>
 * <li>Nº 644 74 44 69 - 0s de conversación - tarificados 0,00 euros</li>
 * <li>Nº 678 11 22 33 - 520s de conversación - tarificados 0,52 euros</li>
 * <li>Nº 644 74 44 69 - 870s de conversación - tarificados 1,10 euros</li>
 * <li>Nº 622 32 89 09 - 750s de conversación - tarificados 0,00 euros</li>
 * </ul>
 * 
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Movil extends Terminal {
	// atributos
	private String tarifa;
	private double totalTarifa;

	/**
	 * Constructor
	 * 
	 * @param numero
	 *          de telefono del usuario
	 * @param tarifa
	 *          tipo del movil
	 */
	public Movil(String numero, String tarifa) {
		super(numero);
		this.tarifa = tarifa;
	}

	/**
	 * Devuelve la tarifa
	 * 
	 * @return the tarifa
	 */
	public String getTarifa() {
		return tarifa;
	}

	/**
	 * Establece la tarifa
	 * 
	 * @param tarifa
	 *          a establecer
	 */
	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}

	/**
	 * Devuelve la tarifa total
	 * 
	 * @return totalTarifa
	 */
	public double getTotalTarifa() {
		return totalTarifa;
	}

	/**
	 * Establece la tarifa total
	 * 
	 * @param totalTarifa
	 *          a establecer
	 */
	public void setTotalTarifa(double totalTarifa) {
		this.totalTarifa = totalTarifa;
	}

	/**
	 * Realiza una llamada de un terminal a otro.
	 * 
	 * Se suman los tiempos a ambos.
	 * 
	 * Tarifas: “rata”, “mono” o “bisonte”.El coste por minuto es de 6, 12 y 30
	 * céntimos respectivamente.
	 * 
	 * @param terminal
	 *          que recibe la llamada
	 * @param tiempo
	 *          en segundos de conversacion
	 */
	public void llama(Terminal terminal, int tiempo) {
		super.llama(terminal, tiempo);
		double minutos = (double) tiempo / 60;

		switch (this.tarifa) {
		case "rata":
			this.totalTarifa += minutos * 0.06;
			break;
		case "mono":
			this.totalTarifa += minutos * 0.12;
			break;
		case "bisonte":
			this.totalTarifa += minutos * 0.30;
			break;
		}
	}

	@Override
	public String toString() {
		DecimalFormat eurosFormateados = new DecimalFormat("0.00");
		return super.toString() + " - tarificados " + eurosFormateados.format(getTotalTarifa()) + " euros";
	}

}
