package listados.listado4;

/**
 * <p>
 * Define la clase Alumnos que obtenga aleatoriamente las notas de 30 alumnos.
 * La nota será un número decimal comprendido entre 0 y 10, ambos inclusive.
 * Utiliza métodos. Al finalizar el programa deberá mostrar:
 * </p>
 * <ul>
 * <li>a. Total de notas</li>
 * <li>b. Número de aprobados</li>
 * <li>c. Número de suspensos</li>
 * <li>d. Nota máxima</li>
 * <li>e. Nota mínima</li>
 * <li>f. Media</li>
 * </ul>
 * 
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Alumnos {

	public static void main(String[] args) {

		double nota;
		int i;
		int aprobados = 0;
		int suspensos = 0;
		double maxima = 0;
		double minima = 10;
		double media = 0;

		do {
			for (i = 1; i < 31; i++) {
				nota = generarAleatorio();
				mostrarNumero(nota);
				aprobados = getAprobados(nota, aprobados);
				suspensos = getSuspensos(nota, suspensos);
				maxima = getMayor(nota, maxima);
				minima = getNotaminima(nota, minima);
				media += nota;
			}
			media /= i;
			mostrarResultados(i, aprobados, suspensos, maxima, minima, media);
		} while (ComunicacionUsuario.continuar());

	}

	/**
	 * Genera un número aleatorio entre 0 y 10
	 * 
	 * @return numero aleatorio generado
	 */
	private static double generarAleatorio() {
		return (Math.random() * 10);
	}

	/**
	 * Muestra el número introducido
	 * 
	 * @param numero
	 *          introducido
	 */
	private static void mostrarNumero(double numero) {
		System.out.println(numero);
	}

	/**
	 * Comprueba cuantos aprobados hay
	 * 
	 * @param numero
	 *          de la nota
	 * @param aprobados
	 *          totales
	 * @return numero aprobados
	 */
	private static int getAprobados(double numero, int aprobados) {
		if (numero >= 5) {
			aprobados++;
		}
		return aprobados;
	}

	/**
	 * Comprueba cuantos suspensos hay
	 * 
	 * @param numero
	 *          de la nota
	 * @param suspensos
	 *          totales
	 * @return numero de suspensos
	 */
	private static int getSuspensos(double numero, int suspensos) {
		if (numero < 5) {
			suspensos++;
		}
		return suspensos;
	}

	/**
	 * Devuelve la nota máxima
	 * 
	 * @param nota
	 *          una nota
	 * @param notaMaxima
	 *          otra nota
	 * @return la nota maxima
	 */
	private static double getMayor(double nota, double notaMaxima) {
		if (nota > notaMaxima) {
			return nota;
		}
		return notaMaxima;
	}

	/**
	 * Comprueba la nota maxima
	 * 
	 * @param numero
	 *          de la nota
	 * @param minima
	 *          total
	 * @return la nota minima
	 */
	private static double getNotaminima(double numero, double minima) {
		if (numero < minima) {
			return numero;
		}
			return minima;
	}

	/**
	 * Muestra los resultados obtenidos
	 * 
	 * @param i
	 *          numero total de alumnos
	 * @param aprobados
	 *          numero de notas iguales o superior a 5
	 * @param suspensos
	 *          numero de notas inferiores a 5
	 * @param maxima
	 *          la nota máxima
	 * @param minima
	 *          la nota mínima
	 * @param media
	 *          la nota media
	 */
	private static void mostrarResultados(int i, int aprobados, int suspensos, double maxima, double minima,
			double media) {
		System.out.println("Total de notas: " + i);
		System.out.println("Número de aprobados: " + aprobados);
		System.out.println("Número de suspensos: " + suspensos);
		System.out.println("Nota máxima: " + maxima);
		System.out.println("Nota mínima: " + minima);
		System.out.println("Media: " + media);
	}

}
