package listados.listado1;

import java.util.Scanner;

/**
 * Escribir un algoritmo para calcular la nota final de un estudiante,
 * considerando //que�por cada respuesta correcta 5 puntos, por una incorrecta
 * -1 y por respuestas en�blanco 0. Imprime el resultado obtenido por el
 * estudiante.
 * 
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio19 {

	public static void main(String[] args) {
		double numPreguntas;
		double preguntaBlanco;
		double preguntaCorrecta;
		double preguntaIncorrecta;
		double nota;
		double notaFinal;

		Scanner sc = new Scanner(System.in);

		System.out.println("N�mero de preguntas: ");
		numPreguntas = sc.nextDouble();
		System.out.println("N�mero de preguntas correctas: ");
		preguntaCorrecta = sc.nextDouble();
		System.out.println("N�mero de preguntas incorrectas: ");
		preguntaIncorrecta = sc.nextDouble();
		System.out.println("N�mero de preguntas en blanco: ");
		preguntaBlanco = sc.nextDouble();

		preguntaCorrecta = preguntaCorrecta * 5;
		preguntaIncorrecta = preguntaIncorrecta * (-1);
		preguntaBlanco = preguntaBlanco * 0;
		nota = (preguntaCorrecta + preguntaBlanco + preguntaIncorrecta) / numPreguntas;
		notaFinal = (nota * 10) / 5;

		System.out.println("La nota final del alumno es " + notaFinal);
	}

}
