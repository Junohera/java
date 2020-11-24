package days22;
/*
 * Thread : 프로그램의 명령을 실행하게끔 해주는 실행 주체.
 * 개발자가 별도의 Thread를 생성하지 않는다면, 한 프로그램에 하나의 Thread가 존재하여
 * 해당 명령을 차례차례 순서대로 실행시킴.
 */

class Thread_A_1 {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Thread_A_1 : i -> %d\n", i);
		}
	}
}
class Thread_A_2 {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Thread_A_2 : i -> %d\n", i);
		}
	}
}
public class Thread01 {
	public static void main(String[] args) {
		Thread_A_1 t1 = new Thread_A_1();
		Thread_A_2 t2 = new Thread_A_2();
		t1.run();
		t2.run();
		for (int i = 1; i <= 10; i++) {
			System.out.printf("main : i -> %d\n", i);
		}
	}
}
