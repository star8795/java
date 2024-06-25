package generic02_method;

public class MethodExample {
	
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<>();
		box.setType(t);
		return box;
	}
	
	/*
	public static Box<Integer> boxing(Integer i){
		Box<Integer> box = new Box<>();
		box.setType(i);
		return box;
	}
	
	public static Box<String> boxing(String str) {
		// java 1.7 이후 부터는
		// 생성자 호출에 제네릭 타입 명시를 안해도 됨.
		Box<String> box = new Box<>();
		box.setType(str);
		return box;
	}
	 */
	public static void main(String[] args) {
		
		// generic type을 명시하지 않았을때는
		// T 자리는 Object type으로 명시
		Box box = new Box();
		box.getType();
		
		Box<String> strBox = MethodExample.<String>boxing("사과");
		String result = strBox.getType();
		System.out.println(result);
		
		// Box<Integer> intBox = MethodExample.<Integer>boxing(100);
		// generic type을 명시하지 않아도 매개변수의 타입을 보고
		// 컴파일러가 제네릭 타입을 유추해서 컴파일
		Box<Integer> intBox = boxing(100);
		int intResult = intBox.getType();
		System.out.println(intResult);
	}

}