package c3_map;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// java.util   import 추가
		// key 와 value type이 String타입으로 제한
		Properties prop = new Properties();
		prop.put("key", "value");
		prop.put("score", 100);
		Object obj = prop.get("score");
		System.out.println(obj);
		prop.clear();
		
		
		// prop.setProperty("key",100);
		prop.setProperty("key", "key value");
		String value = prop.getProperty("key");
		System.out.println("value : " + value);
		// 일반 맵 객체 처럼 동일하게 메소드를 이용해서 데이터를
		// 처리 할 수 있지만 key type, value type Object
		
		// Properties 는 String type의 key, value 
		// data를 저장할고 읽어 올수 있도록 method를 따로 구현
		// setProperty(key,value);
		// getProperty(key)
		
		value = prop.getProperty("최기근","해당 키값이 존재하지 않음");
		// default value 처리
		System.out.println(value);
		
		System.out.println("====================================");
		Properties p = System.getProperties();
		System.out.println(p);
		System.out.println("====================================");
		
		// 경고 - warning 
		// String username = "root";
		// String password = "1234";
		
		String path = 
		PropertiesExample.class.getResource("db.properties").getPath();
		System.out.println(path);
		
		Properties dbProp = new Properties();
		// username=root
		dbProp.load(new FileReader(path));
		System.out.println(dbProp.size());
		String username = dbProp.getProperty("username");
		String password = dbProp.getProperty("password");
		System.out.println("username : " + username);
		System.out.println("password : " + password);
		
	}

}