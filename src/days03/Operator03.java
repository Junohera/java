package days03;

public class Operator03 {

	public static void main(String[] args) {
		// 관계연산자
		// (좌항 기준)		>(초과), <(미만), >=(이상), <=(이하), ==(같다), !=(같지않다)
		// 좌항과 우항의 크기를 비교하여 true/false 값이 결과가 되는 연산
		// 관계식이 올바른 경우 true, 관계식이 틀린 경우 false 가 연산의 결과가 됨
		int n1 = 10;
		int n2 = 5;
		boolean result;
		// %b : boolean 타입의 값을 출력
		result = n1 > n2;
		System.out.printf("%d > %d => %b\n", n1, n2, result);
		result = n1 < n2;
		System.out.printf("%d < %d => %b\n", n1, n2, result);
		result = n1 >= n2;
		System.out.printf("%d >= %d => %b\n", n1, n2, result);
		result = n1 <= n2;
		System.out.printf("%d <= %d => %b\n", n1, n2, result);
		result = n1 == n2;
		System.out.printf("%d == %d => %b\n", n1, n2, result);
		result = n1 != n2;
		System.out.printf("%d != %d => %b\n", n1, n2, result);
		
		// 문자(char) 데이터의 비교 : 각 문자가 갖는 아스키 코드 값으로 비교
		// 아스키코드 : 문자를 저장한 컴퓨터 내부의 이진수 저장코드를 수치적으로 읽어낸 값
		char c1 = 'A', c2 = 'B';
		result = c1 > c2;
		System.out.printf("%c > %c => %b\n", c1, c2, result);
		result = c1 < c2;
		System.out.printf("%c < %c => %b\n", c1, c2, result);
		
		// 문자열(String)의 비교 : s1과 s2는 참조변수이므로 s1>s2같은 비교는 관계연산으로 비교 불가
		// .compareTo() 라는 method(도구)를 이용하여 앞글자부터 한글자씩 비교해 나가는 방식으로 비교
		// 첫글자에서 크기가 결정되면 뒷글자들의 비교는 실행하지 않으며,
		// 현재 비교중인 글자들이 같을 때 다음글자로 비교 순서를 이동
		// 앞글자에서 뒷글자의 아스키 코드값을 뺀 값(정수)을 결과로 얻음
		// 사전적인 순서로 앞에 있는 단어는 작다라고 하고, 뒤에 나오는 단어는 앞에 나오는 단어보다 크다라고 합니다.
		String s1 = "1234", s2 = "987";
		int r = s1.compareTo(s2); // method(함수)의 사용은 해당 단원에서 자세히 공부합니다.
		System.out.printf("\"%s\" > \"%s\" = %d\n", s1, s2, r);
	}

}
