package tema9programacionorientadaaobjetos.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import utiles.Teclado;

/**
 * <p>
 * Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
 * contenidas en un fichero de texto. El nombre del fichero que contiene las
 * palabras se debe pasar como argumento en la línea de comandos. El nombre del
 * fichero resultado debe ser el mismo que el original añadiendo la coletilla
 * sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
 * línea.
 * </p>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>();

		String ruta = "C:\\Users\\d18frsej2\\eclipse-workspace\\PGNJava\\src\\tema9programacionorientadaaobjetos\\ficheros\\";
		String fichero = "";

		fichero = Teclado.leerCadena("Introduzca el nombre del fichero: ");

		try {
			BufferedReader leer = new BufferedReader(new FileReader(ruta + fichero + ".txt"));
			BufferedWriter escribir = new BufferedWriter(new FileWriter(ruta + fichero + "_sort.txt"));

			String linea = "";
			
			while (linea != null) {
				lista.add(linea);
				linea = leer.readLine();
			}

			leer.close();

			Collections.sort(lista);

			for (String cadena : lista) {
				escribir.write(cadena + " ");
			}

			System.out.println("Archivo ordenado y guardado con éxito");
			escribir.close();

		} catch (FileNotFoundException e) {
			System.err.println("El fichero indicado no existe");
		} catch (IOException e) {
			System.err.println("No se ha podido escribir en el archivo");
		}

	}
}
