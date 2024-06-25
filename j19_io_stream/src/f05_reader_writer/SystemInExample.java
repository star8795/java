package f05_reader_writer;

import java.io.*;

public class SystemInExample {

	public static void main(String[] args) throws IOException{
		
		InputStream is = System.in;
		
		while(true) {
			int i = is.read();
			System.out.println(i);
			if(i == 'q') break;
			System.out.println("입력받은 값은 : " + (char)i);
		}
		
		// is.close();
		System.out.println("입력해주세요.");
		byte[] bytes = new byte[100];
		int readBytes = is.read(bytes);
		String str = new String(bytes, 0, readBytes);
		System.out.println(str);
		
		is.close();
		
	}

}
