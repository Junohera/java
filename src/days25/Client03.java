package days25;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
/*
class Sender extends Thread {
	DataOutputStream out; // 메시지 전송(송신)용 출력 스트림
	Socket s;
	String name;
	
	Sender(Socket socket) {
		this.s = socket; // 생성자를 통해 전달되어 온 소켓 인스턴스를 자신의 소켓 변수에 장착
		try { 
			out = new DataOutputStream(s.getOutputStream()); // 출력 스트림 생성
			// 메시지 전달시 앞에 붙여줄 말머리
			name = "[" + s.getInetAddress() + ":" + s.getPort() + "]";
		} catch (IOException e) { e.printStackTrace(); }
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		// out 레퍼런스변수가 널값이 아니라면 : out instance가 할당되어 있는 상태라면
		while (out != null) {
			// out instance는 생성자에서 최초 new로 생성되어 프로그램 종료시까지 계속 없어지지 않습니다.
			// 결국 화면입력 내용을 기다리다 입력이 들어오면 상대방에게 전송하는 작업을 계속 하라는 뜻입니다.
			try {
				String msg = sc.nextLine();
				out.writeUTF(name + msg); // 말머리 + 화면에 입력한 내용을 전송
			} catch (IOException e) { e.printStackTrace(); }
		}
	}
}

class Receiver extends Thread {
	DataInputStream in; // 메시지 전송(수신)용 입력 스트림
	Socket s;
	Receiver(Socket socket) {
		this.s = socket;
		try {
			in = new DataInputStream(s.getInputStream());
		} catch(IOException e) { System.out.println("메시지 수신 객체를 생성하지 못했습니다."); }
	}
	public void run() {
		while (in != null) {
			try {
				System.out.println(in.readUTF()); // 입력되어 오는 메시지를 받아 화면에 출력
			} catch (IOException e) {}
		}
	}
}
*/
public class Client03 {
	public static void main(String[] args) {
		String serverIp = "127.0.0.1";
		try {
			Socket s = new Socket(serverIp, 7777);
			System.out.println("서버에 연결되었습니다.");
			Sender sd = new Sender(s);
			Receiver rc = new Receiver(s);
			sd.start();
			rc.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
