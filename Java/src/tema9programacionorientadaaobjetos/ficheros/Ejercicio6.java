package tema9programacionorientadaaobjetos.ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import utiles.Teclado;

/**
 * <p>
 * Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
 * fichero. Tanto el nombre del fichero como la palabra se deben pasar como
 * argumentos en la línea de comandos.
 * </p>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class Ejercicio6 {

	public static void main(String[] args) {

		String ruta = "C:\\Users\\d18frsej2\\eclipse-workspace\\PGNJava\\src\\tema9programacionorientadaaobjetos\\ficheros\\";
		int contador = 0;
		String fichero = "";
		String palabra = "";
		
		try {
			fichero = Teclado.leerCadena("Introduzca el nombre del fichero: ");
			palabra = Teclado.leerCadena("¿Qué palabra deseas contar?");
		} catch (IOException e) {
			System.err.println("Error al introducir una cadena de texto");
		}

		try {
			BufferedReader leer = new BufferedReader(new FileReader(ruta + fichero + ".txt"));

			String linea = "";
			String contenidoLinea = "";

			while (linea != null) {
				contenidoLinea = linea;
				linea = leer.readLine();
				if (contenidoLinea.equals(palabra)) {
					contador++;
				}
			}

			leer.close();

		} catch (FileNotFoundException e) {
			System.err.println("El fichero no se ha podido encontrar");
		} catch (IOException e) {
			System.err.println("Error en la lectura del fichero");
		}

		System.out.println("La palabra " + palabra + " se ha encontrado " + contador + " veces.");

	}
}
