package days07;

import java.util.Scanner;

public class ControllOp_Loop01 {

	/*
	 * 1. 학생수를 입력받습니다
	 * 2. 과목수를 입력받습니다
	 * 3. 과목수와 학생수에 따른 반복실행문을 실행하여
	 * 		각 학생별 과목을 점수를 입력받고 총점과 평균을 출력하세요
	 * 4. 출력양식
	 * 총과목수 : X 과목, 총인원수 : X명
	 * 과목점수 : XX XX XX  총점 : XXX 평균 : XX.X
	 * 과목점수 : XX XX XX  총점 : XXX 평균 : XX.X
	 * 과목점수 : XX XX XX  총점 : XXX 평균 : XX.X
	 * ...
	 */
	/*
	public static void main(String[] args) {
		int std, k, i, j; // 학생수, 과목수, 반복실행 변수 i, j
		int tot, num; // 총점, 방금 입력받은 점수가 저장될 변수
		double ave; // 평균
		
		Scanner sc = new Scanner(System.in);
		// 1. 학생수를 입력받습니다.
		System.out.printf("학생수 입력 : ");
		std = sc.nextInt();
		// 2. 과목수를 입력받습니다.
		System.out.printf("과목수 입력 : ");
		k = sc.nextInt();
		// 3. 과목수와 학생수에 따른 반복실행문을 실행하여
		//  각 학생별 과목을 점수를 입력 받고 총점과 평균을 출력하세요.
		for (i = 0; i < std; i++) {
			System.out.println((i + 1) + "번 학생 ---------------------");
			tot = 0;
			for(j = 0; j < k; j++) {
				System.out.printf("%d 과목점수 : ", j + 1);
				num = sc.nextInt();
				tot += num;
			}
			ave = tot/(double)k;
			System.out.printf("총점 : %d, 평균 : %.2f\n", tot, ave);
		}
		// 4. 출력양식
		// 총과목수 : X 과목, 총인원수 : X명
	}
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int studentCount = 0; // 학생 수
		int subjectCount = 0; // 과목 수
		
		String print = "";
		
		System.out.printf("학생수를 입력하세요 : ");
		studentCount = sc.nextInt();
		System.out.printf("과목수를 입력하세요 : ");
		subjectCount = sc.nextInt();
		
		int i = 1;
		while (i <= studentCount) {
			int j = 1;
			
			print += "\n과목점수 :";
			int sum = 0;
			double avg;
			while (j <= subjectCount) {
				System.out.printf("%d번째 학생의 %d번째 과목 점수를 입력하세요 : ", i, j);
				int score = sc.nextInt();
				sum += score;
				print += String.format("\t%2d", score);
				j++;
			}
			avg = sum/subjectCount;
			print += String.format("\t총점 :\t%d\t평균 :\t%.1f", sum, avg);
			i++;
		}
		
		System.out.printf("\n총과목수 : %d 과목, 총인원수 : %d명", subjectCount, studentCount);
		System.out.printf(print);
	}
}
