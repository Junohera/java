package days18;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

class JBorderLayout extends JFrame {
	JBorderLayout() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout(10, 10)); // 각 지역 (동서남북중앙)간의 간격 가로세로 10px
		
		con.add(new JButton("EAST"), BorderLayout.EAST);
		con.add(new JButton("WEST"), BorderLayout.WEST);
		con.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		con.add(new JButton("NORTH"), BorderLayout.NORTH);
		con.add(new JButton("CENTER"), BorderLayout.CENTER); // Center는 정의하지 않으면 자리가 남지만 이외의 영역은 정의하지 않으면 다른영역으로 포함되어져 표시
		
		setTitle("border Layout pratice");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class Swing07 {
	public static void main(String[] args) {
		new JBorderLayout();
	}
}
