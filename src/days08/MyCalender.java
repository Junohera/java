package days08;

import java.util.Scanner;

public class MyCalender {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y, m, days = 0 , t, i;
		
		System.out.printf("년 입력 : " );
		y = sc.nextInt();
		System.out.printf("월 입력 : " );
		m = sc.nextInt();
		
		// 입력한 년도의 전년도까지 지나온 날짜수 계산
		days = 365 * (y-1); // 365*(y - 1)
		for (i = 1; i <= (y-1); i++) 
			if ((i%4==0) && (i%100!=0) || (i%400==0)) 
				days ++; // 서기 1년부터 입력한 년도의 전년도까지 있었던 윤년마다 1일을 더함.
		
		// 입력한 월의 전월까지 지나온 날짜 수를 계산합니다.
		switch (m) {
			case 12: days = days + 30;
			case 11: days = days + 31;
			case 10: days = days + 30;
			case 9: days = days + 31;
			case 8: days = days + 31;
			case 7: days = days + 30;
			case 6: days = days + 31;
			case 5: days = days + 30;
			case 4: days = days + 31;
			case 3: 
				// 입력년도가 윤년이면 2월이 29일, 아니면 28일
				if ((i%4==0) && (i%100!=0) || (i%400==0)) days = days + 29;
				else days = days + 28;
			case 2: days = days + 31;
			case 1: days = days + 0;
		}
		
		days = days + 1; // 입력한 월의 1일자가 무슨 요일인지 판단하기위해 1일을 더합니다.
		t = days % 7; // t는 일요일:0, 월요일:1, 화요일:2, 수요일:3, 목요일:4, 금요일:5, 토요일:6
		
		int end = 0;
		switch(m) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: end = 31; break;
			case 4: case 6: case 9: case 11: end = 30; break;
			case 2:
				if ((i%4==0) && (i%100!=0) || (i%400==0)) end = 29;
				else end = 28; break;
		}
//		switch (t) {
//			case 1: System.out.println("월요일입니다"); break;
//			case 2: System.out.println("화요일입니다"); break;
//			case 3: System.out.println("수요일입니다"); break;
//			case 4: System.out.println("목요일입니다"); break;
//			case 5: System.out.println("금요일입니다"); break;
//			case 6: System.out.println("토요일입니다"); break;
//			case 0: System.out.println("일요일입니다"); break;
//		}
		
		// 달력 출력의 시작
		System.out.println();
		System.out.println(y + "년 " + m + "월");
		System.out.println("---------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("---------------------------------------------------");
		
		int cnt = 0;
		// t값보다 1 작은 값까지 빈칸 출력
		for (i = 0; i < t; i++) {
			System.out.printf("\t");
			cnt++;
		}
		
		for (i = 1; i <= end; i++) {
			cnt++;
			System.out.printf("%2d\t", i);
			if (cnt%7==0) System.out.println();
		}
		
		// 36.9
		
		
	}

}
