package examenes.exMarzo2019JavierFriasSerrano.ejercicio2;

/**
 * <p>
 * Clase hija de Rectangulo
 * </p>
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
public class Cuadrado extends Rectangulo implements Comparable<Cuadrado> {

  /**
   * Constructor
   * 
   * @param lado
   */
  public Cuadrado(int lado) {
    super(lado, lado);
  }

  /**
   * Constructor por defecto. Crea un cuadrado de 5x5
   */
  public Cuadrado() {
    super(1, 1);
  }

  /**
   * Devuelve el valor del lado que forma al cuadrado.
   * 
   * @return lado del cuadrado
   */
  public int getLado() {
    return this.getAncho();
  }

  /**
   * Modifica el lado
   * 
   * @param lado
   */
  public void setLado(int lado) {
    super.setAncho(lado);
    super.setAlto(lado);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + getLado();
    result = prime * result + getLado();
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Cuadrado other = (Cuadrado) obj;
    if (getLado() != other.getLado())
      return false;
    if (getLado() != other.getLado())
      return false;
    return true;
  }

  @Override
  public int compareTo(Cuadrado o) {
    if (this.getLado() < o.getLado()) { // En caso de que la instancia sea menor al
      return -1; // cuadrado pasado por parametro.
    } else if (this.getLado() > o.getLado()) { // En caso de que la instancia sea mayor
      return 1; // al cuadrado pasado por parametro.
    } else { // En caso de que ambos cuadrados sean iguales.
      return 0;
    }
  }

}