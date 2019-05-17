package tema11gui.ejercicio5;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;

/**
 * <p>
 * 5. Escribe un programa que guarde en un fichero el contenido de otros dos
 * ficheros, de tal forma que en el fichero resultante aparezcan las líneas de
 * los primeros dos ficheros mezcladas, es decir, la primera línea será del
 * primer fichero, la segunda será del segundo fichero, la tercera será la
 * siguiente del primer fichero, etc.
 * </p>
 * <br />
 * <p>
 * Componentes gráficos:
 * </p>
 * <ul>
 * <li>Etiquetas.</li>
 * <li>Fichero origen y destino.</li>
 * <li>Botón para ejecutar la acción.</li>
 * <li>Caja de texto con el contenido del fichero destino no editable.</li>
 * </ul>
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class GuardaContenido extends JFrame {

  private JPanel contentPane;
  private static GuardaContenido frame = new GuardaContenido();

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
  public GuardaContenido() {
    setTitle("Guardar contenido");
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 370, 264);

    JMenuBar menuBar = new JMenuBar();
    setJMenuBar(menuBar);

    JMenu mnOpciones = new JMenu("Opciones");
    menuBar.add(mnOpciones);

    JMenuItem menuItem_enunciado = new JMenuItem("Enunciado");
    menuItem_enunciado.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(frame,
            "Escribe un programa que guarde en un fichero el contenido de otros dos ficheros, de tal forma que en el fichero resultante aparezcan las líneas de los primeros dos ficheros mezcladas, es decir, la primera línea será del primer fichero, la segunda será del segundo fichero, la tercera será la siguiente del primer fichero, etc");
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

    JLabel label_fichero1 = new JLabel("Fichero 1:");
    label_fichero1.setBounds(39, 54, 60, 14);
    contentPane.add(label_fichero1);

    JLabel label_fichero2 = new JLabel("Fichero 2:");
    label_fichero2.setBounds(39, 111, 60, 14);
    contentPane.add(label_fichero2);

    JFileChooser jfc1 = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    jfc1.setDialogTitle("Seleccione un fichero...");

    JButton boton_fichero1 = new JButton("Selección de fichero");
    boton_fichero1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int returnValue = jfc1.showDialog(null, "Seleccionar");
        if (returnValue == JFileChooser.APPROVE_OPTION)
          if (jfc1.getSelectedFile().getPath() != null)
            boton_fichero1.setText("Seleccionado");
      }
    });
    boton_fichero1.setBounds(151, 50, 178, 23);
    contentPane.add(boton_fichero1);

    JFileChooser jfc2 = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
    jfc2.setDialogTitle("Seleccione un fichero...");

    JButton boton_fichero2 = new JButton("Selección de fichero");
    boton_fichero2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        int returnValue = jfc2.showDialog(null, "Seleccionar");
        if (returnValue == JFileChooser.APPROVE_OPTION)
          if (jfc2.getSelectedFile().getPath() != null)
            boton_fichero2.setText("Seleccionado");
      }
    });
    boton_fichero2.setBounds(151, 107, 178, 23);
    contentPane.add(boton_fichero2);

    JButton boton_guardar = new JButton("Guardar");
    boton_guardar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        try {
          BufferedReader br1 = new BufferedReader(new FileReader(jfc1.getSelectedFile().getPath()));
          BufferedReader br2 = new BufferedReader(new FileReader(jfc2.getSelectedFile().getPath()));
          BufferedWriter bw = new BufferedWriter(new FileWriter("combinado.txt"));
          Vector<String> v = new Vector<String>();

          String linea = "";
          while (linea != null) {
            linea = br1.readLine();
            if (linea != null)
              v.addElement(linea);

            linea = br2.readLine();
            if (linea != null)
              v.addElement(linea);
          }

          for (String s : v) {
            bw.write(s + "\n");
          }

          br1.close();
          br2.close();
          bw.close();

          JOptionPane.showMessageDialog(frame, "Fichero guardado con éxito");

        } catch (IOException | NullPointerException ioe) {
          JOptionPane.showMessageDialog(frame, "Indica los dos ficheros correctamente.", "Error",
              JOptionPane.ERROR_MESSAGE);
        }
      }
    });
    boton_guardar.setBounds(151, 164, 91, 23);
    contentPane.add(boton_guardar);

  }

}
