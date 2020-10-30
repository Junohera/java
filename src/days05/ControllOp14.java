package days05;

import java.util.Scanner;

public class ControllOp14 {

	public static void main(String[] args) {
		// 국어 영어 수학 점수를 입력받아서 총점 평균 계산하고
		// 평균 60이상 이면서 전과목 40미만이 없으면 합격
		// 그렇지 않으면 불합격이라고 출력하세요
		
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, total;
		double ave;
		
		System.out.printf("국어점수를 입력하세요 : ");
		kor = sc.nextInt();
		
		System.out.printf("영어점수를 입력하세요 : ");
		eng = sc.nextInt();
		
		System.out.printf("수학점수를 입력하세요 : ");
		mat = sc.nextInt();
		
		total = kor + eng + mat;
		ave = (total / 3);
		
		System.out.printf("국어 [%d] 영어[%d] 수학[%d] 총점 [%d] 평균 [%f]\n", kor, eng, mat, total, ave);
		
		if (ave >= 60 && (40 <= kor && 40 <= eng && 40 <= mat)) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		if (ave < 60 || kor < 40 || eng < 40 || mat < 40) {
			System.out.println("불합격");
		} else {
			System.out.println("합격");
		}
		
		if (ave >= 60) {
			if (kor >= 40 && eng >= 40 && mat >= 40) System.out.println("합격");
			else System.out.println("불합격");
		} else {
			System.out.println("불합격");
		}
		
		if (ave >= 60) {
			if (kor >= 40) {
				if (eng >= 40) {
					if (mat >= 40) {
						System.out.println("합격");
					} else System.out.println("불합격");
				} else System.out.println("불합격");
			} else System.out.println("불합격");
		} else System.out.println("불합격");
	}

}
