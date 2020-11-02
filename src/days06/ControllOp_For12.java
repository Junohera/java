package days06;

import java.util.Scanner;

public class ControllOp_For12 {

	/*
	 * 두개의 숫자를 입력 받아서 두 숫자의 최소 공배수를 출력
	 * 1. 첫번째 숫자의 배수들 출력 ( 최대 100 )
	 * 2. 두번째 숫자의 배수들 출력 ( 최대 100 )
	 * 3. 두 숫자의 공배수 출력 ( 최대 100 )
	 * 4. 최소 공배수 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, start;
		int end = 100;
		
		System.out.printf("첫번째 정수 입력 : ");
		num1 = sc.nextInt();
		System.out.printf("두번째 정수 입력 : ");
		num2 = sc.nextInt();
		
		if (num1 > num2) start = num1;
		else start = num2;
		
		System.out.printf("%d의 배수 : ", num1);
		for (int i = 1;i*num1 <= end; i++) {
			System.out.printf(" %d ", i * num1);
		}
		
		System.out.printf("\n%d의 배수 : ", num2);
		for (int i = 1;i*num2 <= end; i++) {
			System.out.printf(" %d ", i * num2);
		}
		
		System.out.printf("\n%d와 %d의 공배수 : ", num1, num2);
		for (int i = start;i <= num1 * num2; i++) {
			if (i % num1 == 0 && i % num2 == 0) {
				System.out.printf(" %d", i);
			}
		}
		
		System.out.printf("\n%d와 %d의 최소공배수 : ", num1, num2);
		for (int i = start;i <= num1 * num2; i++) {
			if (i % num1 == 0 && i % num2 == 0) {
				System.out.printf(" %d", i);
				break;
			}
		}
	}

}
