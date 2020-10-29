package days04;

import java.util.Scanner;

public class ControllOp03 {
	
	/*
	 * 출생년도를 입력받아서 나이를 계산한 후
	 * 나이가 20이상이면 성년
	 * 20 미만이면 미성년자 라고 출력합니다.
	 */
	public static void main(String[] args) {
		int birthYear, age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출생년도를 입력해주세요.");
		birthYear = sc.nextInt();
		
		age = 2020 - birthYear;
		
		if (age >= 20) {
			System.out.println("성년");
		} else {
			System.out.println("미성년자");
		}
	}
}
