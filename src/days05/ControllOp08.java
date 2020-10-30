package days05;

import java.util.Scanner;

public class ControllOp08 {

	public static void main(String[] args) {
		// 월을 입력받아서
		// 그 월에 해당하는 영문 월이름을 출력하세요.

		System.out.println("영문 월로 변환할 월을 숫자로 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		if (month == 1) System.out.println("January");
		else if (month == 2) System.out.println("February");
		else if (month == 3) System.out.println("March");
		else if (month == 4) System.out.println("April");
		else if (month == 5) System.out.println("May");
		else if (month == 6) System.out.println("June");
		else if (month == 7) System.out.println("July");
		else if (month == 8) System.out.println("August");
		else if (month == 9) System.out.println("September");
		else if (month == 10) System.out.println("October");
		else if (month == 11) System.out.println("November");
		else if (month == 12) System.out.println("December");
		else System.out.println("잘못 입력했습니다.");
	}

}
