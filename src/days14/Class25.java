package days14;
/*
 * 인스턴스 메서드에서는 인스턴스 변수를 사용할 수 있습니다.
 * 인스턴스 메서드는 스태틱 변수를 사용할 수 있습니다.
 * 인스턴스 메서드는 인스턴스 메서드와 스태틱 메서드 모두를 호출 가능합니다.
 * 스태틱 메서드는 인스턴스를 변수 사용할 수 없습니다.
 * 스태틱 메서드는 스태틱 변수를 사용할 수 있습니다.
 * 스태틱 메서드는 인스턴스 메서드 호출이 불가능하고, 스태틱 메서드는 호출만 가능합니다.
 */
class MemberCall {
	int iv = 10; // 인스턴스 변수 : 객체가 생성될때 iv변수가 생성 -> 10으로 초기화
	static int cv = 20; // 스태틱 변수 : 프로그램이 시작할때 cv가 생성 -> 20으로 초기화
	int iv2 = cv; // 인스턴스 변수 : 객체가 생성될 때 생성 -> 이미 만들어져서 20을 저장하고 있는 값으로 초기화
	// static int cv2 = iv; // 에러 : 언제 생성될지 모를 인스턴스 변수값으로, 스태틱 변수값을 초기화할 수 없음
	static int cv2 = new MemberCall().iv; // 임시방편으로 객체 생성 후 변수를 사용하는 예
	// 억지로라도 인스턴스(멤버)변수로 스태틱 변수의 값을 초기화하고자 한다면 위와 같은 방법을 씁니다.
	// 레퍼런스 변수없는 new 인스턴스를 만들어서 멤버변수 사용.
	
	static void staticMethod() {
		System.out.println(cv); // 스태틱 메서드는 스태틱 필드를 사용할 수 있습니다.
		//System.out.println(iv); // 스태틱 메서드는 인스턴스 변수를 사용할 수 없습니다.
		System.out.println(new MemberCall().iv);
		// 억지로라도 스태틱 메서드가 인스턴스 필드를 사용하려면 객체를 만들고 사용가능
		// instanceMethod1(); // 에러, 스태틱 메서드는 인스턴스 메서드를 호출할 수 없습니다.
		new MemberCall().instanceMethod1();
		// 억지로라도 스태틱 메서드가 멤버 메서드를 호출하려면 객체를 만들고 사용가능
	}
	
	// 인스턴스 메서드는 인스턴스 변수, 스태틱 변수, 인스턴스 메서드, 스태틱 메서드 모두 자유롭게 사용가능
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	void instanceMethod2() {
		staticMethod();
		instanceMethod1();
	}
}
public class Class25 {
	public static void main(String[] args) {
	}
}
