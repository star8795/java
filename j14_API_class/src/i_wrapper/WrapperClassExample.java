package i_wrapper;

/**
 * 기본 타입을 객체로 사용할 수 있도록
 * 연산에 필요한 상수와 기능을 추가하여 묶어놓은 class
 * 포장 객체 - 실제 데이터를 포장한 객체 Wrapper class
 */
public class WrapperClassExample {

	public static void main(String[] args) {
		// int type의 정수값을 포장한 Integer 객체
		Integer obj1 = null;
		obj1 = new Integer(100);
		obj1 = new Integer("100");
		obj1 = Integer.valueOf("100");
		obj1 = Integer.valueOf(100);
		
		// 자동 Boxing
		obj1 = 100;
		
		// unBoxing
		int value = obj1.intValue();
		System.out.println(value);
		
		// 자동 unBoxing
		int i = obj1;
		
		// valueOf
		// 문자열 또는 기본 타입의 데이터를
		// 해당 타입의 포장객체로 변환
		// 주로 문자열에 저장된 데이터가 기본 타입으로
		// 변환할 수 있는 데이터를 저장하고 있다면
		// 기본타입으로 변환 할때 사용
		Byte b = Byte.valueOf("127");
		System.out.println(b);
		
		// 반환타입이 Wrapper class
		Long l = Long.valueOf("1000000");
		System.out.println(l);
		
		// 문자열에 저장된 데이터를 기본타입으로 변환
		double doubleValue = Double.parseDouble("3.141592");
		System.out.println(doubleValue);
		boolean boolValue = Boolean.parseBoolean("true");
		System.out.println(boolValue);
		
		System.out.println("===================================");
		// Wrapper class 가 가진 기능들
		// 어느 범위까지 데이터 사용이 가능한지 상수로 표현
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println((int)Character.MIN_VALUE);
		System.out.println((int)Character.MAX_VALUE);
		System.out.println("=================================");
		
		// 정수값을 이진법 문자열로 반환
		String str = Integer.toBinaryString(10);
		System.out.println(str);
		
		// wrapper class의 타입에 맞는 값을 비교하는 method
		int a = Integer.compare(10, 20);
		// 첫번째 매개변수 값이 작으면 음수
		// 같으면 0 
		// 두번째 매개변수 값이 작으면 양수
		
		Integer i1 = Integer.valueOf(100);
		Integer i2 = Integer.valueOf("100");
		System.out.println(i1 == i2);
		
		Integer i3 = new Integer(100);
		Integer i4 = new Integer(100);
		System.out.println(i3 == i4);
		// new 연산자로 생성된 wrapper class에 저장된 실제 값을 비교
		System.out.println(i3.equals(i4));
		
		test(Integer.valueOf("100"));
		test(Float.valueOf(3.14f));
		
		// Number 를 상속 받고 있지않은 객체는 매개변수에 대입 불가
		// test(Boolean.valueOf("true"));
		test(3.141592);
		test(null);
		test(1111111111L);
		
	} // end main method
	
	// Number - Byte, Short, Integer, Long, Float, Double
	static void test(Number o) {
		if(o != null) {
			System.out.println("test : " + o);
			System.out.println(o.intValue());
			System.out.println(o.longValue());
			System.out.println(o.doubleValue());
		}
	}
	
}