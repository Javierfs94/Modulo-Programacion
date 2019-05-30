package examenes.exMarzo2019JavierFriasSerrano.ejercicio2;

/**
 * <p>
 * Comunicación con el usuario para hacer el test de Cuadrado
 * </p>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class TestCuadrado {

  public static void main(String[] args) {

    try {
//			Cuadrado cuadrado5 = new Cuadrado(-5); // Descomentar para probar la captura de excepciones

      Cuadrado cuadrado1 = new Cuadrado(7);

      System.out.println("Datos de Cuadrado 1 \nLado: " + cuadrado1.getLado() + "\n");

      System.out.println(cuadrado1);

      System.out.println("\n**************************\n");

      Cuadrado cuadrado2 = new Cuadrado(4);

      System.out.println("Datos de Cuadrado 2 \nLado: " + cuadrado2.getLado() + "\n");

      System.out.println(cuadrado2);

      System.out.println("\n**************************\n");

      Cuadrado cuadrado3 = new Cuadrado();

      System.out.println("Datos de Cuadrado 2 \nLado: " + cuadrado3.getLado() + "\n");

      System.out.println(cuadrado3);

      System.out.println("\n**************************\n");

      Cuadrado cuadrado4 = new Cuadrado();

      System.out.println("Datos de Cuadrado 2 \nLado: " + cuadrado4.getLado() + "\n");

      System.out.println(cuadrado4);

      System.out.println("\n**************************\n");

//			System.out.println(cuadrado5);

      compararCuadrados(cuadrado1, cuadrado2);
      compararCuadrados(cuadrado2, cuadrado3);
      compararCuadrados(cuadrado3, cuadrado4);

    } catch (ArithmeticException e) {
      System.err.println("Error, el valor del lado debe estar comprendidos entre 1 y 10");
    }

  }

  /**
   * Compara ambos cuadrados
   * 
   * @param cuadrado1
   * @param cuadrado2
   */
  private static void compararCuadrados(Cuadrado cuadrado1, Cuadrado cuadrado2) {
    if (cuadrado1.compareTo(cuadrado2) == 0) {
      System.out.println("Ambos cuadrados son iguales");
    } else if (cuadrado1.compareTo(cuadrado2) == 1) {
      System.out.println("El cuadrado A es mayor que el cuadrado B");
    } else {
      System.out.println("El cuadrado B es mayor que el cuadrado A");
    }
  }

}