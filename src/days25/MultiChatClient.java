package days25;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

class ClientSender extends Thread {
	Socket s;
	DataOutputStream out;
	String name;
	
	ClientSender(Socket socket, String name) {
		this.s = socket;
		this.name = name;
		try {
			out = new DataOutputStream(s.getOutputStream());
		} catch (IOException e) { e.printStackTrace(); }
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		while (out != null) {
			try {
				out.writeUTF(name); // 최초 접속시 이름을 서버에 보냄
//				while (out != null) {
					out.writeUTF("[" + name +  "]" + sc.nextLine());
//				}
				// 이후 화면에 쓰는 내용을 모두 서버로 전송(프로그램 종료시까지 무한 반복)
			} catch (IOException e) { e.printStackTrace(); }
		}
	}
}

class ClientReceiver extends Thread{
	Socket s;
	DataInputStream in;
	String name;
	
	ClientReceiver(Socket socket) {
		this.s = socket;
		try {
			in = new DataInputStream(s.getInputStream());
		} catch (IOException e) { e.printStackTrace(); }
	}
	
	@Override
	public void run() {
		while (in != null) {
			try { System.out.println(in.readUTF()); } 
			catch (IOException e) { e.printStackTrace(); }
		}
	}
}

public class MultiChatClient {
	public static void main(String[] args) {
		String serverIp = "127.0.0.1";
		try {
			Socket s = new Socket(serverIp, 7777);
			System.out.println("서버에 연결되었습니다.");
			ClientSender cs = new ClientSender(s, args[0]);
			ClientReceiver cr = new ClientReceiver(s);
			cs.start();
			cr.start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
			System.out.println("해당 아이피의 서버(호스트)를 찾을 수 없습니다.");
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("해당 아이피의 서버(호스트)와 연결에 실패했습니다.");
			System.exit(0);
		} finally {
			
		}
	}
}
