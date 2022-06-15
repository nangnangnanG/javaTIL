import javax.swing.*;
import java.awt.*;

public class ContentPaneEx_078 extends JFrame {
	ContentPaneEx_078() {
		setTitle("ContetPane과 JFrame 예제 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		Container contentPane_078 = getContentPane();
		contentPane_078.setBackground(Color.ORANGE);
		contentPane_078.setLayout(new FlowLayout()); 
		
		contentPane_078.add(new JButton("OK")); 
		contentPane_078.add(new JButton("Cancel")); 
		contentPane_078.add(new JButton("Ignore")); 
		
		setSize(300, 150); 
		setVisible(true); 
	}
	public static void main(String[] args) {
		new ContentPaneEx_078();
	}
}
