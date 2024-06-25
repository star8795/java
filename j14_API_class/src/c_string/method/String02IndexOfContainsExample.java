package c_string.method;

public class String02IndexOfContainsExample {

	public static void main(String[] args) {
		// 매개변수로 전달된 문자열이 지정된 문자열에
		// 몇번째 인덱스에서 시작하는지 인덱스 번호를 반환
		// indexOf(), lastIndexOf()
		String str = "자바 프로그래밍을 자바!";
		int index = str.indexOf("프로그래밍");
		System.out.println(index);
		
		index = str.indexOf("java");
		System.out.println(index);
		if(index == -1) {
			System.out.println("java가 존재하지않습니다.");
		}else {
			System.out.println("java가 존재합니다.");
		}
		
		// "자바 프로그래밍을 자바!";
		index = str.indexOf("자바"); // 0
		System.out.println("indexOf(자바) : " + index );
		
		index = str.lastIndexOf("자바"); // 10
		System.out.println("lastIndexOf(자바) : " + index);
		
		// 3번째 인덱스 부터 지정된 문자열을 검색
		index = str.indexOf("자바", 3); // 10
		System.out.println(index);
		
		// contains == 포함하다
		// 매개변수로 전달된 문자열이 포함되어 있으면 true, 
		// 포함되어있지 않으면 false
		boolean contains = str.contains("자바");
		System.out.println("자바 contains : " + contains);
		
	}

}