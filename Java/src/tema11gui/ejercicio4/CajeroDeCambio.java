package tema11gui.ejercicio4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * <p>
 * 4. Cajero de cambio: devuelve y desglosa el cambio en billetes y monedas de
 * forma "ideal"; es decir, con el menor número de billetes y monedas posibles.
 * </p>
 * <br />
 * <p>
 * Componentes gráficos:
 * </p>
 * <ul>
 * <li>Etiquetas.</li>
 * <li>Caja de texto para introducir dinero a cambiar.</li>
 * <li>Cajas de texto para billetes y monedas.</li>
 * <li>Botón para calcular.</li>
 * </ul>
 * <br />
 * <p>
 * Opcional: sustituir la etiqueta de cada billete y moneda por su imagen.
 * </p>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class CajeroDeCambio extends JFrame {

  private JPanel contentPane;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          CajeroDeCambio frame = new CajeroDeCambio();
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
  public CajeroDeCambio() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    contentPane.setLayout(new BorderLayout(0, 0));
    setContentPane(contentPane);
  }

}
