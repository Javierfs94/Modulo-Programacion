package tema11gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * Programa para introducir el radio y que te calcule el área del círculo
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */
public class CalculaArea extends JFrame {

  private JPanel contentPane;

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
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    contentPane.setLayout(new BorderLayout(0, 0));
    setContentPane(contentPane);
  }

}
