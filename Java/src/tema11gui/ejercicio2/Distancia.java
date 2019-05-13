package tema11gui.ejercicio2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

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
 * <p>
 * l usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos en
 * el plano. Calcula y muestra la distancia entre ellos.
 * </p>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class Distancia extends JFrame {

  private JPanel contentPane;
  static Distancia frame = new Distancia();
  private JTextField textField_x1;
  private JTextField textField_x2;
  private JTextField textField_y1;
  private JTextField textField_y2;
  private JTextField textField_distancia;

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
  public Distancia() {
    setTitle("Distancia entre dos números pares");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 470, 305);

    JMenuBar menuBar = new JMenuBar();
    setJMenuBar(menuBar);

    JMenu menu_opciones = new JMenu("Opciones");
    menuBar.add(menu_opciones);

    JMenuItem menuItem_enunciado = new JMenuItem("Enunciado");
    menuItem_enunciado.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        JOptionPane.showMessageDialog(frame,
            "Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos en el plano. Calcula y muestra la distancia entre ellos.");
      }
    });
    menu_opciones.add(menuItem_enunciado);

    JMenuItem menuItem_salir = new JMenuItem("Salir");
    menuItem_salir.addActionListener(new ActionListener() {
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
    menu_opciones.add(menuItem_salir);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    JLabel label_x1 = new JLabel("x1:");
    label_x1.setBounds(33, 24, 46, 14);
    contentPane.add(label_x1);

    JLabel label_x2 = new JLabel("x2:");
    label_x2.setBounds(33, 64, 46, 14);
    contentPane.add(label_x2);

    JLabel label_y1 = new JLabel("y1:");
    label_y1.setBounds(272, 24, 46, 14);
    contentPane.add(label_y1);

    JLabel label_y2 = new JLabel("y2:");
    label_y2.setBounds(272, 64, 46, 14);
    contentPane.add(label_y2);

    textField_x1 = new JTextField();
    textField_x1.setBounds(104, 21, 86, 20);
    contentPane.add(textField_x1);
    textField_x1.setColumns(10);

    textField_x2 = new JTextField();
    textField_x2.setBounds(104, 61, 86, 20);
    contentPane.add(textField_x2);
    textField_x2.setColumns(10);

    textField_y1 = new JTextField();
    textField_y1.setBounds(328, 21, 86, 20);
    contentPane.add(textField_y1);
    textField_y1.setColumns(10);

    textField_y2 = new JTextField();
    textField_y2.setBounds(328, 61, 86, 20);
    contentPane.add(textField_y2);
    textField_y2.setColumns(10);

    JButton button_calcular = new JButton("Calcular");
    button_calcular.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        calcularDistancia();
      }

      /**
       * Calcular la distancia entre puntos
       */
      private void calcularDistancia() {
        try {
          int x1 = Integer.parseInt(textField_x1.getText());
          int y1 = Integer.parseInt(textField_x2.getText());
          int x2 = Integer.parseInt(textField_y1.getText());
          int y2 = Integer.parseInt(textField_y2.getText());
          double distancia = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
          textField_distancia.setForeground(Color.black);
          textField_distancia.setText(Double.toString(distancia));
        } catch (NumberFormatException e1) {
          JOptionPane.showMessageDialog(frame, "No puedes introducir letras o no has rellenado todos los campos",
              "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
    });
    button_calcular.setBounds(104, 187, 89, 23);
    contentPane.add(button_calcular);

    JButton button_limpiar = new JButton("Limpiar");
    button_limpiar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        limpiar();
      }

      /**
       * Limpia las cajas de texto
       */
      private void limpiar() {
        textField_x1.setText("");
        textField_x2.setText("");
        textField_y1.setText("");
        textField_y2.setText("");
        textField_distancia.setText("");
      }
    });
    button_limpiar.setBounds(272, 187, 89, 23);
    contentPane.add(button_limpiar);

    JLabel label_distancia = new JLabel("Distancia:");
    label_distancia.setBounds(33, 130, 86, 14);
    contentPane.add(label_distancia);

    textField_distancia = new JTextField();
    textField_distancia.setEnabled(false);
    textField_distancia.setBounds(129, 127, 285, 20);
    contentPane.add(textField_distancia);
    textField_distancia.setColumns(10);
  }
}
