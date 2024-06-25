package n3_chat.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Socket으로 연결된 client 정보를 저장하고
 * 개별 송/수신을 담당할 class
 */
public class Client {
	
	Socket socket; // accept된 클라이언트 소켓 정보
	
	public Client(Socket socket) {
		this.socket = socket;
		// 연결 수락이 완료되면 client에서 수신 대기
		receive();
	}
	
	/**
	 * socket으로 연결된 client에게 
	 * server에서 문자열 데이터를 매개변수로 넘겨받아 출력
	 */
	public void send(String message) {
		OutputStream os = null;
		byte[] bytes = message.getBytes();
		try {
			os = socket.getOutputStream();
			os.write(bytes);
			os.flush();
		} catch (IOException e) {
			System.out.println("Client 통신 안됨");
			// 통신이 불가능한 소켓 자원 해제
			if(socket != null && !socket.isClosed()) {
				try {
					socket.close();
				} catch (IOException e1) {}
			} // end if
			ServerExample.clients.remove(this);
		} // end try catch
		
		
	}
	
	/**
	 * client에서 송신된 데이터를 수신
	 */
	public void receive() {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				// 반복하면서 client에서 출력된 데이터를 수신받아 모든 client에게 출력
				while(true) {
					InputStream is = null;
					byte[] bytes = new byte[100];
					
					try {
						is = socket.getInputStream();
						// client에서 발신 될때까지 대기(blocking)
						int readCount = is.read(bytes);
						// sender == IP:PORT
						String sender = socket.getInetAddress().getHostAddress()+":"+socket.getPort();
						String message = new String(bytes,0, readCount);
						message = sender +" - " + message;
						System.out.println(message);
						// 연결된 모든 클라이언트에 메세지 출력
						for(Client c : ServerExample.clients) {
							c.send(message);
						} // end for
						// 메세지 출력 완료
					} catch (IOException e) {
						System.out.println("Client - 통신 안됨");
						// socket이 closed 자원해제가 되어 있지 않은 상태면 자원해제
						if(!socket.isClosed()) {
							try {
								socket.close();
							} catch (IOException e1) {}
						}// end if
						
						// 연결된 클라이언트 목록에서 제거
						ServerExample.clients.remove(this);
						break; // while 문 종료
					} // end try catch
				} // end while
			}
		});
		t.start();
	} // end receive
	
}