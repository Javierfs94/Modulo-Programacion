package listados.listado3;
import java.util.Scanner;

/**
 * Crea una aplicaci�n que permita adivinar un n�mero. 
 * La aplicaci�n genera un n�mero aleatorio del 1 al 100. 
 * A continuaci�n va pidiendo n�meros y va respondiendo si el n�mero a adivinar es mayor o menor que el introducido,
 * adem�s de los intentos que te quedan (tienes 10 intentos para acertarlo). 
 * El programa termina cuando se acierta el n�mero (adem�s te dice en cuantos intentos lo has acertado), 
 * si se llega al limite de intentos te muestra el n�mero que hab�a generado.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		//Variables
		int numIntroducido;
		int intentos = 10;
		boolean acertado = false;
		int numGenerado;
		int intento = 0;
    
		Scanner entrada = new Scanner(System.in);

		//Generacion de la variable aleatoria
		numGenerado = (int)(Math.random() * 101 + 1);

		while ((!acertado) && (intentos > 0)) {
			System.out.println("Introduzca un n�mero");
			numIntroducido = entrada.nextInt();

			if (numIntroducido == numGenerado) {
				acertado = true;
			} else {
				System.out.println("No ha acertado. Vuelva ha intentarlo");
				intento++;
				if (numIntroducido < numGenerado) {
					System.out.println("El n�mero introducido es MENOR que el generado");
				} else {
					System.out.println("El n�mero introducido es MAYOR que el generado");
				}
			}
			intentos--;

		} 
		//Comprobacion si ha acertado o no
		//Muestra los numeros de intentos en que se logro si es true o el numero generado si es false
		if (acertado) {
			System.out.println("�Ha acertado el n�mero!");
			System.out.println("Lo ha logrado en " + intento + " intentos");
		} else {
			System.out.println("No ha logrado acertar. El n�mero era " + numGenerado + " �M�s suerte la pr�xima vez!");
		}
	}

}
