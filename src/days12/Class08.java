package days12;

import java.util.Scanner;

class Circle {
	private int ban;
	private double n; // 넓이
	private double d; // 둘레
	
	private double p = 3.1415926;
	
	void initBan(int input_ban) { ban = input_ban; }
	void generate() {
		if (ban <= 0) {
			System.out.println("반지름이 설정되지 않았거나 유효하지않은 값이 설정되었습니다. 유효한 반지름을 입력하시기바랍니다.");
			Scanner sc = new Scanner(System.in);
			initBan(sc.nextInt());
			sc.close();
		}
		n = ban * ban * p; //넓이 공식 : 반지름 * 반지름 * 3.14
		d = 2 * ban * p; // 둘레 공식 : 2 * 반지름 * 3.14
	}
	double getN() { return n; }
	double getD() { return d; }
}
public class Class08 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.initBan(0); // 반지름을 초기화하는 메서드
		c.generate(); // 넓이와 둘레를 계산하는 메서드
		System.out.println("현재 원의 넓이 : " + c.getN());
		System.out.println("현재 원의 둘레 : " + c.getD());
	}
}
