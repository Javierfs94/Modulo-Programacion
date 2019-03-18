package tema9programacionorientadaaobjetos.tamagochi;

/**
 * Clase padre
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public abstract class Animal {

	String nombre;
	String raza;
	Sexo sexo;

	/**
	 * Constructores
	 * 
	 * @param nombre
	 *          el nombre del animal
	 * @param raza
	 *          la raza dentro de ese animal
	 * @param sexo
	 *          el sexo del animal
	 */
	public Animal(String nombre, String raza, Sexo sexo) {
		this.nombre = nombre;
		this.raza = raza;
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [nombre=" + nombre + ", raza=" + raza + ", sexo=" + sexo + "]";
	}

}
