package examenes.exMayo2019JavierFriasSerrano.ejercicio1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;

/**
 * <p>
 * 1. Escribe un programa que usando la interfaz gráfica de Java escoja un
 * fichero del sistema de archivos y lo almacene en otro de manera que se
 * sustituyan todas las ocurrencias de los siguientes caracteres (mayúscula o
 * minúscula) del fichero original por sus correspondientes números:
 * </p>
 * <br />
 * <ul>
 * <li>A 4</li>
 * <li>B 8</li>
 * <li>E 3</li>
 * <li>I 1</li>
 * <li>O 0</li>
 * <li>S 5</li>
 * <li>T 7</li>
 * </ul>
 * <br />
 * <p>
 * Componentes gráficos:
 * </p>
 * <ul>
 * <li>• Etiquetas.</li>
 * <li>• Fichero origen y destino.</li>
 * <li>• Botón para ejecutar la acción.</li>
 * <li>• Caja de texto con el contenido del fichero destino no editable.</li>
 * </ul>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class ModificaLetras extends JFrame {

  private JPanel contentPane;
  private static ModificaLetras frame = new ModificaLetras();
  private JTextField textField_fichero1;
  private JTextField textField_fichero2;

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
  public ModificaLetras() {
    setTitle("Ejercicio 1");
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 673, 480);

    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    JLabel lblFicheroOrigen = new JLabel("Fichero origen");
    lblFicheroOrigen.setHorizontalAlignment(SwingConstants.CENTER);
    lblFicheroOrigen.setBounds(75, 23, 128, 14);
    contentPane.add(lblFicheroOrigen);

    JLabel lblFicheroDestino = new JLabel("Fichero destino");
    lblFicheroDestino.setHorizontalAlignment(SwingConstants.CENTER);
    lblFicheroDestino.setBounds(410, 23, 128, 14);
    contentPane.add(lblFicheroDestino);

    JTextArea textArea_resultado = new JTextArea();
    textArea_resultado.setEditable(false);
    textArea_resultado.setBounds(28, 220, 598, 202);
    contentPane.add(textArea_resultado);

    JScrollPane scrollPane = new JScrollPane(textArea_resultado, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    scrollPane.setBounds(28, 220, 598, 202);
    contentPane.getRootPane().add(scrollPane);

    JFileChooser jfc1 = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    jfc1.setDialogTitle("Seleccione un fichero...");

    JButton boton_ficheroOrigen = new JButton("Selección de fichero");
    boton_ficheroOrigen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        seleccionarFichero1(jfc1, boton_ficheroOrigen);
      }

      /**
       * Selecciona el fichero 1
       * 
       * @param jfc1                fileChooser 1
       * @param boton_ficheroOrigen
       */
      private void seleccionarFichero1(JFileChooser jfc1, JButton boton_ficheroOrigen) {
        int returnValue = jfc1.showDialog(frame, "Seleccionar");
        if (returnValue == JFileChooser.APPROVE_OPTION)
          if (jfc1.getSelectedFile().getPath() != null)
            boton_ficheroOrigen.setText("Seleccionado");
        textField_fichero1.setText(jfc1.getSelectedFile().getName());
      }
    });
    boton_ficheroOrigen.setBounds(54, 57, 169, 23);
    contentPane.add(boton_ficheroOrigen);

    JFileChooser jfc2 = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    jfc2.setDialogTitle("Seleccione un fichero...");

    JButton boton_ficheroDestino = new JButton("Selección de fichero");
    boton_ficheroDestino.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        seleccionarFichero2(jfc2, boton_ficheroDestino);
      }

      /**
       * Selecciona el fichero
       * 
       * @param jfc2                 fileChooser 2
       * @param boton_ficheroDestino
       */
      private void seleccionarFichero2(JFileChooser jfc2, JButton boton_ficheroDestino) {
        int returnValue = jfc2.showDialog(frame, "Seleccionar");
        if (returnValue == JFileChooser.APPROVE_OPTION)
          if (jfc2.getSelectedFile().getPath() != null)
            boton_ficheroDestino.setText("Seleccionado");
        textField_fichero2.setText(jfc2.getSelectedFile().getName());
      }
    });
    boton_ficheroDestino.setBounds(387, 57, 171, 23);
    contentPane.add(boton_ficheroDestino);

    JButton boton_ejecutar = new JButton("Ejecutar");
    boton_ejecutar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        modificarLetrasPorNumeros(textArea_resultado, jfc1, jfc2);
      }

      /**
       * Modifica ciertas letras, ya sean mayúsculas o minúsculas por un determinado
       * número
       * 
       * @param textArea_resultado muestra el resultado obtenido al transformar los
       *                           ficheros en una caja de texto
       * @param jfc1               fichero 1 original que pasará el texto a
       *                           transformar
       * @param jfc2               fichero 2 con el texto transformado del fichero 1
       */
      private void modificarLetrasPorNumeros(JTextArea textArea_resultado, JFileChooser jfc1, JFileChooser jfc2) {
        try {
          BufferedReader leer = new BufferedReader(new FileReader(jfc1.getSelectedFile().getPath()));
          BufferedWriter escribir = new BufferedWriter(new FileWriter(jfc2.getSelectedFile().getPath()));

          String linea = "";
          String resultado = "";
          while (linea != null) {
            linea = leer.readLine();
            if (linea != null) {
              linea = linea.replace('A', '4').replace('a', '4').replace('B', '8').replace('b', '8').replace('E', '3')
                  .replace('e', '3').replace('I', '1').replace('i', '1').replace('O', '0').replace('o', '0')
                  .replace('S', '5').replace('s', '5').replace('T', '7').replace('t', '7');
              escribir.write(linea + "\n");
              resultado += linea + "\n";
            }
          }

          textArea_resultado.append(resultado);

          leer.close();
          escribir.close();

        } catch (IOException | NullPointerException e) {
          JOptionPane.showMessageDialog(frame, "Indica los dos ficheros correctamente.", "Error",
              JOptionPane.ERROR_MESSAGE);
        }
      }
    });

    boton_ejecutar.setBounds(252, 167, 117, 23);
    contentPane.add(boton_ejecutar);

    textField_fichero1 = new JTextField();
    textField_fichero1.setHorizontalAlignment(SwingConstants.CENTER);
    textField_fichero1.setEditable(false);
    textField_fichero1.setBounds(54, 103, 169, 20);
    contentPane.add(textField_fichero1);
    textField_fichero1.setColumns(10);

    textField_fichero2 = new JTextField();
    textField_fichero2.setHorizontalAlignment(SwingConstants.CENTER);
    textField_fichero2.setEditable(false);
    textField_fichero2.setBounds(389, 103, 169, 20);
    contentPane.add(textField_fichero2);
    textField_fichero2.setColumns(10);

  }
}
