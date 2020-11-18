package days18;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class JPanelTest extends JFrame implements ActionListener {
	JPanelTest() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		
		jp1.setLayout(new GridLayout(5, 1));
		jp2.setLayout(new GridLayout(4, 1));
		
		jp1.add(new JButton("JAVA"));
		jp1.add(new JButton("C++"));
		jp1.add(new JButton("ASP"));
		jp1.add(new JButton("JSP"));
		jp1.add(new JButton("PHP"));
		
		jp2.add(new JButton("JAVA"));
		jp2.add(new JButton("C++"));
		jp2.add(new JButton("ASP"));
		jp2.add(new JButton("JSP"));
		
		con.add(jp1, BorderLayout.WEST);
		con.add(jp2, BorderLayout.EAST);
		
		setTitle("JPanel Test");
		setSize(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		System.out.println(s);
	}
}
public class Swing11 {
	public static void main(String[] args) {
		new JPanelTest();
	}
}
