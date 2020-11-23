package days21;

import java.util.ArrayList;

public class Collection13 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		
		// indexOf 메서드는 저장된 특정 값의 위치를 반환
		int target_index = list.indexOf(20);
		System.out.printf("20의 위치 : %d\n", target_index);
		
		// 검색할 값이 존재하지 않는 경우 -1이 반환
		target_index = list.indexOf(50);
		System.out.printf("50의 위치 : %d\n", target_index);
		
		// contains 메서드는 매개변수로 전달된 값의 저장유무에 따라서 true/false의 값을 반환
		System.out.printf("20의 저장 유무 : %b\n", list.contains(20));
		System.out.printf("50의 저장 유무 : %b\n", list.contains(50));
	}
}
