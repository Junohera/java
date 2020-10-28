package days03;

import java.util.Scanner;

//원의 반지름을 입력하세요
// 입력한 원의 넓이
// 입력한 원의 둘레

//넓이 공식 : 반지름 * 반지름 * 3.14
// 둘레 공식 : 2 * 반지름 * 3.14
public class Variable07 {
	
	public static void main(String[] args) {
		// 변수
		int radius; // 반지름
		double rate = 3.14; // 원주율
		double area, round; // 넓이, 둘레
		
		// 입력도구
		Scanner sc = new Scanner(System.in);
		
		// 반지름 입력
		System.out.println("원의 반지름을 입력하세요");
		radius = sc.nextInt();
		
		// 넓이 계산
		area = radius * radius * rate;
		
		// 둘레 계산
		round = 2 * radius * rate;
		
		// 출력
		System.out.printf("입력한 원의 넓이 : %.2f", area);
		System.out.println();
		System.out.printf("입력한 원의 둘레 : %.2f", round);
	}

}
