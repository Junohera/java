package days16;
/*
 * Object 클래스의 equals method : 객체간의 비교를 위해서 사용되는 method
 * Object가 상속한 method들 중 toString과 함께 가장 많이 오버라이딩 되는 method
 */
public class Object03 {
	public static void main(String[] args) {
		// 일반적인 자료형의 변수들 (int, double)은 값의 비교를 위해서 비교연산자(==)를 사용합니다.
		int n1 = 10;
		int n2 = 10;
		if (n1 == n2) System.out.println("n1 변수와 n2 변수는 같습니다.");
		else System.out.println("n1 변수와 n2 변수는 다릅니다.");
		
		// 문자열(String)을 new없이 할당시 이미 HEAP에 같은 문자열이 있을경우, 새로운 메모리공간을 만들지않는다.
		// String s1 = new String("Hello");
		
		// new를 사용하지않고 생성한 객체들간의 비교
		String s1 = "Hello"; 
		String s2 = "Hello"; // s2는 "new를 사용하지 않아서, 별도의 공간이 생기지 않고 기존에 저장되어 있던
		// "Hello"의 주소를 저장합니다.
		if (s1 == s2) System.out.println("s1변수와 s2변수는 같습니다.");
		else System.out.println("s1변수와 s2변수는 다릅니다.");
		// s1 == s2는 Hello가 비교된것이 아니라 저장되어 있는 레퍼런스 값이 비교되었습니다.
		
		/*
		 * new 연산자를 사용하여 객체를 생성하는 경우의 비교
		 * new 연산자의 실행과정
		 * 1. 우항에 위치한 클래스의 객체를 HEAP 메모리에 로딩
		 * 2. 생성자를 실행하여 객체의 초기화를 진행
		 * 3. 생성된 객체의 참조값을 반환
		 */
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		if (s3 == s4) System.out.println("s3변수와 s4변수는 같습니다.");
		else System.out.println("s3변수와 s4변수는 다릅니다.");
		// 참조 변수들의 저장된 주소의 비교이므로 "다릅니다" 실행됩니다.
		
		/*
		 * 위 두개 예제의 결론으로 보건데 문자들과 == 연산은 저장된 문자열이 아니고, 레퍼런스 변수의 주소비교임을
		 * 알 수 있습니다.
		 * 또한 new를 사용하지 않은 String 데이터의 초기화는 이미 저장된 똑같은 문자열 데이터가 있을때
		 * 새로 메모리를 할당하지 않고, 그 문자열의 주소를 새로운 레퍼런스 변수에 저장합니다.
		 * String s1 = "Hello"; String s2 = "Hello"; s1, s2변수는 같은 주소를 저장.
		 */
		
		// 실제 객체의 값을 비교하기 위한 equals method를 사용하면 참조값이 서로 다른 객체의
		// 실제 데이터를 비교하여 동일한 데이터를 가지고 있는지 확인할 수 있습니다.
		if (s3.equals(s4)) System.out.println("(equals사용)s3의 문자열과 s4의 문자열은 같습니다.");
		else System.out.println("(equals사용)s3의 문자열과 s4의 문자열은 다릅니다.");
		/*
		 * equals method는 Object 클래스의 method입니다.
		 * 최초상태는 레퍼런스값(주소)들의 비교를 정의하고 있습니다.
		 * String 클래스는 equals method가 실제값의 비교로 오버라이딩 되어있습니다.
		 * 기타 사용자 정의 클래스에서는 별도로 equals를 실제값으로 비교하도록 오버라이딩 해줘야합니다.
		 */
	}
}
