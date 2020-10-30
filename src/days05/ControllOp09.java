package days05;

import java.util.Scanner;

public class ControllOp09 {

	public static void main(String[] args) {
		// 2020년에 한해서 월과 일을 입력 받은 후
		// 그 날짜가 무슨 요일인지 출력합니다.
		
		// 계산 방법은 2020년 1월 1일부터 입력한 월 일까지 몇일이 지났는지 계산한후
		// 총일수를 7로 나눈 나머지를 계산합니다.
		// 그 값으로 2020년 1월 1일 수요일부터 상대적인 요일을 계산합니다.
		
		// 3월 5일 입력시 : 31 + 29 + 5 => 65
		// 65를 7로 나눈 나머지 -> 2
		// 요일은 목요일
		
		Scanner sc = new Scanner(System.in);
		int month, day, days = 0, na;
		System.out.println("월 입력 : ");
		month = sc.nextInt();
		System.out.println("일 입력 : ");
		day = sc.nextInt();
		
		if (month == 1) 			days = 0;
		else if (month == 2) 	days = 31;
		else if (month == 3) 	days = 31 + 29;
		else if (month == 4) 	days = 31 + 29 + 31;
		else if (month == 5) 	days = 31 + 29 + 31 + 30;
		else if (month == 6) 	days = 31 + 29 + 31 + 30 + 31;
		else if (month == 7) 	days = 31 + 29 + 31 + 30 + 31 + 30;
		else if (month == 8) 	days = 31 + 29 + 31 + 30 + 31 + 30 + 31;
		else if (month == 9) 	days = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
		else if (month == 10) days = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
		else if (month == 11) days = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
		else if (month == 12) days = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
		
		days += day;
		na = days % 7;
		
		if (na == 1) System.out.println("수요일입니다.");
		else if (na == 2) System.out.println("목요일입니다.");
		else if (na == 3) System.out.println("금요일입니다.");
		else if (na == 4) System.out.println("토요일입니다.");
		else if (na == 5) System.out.println("일요일입니다.");
		else if (na == 6) System.out.println("월요일입니다.");
		else if (na == 0) System.out.println("화요일입니다.");
		
	}

}
