package days15;
class SuperD {
	public SuperD() { // 전달인수 없는 디폴트 생성자
		this(1); // 정수값을 매개변수로 갖는 생성자 호출
		System.out.println("SuperD()"); } 			// 4
	public SuperD(int arg) { // 정수값을 매개변수로 갖는 생성자
		this(1.1); // 실수값을 매개변수로 갖는 생성자 호출
		System.out.println("SuperD(int)"); } 		// 3
	public SuperD(double arg) { // 실수값을 매개변수로 갖는 생성자
		this(""); // 문자열 자료를 매개변수로 갖는 생성자 호출
		System.out.println("SuperD(Double)"); } 	// 2
	public SuperD(String arg) { // 문자열 자료를 매개변수로 갖는 생성자
		// 부모 클래스의 생성자의 최종 마지막이므로 super(), this()도 없습니다.
		System.out.println("SuperD(String)"); } 	// 1
}
class SubD extends SuperD {
	public SubD() { // 전달인수 없는 디폴트 생성자
		this(1); // 정수값을 매개변수로 갖는 생성자 호출
		System.out.println("SubD()");} 		// 8
	public SubD(int arg) { // 정수값을 매개변수로 갖는 생성자
		this(1.1); // 실수값을 매개변수로 갖는 생성자 호출
		System.out.println("SubD(int)");} 		// 7
	public SubD(double arg) { // 실수값을 매개변수로 갖는 생성자
		this(""); // 문자열 자료를 매개변수로 갖는 생성자 호출
		System.out.println("SubD(double)");} 		// 6
	public SubD(String arg) { // 문자열 자료를 매개변수로 갖는 생성자
		super(); // 부모클래스의 디폴트 생성자를 호출
		System.out.println("SubD(String)");} 		// 5
	/*
	 * 모든 자식 생성자는 this와 super중 하나만을 사용할 수 있으며,
	 * this를 사용한 메서드는 super의 사용권한을 호출한 형제 생성자에게 일임합니다.
	 * 따라서 오버로딩된 생성자 중에 반드시 하나 이상의 생성자가 super()를 호출해야합니다.
	 * 둘다 안쓰면 super()가 사용된 것으로 간주합니다.
	 */
}
public class Extends6 {
	public static void main(String[] args) {
		// SuperD s = new SuperD();
		SubD sub = new SubD();
	}
}
