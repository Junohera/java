package days05;

import java.util.Scanner;

public class ControllOp07 {

	public static void main(String[] args) {
		// 월(month) 을 입력받아서
		// 입력받은 월의 계절이 무엇인지 출력합니다.
		// 3~5 봄 6~8 여름 9~11 가을 12~2 겨울
		
		// 변수
		int month;
		
		// 입력
		System.out.println("월을 입력하세요. 해당하는 계절을 출력합니다.");
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
		
		boolean a, b, c, d;
		a = (month >= 3) && (month <= 5);
		b = (month >= 6) && (month <= 8);
		c = (month >= 9) && (month <= 11);
		d = (month == 12) || ((month >= 1) && (month <= 2));
		
		if (a) System.out.println("봄");
		else if (b) System.out.println("여름");
		else if (c) System.out.println("가을");
		else if (d) System.out.println("겨울");
		else System.out.println("잘못 입력했습니다.");
	}

}
