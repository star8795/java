package n3_chat.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientExample {
	
	// console에서 서버에 출력(전송)할 메세지를 입력
	Scanner sc = new Scanner(System.in);
	
	/**
	 * server와 연결된 Socket정보를 저장
	 */
	Socket socket;
	
	// ClientExample 객체 생성 시
	// Client 프로그램 실행
	public ClientExample() {
		startClient();
	}
	
	/*
	 * 서버와 연결 작업 수행
	 */
	public void startClient() {
		
		try {
			socket = new Socket();
			// 서버에서 연결이 수락 될때 까지 blocking - 대기
			socket.connect(new InetSocketAddress("10.100.205.231",5002));
			System.out.println("연결 완료");
			System.out.println(socket.getRemoteSocketAddress()); // server
			
			// 서버에서 전달되는 메세지를 수신 대기 및 수신 처리
			receive();
			
			// 콘솔을 통해서 서버에 출력할 메세지를 입력 받아 메세지 출력
			while(true) {
				System.out.print("메세지 입력 : ");
				String message = sc.nextLine();
				send(message);
			}
			
		} catch (IOException e) {
			stopClient();
		}
	} // end startClient
	
	// 자원해제 후 안전하게 client 종료
	public void stopClient() {
		System.out.println("자원 해제");
		if(socket != null && !socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {}
		} // end if
	} // end stop client

	// 서버에 메세지 출력
	public void send(String message) {
		try {
			OutputStream os = socket.getOutputStream();
			byte[] bytes = message.getBytes();
			os.write(bytes);
			os.flush();
		} catch (IOException e) {
			stopClient();
		}
	} // end send
	
	// 서버에서 송신된 메세지를 수신
	public void receive() {
		Thread t = new Thread(()->{
			while(true) {
				InputStream is = null;
				byte[] bytes = new byte[300];
				try {
					is = socket.getInputStream();
					// 서버에서 데이터가 수신되기 전까지 blocking - 대기
					int readByte = is.read(bytes);
					String message = new String(bytes,0,readByte);
					System.out.println(message);
				} catch (IOException e) {
					System.out.println("서버와 연결 끊김");
					stopClient();
					break;
				}
			} // end while
		});
		t.start();
	} // end receive
	
	
	public static void main(String[] args) {
		new ClientExample();
	} // end main

}