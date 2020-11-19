package days19;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/*
 * 성명 : [텍스트]
 * 성별 : [라디오]
 * 취미 : [체크박스]
 * 전화번호 : [콤보] - [텍스트] - [텍스트]
 * 거주지역 : [콤보]
 */
class Resume extends JFrame implements ActionListener {
	JTextField name;
	JTextField phone1;
	JTextField phone2;

	JComboBox<String> hubby = new JComboBox<String>();
	JComboBox<String> phone = new JComboBox<String>();
	JComboBox<String> locale = new JComboBox<String>();
	
	ButtonGroup bg;
	JRadioButton male;
	JRadioButton female;
	
	Resume() {
		Container con = getContentPane();
		con.setLayout(new GridLayout(6, 2));

		// p1
		JPanel p1 = new JPanel(new GridLayout(5, 1));
		
		String[] left = {"성명", "성별", "취미", "전화번호", "거주지역"};
		JLabel[] label = new JLabel[left.length];
		for (int i = 0; i < left.length; i++) {
			label[i] = new JLabel(left[i] + " :");
			p1.add(label[i]);
		}
		
		
		// p2
		JPanel p2 = new JPanel(new GridLayout(5, 1));
		
		// 성명
		name = new JTextField("");
		name.addActionListener(this);
		p2.add(name);
		
		// 성별
		// 취미
		// 전화번호
		// 거주지역
				
		// p3
		JPanel p3 = new JPanel(new FlowLayout());
		JButton submit = new JButton("확 인");
		p3.add(submit);
		
		
		con.add(p1, BorderLayout.EAST);
		con.add(p2, BorderLayout.???);
		con.add(p3);
		
		setTitle("Resume");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
public class Swing17 {
	public static void main(String[] args) {
		new Resume();
	}
}
