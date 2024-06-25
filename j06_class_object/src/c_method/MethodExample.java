package c_method;

public class MethodExample {

	public static void main(String[] args) {
		Method m = new Method();
		
		m.methodA();
		// int result = m.methodA();
		int result = m.methodB();
		System.out.println("methodB 실행결과 : " + result);
		
		double r = m.methodC(20, 10);
		System.out.println("methodC(20, 10) 실행결과" + r);
		
		double avg = m.avg(10, 20, 30.0);
		System.out.println("avg(10, 20, 30.0) 실행결과 : " + avg);
	}

}
