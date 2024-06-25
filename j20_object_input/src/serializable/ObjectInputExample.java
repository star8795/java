package serializable;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import f09_object.serializable.Person;

public class ObjectInputExample {

	public static void main(String[] args) {
		
		try {
			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream("C:\\Temp\\person.dat")
			);
			
			while(true) {	// 반복하면서 Person객체 정보 읽기
				
				try {
					Person p = (Person)ois.readObject();
					System.out.println(p);
				} catch (ClassNotFoundException e) {
					// 직렬화된 클래스를 현재 프로젝트에서 찾을 수 없음
					e.printStackTrace();
					break;
				} catch(EOFException e) {
					System.out.println(e.getMessage());
					break;
				}
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
