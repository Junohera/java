package days07;

import java.util.Random;
import java.util.Scanner;

public class ControllOp_While04 {

	/*
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random(); // 난수 발생을 위한 위부 도구 import
		
		System.out.printf("가위(1), 바위(2), 보(3) 중 선택 : ");
		int b = sc.nextInt();
		
		while (b > 0 && b < 4) {
			int k = rd.nextInt(); // 난수 발생
			
			if (k < 0) k*=-1; // 음수일 경우, 양수 변환
			k%=3; // 3으로 나눈 나머지
			k++; // 보정
			
			if (b == 1) System.out.printf("나 : 가위 \n");
			else if (b == 2) System.out.printf("나 : 바위 \n");
			else System.out.printf("나 : 보 \n");
			
			if (k == 1) System.out.printf("컴퓨터 : 가위\n");
			else if (k == 2) System.out.printf("컴퓨터 : 바위\n");
			else System.out.printf("컴퓨터 : 보\n");
			
			if (b == 1 && k == 1) System.out.println("비겼습니다");
			else if (b == 1 && k == 2) System.out.println("졌습니다.");
			else if (b == 1 && k == 3) System.out.println("이겼습니다.");
			else if (b == 2 && k == 1) System.out.println("이겼습니다.");
			else if (b == 2 && k == 2) System.out.println("비겼습니다.");
			else if (b == 2 && k == 3) System.out.println("졌습니다.");
			else if (b == 3 && k == 1) System.out.println("졌습니다.");
			else if (b == 3 && k == 2) System.out.println("이겼습니다.");
			else if (b == 3 && k == 3) System.out.println("비겼습니다");
			
			System.out.printf("\n가위(1), 바위(2), 보(3) 중 선택 : ");
			b = sc.nextInt();
		}
		System.out.println("\n\n\n가위바위보 게임을 종료합니다.");
	}

}
