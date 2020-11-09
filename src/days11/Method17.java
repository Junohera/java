package days11;

public class Method17 {

	public static void main(String[] args) {
		// 메서드 오버로딩
		// 메소드의 이름은 같고, 매개변수의 타입, 개수, 순서가 다르면 서로 다른 메소드로 인지하는 문법
		// 일관된 메소드 이름을 사용하여 사용자에게 직관적인 이름을 사용하게 합니다.
		// 전달인수(매개변수)의 자료형, 순서 등이 서로 달라도 가능
		int a = max(11, 33);
		System.out.println("두 개의 정수 중 큰 값 " + a);
		a = max(11, 33, 77);
		System.out.println("세 개의 정수 중 큰 값 " + a);
		a = max(1001, 33, 77, 99);
		System.out.println("네 개의 정수 중 큰 값 " + a);
		// 메소드 오버로딩의 예
		System.out.println(10);
		System.out.println(1.1);
		System.out.println("Hello");
	}
	public static int max(int n1, int n2, int n3, int n4) {
		return max(n1, n2) > max(n3, n4) ? max(n1, n2) : max(n3, n4);
	}
	public static int max(int n1, int n2, int n3) {
		return max(n1, n2) > n3 ? max(n1, n2) : n3;
	}
	public static int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}

}
