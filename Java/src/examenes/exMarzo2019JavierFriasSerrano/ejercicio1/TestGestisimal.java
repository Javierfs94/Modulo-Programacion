package examenes.exMarzo2019JavierFriasSerrano.ejercicio1;

import java.io.IOException;

import examenes.exMarzo2019JavierFriasSerrano.ejercicio1.almacen.Almacen;
import examenes.exMarzo2019JavierFriasSerrano.ejercicio1.almacen.IVA;
import examenes.exMarzo2019JavierFriasSerrano.ejercicio1.almacen.exceptions.ArticuloNoExisteException;
import examenes.exMarzo2019JavierFriasSerrano.ejercicio1.almacen.exceptions.CantidadNegativaException;
import examenes.exMarzo2019JavierFriasSerrano.ejercicio1.almacen.exceptions.CodigoNoValidoException;
import examenes.exMarzo2019JavierFriasSerrano.ejercicio1.almacen.exceptions.IvaInvalidoException;
import examenes.exMarzo2019JavierFriasSerrano.ejercicio1.almacen.exceptions.PrecioCompraNegativoException;
import examenes.exMarzo2019JavierFriasSerrano.ejercicio1.almacen.exceptions.PrecioVentaNegativoException;
import examenes.exMarzo2019JavierFriasSerrano.ejercicio1.almacen.exceptions.StockNegativoException;
import examenes.exMarzo2019JavierFriasSerrano.utiles.Menu;
import examenes.exMarzo2019JavierFriasSerrano.utiles.NoEsDecimalException;
import examenes.exMarzo2019JavierFriasSerrano.utiles.NoEsEnteroException;
import examenes.exMarzo2019JavierFriasSerrano.utiles.Teclado;

/**
 * <p>
 * Se comunica con el usuario (E/S de datos por consola) Comprueba si existe o
 * no el artículo en el almacén Comprueba que el stock no sea negativo en el
 * almacén Comprueba que el articulo exista para borrarlo del almacén.
 * </p>
 * <p>
 * Test para comprobar la clase Gestisimal.
 * </p>
 * *
 * <p>
 * Enunciado Examen Módulo Programación 5 de Abril de 2019
 * </p>
 * <p>
 * 1.- (Java) Añade el tipo de IVA a la clase Artículo usada en la clase Almacén
 * hecha en clase y modifica el código necesario para poder aplicarlo:
 * </p>
 * <ul>
 * <li>• Recuerda que hay tres tipos de IVA: general, reducido y super
 * reducido.</li>
 * <li>• Solicita el tipo de IVA mediante un menú. Al objeto lo llamarás
 * menuIva.</li>
 * <li>• Añade el IVA tanto a la opción de alta como a la de modificación de
 * artículo en la clase Almacén y en aquellos otras clases que sea
 * necesario.</li>
 * <li>• En la clase Artículo, en caso de que el iva sea null lanzarás una
 * excepción IvaInvalidoException.</li>
 * <li>• Actualiza el estado/comportamiento de la(s) clase(s) afectada(s).</li>
 * </ul>
 * 
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */

public class TestGestisimal {

  static Almacen almacen = new Almacen();
  private static Menu menu = new Menu("----MENÚ GESTISIMAL----", new String[] { "Listado", "Alta", "Baja",
      "Modificación", "Entada de mercancía", "Salida de mercancía", "Salir" });
  private static Menu menuIva = new Menu("IVA", new String[] { "General", "Reducido", "Super reducido" });

  public static void main(String[] args) throws Exception {

    almacenDePrueba(); // Definición de uso en el comentario del método

    do {
      switch ((menu.gestionar())) {
      case 1: // Listar
        System.out.println(almacen);
        break;
      case 2: // Alta
        annadir();
        break;
      case 3: // Baja
        baja();
        break;
      case 4: // Modificacion
        modificar();
        break;
      case 5: // Entrada mercancia
        entradaAlmacen();
        break;
      case 6: // Salida mercancia
        salidaAlmacen();
        break;
      default: // salir
        System.out.println("Gracias por usar Gestisimal.");
        return;
      }
    } while (true);
  }

  /**
   * Gestisa la selección del tipo de IVA
   * 
   * @return tipo de IVA
   * @throws NumberFormatException
   * @throws IOException
   * @throws NoEsEnteroException
   */
  private static IVA elegirIVA() throws NumberFormatException, IOException, NoEsEnteroException {
    do {
      switch (menuIva.gestionar()) {
      case 1: // General
        return IVA.GENERAL;
      case 2: // Reducido
        return IVA.REDUCIDO;
      case 3: // Super reducido
        return IVA.SUPER_REDUCIDO;
      }
    } while (true);
  }

  /**
   * Metodo para testeo del test con algunos objetos añadidos por defecto al
   * almacen
   * 
   * Nota: he dejado este método para facilitar las pruebas tanto por parte del
   * alumno como del profesor
   */
  private static void almacenDePrueba() {
    try {
      almacen.annadir("Agua", 11, 11, 11, IVA.SUPER_REDUCIDO);
      almacen.annadir("Pan", 22, 22, 22, IVA.REDUCIDO);
      almacen.annadir("Orégano", 11, 11, 33, IVA.GENERAL);
      almacen.annadir("Pepsi", 11, 11, 44, IVA.REDUCIDO);
      almacen.annadir("Fanta", 11, 11, 55, IVA.SUPER_REDUCIDO);
    } catch (Exception e) {
      // Las pruebas no deben aparecer, pero las dejo para facilitar las
      // comprobaciones de la aplicación
    }
  }

