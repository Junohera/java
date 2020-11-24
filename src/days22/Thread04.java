package days22;

/*
 * 2. Runnable 인터페이스를 
 */

class Thread_D_1 implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Thread_D_1 : i -> %d\n", i);
			try { Thread.sleep(1000); }
			catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
}

class Thread_D_2 implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Thread_D_2 : i -> %d\n", i);
			try { Thread.sleep(1000); }
			catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
}
public class Thread04 {
	public static void main(String[] args) {
		// Runnable 인터페이스를 구현한 쓰레드 생성
		// 1. Runnable 인터페이스를 구현한 클래스의 객체 생성
		Thread_D_1 t1 = new Thread_D_1();
		// 2. 1에서 생성된 객체를 Thread 생성자에 전달인수로 전달하며 Thread객체 생성
		Thread t = new Thread(t1);
		// 3. 2에서 생성된 Thread객체를 사용하여 start 메서드 호출
		t.start();
		
		// 위의 과정을 한 라인으로 작성한 코드
		new Thread(new Thread_D_2()).start();
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("main : i -> %d\n", i);
			try { Thread.sleep(1000); }
			catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
}
