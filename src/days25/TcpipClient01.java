package days25;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpipClient01 {

	public static void main(String[] args) throws ConnectException {
		String serverIp = "192.168.0.20";
		
		 try {
			Socket s = new Socket(serverIp, 7777);
			// 연결이 성공하면 아래 문장을 실행. 실패하면 catch구문 실행
			
			InputStream in = s.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			String m = dis.readUTF();
			// 소켓으로부터 받은 데이터를 출력한다.
			System.out.println("받은 메시지 : " + m);
			System.out.println("연결을 종료합니다.");
			
			// 스트림과 소켓을 닫습니다.
			dis.close();
			s.close();
			System.out.println("연결이 종료되었습니다.");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		}
		 
	}

}
