package f05_reader_writer;

import java.io.*;

public class WriterExample {

	public static void main(String[] args) {
		
		try(Writer writer = new FileWriter("C:\\Temp\\data.hwp",true)){
			
			String strs = "최기근님";
			// 저장된 문자열을 character type의 배열로 반환
			char[] chars = strs.toCharArray();
			// ['최']['기']['근']['님']
			for(char c : chars) {
				// char 한 문자씩 출력
				writer.write(c);
			}
			
			// char[] 에 저장된 문자들을 한번에 출력
			writer.write(chars);
			// char[]에 3번째 인덱스 부터 1개의 문자 출력
			writer.write(chars, 3, 1);
			writer.write("박보영님");
			writer.write("이유리님", 0, 3); // '님' 제외
			writer.flush();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	} // end main
}
