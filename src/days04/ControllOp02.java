package days04;

import java.util.Scanner;

public class ControllOp02 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		a = sc.nextInt();
		
		if (a > 0) {
			System.out.println("입력한 정수는 양수입니다.");
		}
		if (a < 0) {
			System.out.println("입력한 정수는 음수입니다.");
		}
		if (a == 0) {
			System.out.println("입력한 정수는 0입니다.");
		}
		
		if (a > 0) {
			System.out.println("입력한 정수는 양수입니다.");
		} else {
			if (a < 0) {
				System.out.println("입력한 정수는 음수입니다.");
			} else {
				System.out.println("입력한 정수는 0입니다.");
			}
		}
		
		if (a > 0) {
			System.out.println("입력한 정수는 양수입니다.");
		} else if (a < 0) {
			System.out.println("입력한 정수는 음수입니다.");
		} else {
			System.out.println("입력한 정수는 0입니다.");
		}
	}

}
