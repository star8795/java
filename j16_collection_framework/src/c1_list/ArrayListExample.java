package c1_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<>();
		// list에 항목 추가
		// array.add(100); 
		// genric으로 지정한 String type이 아닐경우
		// 컴파일러가 체크
		array.add("java");
		array.add("JDBC");
		
		int size = array.size();
		System.out.println("size : " + size); // 추가된 항목의 크기
		array.add(null);
		array.add("MySQL");
		array.add("mysql");
		size = array.size();
		System.out.println("size : " + size);
		
		// list 0번째 인덱스에 저장된 항목의 값
		String str = array.get(0);
		System.out.println(str);		
		// ArrayList array 5번째 인덱스 항목의 값을 읽고 있음.
		
		//IndexOutBoundsException : 존재하지 않는 인덱스 번호로 항목 호출
		// System.out.println(array.get(5));
		
		for(int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		
		
		for(String s : array) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		// array list의 2번째 인덱스에 문자열 항목 추가
		array.add(2, "Servlet/JSP");
		System.out.println(array);
		
		array.add("JDBC");
		System.out.println(array);
		
		// remove - 0번째 인덱스 부터 검색하여 처음 검색된 일치하는 항목 list에서 제거
		boolean isChecked = array.remove("JDBC");
		System.out.println("JDBC REMOVE : " + isChecked);
		System.out.println(array);
		
		String result = array.remove(2);
		System.out.println("2 index remove : "+result);
		System.out.println(array);
		
		// list에 저장된 항목들 중에 
		// 매개변수로 전달 받은 객체와 동등한 객체가 존재하면 true, 없으면 false
		isChecked = array.contains("mysql");
		System.out.println("contains : " + isChecked);
		
		// 저장된 항목이 없으면 true, 저장된 항목이 존재하면 false
		isChecked = array.isEmpty();
		System.out.println("isEmpty ? : " + isChecked);
		
		// list안에 모든 항목을 제거
		array.clear();
		
		System.out.println(array.size());			// 0 
		System.out.println(array.isEmpty());		// true
		
		
		List<Integer> list = new ArrayList<>();
		list.add(100);
//		list.add("최기근");
		
	}

}









