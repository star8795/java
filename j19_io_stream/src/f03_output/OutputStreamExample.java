package f03_output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class OutputStreamExample {

	public static void main(String[] args) {
		String path = "C:\\Temp\\file2.txt";
		
		try {
			// 지정된 경로에 디렉토리가 존재할 경우.
			// 마지막에 지정된 출력할 파일이 존재하지 않으면
			// 파일을 생성하고 그 정보를 저장한다.
			// 기존에 파일이 존재할 경우 존재하는 파일 정보를 저장
			// OutputStream os = new FileOutputStream(path);
			// new FileOutputStream("출력할 파일","이어쓰기 여부");
			OutputStream os = new FileOutputStream(path,true);
			String str = "한글";
			// 문자열을 byte 배열로 반환
			byte[] bytes =  str.getBytes();
			System.out.println(Arrays.toString(bytes));
			/*
			for(int i = 0; i < bytes.length; i++) {
				// 1byte씩 연결된 파일에 출력
				os.write(bytes[i]);
			}
			*/
			// 매개변수로 전달받은 모든 byte배열을 출력
			os.write(bytes);
			//   0     1    2      3   4     5
			// [-19, -107, -100, -22, -72, -128]
			// bytes 배열에서 3번째 인덱스 부터 3개 만큼 출력
			os.write(bytes,3,3); // [-22, -72, -128]
			
			// 버퍼에 잔존하는 데이터 출력
			os.flush();
			// 연결된 파일의 사용 자원 반납(해제)
			os.close();
		// FileNotFoudException 예외 객체는 IOException의 하위 예외	
		} catch (IOException e) { // java.io.IOException
			e.printStackTrace();
		}
		
	}

}