package days19;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class JRadioButtonTest extends JFrame implements ActionListener{
	JTextField jtf;
	ButtonGroup bg;
	JRadioButton jrb1;
	JRadioButton jrb2;
	JRadioButton jrb3;
	JRadioButton jrb4;
	
	JRadioButtonTest() {
		jrb1 = new JRadioButton("승마");
		jrb2 = new JRadioButton("골프");
		jrb3 = new JRadioButton("글라이딩");
		jrb4 = new JRadioButton("스쿠버");
		
		bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		jtf = new JTextField(30);
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(jrb1);
		con.add(jrb2);
		con.add(jrb3);
		con.add(jrb4);
		con.add(jtf);
		
		jrb1.addActionListener(this);
		jrb2.addActionListener(this);
		jrb3.addActionListener(this);
		jrb4.addActionListener(this);
		
		setTitle("checkBox Test");
		setSize(700, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (jrb1.isSelected()) jtf.setText( "\"" + jrb1.getActionCommand() + "\"" + "이(가) 선택되었습니다.");
		else if (jrb2.isSelected())	jtf.setText( "\"" + jrb2.getActionCommand() + "\"" + "이(가) 선택되었습니다.");
		else if (jrb3.isSelected())	jtf.setText( "\"" + jrb3.getActionCommand() + "\"" + "이(가) 선택되었습니다.");
		else if (jrb4.isSelected())	jtf.setText( "\"" + jrb4.getActionCommand() + "\"" + "이(가) 선택되었습니다.");
	}
}
public class Swing15 {
	public static void main(String[] args) {
		new JRadioButtonTest(); 
	}
}
