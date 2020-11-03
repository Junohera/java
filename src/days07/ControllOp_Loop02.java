package days07;

import java.util.Scanner;

public class ControllOp_Loop02 {
	
	/*
	 * while -> for
	 * for -> while
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int studentCount, subjectCount, sum;
		double avg;
		String print = "";
		
		System.out.printf("학생수를 입력하세요 : "); studentCount = sc.nextInt();
		System.out.printf("과목수를 입력하세요 : "); subjectCount = sc.nextInt();
		for (int i = 1; i <= studentCount; i++) {
			print += String.format("\n%d번째 학생 :", i);
			sum = 0;
			for (int j = 1; j <= subjectCount; j++) {
				System.out.printf("%d번째 학생의 %d번째 과목 점수를 입력하세요 : ", i, j);
				int score = sc.nextInt();
				sum += score;
				print += String.format(" %d:%d", j, score);
			}
			avg = sum/subjectCount;
			print += String.format("  총점:%d 평균:%.1f", sum, avg);
		}
		System.out.printf("\n총과목수 : %d 과목, 총인원수 : %d명" + print, subjectCount, studentCount);
	}
}
