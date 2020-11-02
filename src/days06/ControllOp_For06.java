package days06;

public class ControllOp_For06 {
	
	// 1부터 100 사이의 홀수의 합을 계산하세요.
	public static void main(String[] args) {
		int i, sum = 0;
		
		// 방법 1 ( 모든 수 반복 후 분기 white )
		/*
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				sum += i;
				System.out.printf("1부터 %d 까지의 홀수의 합 : %d\n", i, sum);
			}
		}
		*/
		
		// 방법 2 ( 해당 수만 반복 )
		/*
		for (i = 1; i <= 100; i+=2) {
			sum += i;
			System.out.printf("1부터 %d 까지의 홀수의 합 : %d\n", i, sum);
		}
		*/
		
		// 방법 3 ( 모든 수 반복 후 분기 - 블랙리스트 스킵 )
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0) continue; // i가 짝수이면 더이상 현재 반복을 진행하지 말고, 다음 반복 진행
			sum += i;
			System.out.printf("1부터 %d 까지의 홀수의 합 : %d\n", i, sum);
		}
	}

}
