package c_interface_extends;

public class MyClass implements C{

	@Override
	public void methodA() {
		System.out.println("MyClass의 methodA 호출");
	}

	@Override
	public void methodB() {
		System.out.println("MyClass의 methodB 호출");
	}

	@Override
	public void methodC() {
		System.out.println("MyClass의 methodC 호출");
	}
	
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.methodA();
		myClass.methodB();
		myClass.methodC();
	}

	
	
}
