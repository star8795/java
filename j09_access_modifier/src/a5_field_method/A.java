package a5_field_method;

public class A {

	public int field1;
	int field2;
	private int field3;
	
	public A() {
		field1 = 10;
		field2 = 100;
		field3 = 1000;
		
		publicMethod();
		defaultMethod();
		privateMethod();
	}
	
	// publicMethod 전체 프로젝트 내부에서 어디서나 접근가능
	public int publicMethod() {
		// private field 같은 class 내부에서만 접근가능
		return this.field3;
	}
	
	// 같은 패키지 내부에서만 호출가능한 method
	int defaultMethod() {
		return field2;
	}
	
	private int privateMethod() {
		return field1;
	}
	
}
