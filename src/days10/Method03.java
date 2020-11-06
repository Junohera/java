package days10;

public class Method03 {
	/*
	 * 매개변수 : 메서드 호출시 메서드가 필요로하는 데이터를 전달해줄 수 있는 매개역할의 변수
	 * 매개 변수의 선언
	 * public static void 메서드이름(자료형 매개변수, 자료형 매개변수, ...) {
	 * } 매개 변수 또한 필요한 갯수 만큼 선언해서 사용할 수 있습니다.
	 */
	
	// 아래 메서드는 메서드 실행을 위해 정수형 값하나를 매개변수로 전달 받는 형태로 선언
	public static void myPrint(int n) {
		System.out.println("전달받은 매개변수의 값 n -> " + n);
	}
	
	// 아래 메서드는 다수의 매개변수를 전달 받는 메서드의 형태 - 각 매개변수 별로 전달받을 변수를 선언합니다.
	// 동일한 타입이더라도 자료형의 생략은 허용되지 않습니다. (int n1, n2) X
	public static void myPrintWith2Int(int n1, int n2) {
		System.out.println("전달받은 매개변수의 값 n1 -> " + n1 + ", n2 -> " + n2);
	}
	
	public static void main(String[] args) {
		myPrint(100);
		myPrint(200);
		myPrintWith2Int(300, 400);
		// 전달인수는 반드시 매개변수의 자료형과 일치하는 자료를 전달해줘야합니다.
		// 다수개의 값을 전달할때는 자료형과 순서도 일치하게 전달해줘야 합니다.
		// 매개변수 acd(int x, double y) 전달인수 abc(300.0, 500) X
	}

}
