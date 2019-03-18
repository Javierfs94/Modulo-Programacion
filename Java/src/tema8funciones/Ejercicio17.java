package tema8funciones;

/**
 * Escribe un programa que pase de binario a decimal.
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Ejercicio17 {

	public static void main(String[] args) {
		
	   long decimal = 0;
	    
	    System.out.print("Introduzca un número binario: ");
	    long binario = Long.parseLong(System.console().readLine());
	    
	    int bits = Matematicas.digitos(binario);
	    
	    for(int i = 0; i < bits; i++) {
	      decimal += Matematicas.digitoN((int) binario, bits - i - 1) * Matematicas.potencia(2, i);
	    }
	    
	    System.out.println(binario + " en binario es " + decimal + " en decimal.");
	  }
	}

