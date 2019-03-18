package tema7arrays.bidimensionales;

/**
 * Define un array de n�meros enteros de 3 filas por 6 columnas con nombre num y
 * asigna los valores seg�n la siguiente tabla. Muestra el contenido de todos
 * los elementos del array dispuestos en forma de tabla como se muestra en la
 * figura.
 *
 * @author Francisco Javier Fr�as Serrano
 * @version 1.0
 */
public class Ejercicio1 {
	// Constantes
	private static final int NUM_FILAS = 3;
	private static final int NUM_COLUMNAS = 6;

	public static void main(String[] args) {
		// Variables
		int[][] num = new int[NUM_FILAS][NUM_COLUMNAS];
		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		num[1][0] = 75;
		num[1][4] = 0;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;

		// Muestra la tabla con las columnas
		System.out.print("num    ");
		for (int i = 0; i < num[0].length; i++) {
			System.out.print("   Columna " + i);
		}
		// Muestra las filas y los numeros de cada fila y columna
		for (int i = 0; i < num.length; i++) {
			System.out.print("\nFila " + i);// Muestra cada fila de la tabla
			for (int j = 0; j < num[i].length; j++) {
				System.out.printf("%10d ", num[i][j]);// Muestra los numeros del array bidimensional formateados
			}
		}

	}

}
