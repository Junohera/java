package days09;

public class Array08 {

	/*
	 * 배열에 들어있는 값들의 합계와 평균을 계산하여 출력하세요.
	 * int [] a = {56, 87, 96, 87, 45, 89, 69, 36, 13, 98};
	 * 
	 * 출력
	 * 점수 : XX XX XX XX ... XX
	 * 총점 : XXX
	 * 평균 : XX.X
	 */
	public static void main(String[] args) {
		int a [] = {56, 87, 96, 87, 45, 89, 69, 36, 13, 98}, tot = 0;
		System.out.print("점수 :");
		for (int i = 0; i < a.length; i++) {
			System.out.printf(" %d", a[i]);
			tot += a[i];
		}
		System.out.printf("\n총점 : %d", tot);
		System.out.printf("\n평균 : %.1f", tot / (double)a.length);
	}

}
