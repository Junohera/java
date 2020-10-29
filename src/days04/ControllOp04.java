package days04;

import java.util.Scanner;

public class ControllOp04 {

	/*
	 * 출생년도를 입력받고 나이를 계산해서
	 * 12세 미만 어린이, 12~18세 청소년, 19세 이상(나머지) 성년으로 출력하세요.
	 */
	public static void main(String[] args) {	
		int birthYear, age;
		
		System.out.print("출생년도를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		birthYear = sc.nextInt();
		age = 2020 - birthYear;
		
		if (age < 12) System.out.println("어린이입니다.");
		else if (age >= 12 && age <= 18) System.out.println("청소년입니다.");
		else if (age >= 19 && age <= 24) System.out.println("청년입니다.");
		else System.out.println("성년입니다.");
	}

}
