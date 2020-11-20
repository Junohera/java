package days19;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
	
	JTextField jt_name;
	JRadioButton jr1;
	JRadioButton jr2;
	JCheckBox jc1;
	JCheckBox jc2;
	JCheckBox jc3;
	JCheckBox jc4;
	JComboBox<String> jcb;
	JTextField jt_phone2;
	JTextField jt_phone3;
	JComboBox<String> jcb2;
	
	Resume() {
		Container con = getContentPane(); // 메인 컨테이너
		con.setLayout(new BorderLayout());
		
		JPanel jp1 = new JPanel(); // 메인 컨테이너에 올라갈 패널 1
		jp1.setLayout(new GridLayout(6, 1));
		
		jp1.add( new JLabel(" 성     명 : ") );
		jp1.add( new JLabel(" 성     별 : ") );
		jp1.add( new JLabel(" 취     미 : ") );
		jp1.add( new JLabel(" 전 화 번 호 : ") );
		jp1.add( new JLabel(" 거 주 지 역 : ") );
		
		JPanel jp2 = new JPanel(); // 메인 컨테이너에 올라갈 패널 1
		jp2.setLayout(new GridLayout(6, 1));
		
		JPanel jp21 = new JPanel();
		JPanel jp22 = new JPanel();
		JPanel jp23 = new JPanel();
		JPanel jp24 = new JPanel();
		JPanel jp25 = new JPanel();
		JPanel jp26 = new JPanel();
		jp21.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		jp22.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		jp23.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		jp24.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		jp25.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		jp26.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		jt_name = new JTextField(10);
		jp21.add(jt_name);
		
		jr1 = new JRadioButton("남성");
		jr2 = new JRadioButton("여성");
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(jr1);
		bg1.add(jr2);
		jp22.add(jr1);
		jp22.add(jr2);
		
		jc1 = new JCheckBox("스포츠");
		jc2 = new JCheckBox("영화");
		jc3 = new JCheckBox("독서");
		jc4 = new JCheckBox("기타");
		jp23.add(jc1);
		jp23.add(jc2);
		jp23.add(jc3);
		jp23.add(jc4);
		
		jcb = new JComboBox<String>();
		jcb.addItem("02");
		jcb.addItem("010");
		jcb.addItem("031");
		jcb.addItem("032");
		jt_phone2 = new JTextField(10);
		jt_phone3 = new JTextField(10);
		jp24.add(jcb);
		jp24.add(new JLabel("-"));
		jp24.add(jt_phone2);
		jp24.add(new JLabel("-"));
		jp24.add(jt_phone3);
		
		jcb2 = new JComboBox<String>();
		jcb2.addItem("서울");
		jcb2.addItem("경기도");
		jcb2.addItem("강원도");
		jcb2.addItem("충청도");
		jcb2.addItem("경상도");
		jcb2.addItem("전라도");
		jcb2.addItem("제주도");
		jp25.add(jcb2);
		
		JButton jb = new JButton("확인");
		jp26.add(jb);
		
		jp2.add(jp21);
		jp2.add(jp22);
		jp2.add(jp23);
		jp2.add(jp24);
		jp2.add(jp25);
		jp2.add(jp26);
		
		jb.addActionListener(this);
		
		con.add(jp1, BorderLayout.WEST);
		con.add(jp2, BorderLayout.CENTER);
		
		setTitle("구성 실습");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = "";
		
		s += "성     명 : ";
		s += jt_name.getText();
		
		s += "\n성     별 : ";
		if (jr1.isSelected()) s += jr1.getText();
		else if (jr2.isSelected()) s += jr2.getText();
		
		s += "\n취     미 : ";
		if (jc1.isSelected()) s += jc1.getText() + " ";
		if (jc2.isSelected()) s += jc2.getText() + " ";
		if (jc3.isSelected()) s += jc3.getText() + " ";
		if (jc4.isSelected()) s += jc4.getText() + " ";
		
		s += "\n전 화 번 호 : ";
		s += jcb.getSelectedItem();
		if (0 < jt_phone2.getText().length()) {
			s += " - " + jt_phone2.getText();
			if (0 < jt_phone3.getText().length()) {
				s += " - " + jt_phone3.getText();	
			}
		}
		
		s += "\n거 주 지 역 : ";
		s += jcb2.getSelectedItem();
		
		System.out.println(s);
	}
}
public class Swing17 {
	public static void main(String[] args) {
		new Resume();
	}
}
