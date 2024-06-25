package f06_buffered;

import java.io.*;

public class StreamReaderWriterExample {

	public static void main(String[] args) {
		// byte -> char
		// InputStreamReader
		// char -> byte
		// OutputStreamWriter
		// 문자 기반 성능 향상 보조 스트림
		// BufferedReader, BufferedWriter
		
		InputStream is = System.in;
		
		try {
			// inputStream => Reader => buffered
			Reader reader = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(reader);
			
			// 보조스트림을 이용한 출력 스트림
			BufferedWriter writer = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("C:\\Temp\\fos.txt",true))	
					// new FileWriter("C:\\Temp\\fos.txt")
			);
			/*
			OutputStream os = new FileOutputStream("C:\\Temp\\fos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			*/
			System.out.println("입력 대기중....");
			String readData = "";
			while(true) {
				// 입력된 데이터를 한 라인(한줄) 씩 읽음.
				readData = br.readLine();
				// readData 문자열이 quit로 시작하는 문자열이면 true
				// 아니면 false
				if(readData.startsWith("quit")) {
					break;
				}
				writer.write(readData);
				// 줄바꿈
				writer.newLine();
			} // end while
			
			writer.flush();
			writer.close();
			br.close(); // System.in.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

} 