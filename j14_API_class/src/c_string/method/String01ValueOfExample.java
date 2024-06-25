package c_string.method;

public class String01ValueOfExample {

	public static void main(String[] args) {
		
		String str1 = String.valueOf(false);
		String str2 = String.valueOf(10);
		String str3 = String.valueOf(3.14);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str2.equals(str3));
		
		Object obj = new Object();
		// 객체가 매개변수로 전달되면
		// 객체가 가진 의미 있는 데이터를 문자열로 표현하기 위해
		// toString() 가 반환되는 문자열을 전달
		String str4 = String.valueOf(obj);	
		System.out.println(str4);
		
		int a = 100;
		String result = a+"";
		System.out.println(result);
		
	}	// end main

}
