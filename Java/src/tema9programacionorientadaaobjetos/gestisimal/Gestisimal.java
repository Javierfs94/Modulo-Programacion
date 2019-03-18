package tema9programacionorientadaaobjetos.gestisimal;

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
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Gestisimal {

	public String codigo;
	public String descripcion;
	public double precioCompra;
	public double precioVenta;
	public int stock;

	public Gestisimal(String codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
		setCodigo(codigo);
		setDescripcion(descripcion);
		setPrecioCompra(precioCompra);
		setPrecioVenta(precioVenta);
		setStock(stock);
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *          the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion
	 *          the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the precioCompra
	 */
	public double getPrecioCompra() {
		return precioCompra;
	}

	/**
	 * @param precioCompra
	 *          the precioCompra to set
	 */
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	/**
	 * @return the precioVenta
	 */
	public double getPrecioVenta() {
		return precioVenta;
	}

	/**
	 * @param precioVenta
	 *          the precioVenta to set
	 */
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock
	 *          the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Codigo=" + codigo + ", Descripcion=" + descripcion + ", PrecioCompra=" + precioCompra + ", PrecioVenta="
				+ precioVenta + ", Stock=" + stock + "]";
	}

}