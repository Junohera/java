import java.util.Scanner;

public class MyCalender1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y, m, days = 0 , t, i;
		
		System.out.printf("�� �Է� : " );
		y = sc.nextInt();
		System.out.printf("�� �Է� : " );
		m = sc.nextInt();
		
		// �Է��� �⵵�� ���⵵���� ������ ��¥�� ���
		days = 365 * (y-1); // 365*(y - 1)
		for (i = 1; i <= (y-1); i++) 
			if ((i%4==0) && (i%100!=0) || (i%400==0)) 
				days ++; // ���� 1����� �Է��� �⵵�� ���⵵���� �־��� ���⸶�� 1���� ����.
		
		// �Է��� ���� �������� ������ ��¥ ���� ����մϴ�.
		switch (m) {
			case 12: days = days + 30;
			case 11: days = days + 31;
			case 10: days = days + 30;
			case 9: days = days + 31;
			case 8: days = days + 31;
			case 7: days = days + 30;
			case 6: days = days + 31;
			case 5: days = days + 30;
			case 4: days = days + 31;
			case 3: 
				// �Է³⵵�� �����̸� 2���� 29��, �ƴϸ� 28��
				if ((i%4==0) && (i%100!=0) || (i%400==0)) days = days + 29;
				else days = days + 28;
			case 2: days = days + 31;
			case 1: days = days + 0;
		}
		
		days = days + 1; // �Է��� ���� 1���ڰ� ���� �������� �Ǵ��ϱ����� 1���� ���մϴ�.
		t = days % 7; // t�� �Ͽ���:0, ������:1, ȭ����:2, ������:3, �����:4, �ݿ���:5, �����:6
		
		int end = 0;
		switch(m) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: end = 31; break;
			case 4: case 6: case 9: case 11: end = 30; break;
			case 2:
				if ((i%4==0) && (i%100!=0) || (i%400==0)) end = 29;
				else end = 28; break;
		}
//		switch (t) {
//			case 1: System.out.println("�������Դϴ�"); break;
//			case 2: System.out.println("ȭ�����Դϴ�"); break;
//			case 3: System.out.println("�������Դϴ�"); break;
//			case 4: System.out.println("������Դϴ�"); break;
//			case 5: System.out.println("�ݿ����Դϴ�"); break;
//			case 6: System.out.println("������Դϴ�"); break;
//			case 0: System.out.println("�Ͽ����Դϴ�"); break;
//		}
		
		// �޷� ����� ����
		System.out.println();
		System.out.println(y + "�� " + m + "��");
		System.out.println("---------------------------------------------------");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		System.out.println("---------------------------------------------------");
		
		int cnt = 0;
		// t������ 1 ���� ������ ��ĭ ���
		for (i = 0; i < t; i++) {
			System.out.printf("\t");
			cnt++;
		}
		
		for (i = 1; i <= end; i++) {
			cnt++;
			System.out.printf("%2d\t", i);
			if (cnt%7==0) System.out.println();
		}
		
		// 36.9
		
		
	}

}
