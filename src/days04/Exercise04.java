package days04;

import java.util.Scanner;

public class Exercise04 {
	/*
	 * 점수를 입력받아서
	 * 점수가 70점 이상이면서 100점 이하이면 true,
	 * 아니면 false 출력(이면서, 그리고, ~이고 : and(&&)연산자 사용)
	 * 
	 * 입력받을 점수가 저장될 변수 : score
	 * score를 70과 100을 이용해 비교한 결과를 저장할 변수 : boolValue
	 * 결과로 boolValue를 출력합니다.
	 */
	public static void main(String[] args) {
		// 변수
		int score;
		boolean boolValue;
		
		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요~");
		score = sc.nextInt();
		
		// 연산
		boolValue = (score >= 70) && (score <= 100); 
		
		// 출력
		System.out.printf("\"입력한 점수 %d은 70과 100사이의 점수입니다.\"의 진위값 : %b\n", score, boolValue);
	}

}
