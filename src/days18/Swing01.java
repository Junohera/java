package days18;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 윈도우 프로그래밍에 필요한 윈도우 구성요소를 상속받아 추가기능 탑재 형식의 개발을 진행합니다.
class Button_Test extends JFrame {
	JButton male = new JButton("남자"); // 버튼 표면에 "남자"라는 글자가 표시된 버튼 생성
	JButton female = new JButton("여자"); // 버튼 표면에 "여자"라는 글자가 표시된 버튼 생성
	// 아직 화면에 버튼이 보이지 않습니다. 안보이는 곳에 생성만 해둔 상태입니다.

	JLabel label = new JLabel("당신의 성별은 ? "); // 안내문구 표시용 텍스트 도구(컨트롤)
	
	Container con = getContentPane(); // 컨테이너 새 인스턴스 생성

	Button_Test() {
		// 윈도우에 올라갈 컨트롤 들을 담을 바구니 - 담으면 윈도우에 표시될 준비가 완료됩니다.
		con.setLayout(new FlowLayout()); // 윈도우 프레임에 add되어지는 순서로 한줄로 화면 구성
		// 줄맞춤 설정
		
		con.add(label);
		con.add(male);
		con.add(female);
		
		setTitle("버튼 컴포넌트 테스트"); // 윈도우 좌측 상단에 표시된 타이틀 내용 설정
		setSize(300, 100); // 윈도우 크기 설정 : 단위(픽셀)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 현재 윈도우 종료시 프로그램까지 종료 설정
		
		setVisible(true); // 화면에 윈도우를 출현시키는 메서드		
	}
	
}

public class Swing01 {
	public static void main(String[] args) {
		// Button_Test btest = new Button_Test();
		new Button_Test();
	}
}
