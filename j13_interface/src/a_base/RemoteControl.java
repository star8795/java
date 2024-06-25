package a_base;

public interface RemoteControl {

	public static final int MAX_VALUE = 30;
	// 따로 선언하지 않아도
	// 인터페이스의 필드는 자동으로
	// 퍼블릭 스태틱 파이널이 됨.
	int MIN_VALUE = 0;
	
	// 인터페이스 추상 메소드만 선언가능
	// void setValue(int value) {}
	public abstract void turnOn();
	void turnOff();
	void setValue(int value);
	
}
