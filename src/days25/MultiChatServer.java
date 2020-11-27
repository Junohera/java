package days25;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class MultiChatServer {
	
	public static void main(String[] args) {
		MultiChatServer multiChatServer = new MultiChatServer();
		multiChatServer.ready();
	}
	
	HashMap clients; // 접속중인 클라이언트와 연결들을 관리할 리스트
	/*
	 * key : 클라이언트의 이름 - 클라이언트 접속과 함께 전달된 이름 : 숫자로 구성됨
	 * value : 클라이언트에 연결된 이름(key)으로 생성된 out 객체, key 값의 클라이언트 전용 전송객체
	 */
	MultiChatServer() {
		 clients = new HashMap();
		 Collections.synchronizedMap(clients);
		 // MultiThread 환경에서 단일 해쉬맵에 MultiThread가 동시 접근하여 값을 변경하는 것을 막는 동기화 도구.
	}

	class ServerReceiver extends Thread {
		Socket s;
		DataInputStream in;
		DataOutputStream out;
		ServerReceiver(Socket socket) {
			this.s = socket;
			try {
				in = new DataInputStream(s.getInputStream());
				out = new DataOutputStream(s.getOutputStream());
			} catch (IOException e) { System.out.println("송수신객체 생성에 실패했습니다."); }
		} // 송수신을 위한 객체 생성 (생성자)
		
		public void run() { // 접속 클라이언트 명수 만큼 그 실행이 독립실행됩니다.
			String name = "";
			
			try {
				name = in.readUTF(); // 접속과 함께 전달된 이름을 저장
				System.out.println(name);
				clients.put(name, out);
				sendToAll("#" + name + " 님이 들어오셨습니다."); // 이름을 출력(모든 클라이언트에게)
				System.out.println("현재 서버 접속자 수는 " + clients.size() + " 입니다. " );
				
				while (in != null) {
					sendToAll(in.readUTF());
				}
			} catch (SocketException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace(); 
			} finally {
				try {
					sendToAll("#" + name + "님이 나가셨습니다.");
					clients.remove(name); // 해쉬맵에서 현재 사용자 삭제
					System.out.println("[" + s.getInetAddress() + " : " + s.getPort() + "]" + " 에서 접속을 종료하였습니다.");
					System.out.println("현재 서버접속자 수는 " + clients.size() + "입니다.");	
				} catch (Exception e) {
					System.out.println("###############");
					e.printStackTrace();
				}
				
			}
		}
	} // 각 클라이언트 한명당 하나의 ServerReveiver가 new ServerReveiver()로 만들어져 start 실행
	// 만들어진 ServerReceiver 객체 안에는 접속 Client의 이름, in과 out 객체 등이 들어 있습니다.
	
	void sendToAll(String msg) {
		Iterator it = clients.keySet().iterator(); // 해쉬맵의 키들에 차례로 접근할 수 있는 이터레이터 생성
		
		while (it.hasNext()) { // 키값의 마지막까지 다다를때까지 반복실행
			try {
				// 클라이언트에서 (next)키값으로 얻어낸 Value(클라이언트전용out 객체)를 꺼내서 out에 저장
				DataOutputStream out = (DataOutputStream)clients.get(it.next());
				out.writeUTF(msg); // 해쉬맵에서 꺼내온 out 객체를 통해 메시지 전송
			} catch (SocketException e) {
				System.out.println("#################");
			} catch (IOException e) { e.printStackTrace();
			}
		}
		// clients 해쉬맵에 있는 각 클라이언트의 OutputStream을 각각 꺼내어 현재 메시지를 전송
	}
	
	public void ready() {
		ServerSocket sS = null; // 클라이언트들과 연결을 제어
		Socket s = null; // 각 클라이언트와 통신제어
		
		try {
			sS = new ServerSocket(7777);
			System.out.println("서버가 준비되었습니다.");
			
			while(true) {
				System.out.println("서버가 시작되었습니다.");
				s = sS.accept();
				System.out.println("[" + s.getInetAddress() + " : " + s.getPort() + "]" + "에서 접속하였습니다.");
				
				// 아이피와 포트번호로 접속 알림(서버화면)
				ServerReceiver th = new ServerReceiver(s);
				// 연결된 소켓을 전달인수로 쓰레드 생성. 매 접속하는 클라이언트 마다 새로운 소켓과 쓰레드가
				th.start(); // 쓰레드 시작
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("서버 소켓 생성에 실패했습니다. 서버를 종료합니다.");
			System.exit(0);
		}
	}
}
