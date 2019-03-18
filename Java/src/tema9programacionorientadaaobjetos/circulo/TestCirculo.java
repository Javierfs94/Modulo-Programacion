package tema9programacionorientadaaobjetos.circulo;

/**
 * <p>
 * 3. Crea una clase TestCirculo que cree una instancia de “Circulo”, muestre su
 * estado, lo haga creaser 27 veces, averigüe su área, lo haga decrecer 10 veces
 * y muestre su estado final.
 * </p>
 * 
 * @author Fco Javier Frías Serrano
 * @version 1.0
 */
public class TestCirculo {

	public static void main(String[] args) {

		Circulo circulo = new Circulo(5);

		System.out.println(circulo.toString());

		circulo.crecer(27);
		circulo.getArea();
		circulo.menguar(10);

		System.out.println(circulo.toString());

	}

}
