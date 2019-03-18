package tema2variables;

/**
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
 * convertir deber� estar almacenada en una variable.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		double pesetas = 600;
		double euros;

		euros = Math.round(pesetas / 166.386);

		System.out.println(pesetas + " pesetas son " + euros + " euros");

	}

}
