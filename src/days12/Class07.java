package days12;

import java.util.Scanner;

class Gugudan {
	private int dan;
	
	// 단 초기화
	void initDan(int input_dan) {
		dan = input_dan;
	}
	
	// 현재 dan 변수에 있는 값으로 구구단 한개의 단을 출력하는 메서드 정의
	void prnGugudan() {
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + "x" + i + "=" + (dan*i));
		}
	}
}
public class Class07 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int menuOrDan = 0, count = 0;
		boolean first = true;
		String save = "";
		do {
			if (first) {
				System.out.printf("원하는 단수를 입력하세요 : ");
				menuOrDan = sc.nextInt();
				first = false;
			}
			
			count++;
			save += menuOrDan + "단 ";
			
			// Gugudan 객체 생성
			Gugudan g = new Gugudan();
			// dan 값을 초기화하는 메서드 호출
			g.initDan(menuOrDan);
			// 현재 저장된 dan 값으로 한개의 단을 출력하는 메서드 호출
			g.prnGugudan();
			
			System.out.printf("\n원하는 단수를 입력, 또는 종료를 원하면 0을 입력하세요.");
			menuOrDan = sc.nextInt();
		} while (menuOrDan != 0);
		
		System.out.printf("프로그램 종료 (출력수 : %d)", count);
		System.out.printf("\n실행 내역 : %s", save);
		sc.close();
	}

}
