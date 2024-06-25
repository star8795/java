package n2_socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

	public static void main(String[] args) {
		
		// 운영체제에서 지정한 포트번호를 외부에서 연결할 수 있도록
		// 할당 받아 연결요청이 들어온 client Socket을 생성하는 class
		ServerSocket server = null;
		
		try {
			// 운영체제에서 5001번 포트를 할당 받아 서버 오픈
			server = new ServerSocket(5001);
			
			while(true) {
				
				System.out.println("클라이 언트 연결 대기중...");
				// accept(); : client에서 연결 요청이 들어올때 까지 대기하다가
				// 연결 요청이 들어오면 요청이 들어온 클라이언트 정보를 Socket 객체에 
				// 저장하여 반환
				Socket client = server.accept();
				System.out.println("Client 연결 수락");
				// server -> output => client
				// server -> input <= client
				System.out.println(client.getRemoteSocketAddress());
				
				// 연결 수락된 클라이언트와 데이터 송/수신
				OutputStream os = client.getOutputStream();
				
				byte[] bytes = null;
				String message = null;
				
				message = "반가워요~!~!";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("데이터 출력 완료");
				
				
				
				
				// 연결된 클라이언트와 자원 해제 - 클라이언트와 통신 불가
				client.close();
			}
		} catch (IOException e) {
			// 해당 포트가 이미 사용중일 경우
			// 포트번호를 할당 받을 수 없음.
			e.printStackTrace();
		}finally {
			try {
				if(server != null) {
					// 할당된 포트 해제
					server.close();
				}
			} catch (IOException e) {}
		} // end try catch finally
	} // end main

}