package f01_file;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {
		// File 객체
		// 지정된 경로에 존재하는 파일 또는 디렉토리 정보를 저장하는 class
		// 지정된 경로에 파일 또는 디렉토리를 조작하는 기능도 제공
		// C:\Temp\aaa
		// 리눅스 : /home/사용자계정/java
		String dir = "C:\\Temp\\dir\\aaa";
		System.out.println(dir);
		
		// 실행되는 운영체제에 맞는 디렉토리 구분자
		String separator = File.separator;
		System.out.println(separator);
		
		// 구분자를 한 문자로 표현
		char separatorChar = File.separatorChar;
		System.out.println(separatorChar);
		
		dir = "C:"+File.separator+"Temp"+File.separator+"dir";
		System.out.println(dir);
		
		File file = new File(dir);
		// 절대 경로
		System.out.println("absolute : " + file.getAbsolutePath());
		// 저장된 경로 문자열
		System.out.println("path : " + file.getPath());
		
		dir = "";
		// File 생성 시 전달된 경로가 "" 공백 빈 문자일 경우
		// 실행되는 class의 프로젝트 경로로 지정
		file = new File(dir);
		// 절대 경로
		System.out.println("absolute : " + file.getAbsolutePath());
		// 저장된 경로 문자열
		System.out.println("path : " + file.getPath());
		System.out.println("========================================");
		
		// 매개변수가 2개 첫번째 매개변수가 공백이면 디스크 드라이브의 최상위 경로
		// new File(상위디렉토리,하위디렉토리 또는 파일)
		file = new File(dir,"Temp");
		// 절대 경로
		System.out.println("absolute : " + file.getAbsolutePath());
		// 저장된 경로 문자열
		System.out.println("path : " + file.getPath());
		System.out.println("========================================");
		
		
		// file exists - 존재한다.
		// file이 저장한 위치에 디렉토리나 파일이 존재하는지 여부를 판단
		// file.exists(); // 존재하면 true, 존재하지 않으면 false
		
		if(file.exists()) {
			System.out.println("디렉토리가 존재한다.");
		}else {
			System.out.println("디렉토리가 존재하지 않습니다.");
		}
		
		// 새로운 File 객체 생성
		file = new File(file, "dir"+File.separator+"aaa");
		System.out.println(file.getAbsolutePath());
		// C:\Temp\dir\aaa
		
		if(!file.exists()) {
			// file 객체에 저장된 경로 디렉토리나 파일 정보가 존재하지 않음.
			
			// 지정된 경로에 있는 디렉토리 중 마지막에 정의된 디렉토리 생성
			// C:\Temp\dir\aaa
			// 중간에 지정된 폴더가 존재하지않으면 생성 불가
			boolean isMakeDir = file.mkdir(); // 생성 : true , 생성 실패 : false
			System.out.println("디렉토리 생성 여부 : " + isMakeDir);
			
			// 경로상에 정의되어있지만 존재하지 않는 모든 디렉토리 생성
			boolean isMakeDirs = file.mkdirs();
			System.out.println("디렉토리 생성 여부 : " + isMakeDirs);
		}
		
		System.out.println("===========================================");
		
		file = new File(file, "test.txt");
		System.out.println(file.getAbsolutePath());
		
		if(!file.exists()) {
			System.out.println("파일이 존재하지 않음");
			
			// file 객체에 저장된 경로에 새로운 파일 생성
			try { // 컴파일 체크 예외 처리
				boolean isCreated = file.createNewFile();
				System.out.println("파일 생성 : " + isCreated);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}else {
			System.out.println("이미 동일한 이름의 파일이 존재함.");
		}
		
		System.out.println("======================================");
		// 삭제
		File file2 = new File("c:\\Temp\\dir\\aaa\\test.txt");
		System.out.println("file 존재 여부 : " + file2.exists());
		// 지정된 경로에 마지막 디렉토리 또는 파일 정보를 삭제 후 실행 여부 반환
		// 삭제 할려는 파일정보가 디렉토리일 경우
		// 디렉토리 내부에 하나라도 파일정보가 존재하면 삭제 실패
		boolean isDeleted = file2.delete();
		System.out.println("파일 삭제 여부 : " + isDeleted);
		
		file2 = new File("c:\\Temp\\dir\\aaa");
		isDeleted = file2.delete();
		System.out.println("파일 삭제 여부 : " + isDeleted);
		
	}// end main

}