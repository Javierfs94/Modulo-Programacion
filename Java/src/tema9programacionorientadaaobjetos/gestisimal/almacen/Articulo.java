package tema9programacionorientadaaobjetos.gestisimal.almacen;

import tema9programacionorientadaaobjetos.gestisimal.exceptions.CantidadNegativaException;
import tema9programacionorientadaaobjetos.gestisimal.exceptions.StockNegativoException;

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
 * @author Rafael Miguel Cruz Álvarez
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Articulo {

	private static int contador = 0; // Generará códigos para los artículos
	private int codigo;// Identifica al artículo. Será único
	private String descripcion;
	private double precioCompra;
	private double precioVenta;
	private int stock;

	/**
	 * Constructor
	 * 
	 * @param descripcion
	 * @param precioCompra
	 * @param precioVenta
	 * @param stock
	 * @throws StockNegativoException
	 */
	Articulo(String descripcion, double precioCompra, double precioVenta, int stock) throws StockNegativoException {
		setDescripcion(descripcion);
		setPrecioCompra(precioCompra);
		setPrecioVenta(precioVenta);
		setStock(stock);
		setCodigo();
	}

	/**
	 * Constructor
	 * 
	 * @param codigoArticulo
	 */
	Articulo(int codigoArticulo) {
		setCodigo(codigoArticulo);
	}

	/**
	 * Establece el código único
	 */
	private void setCodigo() {
		this.codigo = Articulo.contador++;
	}

	/**
	 * Establece el código pasado como parámetro
	 * 
	 * @param codigo
	 */
	private void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Devuelve el código del articulo
	 * 
	 * @return código
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Devuelve la descripcion del articulo
	 * 
	 * @return la descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Establece la descripción del articulo
	 * 
	 * @param descripcion
	 *          la descripcion a establecer
	 */
	void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Deevuelve el precio de compra del articulo
	 * 
	 * @return el precio de compra
	 */
	public double getPrecioCompra() {
		return precioCompra;
	}

	/**
	 * Establece el precio de compra del articulo
	 * 
	 * @param precioCompra
	 *          el precioCompra a estabelcer
	 */
	void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	/**
	 * Devuelve el precio de venta del articulo
	 * 
	 * @return el precio de venta
	 */
	public double getPrecioVenta() {
		return precioVenta;
	}

	/**
	 * Establece el precio de venta del articulo
	 * 
	 * @param precioVenta
	 *          el precioVenta a establecer
	 */
	void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	/**
	 * Devuelve el stock del articulo
	 * 
	 * @return el stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * Establece el stock del articulo
	 * 
	 * @param stock
	 *          el stock a establecer
	 * @throws StockNegativoException
	 */
	void setStock(int stock) throws StockNegativoException {
		if (stock >= 0) {
			this.stock = stock;
		} else
			throw new StockNegativoException("El stock no puede ser negativo.");
	}

	/**
	 * Método para aumentar el stock
	 * 
	 * @param cantidad
	 *          a incrementar de stock
	 * @throws StockNegativoException
	 * @throws CantidadNegativaException
	 */
	public void incrementaStock(int cantidad) throws StockNegativoException, CantidadNegativaException {
		if (cantidad > 0)
			setStock(getStock() + cantidad);
		else
			throw new CantidadNegativaException("No se puede añadir una cantidad de stock negativo.");
	}

	/**
	 * Método para decrementar el stock
	 * 
	 * @param cantidad
	 *          a decrementar de stock
	 * @throws CantidadNegativaException
	 * @throws StockNegativoException
	 */
	public void decrementaStock(int cantidad) throws CantidadNegativaException, StockNegativoException {
		if (cantidad > 0)
			setStock(getStock() - cantidad);
		else
			throw new CantidadNegativaException("No se puede añadir una cantidad de stock negativo.");
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

	/**
	 * Método set usado en Almacen para realizar la modificación.
	 * 
	 * @param descripcion
	 *          del articulo
	 * @param precioCompra
	 *          del articulo
	 * @param precioVenta
	 *          del articulo
	 * @param stock
	 *          del articulo
	 * @throws StockNegativoException
	 */
	public void set(String descripcion, double precioCompra, double precioVenta, int stock)
			throws StockNegativoException {
		setDescripcion(descripcion);
		setPrecioCompra(precioCompra);
		setPrecioVenta(precioVenta);
		setStock(stock);
	}

	@Override
	public String toString() {
		return "\nCodigo: " + getCodigo() + "\nDescripcion: " + getDescripcion() + "\nPrecioCompra: " + getPrecioCompra()
				+ "\nPrecioVenta: " + getPrecioVenta() + "\nStock: " + getStock() + "\n'''''''''''''''''''''''''''''''''''''''";
	}
}