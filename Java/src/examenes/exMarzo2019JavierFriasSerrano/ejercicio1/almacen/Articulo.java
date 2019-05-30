package examenes.exMarzo2019JavierFriasSerrano.ejercicio1.almacen;

import examenes.exMarzo2019JavierFriasSerrano.ejercicio1.almacen.exceptions.CantidadNegativaException;
import examenes.exMarzo2019JavierFriasSerrano.ejercicio1.almacen.exceptions.IvaInvalidoException;
import examenes.exMarzo2019JavierFriasSerrano.ejercicio1.almacen.exceptions.PrecioCompraNegativoException;
import examenes.exMarzo2019JavierFriasSerrano.ejercicio1.almacen.exceptions.PrecioVentaNegativoException;
import examenes.exMarzo2019JavierFriasSerrano.ejercicio1.almacen.exceptions.StockNegativoException;

/**
 * <p>
 * Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar el
 * control de los artículos de un almacén. De cada artículo se debe saber el
 * código, la descripción, el precio de compra, el precio de venta y el stock
 * (número de unidades). El menú del programa debe tener, al menos, las
 * siguientes opciones:
 * </p>
 * <ul>
 * <li>1. Listado</li>
 * <li>2. Alta</li>
 * <li>3. Baja</li>
 * <li>4. Modificación</li>
 * <li>5. Entrada de mercancía</li>
 * <li>6. Salida de mercancía</li>
 * <li>7. Salir</li>
 * </ul>
 * <p>
 * La entrada y salida de mercancía supone respectivamente el incremento y
 * decremento de stock de un determinado artículo. Hay que controlar que no se
 * pueda sacar más mercancía de la que hay en el almacén.
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
public class Articulo {

  private static int contador = 1; // Generará códigos para los artículos
  private int codigo; // Identifica al artículo. Será único
  private String descripcion;
  private double precioCompra;
  private double precioVenta;
  private int stock;
  private IVA iva;

  /**
   * Constructor de la clase artículo
   * 
   * @param descripcion
   * @param precioCompra
   * @param precioVenta
   * @param stock
   * @throws StockNegativoException
   * @throws PrecioCompraNegativoException
   * @throws PrecioVentaNegativoException
   * @throws IvaInvalidoException
   */
  Articulo(String descripcion, double precioCompra, double precioVenta, int stock, IVA iva)
      throws StockNegativoException, PrecioCompraNegativoException, PrecioVentaNegativoException, IvaInvalidoException {
    setDescripcion(descripcion);
    setPrecioCompra(precioCompra);
    setPrecioVenta(precioVenta);
    setStock(stock);
    setIva(iva);
    setCodigo();
  }

  /**
   * Constructor de la clase artículo unicamente con el código del artículo
   * 
   * @param codigoArticulo
   */
  Articulo(int codigoArticulo) {
    setCodigo(codigoArticulo);
  }

  /**
   * Devuelve el tipo de IVA del producto
   * 
   * @return iva
   */
  public IVA getIva() {
    return iva;
  }

  /**
   * Establece el tipo de IVA
   * 
   * @param iva
   *          el iva a establecer
   * @throws IvaInvalidoException
   */
  private void setIva(IVA iva) throws IvaInvalidoException {
    if (iva == null) {
      throw new IvaInvalidoException("El IVA debe ser válido.");
    }
    this.iva = iva;
  }

  /**
   * Setter del código que aumenta el contador en 1
   */
  private void setCodigo() {
    this.codigo = Articulo.contador++;
  }

  /**
   * Setter del código del constructor de articulo que usa unicamente el codigo.
   * 
   */
  private void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  /**
   * Getter del código
   * 
   * @return codigo del artículo
   */
  public int getCodigo() {
    return codigo;
  }

  /**
   * Getter de la descripción
   * 
   * @return the descripcion
   */
  public String getDescripcion() {
    return descripcion;
  }

  /**
   * Setter de la descripción
   * 
   * @param descripcion
   *          the descripcion to set
   */
  void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  /**
   * Getter precio de compra
   * 
   * @return the precioCompra
   */
  public double getPrecioCompra() {
    return precioCompra;
  }

  /**
   * Setter de precio de compra en el que se controla que el precio de compra no
   * sea negativo
   * 
   * @param precioCompra
   *          the precioCompra to set
   * @throws PrecioCompraNegativoException
   */
  private void setPrecioCompra(double precioCompra) throws PrecioCompraNegativoException {
    if (precioCompra < 0)
      throw new PrecioCompraNegativoException("El precio de compra no puede ser negativo.");
    this.precioCompra = precioCompra;
  }

  /**
   * Getter precio de venta
   * 
   * @return the precioVenta
   */
  public double getPrecioVenta() {
    return precioVenta;
  }

  /**
   * Setter precio de venta en el que se controla que el precio de venta no sea
   * negativo
   * 
   * @param precioVenta
   *          the precioVenta to set
   * @throws PrecioVentaNegativoException
   */
  private void setPrecioVenta(double precioVenta) throws PrecioVentaNegativoException {
    if (precioVenta < 0)
      throw new PrecioVentaNegativoException("El precio de venta no puede ser negativo.");
    this.precioVenta = precioVenta;
  }

  /**
   * Getter del stock
   * 
   * @return the stock
   */
  public int getStock() {
    return stock;
  }

  /**
   * Setter de stock en el que se controla que el stock no sea negativo
   * 
   * @param stock
   *          the stock to set
   * @throws StockNegativoException
   */
  private void setStock(int stock) throws StockNegativoException {
    if (stock < 0)
      throw new StockNegativoException("El stock no puede ser negativo.");
    this.stock = stock;
  }

  /**
   * Método para aumentar el stock
   * 
   * @param cantidad
   * @throws StockNegativoException
   * @throws CantidadNegativaException
   */
  void incrementaStock(int cantidad) throws StockNegativoException, CantidadNegativaException {
    if (cantidad < 0)
      throw new CantidadNegativaException("No se puede añadir una cantidad de stock negativo.");
    setStock(getStock() + cantidad);
  }

  /**
   * Método para aumentar el stock
   * 
   * @param cantidad
   * @throws CantidadNegativaException
   * @throws StockNegativoException
   */
  void decrementaStock(int cantidad) throws CantidadNegativaException, StockNegativoException {
    if (cantidad < 0)
      throw new CantidadNegativaException("No se puede añadir una cantidad de stock negativo.");
    setStock(getStock() - cantidad);
  }

  /**
   * Método set usado en Almacen para realizar la modificación.
   * 
   * @param descripcion
   * @param precioCompra
   * @param precioVenta
   * @param stock
   * @throws StockNegativoException
   * @throws PrecioCompraNegativoException
   * @throws PrecioVentaNegativoException
   * @throws IvaInvalidoException
   */
  public void set(String descripcion, double precioCompra, double precioVenta, int stock, IVA iva)
      throws StockNegativoException, PrecioCompraNegativoException, PrecioVentaNegativoException, IvaInvalidoException {
    setDescripcion(descripcion);
    setIva(iva);
    setPrecioCompra(precioCompra);
    setPrecioVenta(precioVenta);
    setStock(stock);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + codigo;
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
    Articulo other = (Articulo) obj;
    if (codigo != other.codigo)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "\nCodigo: " + getCodigo() + "\nDescripcion: " + getDescripcion() + "\nPrecioCompra: " + getPrecioCompra()
        + "\nPrecioVenta: " + getPrecioVenta() + "\nStock: " + getStock() + "\nIVA: " + getIva()
        + "\n'''''''''''''''''''''''''''''''''''''''";
  }

}