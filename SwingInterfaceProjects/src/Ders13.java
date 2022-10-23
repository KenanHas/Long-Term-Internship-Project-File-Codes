import javax.swing.*;
import java.awt.event.*;
public class Ders13 {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Ana Menü");
		JMenu altMenu= new JMenu("Ders Kayıt İşlemleri");

		JMenuItem i1 = new JMenuItem("Ders Programı");
		JMenuItem i2 = new JMenuItem("Sınav Programı");
		JMenuItem i3 = new JMenuItem("Bilgilerim");
		
	
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		
		JMenuItem a1 = new JMenuItem("Ders Seçme İşlemleri");
		JMenuItem a2 = new JMenuItem("Yaz Okulu Ders Seçimi");
		JMenuItem a3 = new JMenuItem("Yabancı DillerYaz Okulu ");
		
		altMenu.add(a1);
		altMenu.add(a2);
		altMenu.add(a3);
		
		menu.add(altMenu);
		menuBar.add(menu);

		a1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,
						"Ders Seçme İşlemleri Saat 10:00' da Başlayacaktır.", "Hata!!!",
						JOptionPane.ERROR_MESSAGE);
			}
		});
		frame.setJMenuBar(menuBar);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
