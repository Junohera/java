package days18;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JImageTest extends JFrame implements ActionListener {
	JLabel result;
	
	JImageTest() {
		// 이미지 파일을 아이콘화해주는 컨트롤 ImageCon
		ImageIcon ii1 = new ImageIcon("images/korea.gif");
		ImageIcon ii2 = new ImageIcon("images/germany9060.gif");
		ImageIcon ii3 = new ImageIcon("images/usa9060.gif");
		
		// 버튼 이름과 이미지 아이콘으로 버튼 생성
		JButton korea = new JButton("korea", ii1);
		JButton germany = new JButton("germany", ii2);
		JButton usa = new JButton("usa", ii3);
		result = new JLabel();
		
		korea.addActionListener(this);
		germany.addActionListener(this);
		usa.addActionListener(this);
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(korea);
		con.add(germany);
		con.add(usa);
		con.add(result);
		
		setTitle("이미지 아이콘 실습");
		setSize(600, 180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		result.setText(e.getActionCommand() + "을 클릭하셨습니다.");
	}
}
public class Swing04 {
	public static void main(String[] args) {
		new JImageTest();
	}

}
