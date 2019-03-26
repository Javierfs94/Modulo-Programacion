package tema9programacionorientadaaobjetos.colecciondiscos;

/**
 * Definición de la clase Disco
 * 
 * @author Fco Javier Frías Serrano
 * @author Rafa Cruz
 * @version 1.0
 */

public class Disco {

	private static int codigo = 0;
	private int codigoDisco;
	private String autor;
	private String titulo;
	private String genero;
	private int duracion; // duración total en minutos

	/**
	 * Constructor
	 * 
	 * @param autor
	 * @param titulo
	 * @param genero
	 * @param duracion
	 */
	public Disco(String autor, String titulo, String genero, int duracion) {
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		generarCodigo();
	}

	/**
	 * Incrementa el código único del Disco
	 */
	private void generarCodigo() {
		codigoDisco = Disco.codigo++;
	}

	/**
	 * Devuelve el codigo del Disco
	 * 
	 * @return un entero
	 */
	public int getCodigoDisco() {
		return codigoDisco;
	}

	/**
	 * Devuelve el autor
	 * 
	 * @return una cadena
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Establece el autor
	 * 
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Devuelve el genero
	 * 
	 * @return una cadena
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * Establece un genero
	 * 
	 * @param genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * Devuelve el titulo
	 * 
	 * @return una cadena
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Establece el titulo
	 * 
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Devuelve la duracion
	 * 
	 * @return un entero
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * Establece la duracion
	 * 
	 * @param duracion
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String toString() {
		String cadena = "\n------------------------------------------";
		cadena += "\nCódigo: " + getCodigoDisco();
		cadena += "\nAutor: " + getAutor();
		cadena += "\nTítulo: " + getTitulo();
		cadena += "\nGénero: " + getGenero();
		cadena += "\nDuración: " + getDuracion();
		cadena += "\n------------------------------------------";

		return cadena;
	}
}