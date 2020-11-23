package days21;

import java.math.BigInteger;

/*
 * #max #large #int #long #double #BigInteger #factorial
 */
public class Collection04_Wrapper_02 {
	public static void main(String[] args) throws InterruptedException {
		/*double fact = 1;
		
		for (int i = 1; i < 31; i++) {
			fact *= i;
			System.out.println(i + " " + fact);
		}
		*/
		for (int i = 1; i < 1000; i++) {
			System.out.printf("%d!=%s%n", i, calcFactorial(i));
			Thread.sleep(30); // 0.3초의 지연
		}
	}
	
	public static String calcFactorial(int i) {
		String result = null;
		
		BigInteger n = BigInteger.valueOf(i); // 전달된 int형의 i값을 BigInteger로 변환
		// 1부터 n까지의 숫자를 모두 곱셈할것. 그때 필요한 fact변수도 BigInteger로 생성합니다.
		// 초기값 1
		BigInteger fact = BigInteger.ONE; // fact 변수 생성 -> 1초기화
		/*
		 * for (int k = 1; k <= n; k++) {
		 * int k = 1; -> BigInteger k = BigInteger.ONE;
		 * k <= n; -> k.compareTo(n) <= 0;
		 * k++ -> k.add(BigInteger.ONE);
		 * fact *= k; -> fact.multiply(k);
		 */
		for (BigInteger k = BigInteger.ONE; k.compareTo(n) <= 0; k = k.add(BigInteger.ONE)) {
			fact = fact.multiply(k);
		}
		result = fact.toString();
		return result;
	}
}
