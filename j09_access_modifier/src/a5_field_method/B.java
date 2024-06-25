package a5_field_method;

public class B {

	A a = new A();
	
	// a.field1 = 100; X
	
	public B() {
		a.field1 = 200;
		a.field2 = 300;
		// private field니까
		// 객체 외부에ㅐ서 접근 불가능
		// a.field3 = 1000;
		
		a.publicMethod();
		a.defaultMethod();
//		a.privateMehtod();
	}	
}
