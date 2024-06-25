package basic;

public class LambdaExample {

	public static void main(String[] args) {
		// 익명 구현 객체로 interface의 추상메소드 재정의
		MyInterface myInterface = new MyInterface() {
			@Override
			public void run() {
				System.out.println("myInterface call run() ");
			}
		};
		myInterface.run();
		
		// interface에 정의된 추상메소드가 하나라면 
		// 정의해야할 기능이 하나라면 lambda 표현식 으로 생략 가능
		myInterface = ()->{
			System.out.println("lambda expression call run");
		};
		myInterface.run();
		
		// 매개변수가 있는 메소드를 람다 표현식으로 표현
		MyParamInterface paramInterface = new MyParamInterface() {
			@Override
			public void sum(int x, int y) {
				System.out.println(x + y);
			}
		};
		paramInterface.sum(10, 20);
		
		paramInterface = (int x, int y) -> {
			int sum = x + y;
			System.out.printf("%d + %d = %d 입니다. \n", x, y, sum);
		};
		paramInterface.sum(20, 40);
		
		// 반환타입이 있는 메소드 재정의
		MyReturnInterface returnInterface = new MyReturnInterface() {
			@Override
			public int method(int x, int y, String str) {
				System.out.println(str);
				return x * y;
			}
		};
		
		int result = returnInterface.method(10, 30, "곱셈 연산");
		System.out.println(result);
		
		returnInterface = (a, b, c)->{
			System.out.println(c);
			return a + b;	// return type int
		};
		
		result = returnInterface.method(320, 684, "덧셈");
		System.out.println(result);
		
	}	// end main

}
