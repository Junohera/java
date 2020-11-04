package days08;

import java.util.Scanner;

public class Array06 {

	public static void main(String[] args) {
		// 배열의 크기 : 배열크기는 프로그램에서 중요한 정보입니다.
		// 배열의 크기에 따라 반복의 횟수나, 특정 인덱스의 값을 참조하는 것이 수시로 바뀌기 때문입니다.
		// 배열은 이러한 문제를 해결하기 위해 length 라는 속성을 제공합니다.
		// 배열의 이름.length -> 배열의 크기가 정수 타입의 데이터를 얻습니다.
		Scanner sc = new Scanner(System.in);
		System.out.printf("몇과목을 계산하시겠습니까?");
		int k = sc.nextInt();
		int [] score = new int[k];
		int tot = 0;
		double ave;
		for (int i = 0; i < score.length; i++) {
			System.out.printf("점수 입력 : ");
			score[i] = sc.nextInt();
			tot += score[i];
		}
		ave = tot / (double) score.length;
		System.out.printf("총점 : %d 점, 평균 %.2f점\n", tot, (int)(ave*100)/100.0);
	}

}
