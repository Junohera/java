package days15;

// 상위 클래스와 하위클래스 간의 타입 캐스팅
class SuperF {
	int superNum;
	
	public int getSubNum() {
		return this.superNum;
	}
} // 부모클래스

class SubF extends SuperF {
	int subNum;
	// int superNum; (상속받은 멤버필드)
	public int getSubNum() {
		return this.subNum;
	}
} // 자식클래스

public class TypeCasting02 {
	public static void main(String[] args) {
		
		// 부모 클래스의 객체 생성
		SuperF super1 = new SuperF();
		// 자식 클래스의 객체 생성
		SubF sub1 = new SubF();
		
		// 자식 클래스의 레퍼런스 변수 값(또는 자식 클래스의 new Instance 주소값)을 
		// 부모 클래스의 레퍼런스 변수에 저장할 수 있습니다.
		SuperF super2 = sub1;
		// SuperF super2 = new Sub();
		// 또한 자식 인스턴스에 있는 멤버 method 등은 부모 클래스의 멤버에 접근할 권한이 있습니다.
		
		// 반대로 부모 클래스의 레퍼런스 변수 값(또는 new 인스턴스 주소값)을 자식 클래스의 레퍼런스로 대입할 수 는 없습니다.
		// SubF sub2 = super1; // 에러
		// SubF sub2 = new SuperF(); // 에러
		
		// 자식 인스턴스의 주소를 받은 부모 레퍼런스 변수는 변수이름을 이용하여 자식 클래스의 인스턴스에 접근하되
		// 상속해준 부모 클래스의 멤버변수와 멤버 method로만 한정됩니다.
		super2.superNum = 300;
		// 자식클래스의 멤버에는 접근할 수 없음
		// super2.subNum = 10;(에러)
		
		// 부모 클래스 레퍼런스 변수 <- HEAP 영역에 new로 만들어진 자식인스턴스의 주소
		// SuperF super = new SubF();
		// SuperF super; SubF sub = new SubF(); super = sub;
		// super.superNum = 300; O super.subNum = 300; X
		
		/*
		 * 만약 부모클래스의 레퍼런스 변수를 자식클래스의 객체를 참조하려는 경우
		 * 강제 캐스팅을 사용하여 자식클래스의 레퍼런스 변수에 부모의 레퍼런스 값을 대입할 수 있습니다.
		 * Sub sub2 = (SubF)super1; // 현재 에러가 표시되지는 않음 -> 실행시 런타임 에러
		 * 다만 실제 HEAP 저장된 인스턴스의 타입이 자식클래스가 아니면 프로그램 실행중 런타임 에러가 발생되어 프로그래밍이 종료됩니다.
		 * 따라서 부모레퍼런스값을 자식 레퍼런스에 넣을 수 있는 경우를 선별해야 하는데
		 * 현재의 부모 레퍼런스변수가 저장된 주소에 자식 인스턴스가 저장된 경우로 제한합니다.
		 * SubF sub = new SuperF(); X
		 * SubF sub = (SubF)new SuperF(); // 현재 에러는 없지만, 실행시 런타임 에러
		 * SuperF super = new SubF(); SubF sub = (SubF)super; // O 올바른 예
		 * 부모 레퍼런스 <- 자식인스턴스 주소 : 가능
		 * 부모 레퍼런스 <- 부모인스턴스 주소 : 불가능
		 * 자식 레퍼런스 <- (자식클래스자료형)부모레퍼런스 : 문법적 에러는 없지만, 불가능
		 * 자식 레퍼런스 <- (자식클래스자료형)부모레퍼런스 <- 자식 인스턴스의 주소 : 가능
		 */
		
		/*
		 * 강제 캐스팅을 사용한 형변환시 에러를 방지하는 방법
		 * instanceof 연산자
		 * 레퍼런스변수 instanceof 클래스명
		 * 해당 레퍼런스 변수가 실제 참조하는 곳이 우항의 클래스타입인 경우 true 아니면 false반환
		 */
		SuperF super4 = new SuperF();
		if (super4 instanceof SubF) {
			 SubF sub4 = (SubF)super4;
			 System.out.println("형변환 성공~!");
		 } else {
			 System.out.println("형변환을 실행할 수 없습니다.");
		 }

		SuperF super5 = new SubF();
		if (super5 instanceof SubF) {
			 SubF sub4 = (SubF)super5;
			 System.out.println("형변환 성공~!");
		 } else {
			 System.out.println("형변환을 실행할 수 없습니다.");
		 }
		
	}
}
