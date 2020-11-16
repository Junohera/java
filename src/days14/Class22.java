package days14;

class StaticB {
	static int count = 0;
	int num;
	public StaticB() {
		this.num = count++; // 생성자 method에서 count값을 1씩 증가시키며, 그 값을 num에 저장
	}
	// num값은 객체가 만들어질때마다(생성자가 호출될 때마다) 1씩 증가하는 순차값을 갖게되며,
	// count값은 현재 몇개의 객체가 만들어졌는지에도 활용할 수 있습니다.
}
public class Class22 {
	public static void main(String[] args) {
		StaticB c1 = new StaticB();
		System.out.printf("num = %d, count = %d\n",  c1.num, StaticB.count);
		StaticB c2 = new StaticB();
		System.out.printf("num = %d, count = %d\n",  c2.num, StaticB.count);
		StaticB c3 = new StaticB();
		System.out.printf("num = %d, count = %d\n",  c3.num, StaticB.count);
	}
}
