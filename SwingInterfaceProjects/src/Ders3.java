import javax.swing.*;
import java.awt.event.*;

public class Ders3 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Pencere");
		JButton buton = new JButton("Buton1");
		JLabel label = new JLabel("Yazı İçerik");

		label.setBounds(100, 50, 150, 60);
		buton.setBounds(100, 140, 80, 30);

		buton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				label.setText("Butona basıldı");
			}

		});

		frame.add(label);
		frame.add(buton);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
