package days16;
/*
 * toString method의 사용
 * toString method는 클래스의 객체 정보를 문자열로 반환 : 객체의 클래스명 + '@' + 해시코드의 값 (16진수)
 * 사용자 정의 클래스(직접개발한 클래스)에 toStringmethod를 오버라이딩 하여
 * 클래스의 정보를 문자열로 제공하돌록 변형할 수 있습니다.
 */
class UserClass_B {}
class Point {
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		String strInfo = "x =" + this.x + ",y = " + this.y;
		return strInfo; // "x = 값, y = 값" 리턴
	}
}
public class Object02 {
	public static void main(String[] args) {
		UserClass_B obj = new UserClass_B();
		System.out.println("오버라이딩 되지않은 toString()=>" + obj.toString());
		Point p = new Point(30, 20);
		System.out.println("오버라이딩 된 toString=>" + p.toString());
		Object ob = new Point(30, 20);
		System.out.println("오버라이딩 된 toString를 Object 레퍼런스로 출력=>" + ob.toString());
		String msg = "Point => " + p; // .toString() 생략
		System.out.println(msg);
		// .toString()은 print에서 사용되거나 다른 문자열과 '+' 연산될때 생략 가능합니다.
	}
}
