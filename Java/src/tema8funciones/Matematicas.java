package tema8funciones;

/**
 * <p>
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
 * funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * Observa bien lo que hace cada función ya que, si las implementas en el orden
 * adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
 * resulta trivial teniendo voltea y la función siguientePrimo también es muy
 * fácil de implementar teniendo esPrimo.
 * </p>
 * <ul>
 * <li>1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro
 * es capicúa y falso en caso contrario.</li>
 * <li>2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro es
 * primo y falso en caso contrario.</li>
 * <li>3. siguientePrimo: Devuelve el menor primo que es mayor al número que se
 * pasa como parámetro.</li>
 * <li>4. potencia: Dada una base y un exponente devuelve la potencia.</li>
 * <li>5. digitos: Cuenta el número de dígitos de un número entero.</li>
 * <li>6. voltea: Le da la vuelta a un número.</li>
 * <li>7. digitoN: Devuelve el dígito que está en la posición n de un número
 * entero. Se empieza contando por el 0 y de izquierda a derecha.</li>
 * <li>8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
 * dentro de un número entero. Si no se encuentra, devuelve -1.</li>
 * <li>9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la
 * derecha).</li>
 * <li>10. quitaPorDelante: Le quita a un número n dígitos por delante (por la
 * izquierda).</li>
 * <li>11. pegaPorDetras: Añade un dígito a un número por detrás.</li>
 * <li>12. pegaPorDelante: Añade un dígito a un número por delante.</li>
 * <li>13. trozoDeNumero: Toma como parámetros las posiciones inicial y final
 * dentro de un número y devuelve el trozo correspondiente.</li>
 * <li>14. juntaNumeros: Pega dos números para formar uno.</li>
 * </ul>
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Matematicas {

	/**
	 * 1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro es
	 * capicúa y falso en caso contrario.
	 * 
	 * @param numero
	 *          Numero que se quiere comprobar si es capicua
	 * @return Devuelve verdadero si el numero es capicua y falso si no lo es
	 */
	public static boolean esCapicua(int numero) {
		if (numero == voltea(numero)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro es
	 * primo y falso en caso contrario.
	 * 
	 * @param numero
	 *          Numero que se quiere comprobar si es primo o no
	 * @return Devuelve verdadero si es primo y falso si no lo es
	 */

	public static boolean esPrimo(int numero) {
		if (numero < 2) {
			return false;
		} else {
			for (long i = numero / 2; i >= 2; i--) {
				if (numero % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * 3. siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa
	 * como parámetro.
	 * 
	 */
	public static int siguientePrimo(int x) {
		while (!esPrimo(++x)) {
		}
		;

		return x;
	}

	/**
	 * 4. potencia: Dada una base y un exponente devuelve la potencia.
	 * 
	 * @param base
	 *          Base de la potencia
	 * @param exponente
	 *          Exponente de la potencia
	 * @return resultado de la potencia
	 */
	public static int potencia(int base, int exponente) {
		int potencia = 0;
		if (exponente == 0) {
			return 1;
		}

		else if (exponente < 0) {
			return (int) (1 / Math.pow(base, exponente));
		}

		else if (exponente > 0) {
			return (int) Math.pow(base, exponente);
		}
		return potencia;

	}

	/**
	 * 5. digitos: Cuenta el número de dígitos de un número entero.
	 * 
	 */
	public static int digitos(long x) {
		if (x < 0) {
			x = -x;
		}

		if (x == 0) {
			return 1;
		} else {
			int n = 0;
			while (x > 0) {
				x = x / 10; // se le quita un dígito a x
				n++; // incrementa la cuenta de dígitos
			}
			return n;
		}
	}

	/**
	 * 6. voltea: Le da la vuelta a un número.
	 * 
	 */
	public static int voltea(int numero) {
		int cifra, inverso = 0;
		while (numero != 0) {
			cifra = numero % 10;
			inverso = (inverso * 10) + cifra;
			numero /= 10;
		}
		return inverso;
	}

	/**
	 * 7. digitoN: Devuelve el dígito que está en la posición n de un número entero.
	 * Se empieza contando por el 0 y de izquierda a derecha.
	 * 
	 */
	public static char digitoN(int x, int n) {

		String cadena1 = Integer.toString(x);

		char cadena2 = cadena1.charAt(n);

		return cadena2;
	}

	/**
	 * 8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
	 * dentro de un número entero. Si no se encuentra, devuelve -1.
	 * 
	 */
	public static int posicionDeDigito(int x, int d) {
		int i;

		for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {
		}
		;

		if (i == digitos(x)) {
			return -1;
		} else {
			return i;
		}
	}

	/**
	 * 9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la
	 * derecha).
	 * 
	 */
	public static int quitaPorDetras(int x, int n) {
		return x /  potencia(10, n);
	}
	/**
	 * 10. quitaPorDelante: Le quita a un número n dígitos por delante (por la
	 * izquierda).
	 * 
	 */
  public static int quitaPorDelante(int x, int n) {
    x = pegaPorDetras(x, 1); // "cierra" el número por si acaso termina en 0
    x = voltea(quitaPorDetras(voltea(x), n));
    x = quitaPorDetras(x, 1);
    return x;
  }
	/**
	 * 11. pegaPorDetras: Añade un dígito a un número por detrás.
	 * 
	 */
  public static int pegaPorDetras(int x, int d) {
    return juntaNumeros(x, d);
  }
	/**
	 * 12. pegaPorDelante: Añade un dígito a un número por delante.
	 * 
	 */
  public static int pegaPorDelante(int x, int d) {
    return juntaNumeros(d, x);
  }
	/**
	 * 13. trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro
	 * de un número y devuelve el trozo correspondiente.
	 * 
	 */
  public static int trozoDeNumero(int x, int inicio, int fin) {
    int longitud = digitos(x);
    x = quitaPorDelante(x, inicio);
    x = quitaPorDetras(x, longitud - fin - 1);
    return x;
  }
	/**
	 * 14. juntaNumeros: Pega dos números para formar uno.
	 * 
	 */
  public static int juntaNumeros(int x, int y) {
    return (x * potencia(10, digitos(y))) + y;
  }
}
