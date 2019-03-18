package listados.listado3;
/**
 * Una persona adquiri� un producto para pagar en 20 meses. El primer mes pag�
 * 10 �, el segundo 20 �, el tercero 40 � y as� sucesivamente. Realizar un
 * programa para determinar cu�nto debe pagar mensualmente y el total de lo que
 * pagar� despu�s de los 20 meses.
 *
 * @author Fco Javier Frias Serrano
 * @version 1.0
 */
public class Ejercicio7 {

	public static void main(String[] args) {
    //Variables
    int totalAPagar = 0;
    int mensualidad = 10;

    for(int i = 1; i<=20; i++){      
      System.out.printf("Mes %2d pago %7d\n", i , mensualidad);
      totalAPagar += mensualidad; 
      mensualidad *=  2;

    }

   System.out.println("El total a pagar por el producto es: " + totalAPagar);

		
	}

}
