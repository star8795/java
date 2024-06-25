package f06_buffered;

import java.io.*;

public class bufferedExample {

	public static void main(String[] args) {
		
		String originalPath = "C:\\Temp\\cat3.jpg";
		File file = new File(originalPath);
		System.out.println(file.exists());	// 파일 존재 여부
		System.out.println(file.length());	// 파일 크기(byte)
		
		try {
			
			FileInputStream fis = new FileInputStream(file);
			
			long startTime = 0, endTime = 0;
			
			FileOutputStream fos = new FileOutputStream("C:\\Temp\\dir\\copy.jpg");
			
			// 작업 시작전 시간 체크
			startTime = System.nanoTime();
			
			int data; // InputStream으로 읽은 바이트 데이터를 저장할 변수
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
			
			fos.flush();
			fos.close();
			fis.close();
			
			endTime = System.nanoTime();
			
			long result = (endTime - startTime);
			System.out.printf("fis fos file : %d ns %n",result);
			
			System.out.println("=======================================");
			InputStream is = new FileInputStream(originalPath);
			// 내부에 버퍼를 이용해서 파일의 입력 속도를 향상 시킨 보조 스트림
			BufferedInputStream bis = new BufferedInputStream(is);
			
			OutputStream os = new FileOutputStream("C:\\Temp\\dir\\copyBis.jpg");
			// 내부에 버퍼 크기가 8192 byte
			// BufferedOutputStream bos = new BufferedOutputStream(os);
			// 읽어온 원본 이미지 크기 : 93954
			BufferedOutputStream bos = new BufferedOutputStream(os,80000);
			
			startTime = System.nanoTime();
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
			/*
			bos.flush();
			// 보조 스트림 close() 호출 시 기반스트림 close() 호출
			bos.close();
			bis.close();
			*/
			endTime = System.nanoTime();
			result = (endTime - startTime);
			System.out.printf("buffered file : %d ns %n",result);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}