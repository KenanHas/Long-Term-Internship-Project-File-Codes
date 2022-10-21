import javax.swing.*;
import java.awt.event.*;

public class Ders8 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("RadioButon");
		JRadioButton radio1 = new JRadioButton("Görüntü İşleme");
		JRadioButton radio2 = new JRadioButton("Android Uygulama Geliştirme");
		JRadioButton radio3 = new JRadioButton("Web Geliştirme");
		JRadioButton radio4 = new JRadioButton("Siber Güvenlik");
		JLabel label = new JLabel();
		label.setText("Aşağıdaki seçmeli derslerden birisini seçiniz.");

		label.setBounds(20, 20, 290, 30);
		frame.add(label);

		radio1.setBounds(50, 60, 200, 30);
		frame.add(radio1);
		radio1.setActionCommand("Görüntü İşleme");

		radio2.setBounds(50, 90, 200, 30);
		frame.add(radio2);
		radio1.setActionCommand("Android Uygulama Geliştirme");

		radio3.setBounds(50, 120, 200, 30);
		frame.add(radio3);
		radio1.setActionCommand("Web Geliştirme");

		radio4.setBounds(50, 150, 200, 30);
		frame.add(radio4);
		radio1.setActionCommand("Siber Güvenlik");

		ButtonGroup bg = new ButtonGroup();
		bg.add(radio1);
		bg.add(radio2);
		bg.add(radio3);
		bg.add(radio4);

		JButton buton = new JButton("Gönder");
		buton.setBounds(70, 190, 90, 22);
		frame.add(buton);

		JTextField textField = new JTextField();
		textField.setBounds(30, 225, 247, 35);
		textField.setEditable(false);
		frame.add(textField);

		buton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (radio1.isSelected()) {
					textField.setText("Seçilen Ders: " + radio1.getText());
				}
				if (radio2.isSelected()) {
					textField.setText("Seçilen Ders: " + radio2.getText());
				}
				if (radio3.isSelected()) {
					textField.setText("Seçilen Ders: " + radio3.getText());
				}
				if (radio4.isSelected()) {
					textField.setText("Seçilen Ders: " + radio4.getText());
				}

			}

		});

		frame.setSize(350, 350);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
