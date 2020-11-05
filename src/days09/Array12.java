package days09;

import java.util.Scanner;

public class Array12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y, m, days = 0 , t, i, count = 0;
		
		System.out.printf("년 입력 : " );
		y = sc.nextInt();
		System.out.printf("월 입력 : " );
		m = sc.nextInt();
		
		int input = 1;
		boolean first = true;
		
		int [] mdays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};		
		
		while (first || input < 3 && input > 0) {
			
			
			if (!first) {
				if (input == 1 && (m-1) == 0) { // 작년
					y--;
					m = 12;
				} else if (input == 2 && (m+1) == 13) { // 내년
					y++;
					m = 1;
				} else { // 이번 연도
					if (input == 1) m--;
					else if (input == 2) m++;
				}
			}
			
			days = 365 * (y-1); // 365*(y - 1)
			for (i = 1; i <= (y-1); i++) 
				if ((i%4==0) && (i%100!=0) || (i%400==0)) 
					days ++; // 서기 1년부터 입력한 년도의 전년도까지 있었던 윤년마다 1일을 더함.
			
			if ((y%4==0) && (y%100!=0) || (y%400==0))
				mdays[2] = 29;
			else mdays[2] = 28;
			
			for (i = 1; i <= m-1; i++)
				days = days + mdays[i];
			
			days = days + 1;
			t = days % 7;
			
			System.out.println();
			System.out.println(y + "년 " + m + "월");
			System.out.println("---------------------------------------------------");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("---------------------------------------------------");
			
			int cnt = 0;
			for (i = 0; i < t; i++) {
				System.out.printf("\t");
				cnt++;
			}
			for (i = 1; i <= mdays[m]; i++) {
				cnt++;
				System.out.printf("%2d\t", i);
				if (cnt%7==0) System.out.println();
			}
			count++;
			System.out.println();
			System.out.printf("\n\t\t\t1. 이전달 2. 다음달 3. 종료 : ");
			input = sc.nextInt();
			first = false;
		}		
		System.out.printf("\n달력 프로그램이 종료되었습니다. 조회 수 : %d", count);
	}

}
