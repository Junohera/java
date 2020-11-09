package days11;

public class Method15 {

	/*
	 * #array #copy #clone #deepcopy #shallowcopy 
	 */
	public static void main(String[] args) {
		int [] a = {56, 87, 96, 59, 25, 48, 13};
		int sum = 0;
		double average;
		sum = sum(a);
		average = average(a);
		prn(sum, average);
		
		int [] s = copy(a); // 새로운 레퍼런스변수 복사
		sort(s); // 복사한 레퍼런스변수 정렬
		System.out.println();
		for (int sortedValue : s) System.out.printf("%d ", sortedValue); // 복사 후 정렬
		System.out.println();
		for (int originalValue : a) System.out.printf("%d ", originalValue); // 원본(정렬x)
	}
	
	public static int sum(int [] list) {
		int result = 0;
		for (int i = 0; i < list.length; i++) result += list[i];
		return result;
	}
	
	public static double average(int [] list) {
		return sum(list) / list.length;
	}
	
	public static void prn(int tot, double ave) {
		System.out.printf("총점 : %d 평균 : %.2f", tot, ave);
	}
	
	public static int [] copy(int [] origin) {
		int [] copy = new int[origin.length];
		for (int i = 0; i < origin.length; i++) copy[i] = origin[i];
		return copy;
	}
	
	public static void sort(int [] target) {
		for (int i = 0; i < target.length; i++) {
			for (int j = 0; j < i -1; j++) {
				if (target[i] < target[j]) {
					int temp = 0;
					temp = target[i];
					target[i] = target[j];
					target[j] = temp;
				}
			}
		}
	}
}
