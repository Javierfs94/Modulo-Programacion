package examenes.exMarzo2019JavierFriasSerrano.ejercicio1.almacen;

import java.util.ArrayList;

import examenes.exMarzo2019JavierFriasSerrano.ejercicio1.almacen.exceptions.ArticuloNoExisteException;
import examenes.exMarzo2019JavierFriasSerrano.ejercicio1.almacen.exceptions.CantidadNegativaException;
import examenes.exMarzo2019JavierFriasSerrano.ejercicio1.almacen.exceptions.CodigoNoValidoException;
import examenes.exMarzo2019JavierFriasSerrano.ejercicio1.almacen.exceptions.IvaInvalidoException;
import examenes.exMarzo2019JavierFriasSerrano.ejercicio1.almacen.exceptions.PrecioCompraNegativoException;
import examenes.exMarzo2019JavierFriasSerrano.ejercicio1.almacen.exceptions.PrecioVentaNegativoException;
import examenes.exMarzo2019JavierFriasSerrano.ejercicio1.almacen.exceptions.StockNegativoException;

/**
 * <p>
 * Gestiona el conjunto de artículos del almacén.
 * </p>
 * 
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
public class Almacen {

  private ArrayList<Articulo> arraylist = new ArrayList<Articulo>();

  /**
   * Añadir un articulo
   * 
   * @param descripcion
   * @param precioCompra
   * @param precioVenta
   * @param stock
   * @param iva
   * @throws StockNegativoException
   * @throws PrecioCompraNegativoException
   * @throws PrecioVentaNegativoException
   * @throws IvaInvalidoException
   */
  public void annadir(String descripcion, double precioCompra, double precioVenta, int stock, IVA iva)
      throws StockNegativoException, PrecioCompraNegativoException, PrecioVentaNegativoException, IvaInvalidoException {
    arraylist.add(new Articulo(descripcion, precioCompra, precioVenta, stock, iva));
  }

  /**
   * Elimina el artículo del almacén
   * 
   * @param codigo Código del artículo a eliminar
   * @return true si se ha eliminado. false en otro caso.
   */
  public boolean baja(int codigo) throws CodigoNoValidoException {
    return arraylist.remove(new Articulo(codigo)); // Si el código que introducimos en el test es igual al código del
    // artículo que hay en la lista se realiza el borrado.
  }

  /**
   * Modificar articulo
   * 
   * @param articulo
   * @param descripcion
   * @param precioCompra
   * @param precioVenta
   * @param stock
   * @throws StockNegativoException
   * @throws PrecioVentaNegativoException
   * @throws PrecioCompraNegativoException
   * @throws IvaInvalidoException
   * @throws ArticuloNoExisteException
   */

  public void set(int codigo, String descripcion, double precioCompra, double precioVenta, int stock, IVA iva)
      throws StockNegativoException, PrecioCompraNegativoException, PrecioVentaNegativoException, IvaInvalidoException,
      ArticuloNoExisteException {
    get(codigo).set(descripcion, precioCompra, precioVenta, stock, iva);

  }

  /**
   * Método toString
   */
  @Override
  public String toString() {
    return "Artículo " + arraylist + "";
  }

  /**
   * Método get para obtener el codigo del artículo.
   * 
   * @param codigo
   * @return
   * @throws ArticuloNoExisteException
   */
  public Articulo get(int codigo) throws ArticuloNoExisteException {
    try {
      return arraylist.get(arraylist.indexOf(new Articulo(codigo))); // Con get lo que se hace es extraer el código del
      // artículo.
    } catch (IndexOutOfBoundsException e) {
      throw new ArticuloNoExisteException("El código del artículo no existe en el almacén.");// Si el código no lo
                                                                                             // devuelve el indexOf es
                                                                                             // que no existe y salta la
                                                                                             // excepción.
    }
  }

  /**
   * Método incrementar, que aumenta las unidades de stock de un artículo.
   * 
   * @param codigo
   * @param cantidad
   * @throws CantidadNegativaException
   * @throws StockNegativoException
   * @throws ArticuloNoExisteException
   */
  public void incrementar(int codigo, int cantidad)
      throws StockNegativoException, CantidadNegativaException, ArticuloNoExisteException {
    Articulo articulo = get(codigo);
    articulo.incrementaStock(cantidad);
  }

  /**
   * Método decrementar, que disminuye las unidades de stock de un artículo.
   * 
   * @param codigo
   * @param cantidad
   * @throws CantidadNegativaException
   * @throws StockNegativoException
   * @throws ArticuloNoExisteException
   */
  public void decrementar(int codigo, int cantidad)
      throws StockNegativoException, CantidadNegativaException, ArticuloNoExisteException {
    Articulo articulo = get(codigo);
    articulo.decrementaStock(cantidad);

  }
}
