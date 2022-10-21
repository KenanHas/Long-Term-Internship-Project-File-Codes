import javax.swing.*;
import java.awt.event.*; 
public class Ders5 {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("TextArea Örneği");
		JTextArea textArea = new JTextArea();
		
		JButton buton = new JButton("Hesapla");
		JLabel label1= new JLabel();
		JLabel label2 = new JLabel();
		
		
		label1.setBounds(50,25,100,30);
		label2.setBounds(160,25,100,30);
		
		textArea.setBounds(20,75,250,200);
		buton.setBounds(100,300,120,30);
		
		buton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e)
			{
				String text = textArea.getText();
				String[] words = text.split("\\s");
				label1.setText("Kelime :"+words.length);
				label2.setText("Karakter :"+text.length());
			}
			
		});
		frame.add(buton);
		frame.add(textArea);
		frame.add(label2);
		frame.add(label1);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
