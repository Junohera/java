package days05;

public class ControllOp_For02 {

	public static void main(String[] args) {
		int i;
		// 1부터 100사이의 정수 출력
		System.out.println("정수 출력-------------------------------------------");
		for (i = 1; i <= 100; i++) {
			System.out.printf("%d ", i);
			if (i % 20 == 0) System.out.println(); // System.out.printf("\n");
		}
		System.out.printf("\n반복 실행후의 i 변수 값 : %d\n", i);
		
		System.out.println("\n 1부터 100사이의 짝수 출력 1----------------------");
		for (i = 1; i <= 100; i = i + 1) {
			if ((i % 2) == 0) System.out.printf("%d\t", i);
			if ((i % 20) == 0) System.out.println();
		}
		System.out.println("\n 1부터 100사이의 짝수 출력 2----------------------");
		for (i = 2; i <= 100; i = i + 2) {
			System.out.printf("%d\t", i);
			if ((i % 20) == 0) System.out.println();
		}
		System.out.println("\n 1부터 100사이의 홀수 출력 1----------------------");
		for (i = 1; i <= 100; i = i + 1) {
			if ((i % 2) == 1) System.out.printf("%d\t", i);
			if ((i % 20) == 0) System.out.println();
		}
		System.out.println("\n 1부터 100사이의 홀수 출력 2----------------------");
		for (i = 1; i <= 100; i = i + 2) {
			System.out.printf("%d\t", i);
			if (((i+1) % 20) == 0) System.out.println();
		}
	}

}
