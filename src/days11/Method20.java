package days11;

public class Method20 {

	public static void main(String[] args) {
		// clac method 생성 (전달된 문자열에 따라 입력된 숫자들의 평균 또는 합계를 출력하는 method)
		calc("합계", 98, 78, 45, 12, 23, 87, 69, 59);
		System.out.println();
		calc("평균", 98, 78, 45, 12, 23, 32, 98, 63, 25, 87);
	}
	
	public static void calc(String op, int ... numbers) {
		if ("합계".equals(op))
			System.out.printf("%s 결과 : %d", op, sum(numbers));
		else if ("평균".equals(op))
			System.out.printf("%s 결과 : %.1f", op, sum(numbers) / (double)numbers.length);
	}
	
	public static int sum(int ... is) {
		int total = 0;
		for (int n : is) total += n;
		return total;
	}

}
