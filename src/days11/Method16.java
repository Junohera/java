package days11;

import java.util.Scanner;

public class Method16 {

	public static void main(String[] args) {
		// 다수의 학생들의 다수 과목의 성적을 저장하는 배열 생성
		int [][] scores;
		scores = new int[getStudentNumber()][getSubjectNumber() + 1];
		// getStudentNumber() : 학생수를 입력받아서 리턴하는 메서드
		// getSubjectNumber() : 과목수를 입력받아서 리턴하는 메서드
		// getSubjectNumber() + 1 : 총점을 저장할 공간 하나를 추가로 생성
		input(scores);
		output(scores);
//		36
	}
	
	public static int getStudentNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력하세요 : ");
		return sc.nextInt();
	}
	
	public static int getSubjectNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("과목수를 입력하세요 : ");
		return sc.nextInt();
	}
	
	public static void input(int [][] list) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		for (int i = 0; i < list.length; i++) {
			total = 0;
			for (int j = 0; j < (list[i].length - 1); j++) {
				System.out.printf("%d번째 학생의 %d번째 과목 점수 : ", i + 1, j + 1);
				list[i][j] = sc.nextInt();
				total += list[i][j];
			}
			list[i][list[i].length - 1] = total; 
		}
	}
	
	public static void output(int [][] list) {
		double ave = 0.0;
		int subjectCount = list[0].length;
		System.out.println("---------------------------------------------------------------");
		System.out.println("\t\t###성적표###");
		System.out.println("---------------------------------------------------------------");
		System.out.printf("번호\t");
		for (int i = 0; i < list[0].length - 1; i++) System.out.printf("%d과목 \t", i + 1);
		System.out.printf("총점\t평균\t\n");
		System.out.println("---------------------------------------------------------------");
		for (int i = 0; i < list.length; i++) {
			System.out.printf("%d\t", i + 1);
			for (int j = 0; j < list[i].length - 1; j++) System.out.printf("%d\t", list[i][j]);
			ave = list[i][subjectCount - 1] / (double)(subjectCount - 1);
			System.out.printf("%d\t%.1f\n", list[i][subjectCount -1], ave);
		}
		System.out.println("---------------------------------------------------------------");
	}

}
