package days15;
// 접근지정자와 상속
// 브무클래스의 private 멤버는 아무리 자식 클래스라고 하더라도 접근할 수 없는 멤버입니다.
class SuperA {
	private int n1; // private : 현재 클래스 내에있는 멤버 method를 통해서만 접근 가능한 완전 은닉 멤버변수
	public int n2; // 현재 클래스 및 다른 클래스에서 자유롭게 접근 가능한 접근지정자
	int n3; // 표시없는 디폴트 접근 지정자 : 동일한 패키지 내부에서는 public으로 동작, 다른 패키지에서는 private으로 동작
	public int getN1() { return n1; }
}
class SubA extends SuperA {
	public void printInfo() {
		// 부모클래스의 private멤버에 접근할 수 없음
		// System.out.println(this.n1); // 에러 : The field SuperA.n1. is not visible
		// 부모클래스의 public 멤버로만 접근할 수 있음. getN1()
		
		/*public int getN1() { return n1; }*/
		// 에러 : 부모클래스의 private 멤버 변수는 자식클래스의 public method로도 접근이 불가합니다.
		
		// public 으로 선언한 부모 멤버 변수는 자식 클래스에서도 자유롭게 접근 가능합니다.
		System.out.println(this.n2);
		
		// 동일한 패키지이므로 디폴트 접근지정자로 선언된 부모의 멤버에 접근할 수 있습니다.
		System.out.println(this.n3);
		
		// public으로 선언된 멤버method를 이용하여 부모 클래스의 private멤버에 접근할 수 있습니다.
		System.out.println(this.getN1());
	}
}
public class Extends03 {

	public static void main(String[] args) {
		SubA sub = new SubA();
		sub.printInfo();

	}

}
