import java.awt.*;
import javax.swing.*;

public class GridLayoutEx_078 extends JFrame {
	public GridLayoutEx_078() {
		super("GridLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane_078 = getContentPane(); 
	
		
		contentPane_078.setLayout(new GridLayout(1, 10)); 

		for(int i=0; i<10; i++) { 
			String text = Integer.toString(i);
			JButton button = new JButton(text);
			contentPane_078.add(button); 
		}
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx_078();
	}
}