package a4_constructor;

import a3_constructor.A;
import a3_constructor.B;

public class C {

	A a = new A();			// public 생성자
	// default 접근 제한을 가진 생성자이므로
	// 외부 패키지에ㅐ서 접근 불가 호출 X
	// A a1 = new A(1);		// default 생성자
	
	// class 외부에서 접근이 불가능함으로 생성자 호출이 안됨
	// A a2 = new A("private 생성자");
	
	B b = new B();
}
