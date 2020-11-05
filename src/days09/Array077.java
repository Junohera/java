public class Array077 {

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
		int max = 10;
		int [] a = new int[max];
		int [] b = new int[max];
		int [] c = new int[max];
		
		for (int i = 0; i < max; i++) {
			a[i] = (i+1)*3;
			b[i] = (i+1)*5;
			c[i] = a[i] + b[i];
			System.out.printf("[%d] a:%2d b:%2d c:%2d\n", i, a[i], b[i], c[i]);
		}
	}

}
