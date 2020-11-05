public class Array077 {

	public static void main(String[] args) {
		// �迭 a, b, c ���� (�� ���� 10��)
		// a�迭���� 3�� ����� 10�� ���� - �ݺ����๮ �̿�
		// b�迭���� 5�� ����� 10�� ���� - �ݺ����๮ �̿�
		// c�迭���� a�迭�� b�迭�� �� ���� �ε��� ������ ���� ���� - �ݺ����๮ �̿�
		// ex) c[3] = a[3] + b[3];
		// ���
		// a�迭 -> 3 6 9 12 15 ...
		// b�迭 -> 5 10 15 20 25 ...
		// c�迭 -> 8 16 24 32 40 ...
		int max = 10;
		int [] a = new int[max];
		int [] b = new int[max];
		int [] c = new int[max];
		
		for (int i = 0; i < max; i++) {
			a[i] = (i+1)*3;
			b[i] = (i+1)*5;
			c[i] = a[i] + b[i];
			System.out.printf("[%d] a:%2d b:%2d c:%2d\n", i, a[i], b[i], c[i]);
		}
	}

}
