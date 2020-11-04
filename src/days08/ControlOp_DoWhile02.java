package days08;

import java.util.Scanner;

public class ControlOp_DoWhile02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int useCount = 0;
		int isExit;
		do {
			useCount++;
			int n1, n2, result = 0, operator;
			System.out.print("1번째 정수를 입력하세요 : ");
			n1 = sc.nextInt();
			System.out.print("2번째 정수를 입력하세요 : ");
			n2 = sc.nextInt();
			System.out.print("계산에 사용할 부호를 입력하세요 (+:1, -:2, *:3, /:4 : ");
			operator = sc.nextInt();
			switch (operator) {
				case 1 : result = n1 + n2; break;
				case 2 : result = n1 - n2; break;
				case 3 : result = n1 * n2; break;
				case 4 : result = n1 / n2; break;
			}
			System.out.printf("result = %d\n", result);
			System.out.print("계속하시겠습니까(y:1/n:2)? : ");
			isExit = sc.nextInt();
		} while (isExit != 2);
		
		System.out.printf("\n프로그램 종료 : 계산횟수[%d]", useCount);
	}

}
