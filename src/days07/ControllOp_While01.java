package days07;

import java.util.Scanner;

public class ControllOp_While01 {

	public static void main(String[] args) {
		// while 반복문
		// for 반복문은 정해진 횟수의 반복을 괄호안에 미리 정의 해놓고 반복하는 특징이 있는 것
		// while 문은 정해지지 않은 횟수의 반복을 처리하는데 주로 사용
		// 특정 조건이 만족할때까지 무한 수행
		
		int i;
		for (i = 1; i <= 10; i++) {
		}
		// ---------------------------------
		while (i <= 10) {
			
		}
		// 괄호안의 관계연산식의 참/거짓 유무를 먼저 판단한 후 반복을 계속할지 결정합니다.
		// 따라서 위의 문장은 i값이 어떤값이냐에 따라 한번도 실행안될 수도 있고, 무한히 실행될수도 있습니다.
		
		i = 1;
		while (i <= 10) {
			i++;
		}
		// ---------------------------------
		i = 1;
		for( ; i <= 10; ) {
			i++;
		}
		// ---------------------------------
		i = 1;
		for( ; ; ) {
			i++;
			if (i > 10) break;
		}
		// ---------------------------------
		i = 1;
		while (true) {
			i++;
			if (i > 10) break;
		}
		
		// while문의 경우 위에서 코딩한 것처럼 i++ 명령에 의해 반복 유지유무가 결정되는 것보단
		// 특정 조건에 의해 순서와 상관없이 반복이 결정되는 상황에 더 적절히 사용됩니다.
		Scanner sc = new Scanner(System.in);
		System.out.printf("메뉴 선택 : 1(저장), 2(불러오기), 3(종료)");
		int input = sc.nextInt();
		while (input != 3) {
			System.out.printf("메뉴 선택 : 1(저장), 2(불러오기), 3(종료)");
			input = sc.nextInt();
		}
	}

}
