package days09;

import java.util.Random;

public class Array10 {

	public static void main(String[] args) {
		Random rd = new Random();
		int payCnt = 5;
		int [][] lotto = new int[payCnt][6];
		boolean already;
		
		/*
		for (int z = 0; z < payCnt; z++) {
			for (int i = 0; i < lotto.length; i++) {
				do {
					lotto[z][i] = rd.nextInt();
					if (lotto[z][i] < 0) lotto[z][i] = lotto[z][i] * -1;
					lotto[z][i] = lotto[z][i]%45 + 1;

					already = false; 
					for (int j = 0; j < i; j++) {
						if (lotto[z][i] == lotto[z][j]) {
							already = true;
						};
					}
				} while (already);
			}
			
			for (int i = 0; i < lotto[z].length; i++) {
				for (int j = i + 1; j < lotto[z].length; j++) {
					if (lotto[z][i] > lotto[z][j]) {
						int t = lotto[z][i];
						lotto[z][i] = lotto[z][j];
						lotto[z][j] = t;
					}
				}
			}
			
				for (int j = 0; j < lotto[i].length; j++) {
					System.out.printf("%d  ", lotto[z][i]);
				}
			System.out.println();
		}
		*/
		
		int [] a= new int[6];
		int i, j, t;
		
		for (int z = 0; z < 5; z++) {
			for (i = 0; i < a.length; i++) {
				a[i] = rd.nextInt();
				if (a[i] < 0) a[i] = a[i]*-1;
				a[i] = a[i] % 45 + 1;
				for (j = 0; j <= i-1; j++) {
					if (a[j] == a[i]) break;
				}
				// 다를 경우 -> 중복존재, 같을 경우 -> 중복 미존재
				if (i != j) i--; // 상당히 위험한 행동
			}
			
			for (i = 0; i < a.length; i++) {
				for (j = i + 1; j < a.length; j++) {
					if (a[i] > a[j]) {
						t = a[i];
						a[i] = a[j];
						a[j] = t;
					}
				}
			}
			
//			for (i = 0; i < a.length; i++) System.out.printf("%d  ", a[i]);
			for (int p : a) System.out.printf("%d ",  p);
			System.out.println();
		}
	}

}
