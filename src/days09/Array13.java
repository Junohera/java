package days09;

import java.util.Random;
import java.util.Scanner;

public class Array13 {

	/*
	 * 야구 게임 프로그램
	 * 상대가 나에게 알려주지 않은 숫자를 질문과 답변을 통해 맞춰가는 게임
	 * 나에게 알려주지않은 숫자 : 657 같은 한자리 숫자 세개 생성
	 * 질문 : 3 6 7 (같은 한자리 숫자 세개 입력받아서 저장된 숫자와 비교)
	 * 답변 : 1S 1B (같은 숫자, 같은 자리수 : S, 같은 숫자 : B로 개수 출력)
	 * 숫자 하나는 0~9까지 세개의 숫자 중 중복 숫자 없음
	 */
	public static void main(String[] args) {
		int [] com = new int[3];
		int [] user = new int[3];
		int s=0, b=0, count=0;
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		// 컴퓨터 최초 3자리 생성
		int i = 0;
		int j = 0;
		for (i = 0; i < 3; i++) {
			com[i] = rd.nextInt();
			
			if (0 > com[i]) com[i] *= -1;
			com[i] %= 10;
			
			for (j = 0; j <= i-1; j++) 
				if (com[j] == com[i]) break;
			if (i != j) i--;
		}
//		System.out.println(com[0] + " " + com[1] + " " + com[2]);
		
		while (s != 3) {
			s=0; b=0;
			// 사용자 입력
			System.out.printf("\n입력(숫자 세자리) : ");
			/* 방법 2
			int input;
			input = sc.nextInt();
			user[0] = (int)input / 100;
			input %= 100;
			user[1] = (int)input / 10;
			input %= 10;
			user[2] = input;
			*/
			/* 방법 3*/
			String userNum;
			userNum = sc.nextLine();
			// String의 charAt은 문자열의 내용중 () 안에 있는 숫자 번째의 한글자를 추출합니다.
			user[0] = userNum.charAt(0) - '0'; // userNum.charAt(0) : "123" -> '1'
			// '1' - '0' -> 1 		아라비아기호들끼리의 뺄셈연산은 아스키코드값들끼리의 연산됩니다.
			user[1] = userNum.charAt(1) - '0'; // userNum.charAt(1) : "123" -> '2'
			// '2' - '0' -> 2
			user[2] = userNum.charAt(2) - '0'; // userNum.charAt(2) : "123" -> '3'
			// '3' - '0' -> 3
			
			for (int u : user) System.out.printf("%d ", u);
			
			// S, B 확인
			for (i = 0; i < com.length; i++) {
				for (j = 0; j < user.length; j++) {
					if (com[i] == user[j]) {
						if (i == j) s++;
						else b++;
					}
				}
			}
			System.out.printf("\n%d Strike %dBall", s, b);
			count++;
		}
		System.out.printf("\n모든 숫자를 맞췄습니다. 프로그램을 종료합니다. 시도횟수 : %d", count);
	}

}
