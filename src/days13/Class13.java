package days13;
class PersonB {
	private int age;
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	PersonB() {}
}
/*
 * 클래스 내부에 생성자를 꺼내어 따로 정의하지 않으면,
 * 컴파일러는 자동으로 클래스 내부에 숨어있는 디폴트 생성자를 호출합니다.
 * 디폴트 생성자 : PersonB(){}와 같이 생긴, 메모리 할당 외에 아무일도 하지않는 생성자
 * 아래와 같이 내용없이 생성자를 따로 정의하는 것은, 따로 생성자를 기술하지 않는 것과 같습니다.
 */
public class Class13 {
	public static void main(String[] args) {
		PersonB b = new PersonB();
	}
}
