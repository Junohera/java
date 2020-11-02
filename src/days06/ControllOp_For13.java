package days06;

public class ControllOp_For13 {

	public static void main(String[] args) {
		/*
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=10; j++) {
				System.out.printf("%d x %d = %d  ", i, j, i*j);
			}
			System.out.println();
		}
		*/
		
		// 1. 1~10단의 구구단중 1단 제거
		// 2. 1부터 10까지의 구구단이 아닌 1~9까지의 구구단으로 수정
		// 3. i와 j의 위치를 바꿔서 출력모양을 변경
		// 4. %2d를 사용해서 출력 내용 줄맞춤
		/*
		for (int i=1; i<=9; i++) {
			for (int j=2; j<=9; j++) {
				System.out.printf("%d x %d = %2d  ", j, i, i*j);
			}
			System.out.println();
		}
		*/
		
		// 5. 윗부분에 2단부터 5단까지, 아래부분에 6단부터 9단까지를 나눠 출력
		for (int i=1; i<=9; i++) {
			for (int j=2; j<=5; j++) {
				System.out.printf("%d x %d = %2d  ", j, i, i*j);
			}
			System.out.println();
		}
		System.out.println();System.out.println();
		for (int i=1; i<=9; i++) {
			for (int j=6; j<=9; j++) {
				System.out.printf("%d x %d = %2d  ", j, i, i*j);
			}
			System.out.println();
		}
	}

}
