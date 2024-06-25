package a3_constructor;

public class A {
	
	A a = new A(); 				// public
	A a1 = new A(10);			// default
	A a2 = new A("이기적인 놈");	// private

	public A() {
		System.out.println("public 기본 생성자");
	}
	
	A(int a){
		System.out.println("default 생성자 : " + a);
	}
	
	private A(String str) {
		System.out.println("private 생성자 : " + str);
	}
	
}
