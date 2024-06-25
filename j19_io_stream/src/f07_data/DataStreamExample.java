package f07_data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamExample {

	public static void main(String[] args) {
		// 따로 절대경로가 지정되어 있지 않으면 
		// 프로젝트 디렉토리가 경로로 지정
		
		try {
			
			FileOutputStream fos = new FileOutputStream("primitive.txt",true);
			// 기본 타입 8가지 + String
			// byte로 변환하지 않고 읽고 쓸수 있도록 제공 되는 보조 스트림
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeUTF("최기근"); // UTF-8 encoding 형식으로 문자열 출력
			dos.writeDouble(56.8);
			dos.writeInt(100);
			dos.writeChar('A');
			dos.writeBoolean(true);
			
			dos.writeUTF("김동하");
			dos.writeDouble(130.4);
			dos.writeInt(60);
			dos.writeChar('C');
			dos.writeBoolean(false);
			
			dos.flush();
			dos.close();
			System.out.println("출력 완료===================");
			
			DataInputStream dis
				= new DataInputStream(new FileInputStream("primitive.txt"));
			// 읽어 와서 사용가능한 데이터 크기를 byte 단위로 반환
			System.out.println(dis.available());
			while(dis.available() > 0) {
				String name = dis.readUTF();
				double weight = dis.readDouble();
				double score = dis.readInt();
				char grade = dis.readChar();
				boolean isWithdraw = dis.readBoolean();
				System.out.println("name : " + name);
				System.out.println("weight : " + weight);
				System.out.println("score : " + score);
				System.out.println("grade : " + grade);
				System.out.println("isWithdraw : " + isWithdraw);
				System.out.println(dis.available());
			} // end while
			dis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}