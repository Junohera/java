package days19;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
interface CONST4CALCULATOR {
	public static final String PLUS = "+";
	public static final String MINUS = "-";
	public static final String MULTIPLE = "x";
	public static final String DIVISION = "÷";
	public static final String CLEAR = "C";
	public static final String RESULT = "=";
	public static final String BACKSPACE = "<-";
	public static final String FUNC1 = "1/x";
	public static final String ROOT = "Sqr";
	public static final String REMAINDER = "%";
}
/*
 * 컨테이너의 레이아웃 : 5행 1열의 GridLayout
 * 1 행 : JPanel p1 배치 : p1에는 FlowLayout으로 TextField 한개 배치(가로크기 적당히)
 * 2 행 : JPanel p2 배치 : p2에는 GridLayout으로 버튼 네개배치( 7, 8, 9, + )
 * 3 행 : JPanel p3 배치 : p3에는 GridLayout으로 버튼 네개배치( 4, 5, 6, -, )
 * 4 행 : JPanel p4 배치 : p4에는 GridLayout으로 버튼 네개배치( 1, 2, 3, x )
 * 5 행 : JPanel p5 배치 : p5에는 GridLayout으로 버튼 네개배치( C, 0, =, ÷)
 */
class Calculator extends JFrame implements ActionListener, CONST4CALCULATOR {
	private int num1 = 0, num2 = 0, result1 = 0;
	private double result2 = 0.0;
	private String op = PLUS;
	
	JTextField result;
	
	Calculator() {
		Container con = getContentPane();
		con.setLayout(new GridLayout(6, 1));
		
		JPanel p1 = new JPanel(new GridLayout(1, 1));
		Font f = new Font("굴림", Font.BOLD, 20); // 폰트 객체 생성
		result = new JTextField(16); // 생성된 폰트 적용
		result.setFont(f);
		result.setText("0");
		result.setHorizontalAlignment(SwingConstants.RIGHT); // 텍스트 필드 오른쪽 정렬
		result.setEditable(false); // 마우스 키보드로 편집할 수 없게 설정
		p1.add(result);
		
		JPanel p2 = new JPanel(new GridLayout(1, 4));
		JPanel p3 = new JPanel(new GridLayout(1, 4));
		JPanel p4 = new JPanel(new GridLayout(1, 4));
		JPanel p5 = new JPanel(new GridLayout(1, 4));
		JPanel p6 = new JPanel(new GridLayout(1, 4));
		
		String[] calStr = { // op: (3, 7, 11, 15), clear: 12, doCal: 14
			"7", "8", "9", PLUS
			, "4", "5", "6", MINUS 
			, "1", "2", "3", MULTIPLE 
			, CLEAR, "0", RESULT, DIVISION 
			, BACKSPACE, FUNC1, ROOT, REMAINDER
		};
		JButton[] calBtn = new JButton[calStr.length];
		
		for (int i = 0; i < calStr.length; i++) {
			calBtn[i] = new JButton(calStr[i]);
			calBtn[i].setFont(f);
			calBtn[i].addActionListener(this);
			
			if (i < 4) p2.add(calBtn[i]);
			else if (i < 8) p3.add(calBtn[i]);
			else if (i < 12) p4.add(calBtn[i]);
			else if (i < 16) p5.add(calBtn[i]);
			else if (i < 20) p6.add(calBtn[i]);
		}
		
		con.add(p1);
		con.add(p2);
		con.add(p3);
		con.add(p4);
		con.add(p5);
		con.add(p6);
		
		setTitle("Calculator");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		switch(s) {
			case "0": case "1": case "2": case "3": case "4": case "5": case "6": case "7": case "8": case "9":
				if (result.getText().equals("0")) {
					result.setText("");
				}
				
				result.setText(result.getText() + s);
				break;
			case PLUS: case MINUS: case MULTIPLE: case DIVISION: case REMAINDER: case FUNC1: case ROOT:
				if (0 < Integer.parseInt(result.getText())) {
					num1 = Integer.parseInt(result.getText());
					op = s;
					result.setText("0");	
				}
				
				break;
			case CLEAR: result.setText("0"); break;
			case RESULT:
				num2 = Integer.parseInt(result.getText());
				switch(op) {
					case PLUS:
						result1 = num1 + num2;
						result.setText(String.valueOf(result1));
						break;
					case MINUS:
						result1 = num1 - num2;
						result.setText(String.valueOf(result1));
						break;
					case MULTIPLE:
						result1 = num1 * num2;
						result.setText(String.valueOf(result1));
						break;
					case DIVISION:
						result2 = num1 / (double)num2;
						result.setText(String.valueOf(result2));
						break;
					case REMAINDER:
						result1 = num1 % num2;
						result.setText(String.valueOf(result1));
						break;
					case FUNC1:
						result2 = 1 / (double)Integer.parseInt(result.getText());
						result.setText(String.valueOf(result2));
						break;
					case ROOT:
						result2 = Math.sqrt(Integer.parseInt(result.getText()));
						result.setText(String.valueOf(result2));
						break;
				}
				break;
			case BACKSPACE:
				/*
				 * result.getText().length() : 텍스트 필드에 있는 글자의 총갯수
				 * 98765가 있다면 총글자갯수 5, 인덱스는 0번부터 4번까지 입니다.
				 * 이중 9876만 취하고 싶다면, substring에 0, 4라고 써야 0번부터 3번 글자까지
				 * 추출됩니다.
				 * 그말은 곧 length()메서드를 사용했다면 문자열.substring(0, 문자열.length()-1);
				 */
				String t = result.getText();
				if (0 < Integer.parseInt(t)) {
					String substring = t.substring(0, t.length() - 1);
					if (0 == substring.length()) result.setText("0");
					else result.setText(substring);	
				}
				break;
			default:
				System.out.println("already: " + s);
		}
	}
	
}
public class Swing12 {
	public static void main(String[] args) {
		new Calculator();
	}
}
