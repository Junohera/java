package days05;

import java.util.Scanner;

public class ControllOp_For03 {

	public static void main(String[] args) {
		// 변수
		Scanner sc = new Scanner(System.in);
		int dan, i;
		
		// 입력
		System.out.printf("출력할 단을 입력하세요 : ");
		dan = sc.nextInt();
		// 반복실행문을 이용해서 입력한 단의 구구단을 출력하세요.
		// ex) 5 x 1 = 5
		
		// 출력
		System.out.printf("\n### %d단 ###\n", dan);
		for (i = 1; i <= 9; i++)
			System.out.printf("%d\tx\t%d\t=\t%d\n", dan, i,  dan*i);
	}

}
