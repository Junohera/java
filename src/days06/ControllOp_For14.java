package days06;

public class ControllOp_For14 {

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
		
		for (int i = 1; i <= 20; i++) {
			for(int j = i; j <= 20; j++) {
				System.out.printf("#");
				for(int k = 20; k >= i;k--) {
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= 20; i++) {
			for(int j = 20; j >= i; j--) {
				System.out.printf("#");
				for(int k = 1; k <= i;k++) {
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 10; i++) {
			for(int j = i; j <= 10; j++) {
				System.out.printf("#");
			}
			System.out.println();
		}
	}

}
