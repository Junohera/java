package days09;

public class Array14 {

	public static void main(String[] args) {
		// 2차원 배열
		// 행과 열의 개념을 사용하는 인덱스가 2개인 배열
		// 2차원 배열의 변수 선언 - 행과 열을 의미하는 []가 두개사용됨
		int [][] arr;
		// 2차원 배열의 공간 생성
		// 변수명 = new 자료형[행의수][열의수];
		// 3행 2열의 2차원 배열 생성
		// (2개의 요소를 가지는 일차원 배열을 3개 생성 - 3행 2열의 배열)
		arr = new int[3][2];
		// 2차원 배열의 요소 접근 - 2개의 인덱스를 사용
		// 변수명[행의 인덱스 - 0부터 시작][열의 인덱스 - 0부터 시작] = 값;
		// arr 2차원 배열의 3번째 행(index:2)의 두번째 요소(index:1)에 10을 입력
		arr[2][1] = 10;
		// 세번째행의 두번째 값 출력
		System.out.println(arr[2][1]);
		
		// 2차원 배열의 선언 및 초기화 방법
		// 1. 2차원 배열의 변수(참조변수)를 선언한 후, 배열을 할당
		int [][] arr1;
		arr1 = new int[2][3];
		
		// 2. 2차원 배열의 변수 선언과 동시에 배열을 할당
		int [][] arr2 = new int[2][3];
		// 1차원 배열과 마찬가지로 2차원도 HEAP메모리에 생성되므로 초기화 값은 0입니다.
		System.out.println(arr1[0][0]);
		System.out.println(arr2[0][0]);
		
		// 3. 2차원의 배열의 배열을 생성하면서 초기화하는 방법
		// 초기화하는 값을 설정하는 방법
		// { {1번째 행의 초기화 값}, {2번째 행의 초기화 값} ...}
		// 2행 3열의 2차원 배열을 생성하면서
		// 1번째 행의 요소 값을 1, 2, 3으로 2번째 행의 요소값을 4, 5, 6으로 지정
		int [][] arr3 = new int [][] {{1,2,3}, {4,5,6}}; // 2행 3열 2차원 배열
		System.out.println(arr3[0][2]);
		System.out.println(arr3[1][1]);
		
		int [][] arr4 = {{1, 5}, {4, 5}, {7, 8}}; // 3행 2열 2차원 배열
		System.out.println(arr4[0][1]);
		System.out.println(arr4[1][1]);
		
		// 4. 2차원의 배열 생성후 2중 반복 실행문에 의한 값 저장 & 출력
		int [][] a = new int[5][5];
		int k = 1;
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				a[i][j] = k++;
			}
		}
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				System.out.printf("%d\t", a[i][j]);
			}
			System.out.println();
		}
	}

}
