package listados.listado3;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Hacer un programa que muestre un cronometro, indicando las horas, minutos y
 * segundos.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio8 {

	public static void main(String[] args) throws InterruptedException {
    //Variables
    int hora;
    int minuto;
    int segundo;
    String borraAnterior="\b\b\b\b\b\b\b\b";

  //horas
  for(hora=0;hora<=23;hora++){    
    //minutos
     for(minuto=0;minuto<=59;minuto++){    
      //segundos
       for(segundo=0;segundo<=59;segundo++){
        System.out.println(hora+":"+minuto+":"+segundo);
        //System.out.println(borraAnterior+hora+":"+minuto+":"+segundo);
        TimeUnit.SECONDS.sleep(1);
        //Thread.sleep(1+1000);
    
        }
    
      }
    
    }

	}

}
