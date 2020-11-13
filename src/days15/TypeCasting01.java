package days15;
class NormalA { int num; }
class NormalB { int num; }
public class TypeCasting01 {
	public static void main(String[] args) {
		// 기본 자료형 간의 형변환은 자료형의 크기에 영향을 받습니다.
		short s = 10;
		// int 타입(4byte)은 2byte 타입의 short 값을 대입받을 수 있습니다.
		int i = s;
		// short(2byte) 타입은 4byte 타입의 int 값을 대입받을 수 없습니다.
		// s = i; 에러
		// 클래스의 레퍼런스 변수간의 형변환은 각 레퍼런스의 접근 범위에 영향을 받습니다.
		// 서로 다른 클래스 객체간의 형변환은 허용되지 않습니다.
		// 클래스의 레퍼런스는 해당 클래스의 멤버에 접근할 수 있는 권한을 가진 변수입니다.
		// a1 레퍼런스는 NormalA의 num에 접근할 수 있는 레퍼런스
		// b1 레퍼런스는 NormalB의 num에 접근할 수 있는 레퍼런스
		NormalA a1 = new NormalA();
		// NormalB b1 = a1; 에러
		NormalB b2 = new NormalB();
		// NormalA a2 = b2; 에러
	}
}
