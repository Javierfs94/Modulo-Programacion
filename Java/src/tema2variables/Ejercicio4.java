package tema2variables;

/**
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 * convertir deber� estar almacenada en una variable.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		double euros = 5;
		double pesetas;

		pesetas = Math.round(166.486 * euros);

		System.out.println(euros + " euros son " + pesetas + " pesetas");

	}

}
