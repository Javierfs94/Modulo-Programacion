package tema9programacionorientadaaobjetos.circulo;

import javax.swing.JOptionPane;

/**
 * <p>
 * 2. Crea la clase “Circulo” en Java que responda al siguiente comportamiento:
 * </p>
 * <ul>
 * <li>Un círculo puede crecer. Aumenta su radio.</li>
 * <li>Un círculo puede menguar. Decrementa su radio.</li>
 * <li>Un círculo me devuelve su área si se la pido.</li>
 * <li>Un círculo me dice su estado, por ejemplo “Soy un círculo de radio 0.5
 * metros. Ocupo un área de 0.7853981633974483 metros cuadrados” (método
 * toString())</li>
 * </ul>
 * 
 * <p>
 * Modifica la clase Círculo para que cuando el radio se convierta a 0 el
 * círculo reaccione y diga con una caja de texto gráfica “Soy un mísero punto
 * sin área” usando la clase JOptionPane del paquete javax.swing
 * </p>
 *
 * <p>
 * Area= PI*radio^2
 * </p>
 * 
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */

public class Circulo {
	/**
	 * Variables
	 */
	private double radio;

	/**
	 * Constructor de Circulo
	 * 
	 * @param radio
	 */
	public Circulo(double radio) {
		setRadio(radio);
	}

	/**
	 * Devuelve el radio
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * Establece el radio del circulo
	 * 
	 * @param radio
	 *          a establecer
	 */
	private void setRadio(double radio) {
		this.radio = radio;
		if (this.radio == 0) {
			System.out.println(JOptionPane.showInputDialog("Soy un mísero punto sin área"));
		} else if (this.radio < 0) {
			System.out.println("El radio no puede ser negativo. Asignado valor de 0");
			this.radio = 0;
			System.out.println(JOptionPane.showInputDialog("Soy un mísero punto sin área"));
		}
	}

	/**
	 * Incrementa el radio del circulo
	 * 
	 * @param num
	 *          veces a incrementar
	 */
	public void crecer(double num) {
		setRadio(getRadio() + num);
	}

	/**
	 * Mengua el radio del circulo
	 * 
	 * @param num
	 *          veces a menguar
	 */
	public void menguar(double num) {
		setRadio(getRadio() - num);
	}

	/**
	 * Calcula el del circulo y la devuelve
	 * 
	 * @return area del circulo
	 */
	public double getArea() {
		return Math.PI * Math.pow(radio, 2);
	}

	@Override
	public String toString() {
		return "Soy un círculo de radio " + getRadio() + " metros. Ocupo un área de " + getArea() + " metros cuadrados";
	}

}
