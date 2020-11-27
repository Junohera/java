package days25;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpipServer02 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		
		try {
			ss = new ServerSocket(7777);
			System.out.println(getTime() + " 서버가 준비되었습니다.");
		} catch (IOException e) { e.printStackTrace(); }
		
		while (true) {
			try {
				System.out.println(getTime() + " 연결 요청을 기다립니다.");
				
				ss.setSoTimeout(8000); // 서버 소켓이 클라이언트 요청을 기다리는 시간 설정
				// 설정된 시간이 지날때까지 요청이 없으면 SocketTimeoutException 예외가 발생합니다.
				
				Socket s = ss.accept();
				System.out.println(getTime() + s.getInetAddress() + " 로부터 연결요청이 들어왔습니다.");
				OutputStream out = s.getOutputStream();
				DataOutputStream dos = new DataOutputStream (out);
				dos.writeUTF("[공지] 204호 04번 자리서버로부터 테스트 메시지가 전송되었습니다?");
				System.out.println(getTime() + " 데이터를 전송했습니다.");
				dos.close();
				s.close();
			} catch (SocketTimeoutException e) {
				System.out.println(getTime() + " 접속시간 초과. 서버를 종료합니다.");
				System.exit(0);
			} catch (IOException e) { e.printStackTrace(); }
		}
	}
	
	static String getTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
		return sdf.format(new Date());
	}
}
