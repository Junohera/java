public class ControllOp_For132 {

	public static void main(String[] args) {
		/*
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=10; j++) {
				System.out.printf("%d x %d = %d  ", i, j, i*j);
			}
			System.out.println();
		}
		*/
		
		// 1. 1~10���� �������� 1�� ����
		// 2. 1���� 10������ �������� �ƴ� 1~9������ ���������� ����
		// 3. i�� j�� ��ġ�� �ٲ㼭 ��¸���� ����
		// 4. %2d�� ����ؼ� ��� ���� �ٸ���
		/*
		for (int i=1; i<=9; i++) {
			for (int j=2; j<=9; j++) {
				System.out.printf("%d x %d = %2d  ", j, i, i*j);
			}
			System.out.println();
		}
		*/
		
		// 5. ���κп� 2�ܺ��� 5�ܱ���, �Ʒ��κп� 6�ܺ��� 9�ܱ����� ���� ���
		for (int i=1; i<=9; i++) {
			for (int j=2; j<=5; j++) {
				System.out.printf("%d x %d = %2d  ", j, i, i*j);
			}
			System.out.println();
		}
		System.out.println();System.out.println();
		for (int i=1; i<=9; i++) {
			for (int j=6; j<=9; j++) {
				System.out.printf("%d x %d = %2d  ", j, i, i*j);
			}
			System.out.println();
		}
	}

}
