package days04;

import java.util.Scanner;

public class Exercise02 {

	/*
	 * 국어 영어 수학 점수를 입력받아
	 * 총점 평균을 계산하고
	 * 총점 평균을 출력하세요
	 * (변수 이름: kor eng mat total average)
	 * println을 이용하여 출력하되 소수점 둘째자리까지 표시하세요.
	 */
	public static void main(String[] args) {
		// 변수
		int kor, eng, mat;
		int total;
		double average;
		
		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요"); kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요"); eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요"); mat = sc.nextInt();
		
		// 계산
		total = kor + eng + mat;
		average = total / 3.0;
		average = (int)(average * 100) * 0.01;
		
		// 출력
		System.out.println("국어[" + kor + "] 영어["+ eng +"] 수학["+ mat +"]");
		System.out.println("총점["+ total +"] 평균["+ average +"]");
	}

}
