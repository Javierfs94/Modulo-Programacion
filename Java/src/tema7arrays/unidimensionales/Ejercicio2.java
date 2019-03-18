package tema7arrays.unidimensionales;

/**
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
 * elementos seg�n la tabla que se muestra a continuaci�n. Muestra el contenido
 * de todos los elementos del array. �Qu� sucede con los valores de los
 * elementos que no han sido inicializados?
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio2 {

  public static void main(String[] args) {

    //Variables
    char[] simbolo = new char[9];
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';

    for (int i = 0; i < simbolo.length; i++) {

      System.out.println("simbolo[" + i + "] = " + simbolo[i]);

    }

    System.out.println("�Qu� sucede con los valores de los elementos que no han sido inicializados?");
    System.out.println("En el caso de los char, muestran espacios en blanco.");

  }

}
