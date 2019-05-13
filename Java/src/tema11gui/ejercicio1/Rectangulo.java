package tema11gui.ejercicio1;

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
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * <p>
 * 1. Calcular el perímetro y área de un rectángulo dada su base y su altura.
 * </p>
 * <br />
 * <p>
 * Componentes gráficos:
 * </p>
 * <br />
 * <ul>
 * <li>Etiquetas.</li>
 * <li>Cajas de texto para base y altura.</li>
 * <li>Botón para calcular.</li>
 * <li>Caja de texto resultado.</li>
 * </ul>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class Rectangulo extends JFrame {

  private JPanel contentPane;
  private JTextField textField_base;
  private JTextField textField_altura;
  static Rectangulo frame = new Rectangulo();
  private JTextField textField_resultado;

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
   * Create the frame.
   */
  public Rectangulo() {
    setResizable(false);
    setTitle("Rectángulo");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 368, 266);

    JMenuBar menuBar = new JMenuBar();
    setJMenuBar(menuBar);

    JMenu mnOpciones = new JMenu("Opciones");
    menuBar.add(mnOpciones);

    JMenuItem menuItem_enunciado = new JMenuItem("Enunciado");
    menuItem_enunciado.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(frame, "Calcular el perímetro y área de un rectángulo dada su base y su altura.");
      }
    });
    mnOpciones.add(menuItem_enunciado);

    JMenuItem menuItem_ayuda = new JMenuItem("Ayuda");
    menuItem_ayuda.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(frame,
            "Introduzca la base y la altura en números para calcular el área del réctangulo.");
      }
    });
    mnOpciones.add(menuItem_ayuda);

    JMenuItem menuItem_salir = new JMenuItem("Salir");
    menuItem_salir.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });

    JSeparator separador1 = new JSeparator();
    mnOpciones.add(separador1);
    mnOpciones.add(menuItem_salir);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    JLabel label_base = new JLabel("Base:");
    label_base.setBounds(71, 22, 46, 14);
    contentPane.add(label_base);

    JLabel label_altura = new JLabel("Altura:");
    label_altura.setBounds(71, 61, 46, 14);
    contentPane.add(label_altura);

    JLabel label_area = new JLabel("Área:");
    label_area.setBounds(71, 110, 46, 14);
    contentPane.add(label_area);

    textField_base = new JTextField();
    textField_base.setBounds(203, 22, 86, 20);
    contentPane.add(textField_base);
    textField_base.setColumns(10);

    textField_altura = new JTextField();
    textField_altura.setBounds(203, 58, 86, 20);
    contentPane.add(textField_altura);
    textField_altura.setColumns(10);

    JButton button_Calcular = new JButton("Calcular");
    button_Calcular.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        calcularArea();
      }

      /**
       * Calcula el área del rectángulo
       * 
       * @param label_resultado
       */
      public void calcularArea() {
        try {
          double base = Double.parseDouble(textField_base.getText());
          double altura = Double.parseDouble(textField_altura.getText());
          double area = base * altura;
          textField_resultado.setForeground(Color.black);
          textField_resultado.setText(Double.toString(area));
        } catch (Exception e2) {
          JOptionPane.showMessageDialog(frame, "No puedes introducir letras o no has rellenado todos los campos",
              "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
    });
    button_Calcular.setBounds(71, 161, 91, 23);
    contentPane.add(button_Calcular);

    JButton button_limpiar = new JButton("Limpiar");
    button_limpiar.addActionListener(new ActionListener() {

      public void actionPerformed(ActionEvent arg0) {
        limpiar();
      }

      /**
       * Limpiar los campos
       */
      public void limpiar() {
        textField_base.setText("");
        textField_altura.setText("");
        textField_resultado.setText("");
      }
    });
    button_limpiar.setBounds(203, 161, 91, 23);
    contentPane.add(button_limpiar);

    textField_resultado = new JTextField();
    textField_resultado.setEditable(false);
    textField_resultado.setBounds(203, 107, 86, 20);
    contentPane.add(textField_resultado);
    textField_resultado.setColumns(10);

  }
}
