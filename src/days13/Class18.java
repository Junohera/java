package days13;

/*
 * 클래스의 멤버필드들은 new라는 키워드에 의해서 각각의 객체별로 생성됩니다. (서로 다른 메모리 영역)
 * 반면, 멤버 method는 생성된(오버로딩 포함) method별로 하나만 존재하며 모든 객체들이 공유하게 됩니다.
 * 이때 현재 method를 호출한 객체가 어떤 객체인지 구분하여 실행될 수 있게 this라는 숨겨진 참조변수를 제공합니다.
 */
class ThisA {
	private int num;
	
	public void setNum(int num) {
		this.num = num; // this 에 a1과 a2가 저장하고 있던 주소값을 전달받고, 내부객체처럼 사용 
	}
	/*
	 * this에는 현재 method를 호출한 객체의 참조변수값이 전달되어 저장됩니다.
	 * 매개변수로 선언된 num 변수는 현재 method안에서만 사용되는 지역 변수로만 사용되고 소멸합니다.
	 * 멤버 method에서는 멤버변수에 접근 권한이 있으므로, 참조변수 this와 변수가 (.)으로 연결되어 사용됩니다.
	 */
	public void display() {
		// 보통 멤버변수를 this없이 사용해도 매개변수가 아니라면 아래의 실행 코드는
		// 내부적으로 this가 붙어서 다음과 같이 변환되어 실행됩니다.
		// System.out.printf("num = %d\n", this.num);
		System.out.printf("num = %d\n", num);
	}
	// this의 용도 1 : 멤버method를 호출한 호출객체의 참조변수값(주소값)을 전달받아 사용한다.
	
	public void copy1(ThisA b) { // this <- a4, b <- a2
		this.num = b.num;
	}
	
	public ThisA copy2() { // this <- a1
		ThisA a = new ThisA();
		a.num = this.num;
		return a;
	}
}
public class Class18 {
	public static void main(String[] args) {
		ThisA a1 = new ThisA();
		ThisA a2 = new ThisA();
		a1.setNum(10); // 멤버변수에 전달 인수 값을 저장하기 위한 method 호출
		a2.setNum(20);
		a1.display();
		a2.display();
		
		ThisA a3 = a1; // a1 참조변수 값을 a3에 복사하는 동작
		a3.setNum(100);
		a1.display();
		a3.display();
		
		ThisA a4 = new ThisA();
		// a4 = a2; 카피가 안되는 동작
		a4.copy1(a2);
		ThisA a5 = a1.copy2();
	}
}
