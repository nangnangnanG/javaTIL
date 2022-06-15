import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx_078 extends JFrame {
	BorderLayoutEx_078(){
		setTitle("BorderLayout 예제 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp_078 = getContentPane();
		
		cp_078.setLayout(new BorderLayout(30,20));
		cp_078.add(new JButton("Calculate"), BorderLayout.CENTER);
		cp_078.add(new JButton("add"), BorderLayout.NORTH);
		cp_078.add(new JButton("sub"), BorderLayout.SOUTH);
		cp_078.add(new JButton("mul"), BorderLayout.EAST);
		cp_078.add(new JButton("div"), BorderLayout.WEST);

		setSize(300,200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx_078();
	}

}
