package f09_object.serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputExample {

	public static void main(String[] args) {
		
		Person.nation = "대한민국";
		
		File file = new File("C:\\Temp\\person.dat");
		try {
			
			ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(file)
			);
			
			Person p = new Person();
			p.setName("이순신");
			p.setAge(560);
			p.setId("idLee");
			p.setPw("pwLee");
			
			oos.writeObject(p);
			
			Person p1 = new Person();
			p1.setName("김동하");
			p1.setAge(59);
			p1.setId("idKim");
			p1.setPw("pwKim");
			oos.writeObject(p1);
			
			oos.flush();
			oos.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	} // end main;

} // end class








