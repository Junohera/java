package days06;

import java.util.Scanner;

public class ControllOp_For08 {

	/*
	 * 정수를 입력받아
	 * 입력된 정수에 해당되는 팩터리얼을 출력하세요.
	 * 정수 6 입력시 출력 예 : 6 ! = 720  
	 * 
	 * ? 팩터리얼 : n 까지의 곱
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact = 1, max, i;
		
		System.out.printf("정수를 입력하세요 팩터리얼을 반환합니다 : ");
		max = sc.nextInt();
		
		for (i = 1; i <= max; i++) {
			fact *= i;
			
			if (i == 1) System.out.printf("%d ! = %d x ", max, i);
			else if (i  < max) System.out.printf("%d x ", i);
			else System.out.printf("%d = %d", i, fact);
		}
		
		fact = 1;
		
		System.out.println();
		System.out.printf("%d ! = ", max);
		
		for (i = 1; i < max; i++) {
			System.out.printf("%d x ", i);
			fact *= i;
		}
		System.out.printf("%d = %d\n", max, fact * max);
	}

}
