package days13;
/*
 * #overload #this #constructor  
 * this의 용도 1
 * 멤버메서드내에 존재하면서, 메서드를 호출하는 호출객체의 레퍼런스값을 저장하는 숨어있는 레퍼런스 변수
 * this의 용도 2
 * 오버로딩된 형제 생성자를 재호출하기 위한 호출 이름. 반드시 호출하는 형태(매개변수형태)대로
 * 생성자가 오버로딩 되어있어야 함.
 */
class ThisB {
	private int num1;
	private int num2;
	private int num3;
	
	ThisB (int num1) {
		this.num1 = num1;
	}
	ThisB (int num1, int num2) {
		this(num1);
		this.num2 = num2;
	}
	ThisB (int num1, int num2, int num3) {
		this(num1, num2);
		this.num3 = num3;
	}
}
public class Class19 {
	public static void main(String[] args) {
		ThisB b1 = new ThisB(10);
		ThisB b2 = new ThisB(10, 20);
		ThisB b3 = new ThisB(10, 20, 30);
	}
}
