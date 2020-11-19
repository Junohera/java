package days19;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class JTextFieldTextArea extends JFrame implements ActionListener {
	JTextField jtf;
	JTextArea jta;
	
	JTextFieldTextArea() {
		jtf = new JTextField(10); // 최대 표시 10글자(가로크기)....텍스트 필드
		jta = new JTextArea(7, 20); // 7행 20열(20글자)
		
		Font f = new Font("굴림", Font.BOLD, 20);
		jtf.setFont(f);
		jta.setFont(f);
		JButton k = new JButton("확인");
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		k.addActionListener(this);
		
		con.add(jtf);
		con.add(jta);
		con.add(k);
		setTitle("text field text area");
		setSize(350, 300);
		setVisible(true);		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String s = jtf.getText();
		jta.append(s + "\n");
		jtf.setText("");
	}
}
public class Swing13 {
	public static void main(String[] args) {
		new JTextFieldTextArea();
	}
}
