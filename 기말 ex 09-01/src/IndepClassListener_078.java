import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener_078 extends JFrame {
	IndepClassListener_078() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c_078 = getContentPane();
		c_078.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener_078()); 
		c_078.add(btn);
		setSize(250, 120);
		setVisible(true);
	}
	public static void main(String [] args) {
		new IndepClassListener_078();
	}
}
class MyActionListener_078 implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource(); 
		if(b.getText().equals("Action")) 
			b.setText("액션"); 
		else
			b.setText("Action"); 
	}
}