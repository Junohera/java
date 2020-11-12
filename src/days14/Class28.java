package days14;
/*
 * #singleton #design #싱글톤 #싱글턴 #Singleton #pattern
 * 싱글턴 패턴
 * 특정 클래스의 객체를 반드시 한개만 생성할 수 있도록 강제하는 패턴
 * 멤버필드값이 객체들간 스태틱 변수가 아니면서 일관된 값을 가져야하고, 객체도 둘 이상 더 만들필요가
 * 없다면, 하나의 객체(인스턴스)를 공유하여 사용하는 싱글턴 방식이 사용됩니다.
 */

/*
 * 싱글턴 패턴을 구현하는 단계 1 : 생성자(Constructor) 메서드를 private으로 보호합니다.
 * 싱글턴 패턴을 구현하는 단계 2 : 클래스 내부에서 생성자를 호출해서 객체 하나를 생성합니다.
 * 											 이 객체도 private으로 보호합니다. 그리고 static으로 선언합니다.
 * 											 이 객체는 클래스 내부에서 생성하는 것이기 때문에 private과 상관없이 생성이 (생성자 호출)가능합니다.
 * 	싱글턴 패턴을 구현하는 단계 3 : 생성해놓은 객체의 참조변수값을 리턴하는 public형의 메서드를 생성합니다.
 * 											 메서드 이름 getInstance() - static으로 생성합니다.
 */
class SingletonEx {
	int n1;
	int n2;
	private SingletonEx() {} // 1
	private static SingletonEx ist = new SingletonEx(); // 2
	public static SingletonEx getInstance() { return ist; } // 3
	/*
	 * 생성자가 private으로 보호되어 main메서드 안에서 new SingletonEx()로 새로운 객체 생성이 되지않습니다.
	 * SingletonEx s1 = new SingletonEx(); 에러
	 * 싱글턴 방식은 클래스내부에 유일한 객체(ist)를 생성해두고 (private static으로 생성)
	 * public static으로 만들어진 getInstance() 메서드를 호출하고 ist를 리턴받아 객체를 사용합니다
	 * 생성자 메서드는 static 인스턴스 ist만들때 최초 실행된 때 말고는 실행되지 않습니다.
	 */
}
public class Class28 {
	public static void main(String[] args) {
		// SingletonEx s1 = new SingletonEx(); 에러 - 생성자가 private으로 보호됬습니다.
		SingletonEx s1 = SingletonEx.getInstance();
		SingletonEx s2 = SingletonEx.getInstance();
		SingletonEx s3 = SingletonEx.getInstance();
		s1.n1 = 150;
		System.out.println(s2.n1);
		System.out.println(s1); // 객체의 참조 변수를 print하면 '클래스이름@해쉬코드'가 출력됨
		System.out.println(s2);
		System.out.println(s3);
		/*
		 * 싱글턴 패턴이 구현된 클래스의 활용
		 * 날짜, 시간에 관련된 정보를 제공하는 Calendar :
		 * 클래스 싱글턴 패턴이 구현되어 new 인스턴스를 사용하여 객체를 생성할 수 없습니다.
		 * 반드시 getInstance메서드를 사용하여 객체를 반환받아야 합니다.
		 */
	}
}
