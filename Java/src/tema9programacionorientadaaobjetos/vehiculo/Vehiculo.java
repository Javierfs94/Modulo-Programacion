package tema9programacionorientadaaobjetos.vehiculo;

/**
 * <p>
 * Enunciado del ejercicio
 * </p>
 * <p>
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases
 * de la primera. Para la clase Vehiculo, crea los atributos de clase
 * vehiculosCreados y kilometrosTotales, así como el atributo de instancia
 * kilometrosRecorridos. Crea también algún método específico para cada una de
 * las subclases. Prueba las clases creadas mediante un programa con un menú
 * como el que se muestra a continuación:
 * </p>
 * <ul>
 * <li>VEHÍCULOS</li>
 * <li>=========</li>
 * <li>1. Anda con la bicicleta</li>
 * <li>2. Haz el caballito con la bicicleta</li>
 * <li>3. Anda con el coche</li>
 * <li>4. Quema rueda con el coche</li>
 * <li>5. Ver kilometraje de la bicicleta</li>
 * <li>6. Ver kilometraje del coche</li>
 * <li>7. Ver kilometraje total</li>
 * <li>8. Salir</li>
 * <li>Elige una opción (1-8):</li>
 * </ul>
 * <p>
 * Clase Vehiculo
 * </p>
 * 
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public abstract class Vehiculo {
	// atributos
	private static int vehiculosCreados = 0;
	private static int kilometrosTotales = 0;
	private int kilometrosRecorridos; 

	/**
	 * Constructor
	 */
	public Vehiculo() {
		this.kilometrosRecorridos = 0;
		vehiculosCreados++;
	}

	/**
	 * Devuelve los vehiculos Creados
	 * 
	 * @return vehiculosCreados
	 */
	public static int getVehiculosCreados() {
		return vehiculosCreados;
	}

	/**
	 * Devuelve los kilometros Totales
	 * 
	 * @return kilometrosTotales
	 */
	public static int getKilometrosTotales() {
		return kilometrosTotales;
	}

	/**
	 * Devuelve los kilometros Recorridos
	 * 
	 * @return kilometrosRecorridos
	 */
	public int getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}

	/**
	 * Hace que un vehículo recorra una distancia
	 * 
	 * @param km
	 *          kilometros a recorrer
	 */
	public void recorrer(int km) {
		this.kilometrosRecorridos += km;
		Vehiculo.kilometrosTotales += km;
	}

}
