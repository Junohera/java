package days03;

import java.util.Scanner;

public class Variable06 {

	public static void main(String[] args) {
		// 변수
		int bottom, height;
		double result;
		
		// 입력도구
		Scanner sc = new Scanner(System.in); 
		
		// 밑변
		System.out.printf("밑변의 길이를 입력하세요");
		bottom = sc.nextInt();
		System.out.printf("밑변의 길이 : %d\n", bottom);
		
		// 높이
		System.out.printf("높이를 입력하세요");
		height = sc.nextInt();
		System.out.printf("높이 : %d\n\n", height);
		
		// 넓이
		result = (bottom * height) / 2;
		
		// 출력
		System.out.printf("입력한 삼각형의 넓이는 %.1f 입니다.", result);
	}

}
