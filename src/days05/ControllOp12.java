package days05;

import java.util.Scanner;

public class ControllOp12 {

	/*
	 * switch문에서 특정 목적에 맞게 
	 * break를 일부러 생략하여 보다 효율적인 프로그래밍을 할 수 있다는 것을 보여줌.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month, day, days = 0, na;
		System.out.println("월 입력 : ");
		month = sc.nextInt();
		System.out.println("일 입력 : ");
		day = sc.nextInt();
		
		switch(month) {
		case 12:
			days += 30;
		case 11:
			days += 31;
		case 10:
			days += 30;
		case 9:
			days += 31;
		case 8:
			days += 31;
		case 7:
			days += 30;
		case 6:
			days += 31;
		case 5:
			days += 30;
		case 4:
			days += 31;
		case 3:
			days += 29;
		case 2:
			days += 31;
		case 1:
			days += 0;
		}
		
		days += day;
		na = days % 7;
		
		switch(na) {
		case 1:
			System.out.println("수요일입니다.");
			break;
		case 2:
			System.out.println("목요일입니다.");
			break;
		case 3:
			System.out.println("금요일입니다.");
			break;
		case 4:
			System.out.println("토요일입니다.");
			break;
		case 5:
			System.out.println("일요일입니다.");
			break;
		case 6:
			System.out.println("월요일입니다.");
			break;
		case 0:
			System.out.println("화요일입니다.");
			break;
		}
	}

}
