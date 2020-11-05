package days09;

import java.util.Random;

public class Array11 {

	public static void main(String[] args) {
		// 10개까지 배열을 만들고 0~99 사이의 랜덤한 숫자를 저장합니다. (중복 가능)
		
		Random rd = new Random();
		int [] a = new int[10];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = rd.nextInt();
			
			if (a[i] < 0) a[i] *= -1;
			a[i] %= 100;
			
		}
		
		// 반복문과 배열의 사용 1
		for (int i = 0; i < a.length; i++) System.out.printf("%d ", a[i]);
		
		System.out.println();
		// 반복문과 배열의 사용 2
		for (int k : a) System.out.printf("%d ", k);
		// 배열 또는 나중에 공부할 리스트 자료형에 적용할 수 있는 반복실행문의 별도 사용법
		// 변수와 배열(자료형(int, float 등)이 반드시 같아야함)을 for 문안에 제시하면
		// 배열에 있는 값들 하나하나가 차례로 변수에 전달되면서 반복실행
		// 배열은 배열의 이름만 기술. 변수는 그 배열의 값들중 하나를 저장할 수 있는 변수 사용
		// 각 반복 실행 당시의 j 값은 c배열에서 전달 받은 배열의 값들중 하나이며, j변수를 이용해서
		// 배열의 갯수 만큼 반복 실행을 진행함
		// 배열의 값을 입력하거나 또는 연산하기 보다는 출력하기위해서 많이 사용
		
	}

}
