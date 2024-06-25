package f04_try_with_resouces;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class TryWithResoucesExample {

	public static void main(String[] args) {
		String path = "C:\\Temp\\file2.txt";
		String copyPath = "C:\\Temp\\copy.txt";
		
		// path 파일을 읽어서
		// copyPath 경로 파일에 출력
		try(InputStream is = new FileInputStream(path);
			OutputStream os = new FileOutputStream(copyPath);){
			
			int data; // 입력스트림을 통해서 읽어들인 byte 값이 저장
			while((data = is.read()) != -1) {
				System.out.println(data);
				os.write(data);
			}
			os.flush();
		}catch(IOException e) {
			e.printStackTrace();
		} // try catch end
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력");
		String result = sc.next();
		System.out.println(result);
		sc.close();
	} // end main
}