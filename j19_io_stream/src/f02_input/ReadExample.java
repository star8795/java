package f02_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class ReadExample {

	public static void main(String[] args) {
		// java.io package import 추가
		File file = new File("C:\\Temp\\file.txt");
		System.out.println(file.length());
		
		try {
			// IOStream 객체가 생성됨과 동시에 파일과 연결된 상태
			InputStream is = new FileInputStream(file);
			byte[] bytes = new byte[100];
			// IOStream에 연결된 파일 정보를 매개변수로 
			// 전달한 byte[] 에 저장하고 실제 저장된 byte 개수를 반환
			int readBytes = is.read(bytes);
			// 파일에서 읽은 바이트
			System.out.println(Arrays.toString(bytes));
			System.out.println(readBytes); // 읽은 바이트 수
			is.close(); // 입력스트림에 연결된 파일 자원 해제
			
			// bytes 배열에 저장된 데이터를 문자열로 변환
			String result = new String(bytes, 0, readBytes);
			System.out.println(result);
			
			// 한번 연결이 끊긴(close된) 입출력 스트림은 재사용 불가
			is = new FileInputStream(file);
			// 현재 연결된 파일에서 읽을 수 있는 파일의 바이트 수
			int available = is.available();
			System.out.println("읽을 수 있는 파일의 크기 : " + available);
			// 파일 정보를 저장할 배열 생성
			bytes = new byte[available];
			// 파일 데이터에서 0번째 인덱스 부터 길이 만큼 
			// 읽은 데이터를 bytes 배열에 저장
			// readBytes = is.read(bytes, 0, bytes.length);
			// 0  1  2  3  4  5  6 
			//[A][B][C][D][E][F][G]
			// 0번째 인덱스 부터 파일에서 3개 만큼 읽어 bytes 배열에 저장
			readBytes = is.read(bytes, 0, 3);
			
			System.out.println(Arrays.toString(bytes));
			System.out.println(readBytes);
			result = new String(bytes);
			System.out.println(result);
			is.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}