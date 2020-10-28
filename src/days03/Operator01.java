package days03;

// 사(오)칙연산자 +, -, /, *, %
// 관계연산자-비교연산자 >, <, >=, <=, ==, !=
// 논리연산자 &&, ||, !
public class Operator01 {

	public static void main(String[] args) {
		// 산술연산자 +, -, *, /, %
		int n1 = 10;
		int n2 = 7;
		int result1;
		double result2, result3;
		result1 = n1 + n2;
		System.out.println(n1 + " + " + n2 + " = " + result1);
		result1 = n1 - n2;
		System.out.println(n1 + " - " + n2 + " = " + result1);
		result1 = n1 * n2;
		System.out.println(n1 + " x " + n2 + " = " + result1);
		result2 = n1 / (double)n2;
		System.out.println(n1 + " / " + n2 + " = " + result2);
		// 1.4285714285714286를 println을 이용해서 소수점 둘째 자리까지 만들고 싶을 때
		// 1.4285714285714286 * 100 -> 142.85714285714286
		// (int)142.85714285714286 -> 142
		// 142 / 100.0 -> 1.42
		result3 = (int)(result2*100) / 100.0;
		System.out.println(n1 + " / " + n2 + " = " + result3);
		result1 = n1 % n2;
		System.out.println(n1 + " % " + n2 + " = " + result1);
		
		// 산술연산자 사용시 주의사항
		// 정수(byte 또는 short 포함)와 정수의 산술 연산이 일어나면 결과 값은 int 타입이 됩니다.
		// 아래와 같이 byte, short 타입의 변수에 산술연산의 결과를 대입받는 경우 컴파일 에러 발생
		byte b1 = 10;
		byte b2 = 5;
		// byte b3 = b1 + b2; 에러
		// 아래와 같이 연산의 결과를 byte 및 short 변경하여 대입할 수 있습니다.
		byte b3 = (byte)(b1 + b2);
		
		// 형변환 연산자를 자료형간의 호환이 가능한 데이터에만 사용할 수 있습니다.
		// 그 외에는 별도의 형변환 메서드나 연산이 필요합니다.
		double d1 = 1.23456;
		int a = (int)d1; // a변수에 소수점이 없어진 1 저장
		double d2 = (double)a; // d2변수에 1.0 저장
		String str = "123456";
		// int a = (int)str; 에러 - 잘못된 예 int 와 String 사이에는 형변환 호환성이 없습니다.
		int b = Integer.parseInt(str); // 올바른 예 - 문자열을 정수로 변환하는 메소드 사용
		
		// String 데이터와 숫자 데이터의 크기 비교
		// 1234, 998 두개의 숫자중 큰 숫자는 1234 입니다.
		// "1234", "998" 두개의 문자중 큰 문자는 "998"입니다.
	}

}
