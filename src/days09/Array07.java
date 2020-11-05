package days09;

public class Array07 {

	public static void main(String[] args) {
		// 배열 a, b, c 생성 (각 개수 10개)
		// a배열에는 3의 배수들 10개 저장 - 반복실행문 이용
		// b배열에는 5의 배수들 10개 저장 - 반복실행문 이용
		// c배열에는 a배열과 b배열의 각 같은 인덱스 값들의 합을 저장 - 반복실행문 이용
		// ex) c[3] = a[3] + b[3];
		// 출력
		// a배열 -> 3 6 9 12 15 ...
		// b배열 -> 5 10 15 20 25 ...
		// c배열 -> 8 16 24 32 40 ...
		/*
		int max = 10, a [] = new int[max], b [] = new int[max], c [] = new int[max];
		
		for (int i = 0; i < max; i++) {
			a[i] = (i+1)*3;
			b[i] = (i+1)*5;
			c[i] = a[i] + b[i];
		}
		
		System.out.printf("a배열 ->");
		for (int i = 0; i < a.length; i++) System.out.printf(" %2d", a[i]);
		System.out.printf("\nb배열 ->");
		for (int i = 0; i < b.length; i++) System.out.printf(" %2d", b[i]);
		System.out.printf("\nc배열 ->");
		for (int i = 0; i < c.length; i++) System.out.printf(" %2d", c[i]);
		*/
		
		int [] a = new int[10];
		int [] b = new int[10];
		int [] c = new int[10];
		
		System.out.printf("a배열 ->");
		for (int i = 0; i < a.length; i++) {
			a[i] = (i+1)*3;
			System.out.printf(" %2d", a[i]);
		}
		System.out.printf("\nb배열 ->");
		for (int i = 0; i < b.length; i++) {
			b[i] = (i+1)*5;
			System.out.printf(" %2d", b[i]);
		}
		System.out.printf("\nc배열 ->");
		for (int i = 0; i < c.length; i++) {
			c[i] = a[i] + b[i];
			System.out.printf(" %2d", c[i]);
		}
	}

}
