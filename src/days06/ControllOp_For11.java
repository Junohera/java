package days06;

import java.util.Scanner;

public class ControllOp_For11 {

	/*
	 * 두개의 정수를 입력 받아서 두 정수의 최대 공약수를 출력합니다.
	 * 
	 * 최대 공약수 : 두개 숫자의 공통 약수중에 가장 큰 숫자
	 * 10의 약수 : 1 2 5 10 8의 약수 : 1 2 4 8 공약수 : 1 2 최대 공약수 : 2
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		int i, small, result = 0;
		
		System.out.printf("첫번째 정수 입력 : ");
		num1 = sc.nextInt();
		System.out.printf("두번째 정수 입력 : ");
		num2 = sc.nextInt();
		
		if (num1 < num2) {
			small = num1;
		} else {
			small = num2;
		}
		
		System.out.printf("%d의 약수 : ", num1);
		for (i = 1;i <= num1; i++) {
			if (num1 % i == 0) System.out.printf(" %d", i);
		}
		
		System.out.printf("\n%d의 약수 : ", num2);
		for (i = 1;i <= num2; i++) {
			if (num2 % i == 0) System.out.printf(" %d", i);
		}
		
		System.out.printf("\n%d과 %d의 공약수 : ", num1, num2);
		for (i = 1;i <= small;i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.printf(" %d", i);
				result = i;
			}
		}
		
		System.out.printf(", 최대공약수 : %d", num1, num2, result);
	}

}
