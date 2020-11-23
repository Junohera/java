package days21;

import java.util.ArrayList;

/*
 * #레퍼런스객체간 #비교 #검색
 * 을 하려면
 * 최상위클래스 #Object의 메서드를
 * #equals를 #override해야함
 *  
 */
class Point {
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/*
	 * 최상위 클래스 Object의 toString override
	 */
	@Override
	public String toString() {
		return "x: " + x + ", y: " + y;
	}
	/*
	 * 최상위 클래스 Object의 equals override
	 * 서로다른 참조값을 가진 객체가 들어와도(단, 동일 클래스)
	 * 멤버변수간 동일여부를 판단할 수 있게끔 오버라이드
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Point)) return false; // 동일하지않은 클래스 방어
		Point target = (Point)o; // 동일클래스일 경우 Object에서 다운캐스팅
		
		boolean equalsX = (this.x == target.x); // 멤버간 비교
		boolean equalsY = (this.y == target.y); // 멤버간 비교
		
		return equalsX && equalsY;
	}
}

public class Collection14 {
	public static void main(String[] args) {
		ArrayList<Point> list = new ArrayList<Point>();
		
		Point p1 = new Point(10, 10);
		
		list.add(p1);
		list.add(new Point(20, 20));
		list.add(new Point(30, 30));
		
		System.out.println("### toString 생략(모든 Class는 최상위 클래스인 Object로부터 물려받은 toString을 오버라이드할 수 있음.");
		for (Point p : list) System.out.println(p);
		System.out.println("### toString을 직접 명시해도 위와 동일");
		for (Point p : list) System.out.println(p.toString());
		
		System.out.println();
		
		System.out.printf("(30, 30)의 위치 : %d\n", list.indexOf(new Point(30, 30)));
		System.out.printf("(30, 30)의 저장 유무 : %b\n", list.contains(new Point(30, 30)));
		
		// 사용자 정의 클래스에 equals메서드가 오버라이딩 되지않은 경우
		// 컬렉션 내부에서 동일한 형태의 객체를 검색 및 비교할 수 없습니다.
		System.out.println("(30, 30) 삭제 전 갯수 " + list.size()); // 3
		list.remove(new Point(30, 30)); // 내용으로 비교 검색하여 삭제
		System.out.println("(30, 30) 삭제 후 갯수 " + list.size()); // 2
		
	}
}
