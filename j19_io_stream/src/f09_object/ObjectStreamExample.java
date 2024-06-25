package f09_object;

import java.io.*;
import java.util.Arrays;

public class ObjectStreamExample {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("object.dat");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			
			oos.writeObject(Integer.valueOf("85"));
			oos.writeObject(3.14);  // 자동 박싱
			oos.writeObject(new int[] {1,2,3,4});
			oos.writeObject(new String("최기근"));
			
			oos.writeObject(97);// 자동 박싱
			oos.writeObject(Double.valueOf("3.141592"));  
			oos.writeObject(new int[] {90,70,50,60});
			oos.writeObject(new String("최수빈"));
			
			oos.flush();
			oos.close();
			System.out.println("출력 완료");
			
			FileInputStream fis = new FileInputStream("object.dat");
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			int result = fis.available();
			System.out.println("fis available : " + result);
			
			result = bis.available();
			System.out.println("bis available : " + result);
			
			while(bis.available() > 0) {
				
				Object obj1 = ois.readObject();
				Double obj2 = (Double)ois.readObject();
				int[] obj3 = (int[])ois.readObject();
				String obj4 = (String)ois.readObject();
				System.out.println("obj1 : "+obj1);
				System.out.println("obj2 : "+obj2);
				System.out.println("obj3 : "+ Arrays.toString(obj3));
				System.out.println("obj4 : "+obj4);
			} // end while
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} // end exception
		
	} // end main

}







