package tema9programacionorientadaaobjetos.tamagochi;

/**
 * <p>
 * Definición de la clase Perro.
 * </p>
 * <br />
 * <p>
 * EL objetivo es simular el cásico tamagochi pero con el comportamiento de un
 * perro
 * </p>
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Perro extends Animal implements Comportamiento {

	/**
	 * Constructor de Perro
	 * 
	 * @param nombre del perro
	 * @param raza del perro
	 * @param sexo del perro
	 */
	public Perro(String nombre, String raza, Sexo sexo) {
		super(nombre, raza, sexo);
	}

	public void jugar() {
		System.out.println("¡Qué divertido!");
	}

	@Override
	public void saludar() {
		System.out.println("	     |\\_/|                  ");
		System.out.println("	     | @ @   Woof! ");
		System.out.println("	     |   <>              _  ");
		System.out.println("	     |  _/\\------____ ((| |))");
		System.out.println("	     |               `--' | ");
		System.out.println("	 ____|_       ___|   |___.' ");
		System.out.println("	/_/_____/____/_______|");
	}

	@Override
	public void comer(int alimento) {
		System.out.println("¡Qué rico!");
	}

}
