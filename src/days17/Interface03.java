package days17;
interface InterC_Super1 { public abstract void interC1Test(); }
interface InterC_Super2 { public abstract void interC2Test(); }
// 인터페이스의 상속 : 인터페이스끼리 부모, 자식, 상속의 관계를 생성할 수 있습니다.
interface InterC extends InterC_Super1 {
//	public abstract void interC1Test(); // 상속 받은 추상메서드
	public abstract void interC2Test();
}
// 인터페이스끼리의 상속은 extends키워드를 사용하여 상속받습니다.
// 상속을 받은 인터페이스는 추상메서드를 물려받은 상태이므로 추상메서드를 오버라이드 하지 않습니다.
// implements 라는 키워드는 상속받은 인터페이스를 구현하여 새로운 클래스를 만들겠다는 뜻이며
// extends 라는 말과 구분됩니다. 인터페이스를 상속(extends)받은 인터페이스는 그자체도
// 인터페이스 이므로 다른 클래스에게 implements될 준비만 하면 됩니다. 구현, 오버라이드하지않습니다.

// 인터페이스끼리의 상속은 복수개의 상속이 가능합니다.
interface InterC_Sub extends InterC_Super1, InterC_Super2 {
	// public abstract void interC1Test(); 상속받은 추상메서드
	// public abstract void interC2Test(); 상속받은 추상메서드
	public abstract void interCSubTest();
}

// 클래스에서 다수개의 인터페이스를 구현할 수 있습니다.
// class 자식클래스명 implements 인터페이스명1, 인터페이스명2 ...
class Sub_C1 implements InterC_Super1, InterC_Super2 {
	public void interC2Test() {}
	public void interC1Test() {}
}

// 인터페이스간 상속을 구현하고 있는 인터페이스를 클래스에서 구현하는 경우 부모인터페이스의
// 추상메서드를 포함하여 모든 추상메서드를 오버라이딩해야됩니다.
class Sub_C2 implements InterC_Sub {
	public void interC1Test() {}
	public void interC2Test() {}
	public void interCSubTest() {}
}
public class Interface03 {
	public static void main(String[] args) {
		// 부모인터페이스의 레퍼런스 변수에 자식클래스의 객체를 대입
		InterC_Super1 s1 = new Sub_C2();
		InterC_Super2 s2 = new Sub_C2();
		InterC_Sub s3 = new Sub_C2();
		// 인터페이스를 다중 상속한 경우 부모 인터페이스는 자신의 추상메서드만을 접근할 수 있습니다.
		s1.interC1Test();
		s2.interC2Test();
		// s1.interC2Test(); 에러 - 다른 인터페이스의 추상메서드
		// s2.interC1Test(); 에러 - 다른 인터페이스의 추상메서드
		s3.interC1Test();
		s3.interC2Test();
		s3.interCSubTest();
	}
}