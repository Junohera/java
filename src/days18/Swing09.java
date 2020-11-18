package days18;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/*
 * 이미지 apple.jpg persimmon.jpg pear.jpg banana.jpg cherry.jpg
 * 다섯개의 이미지를 아이콘으로 만들고 다섯개를 이미지와 함께 생성하세요.
 * 그리드 레이아웃을 이용하여 3행 2열로 배치하고
 * 액션 리스너를 붙여서 버튼 클릭시에 이미지에 해당하는 과일 이름이 result 레이블에 나오도록 작성하세요.
 */
class GridFruits extends JFrame implements ActionListener {
	JLabel result = new JLabel("");
	
	GridFruits() {
		String[] fruits = {"apple", "persimmon", "pear", "banana", "cherry"};
		ImageIcon[] fruitsImage = new ImageIcon[fruits.length];
		JButton[] fruitsButton = new JButton[fruits.length];

		// container 설정
		Container con = getContentPane();
		con.setLayout(new GridLayout(3, 2));
				
		// 컨텐츠 등록
		for (int i = 0; i < fruits.length; i++) {
			fruitsImage[i] = new ImageIcon("images/" + fruits[i] + ".jpg"); // imageIcon
			fruitsButton[i] = new JButton(fruits[i], fruitsImage[i]);  // button
			con.add(fruitsButton[i]); // add
			fruitsButton[i].addActionListener(this); // addAction
		}
		con.add(result);
		
		// 틀 설정
		setTitle("과일 선택하기");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		this.result.setText("your selected : " + e.getActionCommand());
	}
}

public class Swing09 {
	public static void main(String[] args) {
		new GridFruits();
	}
}
