package days13;
class PersonC {
	private int age;
	/*
	 * 생성자는 메서드이므로 매개변수를 사용할 수 있습니다.
	 * 1. 생성자의 매개변수를 활용하는 경우 각각의 객체마다 서로 다른 값을 가질 수 있습니다.
	 */
	PersonC () { this.age = 60; } // 4. 생성자 메서드 오버로딩을 통해 없어진 디폴트 생성자 문제를 해결할 수 있습니다.
	PersonC (int age) { this.age = age; }
	
	public int getAge() {return age;}
	public void setAge(int age) { this.age = age; }
}
public class Class14 {
	public static void main(String[] args) {
		PersonC c1 = new PersonC(20);
		PersonC c2 = new PersonC(30);
		System.out.println("Person 1의 나이 : " + c1.getAge());
		System.out.println("Person 2의 나이 : " + c2.getAge());
		/*
		 * 2. 클래스 내부에 매개변수를 갖든 안갖든, 생성자가 정의가 되면 숨어 있던 디폴트 생성자는
		 * 		정의된 생성자로 대체되고 없어집니다.
		 * 3. 디폴트 생성자가 없어졌으므로 아래는 에러입니다.
		 * 		PersonC c3 = new PersonC();  // X 에러
		 */
		
		PersonC c4 = new PersonC(); // 5. 디폴트 생성자가 생겼으므로 이는 정상 실행됩니다.
		System.out.println("Person 4의 나이 : " + c4.getAge());
	}
}
