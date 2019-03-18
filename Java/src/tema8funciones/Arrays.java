package tema8funciones;

/**
 * <p>
 * Crea una biblioteca de funciones para arrays (de una dimensión) de números
 * enteros que contenga las siguientes funciones:
 * </p>
 * <ul>
 * <li>1. generaArrayInt: Genera un array de tamaño n con números aleatorios
 * cuyo intervalo (mínimo y máximo) se indica como parámetro.</li>
 * <li>2. minimoArrayInt: Devuelve el mínimo del array que se pasa como
 * parámetro.</li>
 * <li>3. maximoArrayInt: Devuelve el máximo del array que se pasa como
 * parámetro.</li>
 * <li>4. mediaArrayInt: Devuelve la media del array que se pasa como
 * parámetro.</li>
 * <li>5. estaEnArrayInt: Dice si un número está o no dentro de un array.</li>
 * <li>6. posicionEnArray: Busca un número en un array y devuelve la posición
 * (el índice) en la que se encuentra.</li>
 * <li>7. volteaArrayInt: Le da la vuelta a un array.</li>
 * <li>8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un
 * array.</li>
 * <li>9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de
 * un array.</li>
 * </ul>
 *
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class Arrays {

	/**
	 * Muestra por pantalla todos los elementos de un array de números enteros
	 * separados por un espacio.
	 * 
	 * @param x
	 *          array unidimiensional de números enteros
	 */
	public static void muestraArrayInt(int x[]) {
		for (int n : x) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	/**
	 * 1. generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo
	 * intervalo (mínimo y máximo) se indica como parámetro.
	 * 
	 * 
	 */
  public static int[] generaArrayInt(int n, int minimo, int maximo) {
    int[] x = new int[n];

    for(int i = 0; i < n; i++) {
      x[i] = (int)(Math.random()*(maximo - minimo + 1) + minimo);
    }
      
    return x;
  }
	/**
	 * 2. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
	 * 
	 * 
	 */
  public static int minimoArrayInt(int[] x) {
    int minimo = Integer.MAX_VALUE;
    
    for (int n : x) {
      if (n < minimo) {
        minimo = n;
      }
    }
    return minimo;
  }
	/**
	 * 3. maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
	 * 
	 * 
	 */
  public static int maximoArrayInt(int[] x) {
    int maximo = Integer.MIN_VALUE;
    
    for (int n : x) {
      if (n > maximo) {
        maximo = n;
      }
    }
      
    return maximo;
  }
	/**
	 * 4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
	 * 
	 * 
	 */
  public static double mediaArrayInt(int[] x) {
    int suma = 0;
    
    for (int n : x) {
      suma += n;
    }
      
    return (double)suma / x.length;
  }
	/**
	 * 5. estaEnArrayInt: Dice si un número está o no dentro de un array.
	 * 
	 * 
	 */
  public static boolean estaEnArrayInt(int[] x, int n) {
    for (int numero : x) {
      if (numero == n) {
        return true;
      }
    }
    return false;
  }
	/**
	 * 6. posicionEnArray: Busca un número en un array y devuelve la posición (el
	 * índice) en la que se encuentra.
	 * 
	 * 
	 */
  public static boolean posicionEnArray(int[] x, int n) {
  for (int numero : x) {
    if (numero == n) {
      return true;
    }
  }
  return false;
}
  /**
	 * 7. volteaArrayInt: Le da la vuelta a un array.
	 * 
	 * 
	 */
  public static int[] volteaArrayInt(int[] x) {
    int[] a = new int[x.length];
    
    for(int i = 0; i < x.length; i++) {
      a[x.length - i - 1] = x[i];
    }
      
    return a;
  }
	/**
	 * 8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un
	 * array.
	 * 
	 * 
	 */
 public static int[] rotaDerechaArrayInt(int[] x, int n) {
   
   int[] a = x.clone(); // clona en a el contenido de x
   int i;
   int aux;
   
   while (n-- > 0) {
     aux = a[a.length - 1];
     for(i = a.length - 1; i > 0; i--) {
       a[i] = a[i - 1];
     }
     a[0] = aux;
   }
     
   return a;
 }
 
	/**
	 * 9. rotaIzquierdaArrayInt:
	 * 
	 * 
	 */
  public static int[] rotaIzquierdaArrayInt(int[] x, int n) {
    
    int[] a = x.clone(); // clona en a el contenido de x
    int i;
    int aux;
    
    while (n-- > 0) {
      aux = a[0];
      for(i = 0; i < a.length - 1; i++) {
        a[i] = a[i + 1];
      }
      a[a.length - 1] = aux;
    }
      
    return a;
  }
}
