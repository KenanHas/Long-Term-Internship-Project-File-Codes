import javax.swing.*;
import java.awt.event.*;

public class Ders7 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("JCheckBox");
		JCheckBox box1 = new JCheckBox("Evet");
		JCheckBox box2 = new JCheckBox("Hayır");
		JButton buton = new JButton("Gönder");
		JLabel label = new JLabel("Form Onay Durumu: ");
		JLabel form = new JLabel("Yukarıdaki formu onaylıyor musunuz? ");
		
		buton.setBounds(130, 150, 80, 30);
		frame.add(buton);

		box1.setBounds(100, 100, 100, 40);
		frame.add(box1);

		box2.setBounds(200, 100, 100, 40);
		frame.add(box2);

		label.setBounds(50, 200, 1000, 40);
		frame.add(label);
		
		form.setBounds(50, 50,300,40);
		frame.add(form);
		
		buton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (box1.isSelected()) {
					label.setText(label.getText() + box1.getText());
				} else if (box2.isSelected()) {
					label.setText(label.getText() + box2.getText());
				} else {
					label.setText(label.getText() + "Herhangi bir işlem yapılmadı.");
				}
			}
		});

		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
