package tema2variables;

/**
 * Escribe un programa en el que se declaren las variables enteras x e y.
 * As�gnales los valores 144 y 999 respectivamente. A continuaci�n, muestra por
 * pantalla el valor de cada variable, la suma, la resta, la divisi�n y la
 * multiplicaci�n.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		int x = 144;
		int y = 999;

		System.out.println(x + " + " + y + " = " + (x + y));
		System.out.println(x + " - " + y + " = " + (x - y));
		System.out.println(x + " * " + y + " = " + (x * y));
		System.out.println(x + " / " + y + " = " + ((double)x / y));
	}

}
