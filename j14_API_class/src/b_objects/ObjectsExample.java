package b_objects;

import java.util.Objects;

class A{}

public class ObjectsExample {

	public static void main(String[] args) {
		
		A a1 = null;
		A a2 = null;
		
		// a1 == null ? true : false; 
		boolean result = Objects.isNull(a1);
		System.out.println("1=================");
		System.out.println(result);
		
		// a2 != null ? true : false;
		result = Objects.nonNull(a2);
		System.out.println("2=================");
		System.out.println(result);
		
		// System.out.println(a1.equals(a2));
		result = Objects.equals(a1, a2);
		System.out.println("3=================");
		System.out.println(result);
		
		A c = new A();
		result = Objects.equals(a1, c);
		System.out.println("4=================");
		System.out.println(result);
		
		
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		
		result = Objects.equals(arr1, arr2);
		System.out.println("5================");
		System.out.println(result);
		
		result = Objects.deepEquals(arr1, arr2);
		System.out.println("6===============");
		System.out.println(result);
		
		result = Objects.deepEquals(arr1, null);
		System.out.println("7===============");
		System.out.println(result);
		
		/*
		String str = a1.toString()
		System.out.println(str);
		*/
		
		String str = Objects.toString(a1);
		System.out.println("str : " + str);
		
		// Objects.toString(참조 객체, null일 때 전달할 문자열
		str = Objects.toString(a1,"a1은 참조하는 값이 없습니다.");
		System.out.println(str);
		str = Objects.toString(c,"c변수를 통해 참조하는 객체가 없습니다.");
		System.out.println(str);
	}

}