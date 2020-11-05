package days09;

public class Array15 {

	public static void main(String[] args) {
		int [] a1 = new int[10];
		int k = 1;
		for (int i = 0; i < 10; i++) a1[i] = k++;
		for (int j : a1) System.out.printf("%d ", j);
		
		System.out.println();
		int [][] a2 = new int[5][5];
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				a2[j][i] = k++;
			}
		}
		for (int [] j1 : a2) {
			for (int j2 : j1) {
				System.out.printf("%d\t", j2);
			}
			System.out.println();
		}
	}

}
