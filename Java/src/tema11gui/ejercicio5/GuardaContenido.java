package tema11gui.ejercicio5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * <p>
 * 5. Escribe un programa que guarde en un fichero el contenido de otros dos
 * ficheros, de tal forma que en el fichero resultante aparezcan las líneas de
 * los primeros dos ficheros mezcladas, es decir, la primera línea será del
 * primer fichero, la segunda será del segundo fichero, la tercera será la
 * siguiente del primer fichero, etc.
 * </p>
 * <br />
 * <p>
 * Componentes gráficos:
 * </p>
 * <ul>
 * <li>Etiquetas.</li>
 * <li>Fichero origen y destino.</li>
 * <li>Botón para ejecutar la acción.</li>
 * <li>Caja de texto con el contenido del fichero destino no editable.</li>
 * </ul>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class GuardaContenido extends JFrame {

  private JPanel contentPane;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          GuardaContenido frame = new GuardaContenido();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public GuardaContenido() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    contentPane.setLayout(new BorderLayout(0, 0));
    setContentPane(contentPane);
  }

}
