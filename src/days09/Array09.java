package days09;

public class Array09 {

	public static void main(String[] args) {
		// 배열에 있는 값들 중 가장 큰값과 가장 작은 값을 찾아서 출력하세요.
		int a [] = {56, 87, 96, 87, 45, 89, 69, 36, 13, 98}, max = 0;
		int b [] = {-56, -87, -96, -87, -45, -89, -69, -36, -13, -98}, min = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) max = a[i];
			System.out.printf("%d  ", max);
		}
		System.out.println("\n가장 큰값 : " + max);
		
		for (int i = 1; i < b.length; i++) {
			if (min > b[i]) min = b[i];
			System.out.printf("%d  ", min);
		}
		System.out.println("\n가장 작은값 : " + min);
		
		// 배열의 값들을 오름차순 또는 내림차순으로 재배치(정렬)하시오.
		// int [] a = {56, 87, 96, 87, 45, 89, 69, 36, 13, 98};
		// i를 첨자로 한 값과 그 뒤에 있는 j를 첨자로 한 값들을 모두 비교하여 i번째 값보다 작은 숫자가 나오면
		// 그 둘의 값을 맞바꿔서 작은값이 앞으로 오게 합니다.
		// j가 마지막 첨자까지 도달했을 때 i번째에는 가장 작은 숫자가 저장되어 있습니다.
		// 변수들의 값을 맞교환 동작이 필요
		// a = 30; b = 50;
		// a=b; b값이 a에 대입되는 순간 a가 갖고 있던 30은 사라집니다.
		// b=a; a에는 50이 저장되어 있으므로, b에 대입하는건 같은 값을 대입하는 결과입니다.
		// t=a;
		// a=b;
		// b=t;
		int i, j, t;
		for (i = 0; i < a.length; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		for (i = 0; i < a.length; i++) System.out.printf("%d  ", a[i]);
	}

}
