package days17;

import java.util.Calendar;
import java.util.Scanner;

public class Calender06 {

	public static void main(String[] args) {
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		int year, month;
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		year = sc.nextInt();
		System.out.print("월 입력 : ");
		month = sc.nextInt();
		while(true) {
			sDay.set(year, month-1, 1);
			eDay.set(year,  month, 1);
			eDay.add(Calendar.DATE, -1);
			int START_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
			System.out.println("\n" + year + "년\t" + month + "월\t");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("-------------------------------------");
			for (int i = 1; i < START_WEEK; i++) System.out.printf("\t");
			for (int i = 1; i <= eDay.get(Calendar.DATE); i++) {
				System.out.printf("%2d\t", i);
				if (START_WEEK % 7 == 0) System.out.println();
				START_WEEK++;
			}
			
			System.out.printf("\n[이전달(1)] | [다음달(2)] | [종료(3)]");
			int input = sc.nextInt();
			if (input == 3) break;
			else if (input == 1) {
				sDay.add(Calendar.MONTH, -1);
				year = sDay.get(Calendar.YEAR);
				month = sDay.get(Calendar.MONTH) + 1; 
			} else if (input == 2) {
				sDay.add(Calendar.MONTH, 1);
				year = sDay.get(Calendar.YEAR);
				month = sDay.get(Calendar.MONTH) + 1;
			}
		}
		
		System.out.println("프로그램이 종료되었습니다.");
	}

}
