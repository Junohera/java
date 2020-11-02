package days06;

import java.util.Scanner;

public class ControllOp_For07 {

	/*
	 * 정수 10개를 입력받아
	 * 10개의 합계를 계산하여 출력하세요.
	 * 결과는 합계만 한번 출력합니다.
	 */
	public static void main(String[] args) {
		// 변수
		Scanner sc = new Scanner(System.in);
		int sum = 0, num, i;
		
		// 연산
		for (i = 0; i < 10; i++) {
			System.out.printf("정수를 입력하세요 : ");
			num = sc.nextInt();
			sum += num;
		}
		
		// 출력
		System.out.printf("입력받은 정수의 합 : %d\n", sum);
	}

}
