package tema11gui.ejercicio6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * <p>
 * 6. Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
 * fichero.
 * </p>
 * <br />
 * <p>
 * Componentes gráficos:
 * </p>
 * <ul>
 * <li>Etiquetas.</li>
 * <li>Fichero a comprobar.</li>
 * <li>Caja de texto con resultado.</li>
 * <li>Botón calcular.</li>
 * </ul>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class CompruebaOcurrencias extends JFrame {

  private JPanel contentPane;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          CompruebaOcurrencias frame = new CompruebaOcurrencias();
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
  public CompruebaOcurrencias() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    contentPane.setLayout(new BorderLayout(0, 0));
    setContentPane(contentPane);
  }

}
