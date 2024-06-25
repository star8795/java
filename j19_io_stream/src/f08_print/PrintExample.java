package f08_print;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintExample {

	public static void main(String[] args) {
		
		File file = new File("data.txt"); // 프로젝트 폴더에 생성
		
		try {
			FileOutputStream fos = new FileOutputStream(file,true);
			PrintStream ps = new PrintStream(fos);
			ps.println();	// 개행, 줄바꿈
			ps.println("[ 프린트 보조 스트림 ]");
			ps.print(1);
			ps.print("등 입니다.");
			ps.println("마치 콘솔에 출력 하듯이 ");
			ps.println("파일에 데이터를 출력합니다.");
			ps.printf("A의 값은 %d입니다. %n",65);
			ps.println("===============================");
			ps.flush();
			ps.close();
			System.out.println("ps 출력 완료");
			System.out.println("===========================");
			
			// fos = new FileOutputStream(file, true);
			FileWriter fw = new FileWriter(file,true);
			PrintWriter writer = new PrintWriter(fw,true); // autoFlush
			writer.println("[ PrintWriter ]");
			writer.println("사용 방법은 동일");
			writer.printf("내이름은 %s 입니다. %n", "카리나");
			writer.println(false);
			writer.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}