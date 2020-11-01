package days05;

import java.util.Scanner;

public class ControllOp_For05 {

	public static void main(String[] args) {
		// 두개의 정수(a, b)를 입력받아서 a부터 b까지의 정수를 출력
		// 입력받은 숫자중에서 작은 숫자부터 큰숫자까지 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		int min, max, temp;
		
		System.out.printf("첫번째 정수를 입력하세요 : ");
		min = sc.nextInt();
		
		System.out.printf("\n두번째 정수를 입력하세요 : ");
		temp = sc.nextInt();
		
		if (min > temp) {
			max = min;
			min = temp;
		} else {
			max = temp;
		}
		
		// test 2
		for (int i = min; i <= max; i++) {
			System.out.println(i);
		}
	}

}
