package tema9programacionorientadaaobjetos.ejemplos.EjemploInterfaz;

/**
 * Mascota.java
 * Definición de la interfaz Mascota
 * 
 * @author Luis José Sánchez
 */
public interface Mascota {
  String getCodigo();
  void hazRuido();
  void come(String comida);
  void peleaCon(Animal contrincante);
}
