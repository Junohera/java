package days13;
/*
 * 생성자 (Constructor)
 * 클래스의 객체가 생성될 때, 멤버필드의 초기화를 위해서 주로 사용되는 메서드
 * 각각의 객체가 생성될 때, 서로 다른 메모리를 가지는 객체를 생성할 수 있게 합니다.
 * 
 * 생성자의 특징
 * 1. 멤버 메소드입니다.(다소 형태와 사용이 다른 메서드)
 * 2. 클래스의 이름과 동일한 이름을 갖는 메소드입니다.
 * 3. 리턴값이 없는 메소드입니다. (전달인수는 있을 수 있는 메소드입니다.)
 * 4. 따로 정의(생성)하지 않아도 이미 클래스 내부에 존재하는 메서드입니다.
 * 5. 생성자는 각각의 객체가 생성될 때마다 호출되는 메서드입니다. 주로 new와 함께 호출됩니다.
 * 6. 주로 하는 일은 new 와 함께 객체가 저장될 Heap메모리를 할당하고 그 안에 멤버변수를 만드는 일을 합니다.
 */
class PersonA {
	private int age;

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	PersonA() {
		System.out.println("PersonA의 생성자 호출~!");
		this.age = 500;
	}
}
public class Class12 {
	public static void main(String[] args) {
		PersonA a1 = new PersonA();
		// a1.setAge(100);
		System.out.println(a1.getAge());
		
		PersonA a2 = new PersonA();
		a2.setAge(200);
		System.out.println(a2.getAge());
	}

}
