package f05_reader_writer;

import java.io.Console;

/**
 * PS C:\Users\admin\Desktop> java -jar test.jar
	아이디 : id001
	비밀번호 :
	아이디는 : id001
	패스워드는 : pw001
 */

public class ConsoleExample {

	public static void main(String[] args) {
		// Console 객체는 실제 운영체제의 
		// CLI 텍스트 기반 입출력 인터페이스 에서만 동작
		// (Command-Line Interface)
		// GUI(Graphic User Interface)
		// java.io.Console
		Console console = System.console();
		System.out.print("아이디 : ");
		// 사용자에게 콘솔을 통해서 한 문장 - 한라인을 입력받음.
		String id = console.readLine();
		System.out.print("비밀번호 : ");
		// 콘솔을 통해서 한 문장(한라인)을 입력받으나 콘솔에 노출되지않음.
		char[] password = console.readPassword();
		String pass = new String(password);
		System.out.println("아이디는 : " + id);
		System.out.println("패스워드는 : " + pass);
	}
}