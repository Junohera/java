package days04;

import java.util.Scanner;

public class ControllOp05 {
	
	/*
	 * 입력받은 점수가 90~100 A, 80~89 B, 70~79 C, 60~69 D, 0~59 F
	 */
	public static void main(String[] args) {
		int score;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		score = sc.nextInt();
		
		if (score >= 90) System.out.print("A학점");
		else if (score >= 80) System.out.print("B학점");
		else if (score >= 70) System.out.print("C학점");
		else if (score >= 60) System.out.print("D학점");
		else System.out.print("F학점");
	}

}
