package days03;

import java.util.Scanner;

public class Variable05 {

	public static void main(String[] args) {
		int num1, num2; // 사용자가 입력한 값을 저장할 변수
		int num3; // 덧셈, 뺄셈, 곱셈의 결과를 저장할 변수
		double num4; // 나눗셈의 결과를 저장할 변수
		
		Scanner sc = new Scanner(System.in); // 화면입력을 위한 준비 코드

		// int, double, char 등 단순변수 : 지정된 자료형의 자료를 저장할 단순변수들
		// Scanner 형의 sc : 단순 자료와 함께 활용할 수 있는 도구들이 함께 들어 있는 복합 변수들
		System.out.println("정수를 입력하세요");		
		num1 = sc.nextInt(); // 화면에서 정수형데이터를 한개 입력 받아서 num1 변수에 저장하는 명령
		
		//System.out.println("입력한 정수값은 " + num1 + "입니다.");
		System.out.println("정수를 하나 더 입력하세요");		
		num2 = sc.nextInt();
		// 컴파일러가 sc.nextInt() 명령을 만나면 커서를 깜빡이면서 사용자에게서 입력이 있을때까지
		// 무한정 대기합니다. 해당 자료 입력후 엔터가 최종 입력되면 다음 명령으로 진행합니다.
		num3 = num1 + num2;
		System.out.printf("%d + %d = %d\n", num1, num2, num3);
		num3 = num1 - num2;
		System.out.printf("%d - %d = %d\n", num1, num2, num3);
		num3 = num1 * num2;
		System.out.printf("%d x %d = %d\n", num1, num2, num3);
		num4 = num1 / (double)num2;
		System.out.printf("%d ÷ %d = %.1f\n", num1, num2, num4);
	}

}
