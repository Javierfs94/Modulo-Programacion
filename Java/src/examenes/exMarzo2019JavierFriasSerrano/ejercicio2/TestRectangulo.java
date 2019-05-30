package examenes.exMarzo2019JavierFriasSerrano.ejercicio2;

/**
 * <p>
 * Comunicación con el usuario para hacer el test de Cuadrado
 * </p>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class TestRectangulo {

  public static void main(String[] args) {

    try {

//      Rectangulo rectangulo3 = new Rectangulo(-5, 11); // Descomentar para comprobar la captura de excepciones

      Rectangulo rectangulo1 = new Rectangulo(5, 4);

      System.out.println(
          "Datos de Rectángulo 1 \nAncho: " + rectangulo1.getAncho() + "\nAlto: " + rectangulo1.getAlto() + "\n");
      System.out.println(rectangulo1);

      System.out.println("\n**************************\n");

      Rectangulo rectangulo2 = new Rectangulo();

      System.out.println(
          "Datos de Rectángulo 2 \nAncho: " + rectangulo2.getAncho() + "\nAlto: " + rectangulo2.getAlto() + "\n");

      System.out.println(rectangulo2);

      System.out.println("\n**************************\n");

//      System.out.println(rectangulo3);

    } catch (ArithmeticException e) {
      System.err.println("Error, los valores del alto y ancho deben estar comprendidos entre 1 y 10");
    }

  }

}