package days03;

import java.util.Scanner;

public class Variable08 {

	// 상자에 담을 사과의 개수를 입력하세요
	// 1개의 상자에 들어갈 수 있는 사과의 개수를 입력하세요
	
	// 꽉채워진 상자의 개수 ?? box
	// 남은 사과의 개수 : ??개
	
	// (참고)
	// 정수형 변수값을 잠시 실수로 -> (double)a
	// 실수형 변수값을 잠시 정수로 -> (int)b
	public static void main(String[] args) {
		// 변수
		int hasApples, perBox, boxes, tail;
		
		// 입력도구
		Scanner sc = new Scanner(System.in);

		// 입력
		System.out.printf("상자에 담을 사과의 개수를 입력하세요");
		hasApples = sc.nextInt();
		System.out.println("1개의 상자에 들어갈 수 있는 사과의 개수를 입력하세요");
		perBox = sc.nextInt();
		
		// 계산
		boxes = hasApples / perBox; // boxes = (int)(hasApples / perBox);
		tail = hasApples % perBox;
		
		// 출력
		System.out.printf("꽉채워진 상자의 개수 : %d box\n남은 사과의 개수 : %d 개", boxes, tail);
	}
}