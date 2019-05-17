package tema11gui.ejerciciosopcionales.numerosaletras;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * Ventana de interacción del usuario con la aplicación
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class Principal extends JFrame {

  private JPanel contentPane;
  private JTextField textField_letra;
  private JTextField textField_numero;
  static Principal frame = new Principal();

  public static void main(String[] args) {
    lanzarAplicacion();
  }

  /**
   * Lanza la aplicación
   */
  public static void lanzarAplicacion() {
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
  public Principal() {
    setResizable(false);
    setTitle("Numeros a letras");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 1048, 340);

    JMenuBar menuBar = new JMenuBar();
    setJMenuBar(menuBar);

    JMenu mnOpciones = new JMenu("Opciones");
    menuBar.add(mnOpciones);

    JMenuItem menuItem_enunciado = new JMenuItem("Enunciado");
    menuItem_enunciado.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        JOptionPane.showMessageDialog(frame,
            "En este ejercicio se busca introducir un número entero positivo hasta 1 billón y que se muestre dicho número en letra");
      }
    });
    mnOpciones.add(menuItem_enunciado);

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
    mnOpciones.add(menuItem_salir);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    JLabel label_numero = new JLabel("Número:");
    label_numero.setBounds(396, 25, 62, 14);
    contentPane.add(label_numero);

    JLabel label_letra = new JLabel("Letra:");
    label_letra.setBounds(475, 100, 62, 14);
    contentPane.add(label_letra);

    textField_letra = new JTextField();
    textField_letra.setEnabled(false);
    textField_letra.setBounds(30, 143, 964, 32);
    contentPane.add(textField_letra);
    textField_letra.setColumns(10);

    textField_numero = new JTextField();
    textField_numero.setBounds(523, 22, 242, 20);
    contentPane.add(textField_numero);
    textField_numero.setColumns(10);

    JButton boton_mostrar = new JButton("Mostrar");
    boton_mostrar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        mostrarNumeroEnLetra();
      }

      /**
       * Muestra el número el letra
       */
      private void mostrarNumeroEnLetra() {
        try {
          textField_letra.setForeground(Color.black);
          textField_letra.setText(NumerosALetras.cantidadConLetra(textField_numero.getText()));
        } catch (Exception e) {
          JOptionPane.showMessageDialog(frame,
              "No puedes introducir letras. Debes introducir un número entero positivo", "Error",
              JOptionPane.ERROR_MESSAGE);
        }
      }
    });
    boton_mostrar.setBounds(367, 217, 91, 23);
    contentPane.add(boton_mostrar);

    JButton boton_limpiar = new JButton("Limpiar");
    boton_limpiar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        limpiar();
      }

      /**
       * Limpia los campos
       */
      private void limpiar() {
        textField_letra.setText("");
        textField_numero.setText("");
      }
    });
    boton_limpiar.setBounds(571, 217, 91, 23);
    contentPane.add(boton_limpiar);

  }
}