  /**
   * Muestra el título de la ipción elegida
   */
  private static void mostrarTituloOpcion(String mensaje) {
    System.out.println(mensaje);
  }

  /**
   * Método añadir en el que se le pedirá al usuario los datos del artículo.
   * 
   * @throws Exception
   */
  private static void annadir() {
    try {
      mostrarTituloOpcion("--AÑADIR ARTÍCULO--");
      almacen.annadir(Teclado.leerCadena("Introduzca la descripción del artículo:"),
          Teclado.leerDecimal("Introduzca el precio de compra del artículo:"),
          Teclado.leerDecimal("Introduzca el precio de venta del artículo:"),
          Teclado.leerEntero("Introduzca el stock del artículo:"), elegirIVA());
      System.out.println("Artículo añadido.");
    } catch (StockNegativoException | NumberFormatException | PrecioCompraNegativoException
        | PrecioVentaNegativoException | IvaInvalidoException | NoEsDecimalException | NoEsEnteroException
        | IOException e) {
      System.err.println("No se ha podido dar de alta al artículo.\n" + e.getMessage());// Si hay un error salta la
    }
  }

  /**
   * Método para dar de baja un artículo de la lista.
   * 
   * @throws CodigoNoValidoException
   * @throws NoEsEnteroException
   * @throws ArticuloNoExisteException
   */
  private static void baja() throws CodigoNoValidoException, NoEsEnteroException {
    try {
      if (almacen.baja(Teclado.leerEntero("Introduce el códido del artículo a eliminar.")))
        System.out.println("Artículo eliminado.");
      else
        System.err.println("El artículo no se ha podido eliminar. No existe un artículo con ese código en el almacen.");
    } catch (NoEsEnteroException e) {
      System.err.println(e.getMessage());
    }
  }

  /**
   * Método para modificar los atributos de un artículo.
   * 
   * @throws StockNegativoException
   * @throws PrecioCompraNegativoException
   * @throws PrecioVentaNegativoException
   * @throws NoEsEnteroException
   * @throws NoEsDecimalException
   * @throws IOException
   * @throws NumberFormatException
   * @throws IvaInvalidoException
   */
  private static void modificar()
      throws StockNegativoException, PrecioCompraNegativoException, PrecioVentaNegativoException, NoEsEnteroException,
      NoEsDecimalException, NumberFormatException, IOException, IvaInvalidoException {

    try {
      mostrarTituloOpcion("--MODIFICAR ARTÍCULO--");
      int codigo = Teclado.leerEntero("Introduce el códido del artículo a modificar: ");
      System.out.println(almacen.get(codigo));

      almacen.set(codigo, Teclado.leerCadena("Introduzca la descripción del artículo:"),
          Teclado.leerDecimal("Introduzca el precio de compra del artículo:"),
          Teclado.leerDecimal("Introduzca el precio de venta del artículo:"),
          Teclado.leerEntero("Introduzca el stock del artículo:"), elegirIVA());
    } catch (ArticuloNoExisteException | PrecioCompraNegativoException | PrecioVentaNegativoException
        | StockNegativoException | NoEsDecimalException | NoEsEnteroException | IvaInvalidoException e) {
      System.err.println("No se ha podido modificar el artículo.\n" + e.getMessage());
    }

  }

  /**
   * Método para aumentar el stock de un artículo.
   * 
   * @throws NoEsEnteroException
   * @throws StockNegativoException
   * @throws CantidadNegativaException
   */
  private static void entradaAlmacen() throws NoEsEnteroException, StockNegativoException {
    try {
      mostrarTituloOpcion("--INCREMENTAR STOCK--");
      int codigo = Teclado.leerEntero("Introduce el códido del artículo a eliminar.");
      System.out.println(almacen.get(codigo));

      int cantidad = Teclado.leerEntero("Introduzca el número de artículos a aumentar del stock del almacen.");
      almacen.incrementar(codigo, cantidad);
    } catch (ArticuloNoExisteException | CantidadNegativaException e) {
      System.err.println("No se ha podido incrementar el stock del artículo." + e.getMessage() + "\n");
    }
  }

  /**
   * Método para disminuir el stock de un artículo, este no puede ser negativo.
   * 
   * @throws NoEsEnteroException
   * @throws StockNegativoException
   * @throws CantidadNegativaException
   */
  private static void salidaAlmacen() throws NoEsEnteroException, CantidadNegativaException {
    try {
      mostrarTituloOpcion("--DECREMENTAR STOCK--");
      int codigo = Teclado.leerEntero("Introduce el códido del artículo a eliminar.");
      System.out.println(almacen.get(codigo));

      almacen.decrementar(codigo,
          Teclado.leerEntero("Introduzca el número de artículos a eliminar del stock del almacen."));
    } catch (ArticuloNoExisteException | StockNegativoException | CantidadNegativaException e) {
      System.err.println("No se ha podido decrementar el stock del artículo." + e.getMessage() + "\n");
    }
  }

}