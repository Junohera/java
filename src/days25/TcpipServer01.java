package days25;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

// 현재 제작하는 클래스 : 서버역할을 하면서 ... 
// 자신에게 연결을 요청하는 클라이언트의 요청을 수락하고 연결을 완성해줄 클래스

public class TcpipServer01 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(7777); // 서버 소켓 객체 생성
			// 7777 : 포트 번호                                                                                                                                                              
			// 네트워크상의 서버 소켓으로 실행할 연결은 여러역할이 있을 수 있으며, 역할을 서로 구분하기 위해
			// 포트 번호를 설정합니다. 만들어지는 소켓마다 생성자에 전달하여 설정합니다.
			// 여기까지 완료되면 서버가 연결을 받아주기 위한 준비가 완료된 것입니다.
			System.out.println(getTime() + " 서버가 준비되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 서버소켓은 준비 완료 이후 클라이언트의 연결요청이 올 때까지 실행을 잠시 멈추고 계속 기다립니다.
		while (true) {
			try {
				System.out.println(getTime() + " 연결 요청을 기다립니다.");
				Socket s = ss.accept(); // 연결 요청을 캐치해서 통신 소켓에 전달합니다.
				// 클라이언트의 연결요청이 오면 클라이언트 소켓과 통신할 새로운 통신용 소켓을 생성하고,
				// 서버소켓이 연결해놓은 서버연결정보를 전달합니다.
				System.out.println(getTime() + s.getInetAddress() + " 로부터 연결요청이 들어왔습니다.");
				
				// 소켓의 출력스트림을 DataOutputStream에 전달해서 서버 -> 클라이언트의 데이터 출력을 준비합니다.
				// 소켓의 OutputStream -> 시스템의 OutputStream -> DataOutputStream 전달
				OutputStream out = s.getOutputStream();
				DataOutputStream dos = new DataOutputStream (out);
				// 최종 통신 출력 도구 : dos
				
				// 원격 소켓(remote socket)에 메시지를 보냅니다.
				dos.writeUTF("[공지] 204호 04번 자리서버로부터 테스트 메시지가 전송되었습니다?");
				
				System.out.println(getTime() + " 데이터를 전송했습니다.");
				dos.close();
				s.close(); // 스트림과 소켓을 닫아준다.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
}
