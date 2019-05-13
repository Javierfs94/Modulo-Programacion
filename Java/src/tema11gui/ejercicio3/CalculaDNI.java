package tema11gui.ejercicio3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 * 3. Pide un DNI y comprueba que es correcto, será correcto si tiene 9
 * caracteres y la letra es correcta.
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class CalculaDNI extends JFrame {

  private JPanel contentPane;
  private JTextField textField_dni;
  static CalculaDNI frame = new CalculaDNI();

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
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Crea la ventana
   */
  public CalculaDNI() {
    setTitle("Comprueba DNI");
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 354, 212);

    JMenuBar menuBar = new JMenuBar();
    setJMenuBar(menuBar);

    JMenu mnNewMenu = new JMenu("Opciones");
    menuBar.add(mnNewMenu);

    JMenuItem menuItem_enunciado = new JMenuItem("Enunciado");
    menuItem_enunciado.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(frame,
            "Pide un DNI y comprueba que es correcto, será correcto si tiene 9 caracteres y la letra es correcta.");
      }
    });
    mnNewMenu.add(menuItem_enunciado);

    JMenuItem menuItem_salir = new JMenuItem("Salir");
    menuItem_salir.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        salir();
      }

      /**
       * Sale de la aplicación
       */
      private void salir() {
        System.exit(0);
      }
    });
    mnNewMenu.add(menuItem_salir);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    JLabel label_dni = new JLabel("DNI:");
    label_dni.setBounds(81, 40, 46, 14);
    contentPane.add(label_dni);

    textField_dni = new JTextField();
    textField_dni.setBounds(198, 37, 86, 20);
    contentPane.add(textField_dni);
    textField_dni.setColumns(10);

    JButton button_comprobar = new JButton("Comprobar");
    button_comprobar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        comprobarDNI();
      }

      /**
       * Comprueba el DNI introducido
       */
      private void comprobarDNI() {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        String dni = textField_dni.getText();
        if (dni.length() == 9) {
          int numero_dni = Integer.parseInt(dni.substring(0, 8));
          char letra_dni = dni.toUpperCase().charAt(8);
          if (letra_dni == letras.charAt(numero_dni % 23)) {
            JOptionPane.showMessageDialog(frame, "El DNI es válido");
          }
        } else {
          JOptionPane.showMessageDialog(frame, "El DNI no es válido", "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
    });
    button_comprobar.setBounds(60, 108, 104, 23);
    contentPane.add(button_comprobar);

    JButton button_limpiar = new JButton("Limpiar");
    button_limpiar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        limpiar();
      }

      /**
       * Limpia las cajas de texto
       */
      private void limpiar() {
        textField_dni.setText("");
      }
    });
    button_limpiar.setBounds(198, 108, 97, 23);
    contentPane.add(button_limpiar);
  }
}
