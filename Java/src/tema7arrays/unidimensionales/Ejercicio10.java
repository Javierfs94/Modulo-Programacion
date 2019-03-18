package tema7arrays.unidimensionales;

/**
 * Escribe un programa que genere 20 n�meros enteros aleatorios entre 0 y 100 y
 * que los almacene en un array. El programa debe ser capaz de pasar todos los
 * n�meros pares a las primeras posiciones del array (del 0 en adelante) y todos
 * los n�meros impares a las celdas restantes. Utiliza arrays auxiliares si es
 * necesario.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio10 {

  public static void main(String[] args) {

    // Variables
    int[] n = new int[20];

    // Rellena el array con números aleatorios entre 0 y 100
    System.out.println("Array original");
    for (int i = 0; i < 20; i++) {
      n[i] = (int) (Math.random() * 101);
      System.out.print(n[i] + " ");
    }

    // En cada iteración del for se coloca un número par en su posición correcta
    for (int i = 0; i < 20; i++) {

      // Busca el siguiente par a partir de la posición actual
      int j = i;
      while ((n[j++] % 2 != 0) && (j < 20))
        ;

      // Desplaza el número par a su posición correcta (si quedan pares)
      if (j < 20) {
        for (int k = j - 1; k > i; k--) {
          int aux = n[k];
          n[k] = n[k - 1];
          n[k - 1] = aux;
        }
      }
    }
    
    System.out.println("\n");

    // Muestra el resultado.
    System.out.println("Array con los pares al principio");
    for (int i = 0; i < 20; i++) {
      System.out.print(n[i] + " ");
    }
  }

}
