package days05;

public class ControllOp_For04 {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		// sum = 1+2+3+4+5+6+7+8+9+10;
		
		for (i = 1; i <= 100000; i++) {
			sum += i;
			System.out.println("1부터 " + i + "까지의 합은 " + sum + "입니다");
		}
	}

}
