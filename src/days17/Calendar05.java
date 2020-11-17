package days17;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar05 {
	public static void main(String[] args) {
		// 1. 입력한 월의 시작 날짜와 끝날짜를 저장할 캘린더 객체 생성
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
	
		int year;
		int month;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		year = sc.nextInt();
		System.out.print("월 입력 : ");
		month = sc.nextInt();
		
		// 2. 입력 받은 월의 시작날짜(1일)로 시작날짜객체변수를 세팅합니다.
		sDay.set(year, month-1, 1);
		
		// 3. 입력 받은 월의 끝날짜로 끝날짜객체변수를 세팅합니다.
		eDay.set(year,  month, 1); // 다음달 1일로 세팅
		eDay.add(Calendar.DATE, -1); // 1일을 빼서 이달 말일이 되게 합니다.
		
		// 4. 시작 날짜의 요일을 계산합니다.
		int START_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		
		// 5. 달력 타이틀 출력
		System.out.println("\n" + year + "년\t" + month + "월\t");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("-------------------------------------");
		
		// 6. 시작날짜의 요일(숫자, 일요일 1)까지 0부터 시작해서 빈칸을 채웁니다
		for (int i = 1; i < START_WEEK; i++) System.out.printf("\t");
		// 7. 시작 날짜로 시작한 해당 월의 달력을 차례로 출력합니다.
		for (int i = 1; i <= eDay.get(Calendar.DATE); i++) {
			System.out.printf("%2d\t", i); // i값을 '\t'와 함께 출력;
			if (START_WEEK % 7 == 0) System.out.println(); // 토요일까지 출력되었으면 줄바꿈
			START_WEEK++; // 줄바꿈을 감시할 변수++;
		}
	}
}
