import javax.swing.*;
import java.awt.*;

public class NullContainerEx_078 extends JFrame {
	NullContainerEx_078() {
		setTitle("배치관리자 없이 절대 위치에 배치하는 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane_078 = getContentPane();
		contentPane_078.setLayout(null);  

		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50);  
		la.setSize(200, 20);  
		contentPane_078.add(la);  

		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i)); 
			b.setLocation(i*15, i*15);  
			b.setSize(50, 20);  
			contentPane_078.add(b); 
		}
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new NullContainerEx_078();
	}
}



