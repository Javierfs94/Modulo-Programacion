package examenes.exMarzo2019JavierFriasSerrano.ejercicio2;

/**
 * Clase que define la creacion de Rectangulos
 * 
 * <p>
 * Enunciado Examen Módulo Programación 5 de Abril de 2019
 * </p>
 * <p>
 * 2.- (Java) Crea la clase Rectángulo de forma que:
 * </p>
 * <ul>
 * <li>• Un objeto de esta clase se construye pasándole el ancho y el alto.
 * Ninguno de los dos atributos puede ser menor o igual a cero ni mayor que
 * diez, en esos casos se debe lanzar la excepción ArithmeticException.</li>
 * <li>• Mediante getters y setters permite que se acceda y se modifique el
 * ancho y el alto del rectángulo teniendo en cuenta las restricciones en cuanto
 * a las dimensiones del apartado anterior.</li>
 * <li>• Al imprimir en pantalla un objeto de la clase usando System.out.print
 * se debe dibujar el rectángulo por la pantalla (de manera similar a como se
 * imprime un cuadrado en la página 130 del libro Aprende Java con
 * Ejercicios).</li>
 * <li>• Crea la clase Cuadrado como subclase de Rectángulo. Le debes añadir a
 * su comportamiento la posibilidad de comparar objetos cuadrados entre sí.</li>
 * <li>• Crea los programas de test correspondientes a ambas clases. Debes
 * provocar que se lance la excepción y capturarla.</li>
 * </ul>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class Rectangulo {

  private int ancho;
  private int alto;

  /**
   * Constructor
   * 
   * @param ancho
   * @param alto
   */
  public Rectangulo(int ancho, int alto) {
    setAncho(ancho);
    setAlto(alto);
  }

  /**
   * Constructor por defecto. Crea un rectángulo de 5x8
   */
  public Rectangulo() {
    setAncho(1);
    setAlto(1);
  }

  /**
   * Devuelve el ancho
   * 
   * @return el ancho
   */
  public int getAncho() {
    return ancho;
  }

  /**
   * Devuelve el alto
   * 
   * @return el alto
   */
  public int getAlto() {
    return alto;
  }

  /**
   * Establece el ancho
   * 
   * @param ancho
   *          a ancho establecer
   */
  public void setAncho(int ancho) {
    if (ancho <= 0 || ancho > 10) {
      throw new ArithmeticException("Ancho inválido");
    }
    this.ancho = ancho;
  }

  /**
   * Establece el alto
   * 
   * @param alto
   *          el alto a establecer
   */
  public void setAlto(int alto) {
    if (alto <= 0 || alto > 10) {
      throw new ArithmeticException("Alto inválido");
    }
    this.alto = alto;
  }

  /**
   * Pinta el rectangulo
   */
  @Override
  public String toString() {
    int i, espacios;
    String resultado = "";

    for (i = 0; i < this.ancho; i++) {
      resultado += "██";
    }
    resultado += "\n";

    for (i = 1; i < this.alto - 1; i++) {
      resultado += "██";
      for (espacios = 1; espacios < this.ancho - 1; espacios++) {
        resultado += "  ";
      }
      resultado += "██\n";
    }

    for (i = 0; i < this.ancho; i++) {
      resultado += "██";
    }
    resultado += "\n";

    return resultado;
  }

}