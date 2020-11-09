package days11;

public class Method18 {

	public static void main(String[] args) {
		int c;
		c = max(50, 60, 80, 60, 54, 60);
		System.out.println("입력값중 큰값은 : " + c + "입니다");
		c = max(50, 60, 80, 60, 54, 60, 56, 87, 69);
		System.out.println("입력값중 큰값은 : " + c + "입니다");
	}
	// 전달인수의 요소들이 갯수만 다르고, 자료형이 모두 같다면, 메소드 하나만으로 처리가 가능합니다.
	public static int max(int... a) {
		// 전달인수의 갯수만큼 배열로 저장되고, 주소값이 전달, a는 배열의 참조 변수로서 전달된 값들은 배열로 사용가능합니다.
		int max = a[0];
		for (int i = 1; i < a.length; i++)
			if (max < a[i]) max = a[i];
		return max;
	}
	
	public static int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}

}
