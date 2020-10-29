package days04;

import java.util.Scanner;

public class Exercise01 {

	/*
	 * 출생년도를 입력받아 나이를 계산하고
	 * 계산된 나이를 출력하세요
	 * (변수이름 : year, age)
	 * 현재년도에서 출생년도를 뺀 나이보다
	 * 한살 더 많은 한국식 나이로 출력하세요
	 * (++연산자 사용)
	 */
	public static void main(String[] args) {
		// 변수
		int year, age;
		
		// 입력
		System.out.println("출생년도를 입력하세요. YYYY");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();

		// 계산
		age = 2020 - year;
		
		// 출력
		System.out.printf("입력하신 출생년도에 해당하는 나이는 %d 입니다.\n", age);
		System.out.printf("입력하신 출생년도에 해당하는 한국식 나이는 %d 입니다.", ++age);
	}

}
