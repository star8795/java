package exception_02_throws;

public class ThrowsExample {

	public static void main(String[] args) { // throws ClassNotFoundException {
		System.out.println("Main START");
		
		try {
			Class clazz1 = findClass("java.lang.String");
			System.out.println(clazz1);
			Class clazz2 = findClass("java.lang.Stirng"); // 이런 애 없음
			System.out.println(clazz2);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main END");
	}
	
	public static Class findClass(String name) throws ClassNotFoundException {    
		// Class 라는 class는 class의 설계정보를 저장하는 Class
		// Class.forName("class 경로");
		// 클래스 위치 경로를 문자열로 전달받아 클래스의
		// 설계 정보를 저장하는 Class 객체를 반환
		Class clazz = Class.forName(name);
		return clazz;
	}
	

}