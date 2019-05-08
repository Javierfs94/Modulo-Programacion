package tema11gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Point;
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
 * Clase principal de Calculadora
 * 
 * @author Francisco Javier Frías Serrano
 * @version 1.0
 */

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	double num, ans;
	int calculation;

	public void arithmetic_operation() {
		switch (calculation) {
		case 1:
			ans = num + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 2:
			ans = num - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 3:
			ans = num * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		case 4:
			ans = num / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;

		default:
			break;
		}
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setLocation(new Point(500, 250));
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 336, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 39, 310, 47);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton button_Del = new JButton("<--");
		button_Del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int length = textField.getText().length();
				int number = textField.getText().length() - 1;

				String store;

				if (length > 0) {
					StringBuilder back = new StringBuilder(textField.getText());
					back.deleteCharAt(number);
					store = back.toString();
					textField.setText(store);

				}

			}
		});

		JLabel label_show = new JLabel("");
		label_show.setHorizontalAlignment(SwingConstants.RIGHT);
		label_show.setForeground(Color.BLACK);
		label_show.setBounds(238, 11, 82, 17);
		contentPane.add(label_show);

		button_Del.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_Del.setBounds(10, 97, 82, 34);
		contentPane.add(button_Del);

		JButton button_C = new JButton("C");
		button_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		button_C.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_C.setBounds(139, 97, 69, 34);
		contentPane.add(button_C);

		JButton buton_7 = new JButton("7");
		buton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		buton_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		buton_7.setBounds(10, 157, 58, 34);
		contentPane.add(buton_7);

		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_8.setBounds(87, 157, 58, 34);
		contentPane.add(button_8);

		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_9.setBounds(169, 157, 58, 34);
		contentPane.add(button_9);

		JButton button_subtract = new JButton("-");
		button_subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 2;
				textField.setText("");
				label_show.setText(num + "-");
			}
		});
		button_subtract.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_subtract.setBounds(254, 157, 58, 34);
		contentPane.add(button_subtract);

		JButton button_multiply = new JButton("*");
		button_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 3;
				textField.setText("");
				label_show.setText(num + "*");
			}
		});
		button_multiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_multiply.setBounds(254, 226, 58, 34);
		contentPane.add(button_multiply);

		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_4.setBounds(10, 226, 58, 34);
		contentPane.add(button_4);

		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_5.setBounds(87, 226, 58, 34);
		contentPane.add(button_5);

		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_6.setBounds(169, 226, 58, 34);
		contentPane.add(button_6);

		JButton button_division = new JButton("/");
		button_division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 4;
				textField.setText("");
				label_show.setText(num + "/");
			}
		});
		button_division.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_division.setBounds(254, 293, 58, 34);
		contentPane.add(button_division);

		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "1");
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.setBounds(10, 293, 58, 34);
		contentPane.add(button_1);

		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_2.setBounds(87, 293, 58, 34);
		contentPane.add(button_2);

		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");

			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_3.setBounds(169, 293, 58, 34);
		contentPane.add(button_3);

		JButton button_equals = new JButton("=");
		button_equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				arithmetic_operation();
				label_show.setText("");
			}
		});
		button_equals.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_equals.setBounds(169, 359, 143, 34);
		contentPane.add(button_equals);

		JButton button_0 = new JButton("0");
		button_0.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_0.setBounds(10, 359, 58, 34);
		contentPane.add(button_0);

		JButton button_point = new JButton(".");
		button_point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		button_point.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_point.setBounds(93, 359, 58, 34);
		contentPane.add(button_point);

		JButton button_add = new JButton("+");
		button_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 1;
				textField.setText("");
				label_show.setText(num + "+");
			}
		});
		button_add.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_add.setBounds(254, 97, 58, 34);
		contentPane.add(button_add);

	}
}
