package examenes.exMarzo2019JavierFriasSerrano.utiles;

import java.io.IOException;

/**
 * <p>
 * Clase utilizada para la gestión de un menu. Se dedica a:
 * </p>
 * <ul>
 * <li>Mostrar las opciones del menu
 * <li>Recoger y devolver las opciones de un menu
 * </ul>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class Menu {

  private String titulo = null;
  private String opciones[] = null;
  private int numOpciones = 2;

  /**
   * Menu de oopciones
   * 
   * @param titulo
   *          título del menu
   * @param opciones
   *          opciones del menu
   */
  public Menu(String titulo, String[] opciones) {
    this.titulo = titulo;
    this.opciones = opciones;
    this.numOpciones = this.opciones.length;
  }

  /**
   * Gestiona el menu. Consiste en mostrar las opcines y recoger la opcion
   * seleccionada por el usuario
   * 
   * @return opcion valida del menu
   * @throws IOException
   * @throws NumberFormatException
   * @throws NoEsEnteroException
   */
  public int gestionar() throws NumberFormatException, IOException, NoEsEnteroException {
    mostrar();
    return recogerOpcion();
  }

  /**
   * Muestra las opciones del menu
   */
  private void mostrar() {
    int i = 1;
    System.out.println("***" + titulo + "***");
    for (String elemento : opciones) {
      System.out.println("(" + (i++) + ") " + elemento);
    }
  }

  /**
   * Recoge la opcion valida del menu
   * 
   * @return opcion valida
   */
  private int recogerOpcion() {
    int opcion = -1;
    do {
      System.out.print("Introduce una opción válida [1, " + numOpciones + "]: ");
      try {
        opcion = Teclado.leerEntero();
      } catch (NoEsEnteroException e) {
        // no hago nada
      }
    } while (opcion < 1 || opcion > numOpciones);
    return opcion;
  }

}
