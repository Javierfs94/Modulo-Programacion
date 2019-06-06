package examenes.exMayo2019JavierFriasSerrano.ejercicio2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * <p>
 * 2.- Escribe un programa que usando la interfaz gráfica de Java permita al
 * usuario introducir una fecha en formato dd/mm/aaaa y que tenga los siguientes
 * botones:
 * </p>
 * <ul>
 * <li>• Validar fecha: muestra un mensaje diciendo si la fecha es o no
 * válida.</li>
 * <li>• Día posterior: Modifica la fecha sumándole un día. Debe validar la
 * fecha antes de hacer la operación.</li>
 * <li>• Día anterior: Modifica la fecha restándole un día. Debe validar la
 * fecha antes de hacer la operación.</li>
 * <li>• Días hasta hoy: Muestra el número de días que hay entre la fecha
 * introducida y la fecha de hoy. Debe validar la fecha antes de hacer la
 * operación.</li>
 * <li>• Terminar.</li>
 * </ul>
 * <p>
 * La fecha debe ser manejada mediante un objeto de una clase que o bien
 * construyáis con sus métodos correspondientes o de las que ya existen en la
 * API de Java.
 * </p>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class Fecha {

  private static Calendar calendario = Calendar.getInstance();
  private static SimpleDateFormat fechaFormateada = new SimpleDateFormat("dd/MM/yyyy");
  private static String fechaRecogida = "";

  /**
   * Valida la fecha
   * 
   * @return fecha validada
   * @throws FechaNoValidaInvalidaException
   */
  static Calendar validarFecha(String f) throws FechaNoValidaInvalidaException {
    String verifica = "";

    fechaRecogida = f;
    calendario = obtenerFecha(fechaRecogida);
    verifica = fechaFormateada.format(calendario.getTime());

    if (!fechaRecogida.equals(verifica)) {
      throw new FechaNoValidaInvalidaException();
    }
    return calendario;
  }

  /**
   * Obtiene la fecha
   * 
   * @param fecha
   * @return fecha establecida
   */
  public static Calendar obtenerFecha(String fecha) {
    Calendar calendario = Calendar.getInstance();
    String[] partes;

    if (fecha.contains("/") && fecha.length() == 10) {
      partes = fecha.split("/");
      int day = Integer.parseInt(partes[0]);
      int moth = Integer.parseInt(partes[1]);
      int year = Integer.parseInt(partes[2]);

      switch (moth) {
      case 1:
        calendario.set(year, Calendar.JANUARY, day);
        break;
      case 2:
        calendario.set(year, Calendar.FEBRUARY, day);
        break;
      case 3:
        calendario.set(year, Calendar.MARCH, day);
        break;
      case 4:
        calendario.set(year, Calendar.APRIL, day);
        break;
      case 5:
        calendario.set(year, Calendar.MAY, day);
        break;
      case 6:
        calendario.set(year, Calendar.JUNE, day);
        break;
      case 7:
        calendario.set(year, Calendar.JULY, day);
        break;
      case 8:
        calendario.set(year, Calendar.AUGUST, day);
        break;
      case 9:
        calendario.set(year, Calendar.SEPTEMBER, day);
        break;
      case 10:
        calendario.set(year, Calendar.OCTOBER, day);
        break;
      case 11:
        calendario.set(year, Calendar.NOVEMBER, day);
        break;
      case 12:
        calendario.set(year, Calendar.DECEMBER, day);
        break;
      }
    } else {
      calendario.set(0, 0, 0);
    }
    return calendario;
  }

  /**
   * Añade un día a la fecha
   * 
   * @return
   * @throws FechaNoValidaInvalidaException
   */
  static String diaPosterior(String f) throws FechaNoValidaInvalidaException {
    validarFecha(f);
    fechaRecogida = f;
    calendario.add(Calendar.DATE, 1);
    return (fechaFormateada.format(calendario.getTime()));
  }

  /**
   * Resta un día a la fecha
   * 
   * @return
   * 
   * @throws FechaNoValidaInvalidaException
   */
  static String diaAnterior(String f) throws FechaNoValidaInvalidaException {
    validarFecha(f);
    fechaRecogida = f;
    calendario.add(Calendar.DATE, -1);
    return (fechaFormateada.format(calendario.getTime()));
  }

  /**
   * Muestra los días de una fecha a otra
   * 
   * @return dias
   * @throws ParseException
   */
  public static int mostrarDiasHastHoy(String f) throws ParseException {
    Calendar calendario1 = Calendar.getInstance();
    String fecha = calendario1.get(Calendar.DATE) + "/" + (calendario1.get(Calendar.MONTH) + 1) + "/"
        + calendario1.get(Calendar.YEAR);
    Date fechaFinal = fechaFormateada.parse(fecha);
    Date fechaInicial = fechaFormateada.parse(f);

    long hoy = fechaFinal.getTime();
    long fechaI = fechaInicial.getTime();
    if (fechaInicial.before(fechaFinal)) {
      return (int) (((hoy - fechaI) / (3600 * 24 * 1000)));
    } else
      return (int) (((fechaI - hoy) / (3600 * 24 * 1000)));
  }

}
