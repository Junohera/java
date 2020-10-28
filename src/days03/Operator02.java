package days03;

public class Operator02 {

	public static void main(String[] args) {
		// 피연산자와 결과 변수가 같은 연산
		int n = 50;
		double d = 50.0;
		n = n + 10; // n += 10;
		// n변수의 값과 상수10이 CPU에 전달되어 덧셈연산이 되고 그 결과가 다시 돌아와 n변수에 저장
		// 원래n변수값 50은 지워지고, 새로운 값인 60이 n변수에 저장됩니다.
		System.out.println("n = n + 10 -> n = " + n);
		n+=10;
		System.out.println("n += 10 -> n = " + n);
		n = n - 10; // n-=10;
		System.out.println("n = n - 10 -> n = " + n);
		n = n * 10;
		System.out.println("n = n * 10 -> n = " + n);
		d = d / 10.0; // d/=10;
		System.out.println("d = d / 10 -> d = " + d);
		n = n % 10; // n%=10;
		System.out.println("n = n % 10 -> n = " + n);
		
		System.out.println("========== 증가/감소 연산자");
		// 증가/감소 연산자 ++, --
		// 특정 변수의 값을 1 증가하거나, 감소시킬 수 있는 연산자
		// 대입연산자(=)를 사용하지 않고, 값을 수정할 수 있음
		n = 50;
		n++; // n+=1; n=n+1;
		System.out.println("n++ -> n = " + n);
		++n;
		System.out.println("++n -> n = " + n);
		
		System.out.println("\n현재 n값 : " + n);
		System.out.println("println(n++) -> n = " + n++); // 다른 연산 참여 후 1증가
		System.out.println("출력연산후 n값 : " + n);
		
		System.out.println("\n현재 n값 : " + n);
		System.out.println("println(++n) -> n = " + ++n); // 1증가 후 다른 연산에 참여
		System.out.println("출력연산후 n값 : " + n);
	}

}
