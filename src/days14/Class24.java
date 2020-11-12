package days14;
// static 변수, static 메서드, 인스턴스(멤버)변수, 인스턴스(멤버)메서드
class MyMath {
	int a, b;
	static int c = 0;
	
	MyMath() { c++; }
	// 인스턴스 메서드에서는 스태틱 변수를 자유롭게 사용할 수 있습니다.
	void init() { a = c*100; b = c*200; }
	
	int add () { return a + b; }
	int subtract () { return a - b; }
	int multiply () { return a * b; }
	double divide () { return a / (double)b; }
	// 인스턴스 메서드들은 인스턴스 변수들도 자유롭게 사용 가능합니다.
	
	// 반면에 스태틱 메서드는 인스턴스 변수를 사용할 수 없습니다. 스태틱 변수와 매개변수만 사용가능합니다.
	static int add (int e, int d) { return e + d + c; }
	static int subtract (int e, int d) { return e - d + c; }
	static int multiply (int e, int d) { return e * d + c; }
	static double divide (double e, double d) { return e / d + c; }
}
public class Class24 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		mm.init();
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
		System.out.println(MyMath.add(10, 30));
		System.out.println(MyMath.subtract(10, 30));
		System.out.println(MyMath.multiply(10, 30));
		System.out.println(MyMath.divide(10, 30));
	}

}
