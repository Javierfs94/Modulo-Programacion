package tema11gui.ejercicio6;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;

/**
 * <p>
 * 6. Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
 * fichero.
 * </p>
 * <br />
 * <p>
 * Componentes gráficos:
 * </p>
 * <ul>
 * <li>Etiquetas.</li>
 * <li>Fichero a comprobar.</li>
 * <li>Caja de texto con resultado.</li>
 * <li>Botón calcular.</li>
 * </ul>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class CompruebaOcurrencias extends JFrame {

  private JPanel contentPane;
  private JTextField textField_palabra;
  private JTextField textField_resultado;
  private static CompruebaOcurrencias frame = new CompruebaOcurrencias();

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
  public CompruebaOcurrencias() {
    setTitle("Busca ocurrencias");
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 393, 298);

    JMenuBar menuBar = new JMenuBar();
    setJMenuBar(menuBar);

    JMenu mnOpciones = new JMenu("Opciones");
    menuBar.add(mnOpciones);

    JMenuItem menuItem_enunciado = new JMenuItem("Enunciado");
    menuItem_enunciado.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(frame,
            "Realiza un programa que diga cuántas ocurrencias de una palabra hay en un fichero");
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
    JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    jfc.setDialogTitle("Seleccione un fichero...");

    JButton boton_seleccionar = new JButton("Selección de fichero");
    boton_seleccionar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent arg0) {
        int returnValue = jfc.showDialog(null, "Seleccionar");
        if (returnValue == JFileChooser.APPROVE_OPTION)
          if (jfc.getSelectedFile().getPath() != null)
            boton_seleccionar.setText("Seleccionado");
      }
    });
    boton_seleccionar.setBounds(155, 50, 189, 23);
    contentPane.add(boton_seleccionar);

    JLabel label_fichero = new JLabel("Fichero:");
    label_fichero.setBounds(18, 54, 59, 14);
    contentPane.add(label_fichero);

    JLabel label_palabra = new JLabel("Palabra a buscar:");
    label_palabra.setBounds(18, 115, 107, 14);
    contentPane.add(label_palabra);

    textField_palabra = new JTextField();
    textField_palabra.setBounds(155, 112, 189, 20);
    contentPane.add(textField_palabra);
    textField_palabra.setColumns(10);

    textField_resultado = new JTextField();
    textField_resultado.setEnabled(false);
    textField_resultado.setBounds(18, 226, 326, 20);
    contentPane.add(textField_resultado);
    textField_resultado.setColumns(10);

    JButton boton_busqueda = new JButton("Iniciar búsqueda");
    boton_busqueda.addActionListener(new ActionListener() {

      public void actionPerformed(ActionEvent arg0) {
        try {
          if (textField_palabra.getText() != null && jfc.getSelectedFile().getPath() != null)
            buscar(jfc.getSelectedFile().getPath(), textField_palabra.getText());
          else
            JOptionPane.showMessageDialog(frame, "Introduce la palabra y fichero a buscar.");
        } catch (NullPointerException e) {
          JOptionPane.showMessageDialog(frame, "Introduce la palabra y fichero a buscar", "Error",
              JOptionPane.ERROR_MESSAGE);
        }
      }

      private void buscar(String path, String palabra) {
        try {
          BufferedReader br = new BufferedReader(new FileReader(path));
          String linea = "";
          int i = 0;
          int repeticiones = 0;
          while ((linea = br.readLine()) != null) {
            while ((i = linea.indexOf(palabra)) != -1) {
              linea = linea.substring(i + palabra.length(), linea.length());
              repeticiones++;
            }
          }

          br.close();

          textField_resultado.setText("La palabra " + palabra + " se repite " + repeticiones + " veces.");

        } catch (FileNotFoundException | IndexOutOfBoundsException ioe) {
          JOptionPane.showMessageDialog(frame, "No se ha encontrado el fichero", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
          JOptionPane.showMessageDialog(frame, "No se ha podido leer el fichero.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException e) {
          JOptionPane.showMessageDialog(frame, "Introduce la palabra a buscar.", "Error", JOptionPane.ERROR_MESSAGE);
          {
          }
        }
      }
    });
    boton_busqueda.setBounds(155, 167, 164, 23);
    contentPane.add(boton_busqueda);
  }
}
