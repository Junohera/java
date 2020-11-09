package days11;

public class Method21 {

	public static void main(String[] args) {
		String [] sortList = {"asc", "desc"};
		
		for (String type : sortList) {
			if ("asc".equals(type))
				print(sort(type, 87, 45, 65, 85, 32, 56, 47));
			else if ("desc".equals(type))
				print(sort(type, 1, 5, 98, 74, 56, 3, 69, 87, 45, 69, 55, 44));
		}
	}
	
	public static void print(int [] list) {
		System.out.printf("정렬결과 : ");
		for (int n : list) System.out.printf("%d ", n);
		System.out.println();
	}
	
	public static int [] sort (String type, int ... is) {
		int t;
		for (int i = 0; i < is.length; i++) {
			for (int j = 0; j < is.length - 1; j++) {
				if ("asc".equals(type)) {
					if (is[i] < is[j]) {
						t = is[i];
						is[i] = is[j];
						is[j] = t;
					}
				} else {
					if (is[i] > is[j]) {
						t = is[i];
						is[i] = is[j];
						is[j] = t;
					}
				}
			}
		}
		return is;
	}
}
