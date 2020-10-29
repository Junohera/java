package days04;

import java.util.Scanner;

public class Exercise05 {

	/*
	 * 입력한 점수가 100이상이거나 50미만이면 true,
	 * 아니면 false (이거나, 또는 or(|| 연산자 사용)
	 */
	public static void main(String[] args) {
		// 변수
		int d;
		boolean b;
		
		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요~");
		d = sc.nextInt();
		
		// 연산
		b = (d >= 100) || (d < 50);
		
		// 출력
		System.out.printf("\"입력한 점수 %d은 100과 50 사이를 벗어나는 점수입니다.\"의 진위값 : %b", d, b);		
	}

}
