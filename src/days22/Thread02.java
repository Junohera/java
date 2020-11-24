package days22;
/*
 * 프로그램의 수행 중 동시에 처리하고자 하는 작업이 생겼을 때는 원래 갖고 있는 메인 Thread 외에
 * Thread 클래스를 추가사용하여 실행시킬 수 있습니다.
 * Thread Class : 프로그램 실행의 흐름을 분기할 수 있는 방법을 제공하는 클래스.
 * 
 * 구현방법
 * 1. Thread 클래스를 상속받는 방법
 * 		1-1. Thread Class를 상속받아 public void run() 메서드를 오버라이딩 합니다.
 * 			public void run() : 쓰레드가 생성되어 수행할 작업을 정의하는 메서드
 * 		1-2. 해당 클래스의 객체를 생성하고, start메서드를 호출(실행)합니다.
 * 			만약 오버라이딩된 run 메서드를 호출하면, 쓰레드 생성실행이 아니라, 일반메서드 호출이 되므로
 * 			반드시 start 메서드를 통해 run으로 이어지게 호출합니다.
 * 			start 메서드 : Thread Class(부모클래스)에 있는 메서드로, 자체적으로 쓰레드 추가 생성후
 * 				run 메서드를 재호출하는 역할을 합니다.(상속된 메서드로 메서드가 표면에 보여지지는 않은채 사용됩니다.)
 * 2. Runnable 인터페이스를 implements(구현)하는 방법
 * 		2-1. Thread Class를 상속받는 방법과 같고 효과도 거의 같습니다.
 */

class Thread_B_1 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Thread_B_1 : i -> %d\n", i);
			try {
				sleep(300); // 0.3초간 실행을 딜레이(일시정지) 하라는 Thread 클래스의 static메서드
				// 자신의 클래스 안에서 실행되는 경우이므로, 클래스네임. 은 붙이지 않습니다.
				// 프로세서 실행에 관여한 메서드로 예외처리가 따라다닙니다.
			} catch (InterruptedException e) { e.printStackTrace(); }
 		}
	}
}

class Thread_B_2 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Thread_B_2 : i -> %d\n", i);
			try { sleep(300); } 
			catch (InterruptedException e) { e.printStackTrace(); }
 		}
	}
}

public class Thread02 {
	public static void main(String[] args) {
		Thread_B_1 t1 = new Thread_B_1();
		Thread_B_2 t2 = new Thread_B_2();
		
		t1.start();
		t2.start();
		for (int i = 1; i<= 10; i++) {
			System.out.printf("main : i -> %d\n", i);
			try { Thread.sleep(300); }
			catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
}
