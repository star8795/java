package c_method;
/**
 * method : 객체의 동작 - 기능들을 정의
 */
public class Method {
	
	// System.out.println("배부릅니까?");  컴파일 오류
	
	/*
	 * class 내부에 정의가능한 구성멤버
	 * Field 선언;
	 * method 선언;
	 * 생성자 선언;
	 */
	/**
	 * 반환형(return type) : 메소드이름_식별자(매개변수들...){
	 * 
	 * 실행할 명령문(실행블럭)...
	 * 
	 * }
	 */
	void methodA() {
	System.out.println("void 반환하는 값이 없고 매개변수 없이 기능만 수행");
	}
	int methodB() {
		System.out.println("int type의 결과를 반환하는 method");
		// return "이런거 안됨";
		return 0;
	}
	double methodC(int x, int y) {
		System.out.println("정수타입의 매개변수 2개 선언");
		System.out.println("블럭 실행 후 double type의 결고 반환");
		return x / y;
	}
	double avg(int i, int j, double d) {
		double total = i + j + d;
		return total / 3;
	}
}
