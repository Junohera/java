package days04;

import java.util.Scanner;

public class Exercise03 {
	/*
	 * number 변수의 값이 짝수인지 확인하여
	 * 결과가 짝수면 true
	 * 홀수면 false 를 출력하세요
	 * true/false값을 출력
	 * 
	 * 입력받을 숫자가 저장될 변수 : number
	 * number를 2로 나눈 나머지를 저장할 변수 : namuge
	 * n과 0을 비교한 결과를 저장할 변수 : boolValue
	 * 결과로 boolValue를 출력합니다
	 */
	public static void main(String[] args) {
		// 변수
		int number, namuge;
		boolean boolValue;
		
		// 입력
		System.out.println("정수를 입력하세요. 짝수여부를 출력합니다.");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		// 계산
		namuge = number % 2;
		boolValue = namuge == 0;
		
		// 출력
		System.out.printf("입력[%d], 출력[%b]", number, boolValue);
	}

}
