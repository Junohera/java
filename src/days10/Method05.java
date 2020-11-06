package days10;

public class Method05 {
	/*
	 * 매개변수의 역할
	 * Call By Value 방식의 메소드 호출
	 * 메소드를 호출할 때 전달하는 매개변수가 값인 경우를 의미 (int, float, double)
	 * 아래의 updateValue 메소드를 실행하기 위해
	 * main메소드의 num 변수가 가진 10을 매개변수에게 넘겨주고, updateValue 메소드에서
	 * 해당 값을 100으로 수정했지만, main 메소드 num 변수의 값은 변경되지 않습니다. 
	 * 값만을 전달하는 메소드(Call By Value) 호출이었기 때문에...
	 * 1. 메소드의 매개변수는 지역변수입니다.
	 * 2. 서로 다른 메소드에서는 동일한 이름의 변수를 생성하는 것이 가능, 이는 서로 독립적이고 이름만 같은
	 * 별도의 변수들입니다.
	 */
	public static void updateValue(int num) {
		num = 100;
		System.out.printf("updateValue num -> %d\n", num);	// 100
	}
	public static void main(String[] args) {
		int num = 10;
		System.out.printf("main num -> %d\n", num);	// 10
		updateValue(num);
		System.out.printf("main num -> %d\n", num);	// 10
	}

}
