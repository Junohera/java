package days11;

import java.util.Scanner;

public class Method13 {

	public static void main(String[] args) {
		int kor, eng, mat, tot;
		double ave;
		String gra;
		kor = myInput(1); // 점수 입력
		eng = myInput(2);
		mat = myInput(3);
		tot = sum(kor, eng, mat); // 총점 계산
		ave = avg(kor, eng, mat); // 평균 계산
		gra = grade(ave); // 평균 90이상 A학점, 80이상 B 학점, 70이상 C학점, 60이상 D학점, 나머지 F
		prn(tot, ave, gra); // 총점, 평균, 학점 출력
	}
	
	public static int myInput(int type) {
		Scanner sc = new Scanner(System.in);
		if (type == 1) System.out.print("국어를 입력하세요 : ");
		else if (type == 2) System.out.print("영어를 입력하세요 : ");
		else if (type == 3) System.out.print("수학을 입력하세요 : ");
		return sc.nextInt();
	}
	
	public static int sum(int sub1, int sub2, int sub3) {
		return sub1 + sub2 + sub3;
	}
	
	public static double avg(int sub1, int sub2, int sub3) {
		return (int)(sum(sub1, sub2, sub3) / 3.0 * 100) / 100.0; // 소수점 2자리까지만
		// 메서드는 반드시 main 메서드에서만 호출할 수 있는 것이 아닙니다.
		// 만들어진 메서드들간에 필요하다면 서로를 호출하여 결과를 활용할 수 있습니다.
		// 메서드 호출의 결과로 리턴된 값은 위와 같이 다음 연산에도 참여시킬 수 있습니다.
		// t = sum(k, m, e); a = sum(k, m, e) / 3.0;
	}
	
	public static String grade(double avg) {
		if (avg >= 90) return "A";
		else if (avg >= 80) return "B";
		else if (avg >=70) return "C";
		else if (avg >= 60) return "D";
		return "F";
	}
	
	public static void prn(int tot, double ave, String gra) { // 총점, 평균, 학점 출력
//		System.out.printf("총점 : %d, 평균 : %.2f, 학점 : %s", tot, ave, gra);
		System.out.println("총점 : " + tot + " 평균 : " + ave + " 학점 : " + gra);
	}
}
