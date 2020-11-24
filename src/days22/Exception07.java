package days22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		while (true) {
			try {
				System.out.print("정수를 입력하세요 : ");
				num = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닌 잘못된 타입이 입력되었습니다.");
				// 키보드 버퍼에 남아있는 문자열(엔터 등)의 값을 제거
				sc.next(); // 입력 버퍼를 비움
			}
		}
	}
}
