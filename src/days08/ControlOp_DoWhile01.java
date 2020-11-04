package days08;

import java.util.Scanner;

public class ControlOp_DoWhile01 {

	public static void main(String[] args) {
		int i;
		for(i = 11; i<= 10; i++) {
			System.out.printf("%d ", i);
		}
		System.out.println("\tfor 반복 종료후 값 : " + i);
		i = 11;
		while (i<=10) {
			System.out.printf("%d ", i);
			i++;
		}
		System.out.println("\twhile 반복 종료후 값 : " + i);
		i = 11;
		do {
			System.out.printf("%d ", i);
			i++;
		} while (i <= 10);
		System.out.println("\tdo-while 반복 종료후 값 : " + i);
		
		// do ~ while 반복문을 활용하여
		// 사용자가 100을 입력할 때까지 반복해서 입력받으세요.
		
		Scanner sc = new Scanner(System.in);
		int input;
		do {
			System.out.print("정수를 입력 : ");
			input = sc.nextInt();
		} while (input != 100);
		System.out.println("프로그램 종료");
	}

}
