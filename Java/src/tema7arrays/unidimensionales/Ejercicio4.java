package tema7arrays.unidimensionales;

/**
 * Define tres arrays de 20 n�meros enteros cada una, con nombres numero,
 * cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100.
 * En el array cuadrado se deben almacenar los cuadrados de los valores que hay
 * en el array numero. En el array cubo se deben almacenar los cubos de los
 * valores que hay en numero. A continuaci�n, muestra el contenido de los tres
 * arrays dispuesto en tres columnas.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio4 {

  public static void main(String[] args) {

    // Variables
    int numero[] = new int[20];
    int cuadrado[] = new int[20];
    int cubo[] = new int[20];

    System.out.println("N�mero\tCuadrado Cubo");
    System.out.println("######################");
    for (int i = 0; i < numero.length-1; i++) {
      numero[i] = (int) (Math.random() * 100); // Genera un numero aleatorio entre 0 y 100
      cuadrado[i] = (int) Math.pow(numero[i], 2); // Realiza la potencia cuadrada del array de los numeros
      cubo[i] = (int) Math.pow(numero[i], 3); // Realiza la potencia cubica del array de los numeros

      System.out.println(numero[i] + "\t" + cuadrado[i] + "\t " + cubo[i]); // Muestra los resultados de los 3 arrays

    }

  }

}
