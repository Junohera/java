package days05;

import java.util.Scanner;

public class ControllOp10 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하세요:");
		a = sc.nextInt();
		// switch() 괄호안의 변수값에 따라 별도의 명령이 필요할 때 사용
		// if 문과 비슷한 구조이지만, 변수값의 단순참조에 의해 실행될 명령이 선택되는 것이 다릅니다.
		
		switch(a) {
		case 1:
			System.out.println("1을 입력하셨습니다.");
			break; // 아랫쪽 케이스를 모두 실행하는 단점을 보완하기 위해 각 case에 break 명령을 추가
		case 2:
			System.out.println("2을 입력하셨습니다.");
			break;
		case 3:
			System.out.println("3을 입력하셨습니다.");
			break;
		case 4:
			System.out.println("4을 입력하셨습니다.");
			break;
		case 5:
			System.out.println("5을 입력하셨습니다.");
			break;
		}
	}

}
