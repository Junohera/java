package days10;

import java.util.Scanner;

public class Method10 {

	public static void main(String[] args) {
		int year;
		boolean a;
		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력 : ");
		year = sc.nextInt();
		a = yoon(year); // 년도를 전달인수로 전달하여 윤년이면 true, 평년이면 false를 리턴
		prn(a); // 변수 a값을 전달받아 윤년 또는 평년을 출력하는 메서드
	}
	public static boolean yoon(int year) {
		boolean isYoon = (year % 4) == 0 && ((year % 100) != 0 || (year % 400 == 0));
		return isYoon;
	}
	public static void prn(boolean a) {
		if (a) {
			System.out.println("윤년입니다");
		} else {
			System.out.println("평년입니다.");
		}
	}

}
