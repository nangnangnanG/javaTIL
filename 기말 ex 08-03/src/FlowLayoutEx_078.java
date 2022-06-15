import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx_078 extends JFrame{
	FlowLayoutEx_078(){
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp_078 = getContentPane();
		
		cp_078.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		cp_078.add(new JButton("add"));
		cp_078.add(new JButton("sub"));
		cp_078.add(new JButton("mul"));
		cp_078.add(new JButton("div"));
		cp_078.add(new JButton("Calculate"));
		
		setSize(300,250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx_078();
	}
}