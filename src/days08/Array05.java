package days08;

import java.util.Scanner;

public class Array05 {

	/*
	 * 5과목의 성적을 배열에 입력받아서
	 * 각 과목 점수와 총점 배열을 출력하세요
	 * 평균은 소수점 둘째 자리까지만 표시하세요
	 * 
	 * 과목 점수 : XX XX XX XX XX
	 * 총점 : XXX
	 * 평균 : XX.XX
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sub [][], tot [], count = 0, studentCount = 0, totalStudentCount = 0, subjectCount, input = 0;
		double avg [];
		
		do {
			count++;
			System.out.print("학생수 입력 : ");
			studentCount = sc.nextInt();
			totalStudentCount += studentCount;
			
			System.out.print("과목수 입력 : ");
			subjectCount = sc.nextInt();
			
			sub = new int[studentCount][subjectCount];
			tot = new int[studentCount];
			avg = new double[studentCount];
			
			for (int i = 0; i < studentCount; i++) {
				for (int j = 0; j < subjectCount; j++) {
					System.out.printf("%d번째 학생의 %d과목 점수 입력 : ", i+1, j+1);
					sub[i][j] = sc.nextInt();
					tot[i] += sub[i][j];
				}
				avg[i] = tot[i] / subjectCount;
			}
			
			System.out.println("\n\t\t###성적표###");
			System.out.println("---------------------------------------------------------");
			System.out.println("번호\t국어\t영어\t수학\t사회\t화학\t총점\t평균");
			System.out.println("---------------------------------------------------------");
			for (int i = 0; i < studentCount; i++) {
				System.out.printf("\n%d", i+1);
				for (int j = 0; j < subjectCount; j++) {
					System.out.printf("\t%d", sub[i][j]);
				}
			}
				
					
			System.out.println("---------------------------------------------------------");
			
			System.out.print("성적표 출력 완료 (1. 추가입력 2. 종료) : ");
			input = sc.nextInt();
		} while (input == 1);
		
		System.out.printf("프로그램이 종료되었습니다. 입력횟수 %d, 총 학생수 %d\n", count, totalStudentCount);
	}

}
