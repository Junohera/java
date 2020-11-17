package days17;
// 부모 인터페이스
interface InterD {
	public abstract void interDTest();
}
// 부모 클래스
abstract class SuperD {
	public abstract void superDTest();
}
// 클래스와 인터페이스를 동시에 다중 상속 받을 수 있습니다.
// class 자식 클래스명 extends 부모클래스명 implements 부모인터페이스명
class SubD extends SuperD implements InterD {
	@Override
	public void interDTest() {	}
	@Override
	public void superDTest() {}
}
public class Interface04 {
	public static void main(String[] args) {
	}
}
