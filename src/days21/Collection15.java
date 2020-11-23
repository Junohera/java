package days21;

import java.util.HashMap;

/*
 * Hash 기반의 클래스에서 키 값의 중복을 제거하기 위해서 실행되는 과정(키값이 사용자 정의 클래스 객체일 때)
 * 1. 입력된(검색할) 객체의 hashCode 메서드 실행
 * 2. 반환받은 hashCode 메서드의 결과를 현재 저장되어 있는 모든 객체들의 hashCode 메서드의 반환값과 비교
 * 3. 만약 동일한 hashCode 메서드의 결과가 존재한다면 equals 메서드를 실행하여 두 객체가 동일한지 비교
 * => Override (hashCode, toString) of Object methods
 *  
 * 키값을 객체로 사용할 경우(지양하지만 그럴 수 있게하기위한 방법)
 * 사용자정의 클래스에 hashCode Override
 */
class Rect {
	private int x;
	private int y;
	public Rect(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() { // 최상위 클래스 method Override of Object
		return "x : " + this.x + ", y : " + this.y;
	}
	
	@Override
	public boolean equals(Object o) { // 최상위 클래스 method Override of Object 
		if (!(o instanceof Rect)) return false;
		Rect target = (Rect)o;
		boolean flag = ((this.x == target.x) && (this.y == target.y));
		return flag;		
	}
	
	// Hash기반의 클래스에 의해서 호출되는 메서드를 오버라이딩하여 동일한 형태의 객체를 검색하기 위해서
	// 사용되게 함. 동일한 HashCode를 반환하는 경우에만 비교를 수행
	@Override
	public int hashCode() {
		System.out.println("Rect 클래스의 hashCode 실행");
		return this.x + this.y;
	}
}

public class Collection15 {
	public static void main(String[] args) {
		HashMap<Rect, Integer> map = new HashMap<Rect, Integer>();
		
		map.put(new Rect(10, 10), 10);
		map.put(new Rect(20, 20), 20);
		map.put(new Rect(30, 30), 30);
		
		for (Rect key : map.keySet()) {
			System.out.printf("%s - %d    ", key, map.get(key));
		}
		
		// 하기의 명령줄이 false인 이유는 같은 클래스더라도 인스턴스화한 각 객체마다 고유의 해시코드를 가지고 있기 때문
		// 비교시 서로다른 해시코드로 비교하기에 항상 false가 나옴.
		// => Override hashCode method of Object 
		 System.out.printf("\n(30, 30)의 유무 : %b\n", map.containsKey(new Rect(30, 30)));
	}
}
