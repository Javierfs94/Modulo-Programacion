package tema11gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 * <p>
 * Programa para introducir el radio y que te calcule el área del círculo Área
 * </p>
 * <p>
 * del círculo = π*r²
 * </p>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class CalculaArea extends JFrame {

  private JPanel contentPane;
  private JTextField textField_radio;
  private JLabel label_mostrar;
  private JButton btnLimpiar;

  public static void main(String[] args) {
    launchAplication();
  }

  /**
   * Launch the application.
   */
  private static void launchAplication() {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          CalculaArea frame = new CalculaArea();
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
  public CalculaArea() {
    setType(Type.UTILITY);
    setTitle("Calcula Círculo");
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 401, 225);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    JButton button_calcular = new JButton("Calcular");
    button_calcular.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        calcularArea();
      }

      /**
       * Calcula el Area
       */
      private void calcularArea() {
        try {
          label_mostrar.setForeground(Color.black);
          double pi = 3.14;
          double numero = Double.parseDouble(textField_radio.getText());
          double area = pi * Math.pow(numero, 2);
          label_mostrar.setText(Double.toString(area));

        } catch (Exception e) {
          label_mostrar.setText("No puedes introducir letras");
          label_mostrar.setForeground(Color.red);
        }
      }
    });
    button_calcular.setBounds(64, 102, 89, 23);
    contentPane.add(button_calcular);

    JLabel label_radio = new JLabel("Radio:");
    label_radio.setHorizontalAlignment(SwingConstants.CENTER);
    label_radio.setBounds(93, 35, 60, 23);
    contentPane.add(label_radio);

    textField_radio = new JTextField();
    textField_radio.setHorizontalAlignment(SwingConstants.CENTER);
    textField_radio.setBounds(195, 36, 86, 20);
    contentPane.add(textField_radio);
    textField_radio.setColumns(10);

    label_mostrar = new JLabel("");
    label_mostrar.setHorizontalAlignment(SwingConstants.CENTER);
    label_mostrar.setBounds(93, 155, 188, 30);
    contentPane.add(label_mostrar);

    btnLimpiar = new JButton("Limpiar");
    btnLimpiar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        limpiar();
      }

      /**
       * Limpia los campos que introducen o muestran información
       */
      private void limpiar() {
        textField_radio.setText("");
        label_radio.setForeground(Color.black);
      }
    });
    btnLimpiar.setBounds(195, 102, 89, 23);
    contentPane.add(btnLimpiar);
  }
}
