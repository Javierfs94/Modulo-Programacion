package tema9programacionorientadaaobjetos.tiempo;

import java.util.Calendar;

/**
 * <p>
 * Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase
 * Tiempo son intervalos de tiempo y se crean de la forma Tiempo t = new
 * Tiempo(1, 20, 30) donde los parámetros que se le pasan al constructor son las
 * horas, los minutos y los segundos respectivamente. Crea el método toString
 * para ver los intervalos de tiempo de la forma 10h 35m 5s. Si se suman por
 * ejemplo 30m 40s y 35m 20s el resultado debería ser 1h 6m 0s. Realiza un
 * programa de prueba para comprobar que la clase funciona bien.
 * </p>
 * <p>
 * Variación: El ejercicio 6 anterior te pide que crees una clase "Tiempo" y un
 * programa de prueba. Investiga si ya existe en Java y Python una clase similar
 * y adapta tus programas de prueba para trabajar con esas clases.
 * </p>
 * 
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class TiempoMejorado {

	Calendar calendar;

	/**
	 * Constructor
	 */
	public TiempoMejorado() {
		calendar = Calendar.getInstance();
	}

	/**
	 * Modifica el tiempo
	 * 
	 * @param horas
	 * @param minutos
	 * @param segundos
	 */
	public void modificar(int horas, int minutos, int segundos) {
		calendar.add(Calendar.SECOND, segundos);
		calendar.add(Calendar.MINUTE, minutos);
		calendar.add(Calendar.HOUR_OF_DAY, horas);
	}

	@Override
	public String toString() {
		return calendar.get(Calendar.HOUR_OF_DAY) + "h " + calendar.get(Calendar.MINUTE) + "m "
				+ calendar.get(Calendar.SECOND) + "s";
	}

}
