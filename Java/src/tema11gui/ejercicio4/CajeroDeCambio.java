package tema11gui.ejercicio4;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

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
  private static CajeroDeCambio frame = new CajeroDeCambio();
  private JTextField textField_dinero;
  private JTextField textField_200;
  private JTextField textField_100;
  private JTextField textField_50;
  private JTextField textField_20;
  private JTextField textField_10;
  private JTextField textField_5;
  private JTextField textField_2;
  private JTextField textField_1;
  private JTextField textField_050;
  private JTextField textField_020;
  private JTextField textField_010;
  private JTextField textField_005;
  private JTextField textField_002;
  private JTextField textField_001;

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
  public CajeroDeCambio() {
    setResizable(false);
    setTitle("Cajero de cambio");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 428);

    JMenuBar menuBar = new JMenuBar();
    setJMenuBar(menuBar);

    JMenu mnOpciones = new JMenu("Opciones");
    menuBar.add(mnOpciones);

    JMenuItem menuItem_enunciado = new JMenuItem("Enunciado");
    menuItem_enunciado.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(frame,
            "Cajero de cambio: devuelve y desglosa el cambio en billetes y monedas de forma \"ideal\"; es decir, con el menor número de billetes y monedas posibles");
      }
    });
    mnOpciones.add(menuItem_enunciado);

    JMenuItem menuItem_salir = new JMenuItem("Salir");
    menuItem_salir.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
    mnOpciones.add(menuItem_salir);

    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    JLabel label_dinero = new JLabel("Dinero:");
    label_dinero.setBounds(71, 11, 46, 14);
    contentPane.add(label_dinero);

    textField_dinero = new JTextField();
    textField_dinero.setBounds(153, 8, 86, 20);
    contentPane.add(textField_dinero);
    textField_dinero.setColumns(10);

    JButton boton_cambio = new JButton("Cambio");
    boton_cambio.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        calcularCambio();
      }

      /**
       * Calcula el cambio pasado por el usuario
       */
      public void calcularCambio() {
        try {
          double dinero = Double.parseDouble(textField_dinero.getText());
          BigDecimal bigDecimal = new BigDecimal(dinero).setScale(2, BigDecimal.ROUND_DOWN);
          dinero = bigDecimal.doubleValue();

          int cantidad200 = 0;
          int cantidad100 = 0;
          int cantidad50 = 0;
          int cantidad20 = 0;
          int cantidad10 = 0;
          int cantidad5 = 0;
          int cantidad2 = 0;
          int cantidad1 = 0;
          int cantidad050 = 0;
          int cantidad020 = 0;
          int cantidad010 = 0;
          int cantidad005 = 0;
          int cantidad002 = 0;
          int cantidad001 = 0;

          while (dinero >= 200) {
            dinero -= 200;
            cantidad200++;
          }

          while (dinero >= 100) {
            dinero -= 100;
            cantidad100++;
          }
          while (dinero >= 50) {
            dinero -= 50;
            cantidad50++;
          }
          while (dinero >= 20) {
            dinero -= 20;
            cantidad20++;
          }
          while (dinero >= 10) {
            dinero -= 10;
            cantidad10++;
          }
          while (dinero >= 5) {
            dinero -= 5;
            cantidad5++;
          }
          while (dinero >= 2) {
            dinero -= 2;
            cantidad2++;
          }
          while (dinero >= 1) {
            dinero -= 1;
            cantidad1++;
          }
          while (dinero >= 0.50) {
            dinero -= 0.50;
            cantidad050++;
          }
          while (dinero >= 0.20) {
            dinero -= 0.20;
            cantidad020++;
          }
          while (dinero >= 0.10) {
            dinero -= 0.10;
            cantidad010++;
          }
          while (dinero >= 0.05) {
            dinero -= 0.05;
            cantidad005++;
          }
          while (dinero >= 0.02) {
            dinero -= 0.02;
            cantidad002++;
          }
          while (dinero >= 0.01) {
            dinero -= 0.01;
            cantidad001++;
          }

          textField_200.setText(Integer.toString(cantidad200));
          textField_100.setText(Integer.toString(cantidad100));
          textField_50.setText(Integer.toString(cantidad50));
          textField_20.setText(Integer.toString(cantidad20));
          textField_10.setText(Integer.toString(cantidad10));
          textField_5.setText(Integer.toString(cantidad5));
          textField_2.setText(Integer.toString(cantidad2));
          textField_1.setText(Integer.toString(cantidad1));
          textField_050.setText(Integer.toString(cantidad050));
          textField_020.setText(Integer.toString(cantidad020));
          textField_010.setText(Integer.toString(cantidad010));
          textField_005.setText(Integer.toString(cantidad005));
          textField_002.setText(Integer.toString(cantidad002));
          textField_001.setText(Integer.toString(cantidad001));
        } catch (NumberFormatException e1) {
          JOptionPane.showMessageDialog(frame, "Formato inválido", "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
    });
    boton_cambio.setBounds(282, 7, 91, 23);
    contentPane.add(boton_cambio);

    textField_200 = new JTextField();
    textField_200.setColumns(10);
    textField_200.setBounds(85, 59, 57, 20);
    contentPane.add(textField_200);

    textField_100 = new JTextField();
    textField_100.setColumns(10);
    textField_100.setBounds(85, 103, 57, 20);
    contentPane.add(textField_100);

    textField_50 = new JTextField();
    textField_50.setColumns(10);
    textField_50.setBounds(85, 149, 57, 20);
    contentPane.add(textField_50);

    textField_20 = new JTextField();
    textField_20.setColumns(10);
    textField_20.setBounds(85, 194, 57, 20);
    contentPane.add(textField_20);

    textField_10 = new JTextField();
    textField_10.setColumns(10);
    textField_10.setBounds(85, 239, 57, 20);
    contentPane.add(textField_10);

    textField_5 = new JTextField();
    textField_5.setColumns(10);
    textField_5.setBounds(85, 286, 57, 20);
    contentPane.add(textField_5);

    JLabel label_200 = new JLabel("200");
    label_200.setBounds(29, 62, 46, 14);
    contentPane.add(label_200);

    JLabel label_100 = new JLabel("100");
    label_100.setBounds(29, 106, 46, 14);
    contentPane.add(label_100);

    JLabel label_50 = new JLabel("50");
    label_50.setBounds(29, 152, 46, 14);
    contentPane.add(label_50);

    JLabel label_20 = new JLabel("20");
    label_20.setBounds(29, 197, 46, 14);
    contentPane.add(label_20);

    JLabel label_4 = new JLabel("10");
    label_4.setBounds(29, 242, 46, 14);
    contentPane.add(label_4);

    JLabel label_5 = new JLabel("5");
    label_5.setBounds(29, 289, 46, 14);
    contentPane.add(label_5);

    JLabel label_2 = new JLabel("2");
    label_2.setBounds(243, 62, 46, 14);
    contentPane.add(label_2);

    textField_2 = new JTextField();
    textField_2.setBounds(313, 59, 57, 20);
    contentPane.add(textField_2);
    textField_2.setColumns(10);

    JLabel label_1 = new JLabel("1");
    label_1.setBounds(243, 93, 46, 14);
    contentPane.add(label_1);

    JLabel label_050 = new JLabel("0.50");
    label_050.setBounds(243, 123, 46, 14);
    contentPane.add(label_050);

    JLabel label_020 = new JLabel("0.20");
    label_020.setBounds(243, 152, 46, 14);
    contentPane.add(label_020);

    JLabel label_010 = new JLabel("0.10");
    label_010.setBounds(243, 197, 46, 14);
    contentPane.add(label_010);

    JLabel label_005 = new JLabel("0.05");
    label_005.setBounds(243, 242, 46, 14);
    contentPane.add(label_005);

    JLabel label_002 = new JLabel("0.02");
    label_002.setBounds(243, 289, 46, 14);
    contentPane.add(label_002);

    JLabel label_001 = new JLabel("0.01");
    label_001.setBounds(243, 332, 46, 14);
    contentPane.add(label_001);

    textField_1 = new JTextField();
    textField_1.setColumns(10);
    textField_1.setBounds(313, 90, 57, 20);
    contentPane.add(textField_1);

    textField_050 = new JTextField();
    textField_050.setColumns(10);
    textField_050.setBounds(313, 120, 57, 20);
    contentPane.add(textField_050);

    textField_020 = new JTextField();
    textField_020.setColumns(10);
    textField_020.setBounds(313, 163, 57, 20);
    contentPane.add(textField_020);

    textField_010 = new JTextField();
    textField_010.setColumns(10);
    textField_010.setBounds(313, 194, 57, 20);
    contentPane.add(textField_010);

    textField_005 = new JTextField();
    textField_005.setColumns(10);
    textField_005.setBounds(313, 239, 57, 20);
    contentPane.add(textField_005);

    textField_002 = new JTextField();
    textField_002.setColumns(10);
    textField_002.setBounds(313, 286, 57, 20);
    contentPane.add(textField_002);

    textField_001 = new JTextField();
    textField_001.setColumns(10);
    textField_001.setBounds(313, 329, 57, 20);
    contentPane.add(textField_001);

  }
}
