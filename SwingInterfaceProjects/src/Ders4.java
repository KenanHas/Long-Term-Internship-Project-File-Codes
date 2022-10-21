import javax.swing.*;
import java.awt.event.*;

public class Ders4 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Pencere");
		JTextField textField1 = new JTextField();
		JTextField textField2 = new JTextField();
		JTextField textField3 = new JTextField();
		JLabel label1 = new JLabel("İlk Sayı");
		JLabel label2 = new JLabel("İkinci Sayı");
		JLabel label3 = new JLabel("Toplam");

		JButton buton = new JButton("Toplam");

		label1.setBounds(50, 10, 100, 30);
		label2.setBounds(50, 70, 100, 30);
		label3.setBounds(50, 130, 100, 30);

		textField1.setBounds(50, 40, 200, 30);
		textField2.setBounds(50, 100, 200, 30);
		textField3.setBounds(50, 160, 200, 30);

		textField3.setEditable(false);

		buton.setBounds(50, 220, 200, 30);

		buton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int number1 = Integer.parseInt(textField1.getText());
				int number2 = Integer.parseInt(textField2.getText());
				int c = number1 + number2;
				String total = String.valueOf(c);
				textField3.setText(total);
			}

		});

		frame.add(textField1);
		frame.add(textField2);
		frame.add(textField3);
		frame.add(label2);
		frame.add(label1);
		frame.add(label3);
		frame.add(buton);

		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
