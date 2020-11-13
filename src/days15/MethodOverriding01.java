package days15;
/*
 * 상속 문법
 * 각각의 클래스에서 발견되는 공통 변수, 메소드등을 하나의 클래스로 선언하여 물려받는 문법
 * 상속은 모든 클래스의 공통되는 속성, 기능을 정의된 부모클래스를 자식클래스에게 물려주는 방식
 * 부모클래스 정의되는 속성, 또는 기능들은 모든 자식클래스에서 동작해야 하므로 일반적인 정의만 사용할 수 있습니다.
 * 또한 상속 받은 메서드들은 자식 클래스의 생성 목적이나 용도에 따라 사용이 어울리지 않은 메서드일 가능성이 있습니다.
 */
class Animal {
	public void crying() {
		System.out.println("소리를 냅니다.");
	}
}
class Dog extends Animal {
	public void crying() { // 부모 클래스의 메서드중 구현할 기능의 메서드를 같은 이름의 메서드로 재정의
		System.out.println("멍멍~");
	}
}
class Cat extends Animal {
	public void crying() { // 부모 클래스의 메서드중 구현할 기능의 메서드를 같은 이름의 메서드로 재정의
		System.out.println("야옹~");
	}
}
public class MethodOverriding01 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.crying();
		Cat c = new Cat();
		c.crying();
	}
}
