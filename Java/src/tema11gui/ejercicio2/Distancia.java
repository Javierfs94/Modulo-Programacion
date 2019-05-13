package tema11gui.ejercicio2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Distancia extends JFrame {

  private JPanel contentPane;

  public static void main(String[] args) {
    lanzarAplicacion();
  }

  /**
   * Lanza la aplicación
   */
  private static void lanzarAplicacion() {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Distancia frame = new Distancia();
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
  public Distancia() {
    setTitle("Distancia entre dos números pares");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);

    JMenuBar menuBar = new JMenuBar();
    setJMenuBar(menuBar);

    JMenu menu_opciones = new JMenu("Opciones");
    menuBar.add(menu_opciones);

    JMenuItem mntmEnunciado = new JMenuItem("Enunciado");
    mntmEnunciado.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
      }
    });
    menu_opciones.add(mntmEnunciado);

    JMenuItem mntmSalir = new JMenuItem("Salir");
    mntmSalir.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        salir();
      }

      /**
       * Sale de la aplicación
       */
      private void salir() {
        System.exit(0);
      }
    });
    menu_opciones.add(mntmSalir);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
  }

}
