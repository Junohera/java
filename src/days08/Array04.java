package days08;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		// 세명의 학생 국영수 과목의 점수를 입력받아서 성적표 출력
		int [] kor = new int[3];
		int [] eng = new int[3];
		int [] mat = new int[3];
		int [] tot = new int[3];
		double [] ave = new double[3];
		
		// 각 학생의 국영수 점수를 입력받습니다.
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("%d번 학생의 국어점수 : ", i + 1);
			kor[i] = sc.nextInt();
			System.out.printf("%d번 학생의 영어점수 : ", i + 1);
			eng[i] = sc.nextInt();
			System.out.printf("%d번 학생의 수학점수 : ", i + 1);
			mat[i] = sc.nextInt();
			
			tot[i] = kor[i] + eng[i] + mat[i];
			ave[i] = tot[i] / 3.0;
		}
		System.out.println("\t\t###성적표###");
		System.out.println("---------------------------------------------------------");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------------------");
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" + tot[i] + "\t" + (int)(ave[i]*100)/100.0);
		}
		System.out.println("---------------------------------------------------------");
		
	}

}
