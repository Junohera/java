package days15;
/*
 * method 오버라이딩
 * 1. method의 이름이 동일해야 합니다.
 * 2. method의 매개변수의 타입, 개수, 순서가 다를경우 같은 이름의 method라도 다른 method로 인식합니다. 
 * 3. 상속관계에서만 사용할 수 있습니다.
 * 4. 부모클래스의 method의 원형과 반드시 일치해야합니다. (리턴값의 타입, method 이름, 매개변수)
 * 5. 접근지정자는 축소될 수 없습니다. (다형성의 구현때문에...)
 * 6. 부모클래스의 final로 정의된 method는 오버라이딩 할 수 없습니다.
 */
class Animal2 {
	public void crying() { System.out.println("소리를 냅니다"); }
}
class Dog2 extends Animal2 {
	public void crying() { super.crying(); System.out.println("멍멍~"); }
}
class Cat2 extends Animal2 {
	public void crying2() { super.crying(); System.out.println("야옹~"); }
	// method의 이름이 다르므로 method 오버라이딩이 아닙니다.
}
public class MethodOverriding2 {
	public static void main(String[] args) {
		Dog2 d = new Dog2();
		Cat2 c = new Cat2();
		// method가 오버라이드 되지 않은 Cat2클래스의 crying()method는 부모 클래스 method가 실행됩니다.
		d.crying();
		c.crying();
		// 클래스의 외부에서는 super 키워드를 통한 부모클래스의 method 호출이 제한됨
		// d.super.crying(); 에러
		Animal2 a = d; // Animal2 a = new Dog();
		a.crying();
		// method 오버라이딩과 다형성 구현
		// 부모클래스의 레퍼런스는 자식클래스의 객체를 참조할 수 있습니다.
		// 이때 부모클래스는 자식클래스의 오버라이딩된 method를 호출할 수 있습니다.
		// 부모클래스의 레퍼런스에 자식 클래스의 레퍼런스를 전달하여 사용하는 경우
		// 자식클래스에 새롭게 정의된 멤버필드는 접근할 수 없지만, 오버라이딩된 method는 접근 가능하며,
		// 오히려 우선 실행됩니다.
	}
}
