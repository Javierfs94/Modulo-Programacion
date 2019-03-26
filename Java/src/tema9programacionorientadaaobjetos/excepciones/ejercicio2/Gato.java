package tema9programacionorientadaaobjetos.excepciones.ejercicio2;

/**
 * Definición de la clase GatoSimple
 *
 * <p>
 * Modifica la clase Gato vista anteriormente añadiendo el método apareaCon.
 * Este método debe comprobar que los gatos son de distinto sexo, tras lo cual,
 * genera un nuevo gato. Por ejemplo, sería válido algo como Gato cria =
 * garfield.apareaCon(lisa). En caso de que los gatos sean del mismo sexo, el
 * método debe generar la excepción ExcepcionApareamientoImposible. Crea un
 * programa desde el que se pruebe el método.
 * </p>
 * 
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Gato {

	private String color;
	private String raza;
	private String sexo;
	private int edad;
	private double peso;

	/**
	 * Constructor
	 * 
	 * @param s
	 */
	public Gato(String sexo) {
		this.sexo = sexo;
	}

	public String getSexo() {
		return this.sexo;
	}

	/**
	 * Hace que el gato maulle
	 */
	public void maulla() {
		System.out.println("Miauuuu");
	}

	/**
	 * Hace que el gato ronronee
	 */
	public void ronronea() {
		System.out.println("mrrrrrr");
	}

	/**
	 * Hace que el gato coma. A los gatos les gusta el pescado, si le damos otra
	 * comida la rechazará.
	 ** 
	 * @param comida
	 *          la comida que se le ofrece al gato
	 */
	public void come(String comida) {
		if (comida.equals("pescado")) {
			System.out.println("Hmmmm, gracias");
		} else {
			System.out.println("Lo siento, yo solo como pescado");
		}
	}

	/**
	 * Pone a pelear dos gatos. Solo se van a pelear dos machos entre sí.
	 *
	 * @param contrincante
	 *          es el gato contra el que pelear
	 */
	public void peleaCon(Gato contrincante) {
		if (this.sexo.equals("hembra")) {
			System.out.println("no me gusta pelear");
		} else {
			if (contrincante.getSexo().equals("hembra")) {
				System.out.println("no peleo contra gatitas");
			} else {
				System.out.println("ven aquí que te vas a enterar");
			}
		}
	}

	/**
	 * Aparea 2 gatos entre ellos
	 * 
	 * @param pareja
	 * @return
	 * @throws ApareamientoImposibleException
	 */
	public Gato apareaCon(Gato pareja) throws ApareamientoImposibleException {

		if (this.sexo.equals(pareja.getSexo())) {
			throw new ApareamientoImposibleException(raza);
		}

		String cria = (int) (Math.random() * 2) == 0 ? "hembra" : "macho";
		return new Gato(cria);

	}

	@Override
	public String toString() {
		return "Gato [color=" + color + ", raza=" + raza + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + "]";
	}

}
