package days02;

public class Print04 {
	// println 의 사용
	// println() 와 printf("\n") 는 같은 명령입니다.
	// println 은 출력내용을 모두 출력 후 줄바꿈을 자동으로 해주는 명령입니다.
	
	public static void main(String[] args) {
		//System.out.println() method는 문자열(" "로 묶인 데이터)이 주가된 출력이 아니라
		// 어떤 형식의 자료도 먼저 출력이 가능합니다.
		System.out.println(10); // System.out.printf("%d", 10);
		System.out.println(12.123); // System.out.printf("%.3f", 12.123);
		System.out.println("Java Programming");
		
		// 10과 20의 합은 30입니다.  를 println 을 이용한다면?
		System.out.println("10과 20의 합은 30입니다."); // 방법1
		System.out.println("10과 20의 합은 " + (10+20) + "입니다."); // 방법2
		
		// -- 문자와 숫자의 차이
		//		1. 문자는 " " 로 묶어서 표현하고, 숫자는 그렇지 않은 상태 그대로를 사용합니다.
		//			"123" <- 문자(아라비아기호 일이삼),123 <- 숫자(백이십삼)
		//		2. 문자의 더하기 연산은 이어붙이기기가 되고, 숫자의 더하기 연산은 산술 더하기 연산입니다.
		//			"123" + "123" -> "123123"	123 + 123 -> 246
		//		3. 문자와 숫자의 덧셈연산도 결과는 문자가 되고 이어붙이기 결과가 나옵니다.
		//			"123" + 4 -> "1234"
		System.out.println("Hello World" + 365);
		System.out.println(10 + " + " + 5 + " = " + (10 + 5));
		System.out.println(10 + " + " + 5 + " = " + 10 + 5); // 잘못된 예
		System.out.println("10 + 5" + " = " + (10 + 5));
		System.out.println("10 + 5 = " + (10 + 5));
		System.out.println("10 + 5 = " + 1 + 5);
		System.out.println("10 + 5 = 15");
	}

}
