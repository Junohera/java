package days11;

import java.util.Scanner;

public class Method14 {

	public static void main(String[] args) {
		// 정수를 입력받아 1부터 입력받은 정수까지의 합(sum) 계산 출력
		// 1부터 입력받은 정수까지의 곱(factorial) 출력
		int n;
		int tot, fact;
		n = myInput();
		prn(sum(n), factorial(n), n);
	}
	
	public static int myInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		return sc.nextInt();
	}
	
	public static int sum(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) result += i;
		return result;
	}
	
	public static int factorial(int n) {
		int result = 1;
		for (int i = 2; i <= n; i++) result *= i;
		return result;
	}
	
	public static void prn(int tot, int fact, int n) {
		System.out.printf("1부터 %d까지의 합 : %d\n", n, tot);
		System.out.printf("1부터 %d까지의 곱 : %d\n", n, fact);		
	}

}
