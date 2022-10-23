import javax.swing.*;
import java.awt.event.*;

public class Ders9 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("JComboBox");
		JLabel label = new JLabel("Üniversite Fakülteleri");
		JButton buton = new JButton("Seç");
		String[] array = { "Mühendislik", "Tıp", "Teknoloji", "Diş Hekimliği", "Hukuk" };
		JLabel label2 = new JLabel();
		buton.setBounds(80, 120, 60, 20);
		JComboBox box = new JComboBox(array);

		buton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = (String) box.getSelectedItem();
				JOptionPane.showMessageDialog(frame,
						"Fakülte seçiminiz başarıyla tamamlandı.\nSeçilen Fakülte: " + text, "Tamamlandı",
						JOptionPane.OK_CANCEL_OPTION);
			}
		});
		box.setBounds(60, 90, 110, 20);
		label.setBounds(60, 50, 120, 20);
		label2.setBounds(40, 155, 200, 20);
		frame.add(label2);
		frame.add(buton);
		frame.add(box);
		frame.add(label);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
