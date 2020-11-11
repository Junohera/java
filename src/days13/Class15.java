package days13;
class PersonD {
	// 매개변수를 선언하지 않은 디폴트 생성자
	public PersonD() { System.out.println("PersonD 클래스의 디폴트 생성자 호출"); }
	// int 타입을 매개변수로 지정한 생성자
	public PersonD(int i) { System.out.println("PersonD 클래스의 int 타입 매개변수를 전달받는 생성자 호출"); }
	// double 타입을 매개변수로 지정한 생성자
	public PersonD(double d) { System.out.println("PersonD 클래스의 double 타입 매개변수를 전달받는 생성자 호출"); }
}
public class Class15 {
	public static void main(String[] args) {
		PersonD d1 = new PersonD();
		PersonD d2 = new PersonD(10);
		PersonD d3 = new PersonD(10.23);
	}
}
