public class ControllOp_For141 {

	public static void main(String[] args) {
		/*for (int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.printf("#");
			}
			System.out.println();
		}*/
		
		/*
		for (int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.printf("#");
			}
			System.out.println();
		}*/
		
//		for (int i = 1; i <= 20; i++) {
//			for(int j = i; j <= 20; j++) {
//				System.out.printf("#");
//				for(int k = 20; k >= i;k--) {
//					System.out.printf(" ");
//				}
//			}
//			System.out.println();
//		}
//		for (int i = 1; i <= 20; i++) {
//			for(int j = 20; j >= i; j--) {
//				System.out.printf("#");
//				for(int k = 1; k <= i;k++) {
//					System.out.printf(" ");
//				}
//			}
//			System.out.println();
//		}
		
		// i = (1, 2, 3, 4, ...)
		// j = ((10), (9, 10), (8, 9, 10), (7, 8, 9, 10))
		int max = 10;
		
		for (int i = 1; i <= max; i++) {
			for(int j = 1; j <= max; j++) {
				if (j >= ((max+1) - i)) System.out.printf("#");	
				else System.out.printf(" ");
			}
			System.out.println();
		}
		
System.out.println();

		// i = (10, 9, 8, 7, ...)
		// j = ((10), (9, 10), (8, 9, 10), (7, 8, 9, 10))
		for (int i = max; i > 0 ; i--) {
			for(int j = 1; j <= max; j++) {
				if (j >= i) System.out.printf("#");	
				else System.out.printf(" ");
			}
			System.out.println();
		}
		
System.out.println();

		for (int i = 1; i <= max; i++) {
			for(int j = 1; j <= max; j++) {
				if (j < i) System.out.printf(" ");
				else System.out.printf("#");
			}
			System.out.println();
		}
	}

}
