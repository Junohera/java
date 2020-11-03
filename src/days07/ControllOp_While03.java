package days07;

import java.util.Scanner;

public class ControllOp_While03 {

	/*
	 * 사용자에게서 단을 입력받아 구구단을 출력
	 * 사용자가 0ㅇ을 입력할때까지 반복적으로 입력받고 구구단을 출력
	 */
	public static void main(String[] args) {
		int i, g;
		Scanner sc = new Scanner(System.in);
		
		/*
		while (true) {
			i = 1;
			System.out.print("출력할 구구단의 단 입력 (종료:0) : ");
			g = sc.nextInt();
			
			if (g > 0) {
				while (i <= 9) {
					System.out.printf("%d x %d = %d\n", g, i, g*i++);
				}
				System.out.println();
			} else break;
		}
		*/
		
		/*
		System.out.print("출력할 구구단의 단 입력 (종료:0) : ");
		g = sc.nextInt();
		
		while (g != 0) {
			i = 1;
			while (i <= 9) {
				System.out.printf("%d x %d = %d\n", g, i, g*i);
				i++;
			}
			
			System.out.print("\n출력할 구구단의 단 입력 (종료:0) : ");
			g = sc.nextInt();
		}
		*/
		
		System.out.print("출력할 구구단의 단 입력 (종료:0) : ");
		g = sc.nextInt();
		
		while (g != 0) {
			for (i = 1; i <= 9; i++)
				System.out.printf("%d x %d = %d\n", g, i, (g*i));
			System.out.print("\n\n출력할 구구단의 단 입력 (종료:0) : ");
			g = sc.nextInt();
		}
		System.out.println("\n프로그램이 종료되었습니다.");
	}

}
