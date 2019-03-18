package tema9programacionorientadaaobjetos.fraccion;

/**
 * <p>
 * 5. Crea una clase Fraccion de forma que podamos hacer las siguientes
 * operaciones:
 * </p>
 * <ul>
 * <li>Contruir un objeto Fraccion pasándole al constructor el numerador y el
 * denominador.</li>
 * <li>Obtener la fracción.</li>
 * <li>Obtener y modificar numerador y denominador. No se puede dividir por
 * cero.</li>
 * <li>Obtener resultado de la fracción (número real).</li>
 * <li>Multiplicar la fracción por un número.</li>
 * <li>Multiplicar, sumar y restar fracciones.</li>
 * <li>Simplificar la fracción.</li>
 * </ul>
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Fraccion {

	private double numerador;
	private double denominador;

	/**
	 * Constructor
	 * 
	 * @param numerador
	 *          de la fraccion
	 * @param denominador
	 *          de la fraccion
	 */
	public Fraccion(double numerador, double denominador) {
		setNumerador(numerador);
		setDenominador(denominador);
		simplificar();
	}

	/**
	 * Devuelve el numerador
	 * 
	 * @return numerador
	 */
	public double getNumerador() {
		return numerador;
	}

	/**
	 * Devuelve el denominador
	 * 
	 * @return denominador
	 */
	public double getDenominador() {
		return denominador;
	}

	/**
	 * Establece el numerador
	 * 
	 * @param numerador
	 *          de la fraccion
	 */
	private void setNumerador(double numerador) {
		this.numerador = numerador;
		if (this.numerador == 0) {
			System.out.println("El numerador no puede ser 0. Colocando numerador 1");
			this.numerador = 1;
		}
	}

	/**
	 * Establece el denominador
	 * 
	 * @param demoninador
	 *          de la fraccion
	 */
	private void setDenominador(double demoninador) {
		this.denominador = demoninador;
		if (this.denominador == 0) {
			System.out.println("El denominador no puede ser 0. Colocando denominador 1");
			this.denominador = 1;
		}
	}

	/**
	 * Suma de fracciones
	 * 
	 * @param fraccion1
	 *          Primera fraccion
	 * @param fraccion2
	 *          Segunda fraccion
	 * @return el resultado de la fraccion como cadena
	 */
	public static String sumar(Fraccion fraccion1, Fraccion fraccion2) {
		double auxNum = fraccion1.getNumerador() * fraccion2.getDenominador();
		double auxDen = fraccion2.getNumerador() * fraccion1.getDenominador();
		double auxDivisor = fraccion1.getDenominador() * fraccion2.getDenominador();
		return ((auxNum + auxDen) + " / " + auxDivisor);
	}

	/**
	 * Resta de fracciones
	 * 
	 * @param fraccion1
	 *          Primera fraccion
	 * @param fraccion2
	 *          Segunda fraccion
	 * @return el resultado de la fraccion como cadena
	 */
	public static String restar(Fraccion fraccion1, Fraccion fraccion2) {
		double auxNum = fraccion1.getNumerador() * fraccion2.getDenominador();
		double auxDen = fraccion2.getNumerador() * fraccion1.getDenominador();
		double auxDivisor = fraccion1.getDenominador() * fraccion2.getDenominador();
		return ((auxNum - auxDen) + " / " + auxDivisor);
	}

	/**
	 * Multiplica el numerador de la fraccion por un numero entero
	 * 
	 * @param numero
	 *          entero para multiplicar el numerador de la fraccion
	 * @return el numerador multiplicado
	 */
	public String multiplicarPorNumero(int numero) {
		this.numerador *= numero;
		return this.numerador + " / " + getDenominador();
	}

	/**
	 * Calcula laa multiplicacion entre 2 fracciones
	 * 
	 * @param x
	 *          fraccion 1
	 * @param y
	 *          fraccion 2
	 * @return fraccion c, resultane de la multiplicacion entre ambas
	 */
	public static Fraccion multiplicarFracciones(Fraccion x, Fraccion y) {
		double n;
		double d;
		n = x.getNumerador() * y.getNumerador();
		d = x.getDenominador() * y.getDenominador();
		Fraccion c = new Fraccion(n, d);
		return c;
	}

	/**
	 * Hallar el Minimo Común Divisor de una fracción
	 * 
	 * @return
	 */
	private double mcd() {
		double dividendo = this.numerador;
		double divisor = this.denominador;
		while (dividendo % divisor != 0) {
			double resto = dividendo % divisor;
			dividendo = divisor;
			divisor = resto;
		}

		return divisor;
	}

	/**
	 * Simplificar una fracción
	 */
	private void simplificar() {
		double mcd = mcd();
		this.numerador /= mcd;
		this.denominador /= mcd;
	}

	@Override
	public String toString() {
		return "Fraccion: " + getNumerador() + " / " + getDenominador();
	}

}
