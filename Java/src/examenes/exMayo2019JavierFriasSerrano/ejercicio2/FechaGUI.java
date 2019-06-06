package examenes.exMayo2019JavierFriasSerrano.ejercicio2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 * <p>
 * 2.- Escribe un programa que usando la interfaz gráfica de Java permita al
 * usuario introducir una fecha en formato dd/mm/aaaa y que tenga los siguientes
 * botones:
 * </p>
 * <ul>
 * <li>• Validar fecha: muestra un mensaje diciendo si la fecha es o no
 * válida.</li>
 * <li>• Día posterior: Modifica la fecha sumándole un día. Debe validar la
 * fecha antes de hacer la operación.</li>
 * <li>• Día anterior: Modifica la fecha restándole un día. Debe validar la
 * fecha antes de hacer la operación.</li>
 * <li>• Días hasta hoy: Muestra el número de días que hay entre la fecha
 * introducida y la fecha de hoy. Debe validar la fecha antes de hacer la
 * operación.</li>
 * <li>• Terminar.</li>
 * </ul>
 * <p>
 * La fecha debe ser manejada mediante un objeto de una clase que o bien
 * construyáis con sus métodos correspondientes o de las que ya existen en la
 * API de Java.
 * </p>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class FechaGUI extends JFrame {

  private JPanel contentPane;
  private JTextField textField_fecha;
  private static FechaGUI frame = new FechaGUI();
  private JTextField textField_diasHastaHoy;

  public static void main(String[] args) {
    lanzarAplicación();
  }

  /**
   * Lanza la aplicación
   */
  private static void lanzarAplicación() {
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
  public FechaGUI() {
    setTitle("Fecha");
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 441, 440);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    textField_fecha = new JTextField();
    textField_fecha.setBounds(226, 49, 158, 20);
    contentPane.add(textField_fecha);
    textField_fecha.setColumns(10);

    JButton boton_validar = new JButton("Validar fecha");
    boton_validar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        obtenerFecha();
      }

    });
    boton_validar.setBounds(131, 111, 158, 23);
    contentPane.add(boton_validar);

    JButton boton_diaPosterior = new JButton("Día posterior");
    boton_diaPosterior.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        sumarDia();
      }

    });
    boton_diaPosterior.setBounds(226, 180, 158, 23);
    contentPane.add(boton_diaPosterior);

    JButton boton_diaAnterior = new JButton("Día anterior");
    boton_diaAnterior.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        restarDia();
      }

    });
    boton_diaAnterior.setBounds(39, 180, 158, 23);
    contentPane.add(boton_diaAnterior);

    JButton boton_diaHastaHoy = new JButton("Días hasta hoy");
    boton_diaHastaHoy.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        obtenerDiasHastaHoy();
      }

    });
    boton_diaHastaHoy.setBounds(39, 260, 158, 23);
    contentPane.add(boton_diaHastaHoy);

    JButton boton_terminar = new JButton("Terminar");
    boton_terminar.addActionListener(new ActionListener() {

      public void actionPerformed(ActionEvent arg0) {
        salir();
      }

    });
    boton_terminar.setBounds(131, 331, 158, 23);
    contentPane.add(boton_terminar);

    JLabel label_fecha = new JLabel("Fecha");
    label_fecha.setHorizontalAlignment(SwingConstants.CENTER);
    label_fecha.setBounds(39, 52, 129, 14);
    contentPane.add(label_fecha);

    textField_diasHastaHoy = new JTextField();
    textField_diasHastaHoy.setHorizontalAlignment(SwingConstants.CENTER);
    textField_diasHastaHoy.setEditable(false);
    textField_diasHastaHoy.setBounds(226, 261, 158, 20);
    contentPane.add(textField_diasHastaHoy);
    textField_diasHastaHoy.setColumns(10);
  }

  /**
   * Obtiene la fecha
   */
  private void obtenerFecha() {
    try {
      if (Fecha.validarFecha(textField_fecha.getText()) != null) {
        JOptionPane.showMessageDialog(frame, "Fecha Válida.");
      }
    } catch (FechaNoValidaInvalidaException e) {
      JOptionPane.showMessageDialog(frame, "Error al introducir la fecha. \nIntrodúzcala en formato dd/mm/yyyy",
          "Error", JOptionPane.ERROR_MESSAGE);
    }
  }

  /**
   * Suma un día a la fecha
   */
  private void sumarDia() {
    try {
      textField_fecha.setText(Fecha.diaPosterior(textField_fecha.getText()));
    } catch (FechaNoValidaInvalidaException e) {
      JOptionPane.showMessageDialog(frame,
          "No se ha podido añadir un día. \nLa fecha es no es válida. \nIntroduzca una fecha válida.", "Error",
          JOptionPane.ERROR_MESSAGE);
      ;
    }
  }

  /**
   * Resta un día a la fecha
   */
  private void restarDia() {
    try {
      textField_fecha.setText(Fecha.diaAnterior(textField_fecha.getText()));
    } catch (FechaNoValidaInvalidaException e) {
      JOptionPane.showMessageDialog(frame,
          "No se ha podido quitar un día. \nLa fecha es no es válida. \nIntroduzca una fecha válida.", "Error",
          JOptionPane.ERROR_MESSAGE);
    }
  }

  /**
   * Obtiene los días de una fecha a otra
   */
  private void obtenerDiasHastaHoy() {
    try {
      textField_diasHastaHoy.setText(Integer.toString(Fecha.mostrarDiasHastHoy(textField_fecha.getText())));
    } catch (ParseException e) {
      JOptionPane.showMessageDialog(frame,
          "No se ha podido calcular los días. \nLa fecha es no es válida. \nIntroduzca una fecha válida.", "Error",
          JOptionPane.ERROR_MESSAGE);
    }
  }

  /**
   * Sale de la aplicación
   */
  private void salir() {
    System.exit(0);
  }
}
