package days17;

public class String01 {
	public static void main(String[] args) {
		// 0.
		String s = "Hello"; // 가용한 HEAP 공간에 "Hello"를 저장하고 그 주소를 s에 전달
		// 이미 저장된 "Hello"가 있다면 그 주소를 전달합니다.
		System.out.println("0. " + s); // System.out.println("0. " + s.toString());
		
		// 1.
		s = new String("Hello"); // new에 의해 새로운 HEAP공간에 "Hello"를 저장, 그 주소를 s에 전달
		System.out.println("1. " + s); // System.out.println("1. " + s.toString());
		// String클래스는 Object클래스를 상속받고,
		// 이미 toString과 equals가 자신에게 적합하게 오버라이딩 되어있습니다.
		
		// 2.
		char [] c = {'H', 'e', 'l', 'l', 'o'}; // 한글자만을 하나의 데이터로 갖는 char형 배열
		String s2 = new String(c); // 배열주소를 초기값으로 문자열 구성.
		System.out.println("2. " + s2);
		
		// 3.
		String n = "0123456789";
		char c1 = s.charAt(0);
		char c2 = n.charAt(5); // 괄호안에 정수값 번째의 글자를 얻음.(0부터 시작)
		System.out.println("3. " + c1 + " " + c2);
		
		// 4.
		String a1 = new String("ABCD");
		String a2 = new String("BCD");
		String a3 = new String("ABCD");
		System.out.println("4. a1.compareTo(a2) ? " + a1.compareTo(a2));
		System.out.println("4. a2.compareTo(a3) ? " + a2.compareTo(a3));
		System.out.println("4. a1.compareTo(a3) ? " + a1.compareTo(a3));
		
		/*
		 * 문자열간의 비교
		 * 숫자 987보다 숫자1234가 크다고 표현하지만 문자열"987"이 문자열"1234"보다 크다고 표현합니다.
		 * 문자들간의 비교는 첫글자 부터 차례차례 비교하여, 서로 첫글자가 다르면 그 글자의 아스키코드값으로
		 * 크기를 결정짓고, 첫글자가 같으면 두번째 글자끼리 비교하여 결정합니다.
		 * 두번째도 같으면 세번째 글자로.....
		 * 크기를 결정하는 방법은 비교되는 두글자들의 뺄셈을 연산하여, 결과가 음수이면 두번째글자가 크다고 하고
		 * 양수이면 앞글자가 크다고 합니다.
		 * ex ) 'A' - 'B' => -1 두번째 글자가 크다
		 */

		// 5. s : Hello
		s2 = s.concat(" World"); // == new String(s + " World");
		/*
		 * concat메서드는 원본s에 잇는 문자열에 World를 이어붙이고 s에 업데이트해서 저장하는 것이 아니라
		 * 이어붙이기된 새로운 문자열 객체를 만들어서 새로운 레퍼런스 변수에 저장할 수 있게 리턴해줍니다.
		 * String 클래스의 특성상 s에 있는 Hello원본은 보호되고 있습니다.
		 */
		System.out.println("5. " + s2);
		System.out.println("5. " + s);
		
		// 6.
		s = new String("abcdefg");
		boolean b = s.contains("bc");
		/*
		 * 괄호안의 문자열이 메서드 호출 객체가 갖고 있는 문자열의 일부로 포함되어 있다면 true를 리턴해주는 메서드.
		 * boolean b = new String("abcdefg").contains("bc");
		 */
		System.out.println("6. 문자열 " + s + "에는 \"bc\"가 포함되어 있다 ? " + b);
		
		// 7.
		s = new String("Hello.txt");
		b = s.endsWith("txt");
		// 메서드 호출 객체가 갖고 있는 문자열이 괄호안의 문자열로 끝나면 true를 리턴해주는 메서드 #확장자 #체크 #ext 
		System.out.println("7. 문자열 " + s + "는 \"txt\"로 끝난다 ? " + b);
		
		// 8.
		s = new String("Hello");
		// 대소문자 구분해서 비교
		System.out.println("8. " + s + "는 \"Hello\"와 같다 ? " + s.equals("Hello"));
		System.out.println("8. " + s + "는 \"hello\"와 같다 ? " + s.equals("hello"));
		// 대소문자 구분하지 않고 비교
		System.out.println("8. " + s + "는 \"HELLO\"와 같다 ? " + s.equalsIgnoreCase("HELLO"));
		System.out.println("8. " + s + "는 \"Hello\"와 같다 ? " + s.equalsIgnoreCase("Hello"));
		
		// 9.
		System.out.println("\n9. " + s + "의 문자중 \'o\'의 위치 " + s.indexOf('o'));
		System.out.println("9. " + s + "의 문자중 \'k\'의 위치 " + s.indexOf('k'));
		// 메서드 호출 객체의 문자열중에 괄호안에 있는 문자가 몇번째로 위치하는 지를 구해줍니다.
		// 있으면 위치값(0부터 시작하는 정수), 없으면 -1
		System.out.println("9. " + s + " s.indexOf(\'e\', 0) -> " + s.indexOf('e', 0));
		System.out.println("9. " + s + " s.indexOf(\'e\', 2) -> " + s.indexOf('e', 2));
		/*
		 * 찾고자 하는 문자가 지정한 정수(0부터 시작)번째부터 시작해서 몇번째 글자로 위치하는 지를 구해줍니다.
		 * 첫번째 사용 예 : 알파벳 'e'가 문자열 s의 0번째부터 찾아서 전체 글자의 몇번째 글자인지 구함 : 1리턴
		 * 두번째 사용 예 : 알파벳 'e'가 문자열 s의 2번째(0부터 시작)부터 찾아서 전체 글자의 몇번째 글자인지 구함 : -1 리턴(없으므로)
		 */
		
		// 10.
		s = new String("ABCDEFG");
		System.out.println("\n10. " + s + " s.indexOf(\"CD\") -> " + s.indexOf("CD"));
		// 문자열의 일부가 위치한 위치값
		s = "java.lang.Object";
		System.out.println("10. " + s + " 문자열중 '.'의 마지막 위치 -> " + s.lastIndexOf('.'));
		// 문자열의 일부 또는 문자가 마지막으로 확인된 위치
	}
}
