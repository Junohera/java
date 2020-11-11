package days13;
// int 형 데이터하나를 매개변수로 하는 생성자와 디폴트 생성자가 오버로딩된 생성자를 갖는 클래스 제작
// 멤버 필드 int dan;
// 멤버 메서드 : dan 값이 0이면 2~9단의 구구단 모두 출력, 0이 아니면 해당 구구단만 출력하는 메서드 제작
// 디폴트 생성자는 dan 변수를 0으로 저장, 전달인수가 잇는 생성자는 dan 변수를 전달인수 값으로 저장
// 메서드 이름 : print()
// 클래스 이름 : Gugudan
class Gugudan {
	private int dan;
	
	Gugudan() {}
	Gugudan(int dan) { this.dan = dan; }
	
	public void print() {
		if (this.dan != 0)
			printDan(dan); // 멤버 메서드들간에는 메서드(printDan)를 호출하는 객체 없이 호출이 가능합니다.
		else 
			for (int dan = 2; dan < 10; dan++)
				printDan(dan);
		
		System.out.println();
	}
	
	private void printDan(int dan) {
		for (int i = 1; i < 10; i++) System.out.printf("%2d x %2d = %2d ", dan, i, dan*i);
		System.out.println();
	}
}
public class Class16 {
	public static void main(String[] args) {
		Gugudan g1 = new Gugudan(8);
		Gugudan g2 = new Gugudan();
		g1.print();
		g2.print();
	}
}
