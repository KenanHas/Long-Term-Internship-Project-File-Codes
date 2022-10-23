import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;

public class CalculatorProject extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	private double number, answer;
	private int operation;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorProject frame = new CalculatorProject();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void calculate()
	{
		switch(operation)
		{
		case 1:
			answer = number + Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 2:
			answer = number - Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 3:
			answer = number * Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 4:
			answer = number / Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		}

	}

	public void printValues(String str)
	{
		input.setText(input.getText()+str);
	}
	
	public CalculatorProject() {
		setForeground(new Color(255, 0, 0));
		setType(Type.UTILITY);
		setTitle("Hesap Makinesi");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 395);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 153, 204));
		contentPane.setForeground(new Color(0, 102, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel screen = new JPanel();
		screen.setBounds(0, 0, 300, 78);
		contentPane.add(screen);
		screen.setLayout(null);
		
		input = new JTextField();
		input.setBackground(new Color(255, 255, 255));
		input.setBounds(0, 25, 300, 53);
		input.setEditable(false);
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setFont(new Font("Calibri", Font.BOLD, 28));
		screen.add(input);
		input.setColumns(10);
		
		JLabel lbl = new JLabel("");
		lbl.setForeground(new Color(0, 0, 139));
		lbl.setBackground(new Color(255, 128, 64));
		lbl.setHorizontalAlignment(SwingConstants.TRAILING);
		lbl.setFont(new Font("Calibri", Font.BOLD, 16));
		lbl.setVerticalAlignment(SwingConstants.BOTTOM);
		lbl.setBounds(0, 0, 300, 26);
		screen.add(lbl);
		
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setBackground(new Color(0, 51, 153));
		buttonsPanel.setForeground(Color.RED);
		buttonsPanel.setBounds(0, 79, 300, 277);
		contentPane.add(buttonsPanel);
		buttonsPanel.setLayout(new GridLayout(4, 4, 1, 1));
		
		JButton btnNewButton_3 = new JButton("7");
		btnNewButton_3.setForeground(new Color(255, 102, 0));
		btnNewButton_3.setBackground(new Color(51,51,51));
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printValues(e.getActionCommand());
			}
		});
		btnNewButton_3.setFont(new Font("Calibri", Font.PLAIN, 28));
		buttonsPanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("8");
		btnNewButton_4.setForeground(new Color(255, 102, 0));
		btnNewButton_4.setBackground(new Color(51,51,51));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printValues(e.getActionCommand());
			
			}
		});
		btnNewButton_4.setFont(new Font("Calibri", Font.PLAIN, 28));
		buttonsPanel.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("9");
		btnNewButton_4_1.setForeground(new Color(255, 102, 0));
		btnNewButton_4_1.setBackground(new Color(51,51,51));
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printValues(e.getActionCommand());
			}
		});
		btnNewButton_4_1.setFont(new Font("Calibri", Font.PLAIN, 28));
		buttonsPanel.add(btnNewButton_4_1);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.setForeground(new Color(255, 102, 0));
		btnNewButton_1.setBackground(new Color(51,51,51));

		btnNewButton_1.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				
				number = Double.parseDouble(input.getText());
				operation = 1;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
		
			}
		});
		
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 28));
		buttonsPanel.add(btnNewButton_1);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setForeground(new Color(255, 102, 0));
		btnNewButton_5.setBackground(new Color(51,51,51));

		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printValues(e.getActionCommand());
			}
		});
		btnNewButton_5.setFont(new Font("Calibri", Font.PLAIN, 28));
		buttonsPanel.add(btnNewButton_5);
		
		JButton btnNewButton_5_4 = new JButton("5");
		btnNewButton_5_4.setForeground(new Color(255, 102, 0));
		btnNewButton_5_4.setBackground(new Color(51,51,51));

		btnNewButton_5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printValues(e.getActionCommand());
			}
		});
		btnNewButton_5_4.setFont(new Font("Calibri", Font.PLAIN, 28));
		buttonsPanel.add(btnNewButton_5_4);
		
		JButton btnNewButton_5_3 = new JButton("4");
		btnNewButton_5_3.setForeground(new Color(255, 102, 0));
		btnNewButton_5_3.setBackground(new Color(51,51,51));
		btnNewButton_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printValues(e.getActionCommand());
			}
		});
		btnNewButton_5_3.setFont(new Font("Calibri", Font.PLAIN, 28));
		buttonsPanel.add(btnNewButton_5_3);
		
		JButton btnNewButton_5_2 = new JButton("-");
		btnNewButton_5_2.setForeground(new Color(255, 102, 0));
		btnNewButton_5_2.setBackground(new Color(51,51,51));
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 2;
				input.setText("");
				lbl.setText(number + " "+e.getActionCommand());
			}
		});
		btnNewButton_5_2.setFont(new Font("Calibri", Font.PLAIN, 28));
		buttonsPanel.add(btnNewButton_5_2);
		
		JButton btnNewButton_5_1 = new JButton("3");
		btnNewButton_5_1.setForeground(new Color(255, 102, 0));
		btnNewButton_5_1.setBackground(new Color(51,51,51));
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printValues(e.getActionCommand());
			}
		});
		btnNewButton_5_1.setFont(new Font("Calibri", Font.PLAIN, 28));
		buttonsPanel.add(btnNewButton_5_1);
		
		JButton btnNewButton_5_5 = new JButton("2");
		btnNewButton_5_5.setForeground(new Color(255, 102, 0));
		btnNewButton_5_5.setBackground(new Color(51,51,51));
		btnNewButton_5_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printValues(e.getActionCommand());
			}
		});
		btnNewButton_5_5.setFont(new Font("Calibri", Font.PLAIN, 28));
		buttonsPanel.add(btnNewButton_5_5);
		
		JButton btnNewButton_5_5_1 = new JButton("1");
		btnNewButton_5_5_1.setForeground(new Color(255, 102, 0));
		btnNewButton_5_5_1.setBackground(new Color(51,51,51));
		btnNewButton_5_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printValues(e.getActionCommand());
			}
		});
		btnNewButton_5_5_1.setFont(new Font("Calibri", Font.PLAIN, 28));
		buttonsPanel.add(btnNewButton_5_5_1);
		
		JButton btnNewButton_5_5_2 = new JButton("*");
		btnNewButton_5_5_2.setForeground(new Color(255, 102, 0));
		btnNewButton_5_5_2.setBackground(new Color(51,51,51));
		btnNewButton_5_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 3;
				input.setText("");
				lbl.setText(number + " " + e.getActionCommand());
			}
		});
		btnNewButton_5_5_2.setFont(new Font("Calibri", Font.PLAIN, 28));
		buttonsPanel.add(btnNewButton_5_5_2);
		
		JButton btnNewButton_5_5_3 = new JButton("0");
		btnNewButton_5_5_3.setForeground(new Color(255, 102, 0));
		btnNewButton_5_5_3.setBackground(new Color(51,51,51));
		btnNewButton_5_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printValues(e.getActionCommand());
			}
		});
		btnNewButton_5_5_3.setFont(new Font("Calibri", Font.PLAIN, 28));
		buttonsPanel.add(btnNewButton_5_5_3);
		
		JButton btnNewButton_5_5_4 = new JButton("=");
		btnNewButton_5_5_4.setForeground(new Color(255, 102, 0));
		btnNewButton_5_5_4.setBackground(new Color(51,51,51));

		lbl.setText(input.getText()+" ");
		btnNewButton_5_5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl.setText(input.getText());
				calculate();
			}
		});
		btnNewButton_5_5_4.setFont(new Font("Calibri", Font.PLAIN, 28));
		buttonsPanel.add(btnNewButton_5_5_4);
		
		JButton btnNewButton_5_5_5 = new JButton("C");
		btnNewButton_5_5_5.setForeground(new Color(255, 102, 0));
		btnNewButton_5_5_5.setBackground(new Color(51,51,51));
		btnNewButton_5_5_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(" ");
				lbl.setText(" ");
			}
		});
		btnNewButton_5_5_5.setFont(new Font("Calibri", Font.PLAIN, 28));
		buttonsPanel.add(btnNewButton_5_5_5);
		
		JButton btnNewButton_5_5_2_1 = new JButton("/");
		btnNewButton_5_5_2_1.setForeground(new Color(255, 102, 0));
		btnNewButton_5_5_2_1.setBackground(new Color(51,51,51));
		btnNewButton_5_5_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 4;
				input.setText("");
				lbl.setText(number + " "+e.getActionCommand());
			}
		});
		btnNewButton_5_5_2_1.setFont(new Font("Calibri", Font.PLAIN, 28));
		buttonsPanel.add(btnNewButton_5_5_2_1);
	}
}
