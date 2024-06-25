package n3_chat.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;

public class ServerExample {
	/**
	 * 운영체제에서 포트번호를 할당 받아
	 * 연결요청을 보낸 Socket 정보를 수락과 함께 
	 * Socket 객체로 제공해줄 class
	 */
	ServerSocket serverSocket;
	// 모든 클라이언트 가 공유할 연결 수락이 완료된 client 목록을 저장할 list
	static List<Client> clients = new Vector<>();
	
	
	// 서버 실행
	public void startServer() {
		
		try {
			serverSocket = new ServerSocket();
			// 5002번 포트를 사용하는 ServerSocket 생성
			serverSocket.bind(new InetSocketAddress(5002));
			System.out.println("[ Server Open ]");
			System.out.println(serverSocket);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// client 연결 요청을 수락
		while(true) {
			
			try {
				System.out.println("[ Client 연결 대기중... ]");
				// 한 유저(Client)의 연결이 수락 완료 될때까지 blocking(대기)
				Socket client = serverSocket.accept();
				InetSocketAddress isa 
					= (InetSocketAddress)client.getRemoteSocketAddress();
				// IP 주소
				String host = isa.getHostString();
				System.out.println("연결 수락 : " + host);
				
				Client c = new Client(client);
				clients.add(c);
				System.out.println("연결된 client 수 : " + clients.size());
			} catch (IOException e) {
				System.out.println("서버 종료 : " + e.getMessage());
				stopServer();
				break;
			}
		} // end while
	} // end startServer
	
	// 할당된 자원 해제 후 안전하게 서버 종료
	public void stopServer() {
		
	}

	public static void main(String[] args) {
		ServerExample server = new ServerExample();
		server.startServer(); // server 실행
	} // end main

}