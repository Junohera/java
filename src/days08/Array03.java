package days08;

public class Array03 {

	public static void main(String[] args) {
		// 배열 변수의 활용-배열과 반복문
		// 배열은 하나의 변수명을 가지며, 변수명과 인덱스를 조합하여 각 요소에 접근할 수 있습니다.
		// 일반적으로 for 반복문의 기준변수를 사용하여 배열의 인덱스를 제어하는 방식으로 배열의 각 요소에
		// 접근하는 방식이 활용됩니다.
		
		int [] arr = new int[100];
		// arr 배열의 요소 값을 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 으로 초기화
		// 배열의 요소가 많을 수록 인덱스를 지정하여 코드를 작성하기 힘들어 집니다...
		arr[0] = 1; arr[1] = 2; arr[2] = 3; arr[3] = 4; arr[4] = 5;
		arr[5] = 6; arr[6] = 7; arr[7] = 8; arr[8] = 9; arr[9] = 10;
		
		// 배열과 반복문을 활용하여 값을 초기화하는 코드 - i변수의 값이 0 ~ 99 까지 실행
		for (int i = 0; i < 100; i++)
			arr[i] = i + 1;
		for (int i = 0; i < 100; i++)
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
	}

}
