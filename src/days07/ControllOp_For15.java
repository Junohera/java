package days07;

public class ControllOp_For15 {

	/*
	 * 1부터 100 사이에 있는 소수(prime number)를 출력하세요.
	 * 
	 * 1 : 1부터 1까지의 숫자를 이용하여 i값 1을 나눈 나머지를 계산하고 결과가 0인경우가 두번 이었는지...
	 * 2 : 1~2를 이용하여 나눈 나머지를 계산하고 결과가 0인경우가 두번 이었는지 그 이상이었는지 검사
	 */
	public static void main(String[] args) {
		int i, j;
		int count = 0, limit = 100;
		
		for(i = 1; i <= limit; i++) {
			count = 0;
			for (j = 1; j <= i; j++) {
				if (i % j == 0) {
					if (i > j)
						count++;
					else if (count == 1)
						System.out.printf("%d ", j);
				}
			}
		}
		
System.out.println();
		
		for (i = 1; i <= limit; i++) {
			count = 0; // 새로운 i값이 등장했다면, 처음부터 다시 카운트해야하므로 0을 대입
			
			for (j = 1; j <= i; j++) {
				if (i % j == 0) count++;
			}
			
			if (count == 2) System.out.printf("%d ", i);
			if (i % 100 == 0) System.out.println();
		}
		
System.out.println();
		
		for (i = 1; i <= limit; i++) {
			count = 0;
			
			for (j = 2; j <= i - 1; j++) {
				if (i % j == 0) count++;
			}
			
			if (count == 0) System.out.printf("%d ", i);
			if (i % 100 == 0) System.out.println();
		}
		
		for (i = 1; i <= limit; i++) {
			count = 0;
			
			for (j = 2; j <= i/2; j++) {
				if (i % j == 0) count++;
			}
			
			if (count == 0) System.out.printf("%d ", i);
			if (i % 100 == 0) System.out.println();
		}
		
		
		
		

	}
	// 36

}
