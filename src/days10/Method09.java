package days10;

import java.util.Scanner;

public class Method09 {

	public static void main(String[] args) {
		
		int ban;
		double n, d;
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 ");
		ban = sc.nextInt();
		n = calculate1(ban); // n = ban * ban * 3.141592;
		d = calculate2(ban); // n = 2 * ban * 3.141592;
		prn(n, d);
	}
	public static double calculate1(int ban) {
		double n = 3.141592 * ban * ban;
		
		return n;
	}
	public static double calculate2(int ban) {
		double d = 3.141592 * 2 * ban;
		
		return d;
	}
	public static void prn(double n, double d) {
		System.out.printf("입력한 원의 넓이 : %.1f\n", n);
		System.out.printf("입력한 원의 둘레 : %.1f\n", d);
	}
	

}
