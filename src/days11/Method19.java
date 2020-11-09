package days11;

public class Method19 {

	public static void main(String[] args) {
		// 배열로 전달될 n개의 전달인수와 자료형이 다른 자료가 전달인수로 전달될때...
		sort("asc", 78, 25, 56, 32, 45, 78, 98);
		System.out.println();
		sort("desc", 87, 75, 23, 65, 45, 8, 56, 98, 78, 12);
		// 자료형이 다른 전달인수를 반드시 맨 앞으로 써서 뒤로 이어지는 동일 자료형의 전달인수가 갯수와 상관없이
		// 작성될 수 있게 합니다.
	}
	
	public static void sort(String op, int ... a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (op.equals("desc")) {
					if (a[i] > a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				} else if (op.equals("asc")){
					if (a[i] < a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
				
			}
		}
		
		for (int item : a) System.out.printf("%d ", item);
	}

}
