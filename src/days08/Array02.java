package days08;

public class Array02 {

	public static void main(String[] args) {
		// 배열의 선언과 생성 방법
		// 1. 배열 변수의 선언 후, 실제 배열 공간을 할당 받는 방법
		// null : 아무것도 없는 값, 비어있는 값이라고 표현합니다.
		// 변수 생성 후 null값을 초기화하는 것은 아무것도 넣지 않아서 초기화 되지 않은 것과는 다릅니다.
		// 아무것도 없는 값이라고 표현될 뿐, 정말 초기화를 하지않은 변수는 사용하지 못하지만
		// null값이 초기화된 변수는 사용해도 에러가 나지 않습니다.
		int [] arr1 = null;
		arr1 = new int[5];
		System.out.println(arr1[0]);
		System.out.println(arr1[4]);
		// 2. 배열 변수의 선언과 배열의 생성을 동시에 진행
		int [] arr2 = new int[5];
		System.out.println(arr2[0]);
		System.out.println(arr2[4]);
		// HEAP 메모리의 특징 : 배열은 HEAP 메모리에 new 연산자를 통해서 생성되며
		// HEAP 메모리에 생성되는 모든 영역은 0 또는 0.0, String형 또는 char형 배열일 경우
		// null 값으로 초기화됩니다.
		
		
		// 3. 배열을 생성하면서 임의의 값으로 초기화하는 방법
		// 크기가 5인 배열을 생성하면서, 각 요소의 값을 1,2,3,4,5로 초기화하는 코드
		int [] arr3 = new int[] {1, 2, 3, 4, 5};
		System.out.println(arr3[0]); // 배열의 첫번째요소 값 확인
		System.out.println(arr3[4]); // 배열의 두번째요소 값 확인
		
		// 4. 메모리 생성 및 할당 연산 new를 생략한 배열 선언
		int [] arr4 = {1, 2, 3, 4, 5};
		System.out.println(arr4[1]); // 배열의 두번째요소 값 확인
		System.out.println(arr4[3]); // 배열의 네번째요소 값 확인
		arr4[0] = 100;
		System.out.println(arr4[0] + " " + arr4[0]);
		
		// 5. 두개의 배열레퍼런스 변수를 한번에 선언
		int [] arr5, arr6;
		arr5 = new int[3];
		arr6 = new int[3];
		
		// 6. 두개는 배열레퍼런스 변수로 하나는 일반 변수로 선언
		int arr7 [], arr8 [], arr9;
		arr7 = new int[3];
		arr8 = new int[3];
		arr9 = 10;
	}

}
