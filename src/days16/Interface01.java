package days16;
/*
 * 인터페이스 : 100% 상속만을 목적으로 만들어진 상속용 클래스
 * 인터페이스 내에서 추상클래스 처럼 멤버 변수, 멤버 메서드를 생성해서 쓸수 없습니다.
 * 추상메서드만 사용가능합니다. (멤버변수 final 변수는 사용가능)  
 */

/*
 * 자바의 언어에서 제공하는 상속 기능은 단일 상속만을 지원합니다.
 * 하나의 클래스는 하나의 부모클래스를 가질 수 있습니다. (여러개의 클래스를 상속할 수 없음)
 * class Sub_A extends Super_A, Super_B { } - 에러
 */

/*
 * 종합적인 규칙과 장단점
 * 다중 상속을 지원하기위한 인터페이스(interface)
 * 인터페이스도 클래스 -> 제약이 있는 클래스
 * 인터페이스는 멤버필드로 public static final 멤버만 가질 수 있습니다.
 * 인터페이스는 멤버메서드로 public abstract 메서드만 가질 수 있습니다.
 * 다중상속이 가능합니다.
 */

// class 만들듯이 생성하며, class란 키워드 대신 interface라는 키워드를 써서 생성합니다.
interface Inter_A {
	// int n1; //에러 - 일반 멤버변수 선언이 제한
	// public inter_A() { } // 에러 - 생성자 선언 제한됨(추상메서드만 생성 가능)
	// public void print() { } // 에러 - 일반메서드 선언 불가 (추상메서드만 생성가능)
	// 인터페이스 내부에 선언할 수 있는 요소
	// public static final 멤버 변수
	public static final int num = 10;
	// public abstract 멤버 메서드
	public abstract void test();
}
// 인터페이스를 구현하는 자식클래스의 선언 class 자식클래스명 implements 부모 인터페이스명
// 인터페이스를 상속(구현)하는 클래스는 상속(구현)할 클래스 앞에 extends대신 implements를 씁니다.
class Sub_A implements Inter_A {
	@Override
	public void test() {
		System.out.println("Sub_A 클래스의 test 메서드 실행");
	}
}
public class Interface01 {
	public static void main(String[] args) {
		Sub_A s = new Sub_A();
		s.test();
	}
}
