package n2_socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExample {

	public static void main(String[] args) {
		
		try {
			System.out.println("[ Server에 연결 요청 ]");
			Socket socket = new Socket("10.100.205.231",5001);
			System.out.println("[ Server와 연결 성공 ]");
			System.out.println(socket.getRemoteSocketAddress());
			
			byte[] bytes = new byte[100];
			String message = "";
			// 서버에서 출력된 데이터를 입력 받기 위한 입력 스트림 
			InputStream is = socket.getInputStream();
			// 입력 스트림으로 연결된 스트림에서 출력된 데이터를 bytes 배열에 저장 후
			// 입력받은 바이트 개수를 반환
			// 서버에서 출력된 데이터를 입력받기 위해서 
			// 데이터가 수신 될때 까지 blocking - 대기
			System.out.println("클라이언트 수신 대기");
			int readBytes = is.read(bytes);
			message = new String(bytes, 0 , readBytes, "UTF-8");
			System.out.println("[ 입력받은 데이터 : " + message + "]");
			
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}