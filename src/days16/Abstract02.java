package days16;
/*
 * 추상 클래스 (Abstract Class)
 * 상속을 통한 다형성의 구현에 강제성을 부여하기 위한 클래스 - 추상메서드를 포함한 클래스
 * 추상 메서드 : 메서드의 원형만 존재하고 실제 내용이 없는 메서드
 */

/*
 * 추상 메서드의 작성 방법
 * 접근지정자 abstract 리턴값의 타입 메서드명(매개변수);
 * 추상 클래스는 일반 클래스와 동일하게 일반 멤버변수 일반 메서드, 생성자 등을 포함할 수 있습니다.
 * 단, 추상메서드를 포함할 수 있는 특징이 추가된 클래스입니다.
 * 추상클래스는 상속을 통한 다형성 구현을 위해서 생성됩니다.
 */

// 추상메서드는 상속한 자식 클래스에서 오버라이드 하지않으면 에러를 발생합니다.

abstract class Animals {
	//추상 메서드 : 메서드의 정의만 있고, 메서드의 body(몸체)구현은 없습니다.
	public abstract void crying();
}
// 추상메서드는 자식클래스에서 새롭게 재정의 될 수 있습니다.
// 추상메서드를 오버라이딩한 자식클래스는 일반클래스로 사용될 수 있습니다.
// 추상클래스를 상속한 자식 클래스가 추상메서드를 오버라이딩 하지 않는다면 에러가 발생합니다. 
class Dogs extends Animals {
	@Override
	public void crying() {
		System.out.println("멍멍!");
	}
}

class Cats extends Animals {
	@Override
	public void crying() {
		System.out.println("야옹!");
	}
}
public class Abstract02 {
	public static void main(String[] args) {
		Animals d = new Dogs();
		Animals c = new Cats();
		d.crying();
		c.crying();
		
		// 추상클래스는 추상메서드가 구현이 안된 상태이므로 추상클래스 형태의 인스턴스는 만들 수 없습니다.
		// Animals ani = new Animals(); 에러
	}
}
