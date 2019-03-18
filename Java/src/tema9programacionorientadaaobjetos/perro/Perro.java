package tema9programacionorientadaaobjetos.perro;

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
public class Perro {
	// Atributos
	private static final int PESO_MAXIMO = 15;
	private static final int PESO_MINIMO = 5;
	String nombre;
	String raza;
	String sexo;
	int edad;
	int peso;
	boolean cansado = false;
	boolean dormido = false;

	/**
	 * Constructor de Perro
	 * 
	 * @param nombre
	 * @param raza
	 * @param sexo
	 * @param edad
	 * @param peso
	 * @param cansado
	 * @param dormido
	 */
	public Perro(String nombre, String raza, String sexo, int edad, int peso) {
		this.nombre = nombre;
		this.raza = raza;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public boolean isCansado() {
		return cansado;
	}

	public void setCansado(boolean cansado) {
		this.cansado = cansado;
	}

	public boolean isDormido() {
		return dormido;
	}

	public void setDormido(boolean dormido) {
		this.dormido = dormido;
	}

	public static int getPesoMaximo() {
		return PESO_MAXIMO;
	}

	public static int getPesoMinimo() {
		return PESO_MINIMO;
	}

	public void ladrar() {
		if (comprobarEstado()) {
			System.out.println("El animal está dormido o cansado, por lo que no puede ladrar");
		} else {
			System.out.println("	     |\\_/|                  ");
			System.out.println("	     | @ @   Woof! ");
			System.out.println("	     |   <>              _  ");
			System.out.println("	     |  _/\\------____ ((| |))");
			System.out.println("	     |               `--' | ");
			System.out.println("	 ____|_       ___|   |___.' ");
			System.out.println("	/_/_____/____/_______|");

		}
	}

	public void alimentar(int alimento) {
		if (comprobarEstado()) {
			System.out.println("El animal está dormido o cansado, por lo que no se le puede alimentar");
		} else {
			if (this.peso >= getPesoMaximo()) {
				System.out.println("No puedo comer más.");
			} else {
				this.peso += alimento;
				if (this.peso > getPesoMaximo()) {
					this.peso = getPesoMaximo();
				}
				System.out.println("¡Qué rico!");
			}
		}
	}

	public void jugar() {
		if (comprobarEstado()) {
			System.out.println("El animal está dormido o cansado, por lo que no puede jugar");
		} else {
			if (this.peso <= getPesoMinimo()) {
				System.out.println("No puedo jugar más, estoy muy cansado.");
				this.cansado = true;
			} else {
				this.peso--;
				System.out.println("¡Qué divertido!");
			}
		}

	}

	private boolean comprobarEstado() {
		return this.cansado == true || this.dormido == true;
	}

	public void dormir() {
		if (!dormido) {
			setCansado(false);
			setDormido(true);
			System.out.println("Estoy muy cansado, voy a dormir zzzzZZZZzzzz");
		} else {
			System.out.println("Ya estoy dormido");
		}

	}

	public void despertar() {
		if (dormido) {
			setDormido(false);
			System.out.println("¡Me he despertado!");
		} else {
			System.out.println("Ya estoy despierto");
		}
	}

	@Override
	public String toString() {
		return "Perro [nombre= " + getNombre() + ", raza= " + getRaza() + ", sexo= " + getSexo() + ", edad= " + getEdad()
				+ " años, peso= " + peso + ", cansado= " + isCansado() + ", dormido= " + isDormido() + "]";
	}

}
