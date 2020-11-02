package days06;

import java.util.Scanner;

public class ControllOp_For10 {

	/*
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year, month, day, days = 0, na;
		System.out.println("년 입력 : ");
		year = sc.nextInt();
		System.out.println("월 입력 : ");
		month = sc.nextInt();
		System.out.println("일 입력 : ");
		day = sc.nextInt();
		
		days = 365 * (year - 1); // 전년도까지의 날짜 합
		
		for (int i = 0; i <= year; i++) {
			if ((year % 4) == 0 && ((year % 100) != 0 || (year % 400 == 0))) {
				days++;
			}
		}
		
		switch(month) {
		case 12: days += 30;
		case 11: days += 31;
		case 10: days += 30;
		case 9: days += 31;
		case 8: days += 31;
		case 7: days += 30;
		case 6: days += 31;
		case 5: days += 30;
		case 4: days += 31;
		case 3:
			if ((year % 4) == 0 && ((year % 100) != 0 || (year % 400 == 0))) 
				days += 29;
			else
				days += 28;
		case 2: days += 31;
		case 1: days += 0;
		}
		
		days += day;
		na = days % 7;
		
		System.out.println(na);
		switch(na) {
		case 1: System.out.println("월요일입니다."); break;
		case 2: System.out.println("화요일입니다."); break;
		case 3: System.out.println("수요일입니다."); break;
		case 4: System.out.println("목요일입니다."); break;
		case 5: System.out.println("금요일입니다."); break;
		case 6: System.out.println("토요일입니다."); break;
		case 0: System.out.println("일요일입니다."); break;
		}
	}

}
