package days04;

import java.util.Scanner;

public class ControllOp06 {

	/*
	 * 년도를 입력받아서 입력받은 연도가 윤년인지 평년인지를 판단하여 출력하세요
	 * 윤년의 조건 : 입력한 년도가 4의 배수이면서, 100의 배수가 아니거나 400의 배수인 해
	 */
	
	// 윤년 목록
//	1968 년
//	1972 년
//	1976 년
//	1980 년
//	1984 년
//	1988 년
//	1992 년
//	1996 년
//	2000 년
//	2004 년
//	2008 년
//	2012 년
//	2016 년
//	2020 년
	public static void main(String[] args) {
		// 변수
		int year;
		
		// 입력
		System.out.println("윤년을 판단할 날짜를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		// 연산
		if ((year % 4) == 0 && ((year % 100) != 0 || (year % 400 == 0))) System.out.println("윤년O");
		else System.out.println("윤년X");
		
		// 출력
		System.out.println(year);
	}

}
