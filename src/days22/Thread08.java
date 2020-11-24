package days22;

import javax.swing.JOptionPane;

class Thread_C_2 extends Thread {
	private boolean state = true;
	public void setState(boolean s) { this.state = s; }
	@Override
	public void run() {
		for (int i = 10; i > 0 && this.state == true; i--) {
			System.out.println(i);
			try { sleep(1000); }
			catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
}
public class Thread08 {
	public static void main(String[] args) {
		Thread_C_2 t2 = new Thread_C_2();
		t2.start();
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		// t2.stop();
		// t2.stop(); Thread의 stop()메서드는 사용중이었던 자원(변수, 메모리 등)의 불안정을
		// 초래하기 때문에 지금은 사용하지 않습니다.
		t2.setState(false);
		System.out.println("입력하신 값은 " + input + "입니다.");
	}
}
