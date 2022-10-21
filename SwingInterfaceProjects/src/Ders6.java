import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Ders6 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("JPassword");
		JPasswordField password = new JPasswordField();
		JLabel label = new JLabel("Şifre: ");
		JButton buton = new JButton("Gönder");
		JLabel goster = new JLabel();
		JButton buton2 = new JButton("Evet");
		JLabel label2 = new JLabel("Şifre gösterilsin mi?");

		label2.setBounds(150, 15, 200, 40);
		frame.add(label2);

		buton2.setBounds(170, 50, 60, 30);
		frame.add(buton2);

		buton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sifre = new String(password.getPassword());
				goster.setText(label.getText() + sifre);
			}

		});

		buton.setBounds(35, 85, 80, 30);
		frame.add(buton);

		password.setBounds(30, 50, 90, 30);
		frame.add(password);

		label.setBounds(30, 15, 50, 40);
		frame.add(label);

		goster.setBounds(150, 81, 180, 40);
		frame.add(goster);

		buton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sifre = new String(password.getPassword());
				goster.setText("Gönderildi");
			}
		});

		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);

	}
}
