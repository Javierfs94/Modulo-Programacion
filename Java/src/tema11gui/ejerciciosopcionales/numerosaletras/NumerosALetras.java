package tema11gui.ejerciciosopcionales.numerosaletras;

import java.math.BigDecimal;

/**
 * Introducir un número entero positivo y pasarlo a letra
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class NumerosALetras {

  /**
   * <p>
   * Convierte el número que recibe como argumento a letra
   * </p>
   * <br />
   * <p>
   * Nota: Para realizar este ejercicio, he necesitado ejemplos para conseguir les
   * unidades, centenas, decenas, etc. Así como ejemplos de ejercicios que de
   * convertir números a cadenas. Con eso encontré también información sobre la
   * clase y métodos BigDecimal, que permiten una mayour precisión que
   * necesitaremos para asegurarnos de que la conversión de número a letra sea
   * exitosa.
   * </p>
   * 
   * @param cadena contiene los dígitos de un número
   * @return Una cadena de texto que contiene la letra de la parte entera del
   *         número
   */
  public static String cantidadConLetra(String cadena) {
    StringBuilder resultado = new StringBuilder(); // Genera el resultado de la cadena correspondiente a representar el
                                                   // número en letra
    BigDecimal total = new BigDecimal(cadena).setScale(2, BigDecimal.ROUND_DOWN); // Formatea la cadena de una manera
                                                                                  // más precisa

    // Extraemos las partes correspondientes del número
    long parteEntera = total.toBigInteger().longValue();
    int unidades = (int) ((parteEntera % 1000));
    int miles = (int) ((parteEntera / 1000) % 1000);
    int millones = (int) ((parteEntera / 1000000) % 1000);
    int milMillones = (int) ((parteEntera / 1000000000) % 1000);

    return mostrarResultado(resultado, parteEntera, unidades, miles, millones, milMillones); // Mostramos el resultado
                                                                                             // mediante el uso de
                                                                                             // condicionales
  }

  /**
   * Muestra el resultado de la cadena, evaluando cada parte del número
   * 
   * @param resultado
   * @param parteEntera
   * @param unidades
   * @param miles
   * @param millones
   * @param milMillones
   * @return cadena de texto resultante
   */
  private static String mostrarResultado(StringBuilder resultado, long parteEntera, int unidades, int miles,
      int millones, int milMillones) {
    if (parteEntera == 0) {
      resultado.append("Cero ");
      return resultado.toString();
    }

    if (milMillones > 0) {
      resultado.append(texto(milMillones).toString() + "Mil ");
    }
    if (millones > 0) {
      resultado.append(texto(millones).toString());
    }
    if (milMillones == 0 && millones == 1) {
      resultado.append("Millón ");
    } else if (milMillones > 0 || millones > 0) {
      resultado.append("Millones ");
    }

    if (miles > 0) {
      resultado.append(texto(miles).toString() + "Mil ");
    }
    if (unidades > 0) {
      resultado.append(texto(unidades).toString());
    }
    return resultado.toString();
  }

  /**
   * Convierte una cantidad de tres cifras a su representación escrita con letra
   *
   * @param numero a convertir
   * @return Una cadena de texto que contiene la representación con letra del
   *         número que se recibió como argumento
   */
  private static StringBuilder texto(int numero) {
    StringBuilder resultado = new StringBuilder();
    int centenas = numero / 100;
    int decenas = (numero % 100) / 10;
    int unidades = (numero % 10);

    switch (centenas) {
    case 0:
      break;
    case 1:
      if (decenas == 0 && unidades == 0) {
        resultado.append("Cien ");
        return resultado;
      } else
        resultado.append("Ciento ");
      break;
    case 2:
      resultado.append("Doscientos ");
      break;
    case 3:
      resultado.append("Trescientos ");
      break;
    case 4:
      resultado.append("Cuatrocientos ");
      break;
    case 5:
      resultado.append("Quinientos ");
      break;
    case 6:
      resultado.append("Seiscientos ");
      break;
    case 7:
      resultado.append("Setecientos ");
      break;
    case 8:
      resultado.append("Ochocientos ");
      break;
    case 9:
      resultado.append("Novecientos ");
      break;
    }

    switch (decenas) {
    case 0:
      break;
    case 1:
      if (unidades == 0) {
        resultado.append("Diez ");
        return resultado;
      } else if (unidades == 1) {
        resultado.append("Once ");
        return resultado;
      } else if (unidades == 2) {
        resultado.append("Doce ");
        return resultado;
      } else if (unidades == 3) {
        resultado.append("Trece ");
        return resultado;
      } else if (unidades == 4) {
        resultado.append("Catorce ");
        return resultado;
      } else if (unidades == 5) {
        resultado.append("Quince ");
        return resultado;
      } else
        resultado.append("Dieci");
      break;
    case 2:
      if (unidades == 0) {
        resultado.append("Veinte ");
        return resultado;
      } else
        resultado.append("Veinti");
      break;
    case 3:
      resultado.append("Treinta ");
      break;
    case 4:
      resultado.append("Cuarenta ");
      break;
    case 5:
      resultado.append("Cincuenta ");
      break;
    case 6:
      resultado.append("Sesenta ");
      break;
    case 7:
      resultado.append("Setenta ");
      break;
    case 8:
      resultado.append("Ochenta ");
      break;
    case 9:
      resultado.append("Noventa ");
      break;
    }

    if (decenas > 2 && unidades > 0)
      resultado.append("y ");

    switch (unidades) {
    case 0:
      break;
    case 1:
      resultado.append("Un ");
      break;
    case 2:
      resultado.append("Dos ");
      break;
    case 3:
      resultado.append("Tres ");
      break;
    case 4:
      resultado.append("Cuatro ");
      break;
    case 5:
      resultado.append("Cinco ");
      break;
    case 6:
      resultado.append("Seis ");
      break;
    case 7:
      resultado.append("Siete ");
      break;
    case 8:
      resultado.append("Ocho ");
      break;
    case 9:
      resultado.append("Nueve ");
      break;
    }

    return resultado; // cadena final resultante
  }
}
