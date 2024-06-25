package f05_reader_writer;

import java.io.*;
import java.util.Scanner;

public class ReaderWriterExample {

	public static void main(String[] args) {
		// local network 파일 읽기
		// \\10.100.205.231
		String path = "\\\\10.100.205.231\\public\\etc\\강사 연락처 및 공유폴더.txt";
		
		Reader reader = null;
		Writer writer = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			reader = new FileReader(path);
			char[] chars = new char[100];
			
			int readChar;
			
			String result = "";
			
			while((readChar = reader.read(chars)) != -1) {
				result += new String(chars, 0, readChar);
			}
			System.out.println(result);
			
			System.out.println("=====================================");
			System.out.println("추가할 문자열을 입력해 주세요 > ");
			String appendStr = sc.nextLine(); // 추가할 문자열 한줄 입력받기
			
			// 기존 파일에 이어쓰기
			writer = new FileWriter(path, true);
			writer.write(appendStr);
			writer.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				// Writer 출력 스트림 자원 해제
				if(writer != null) writer.close();
			} catch (IOException e) {}
			
			try {
				// reader 입력 스트림 자원 해제
				if(reader != null)reader.close();
			} catch (IOException e) {}
			
		} // end try catch finally
		
	} // end main method

}