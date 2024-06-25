package a3_constructor;

public class B {

	A a =  new A();			// public 생성자 호출
	A a1 = new A(10);		// default 생성자 호출
	// private 생성자는 A class 내부에서만 호출 가능
	// A a2 = new A("private 생성자 호출"); X
	
	// public B() {}
}
