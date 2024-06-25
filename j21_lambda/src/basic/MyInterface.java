package basic;

/**
 * 하나의 기능을 정의하는 interface : 함수형 인터페이스
 */
// 함수형 인터페이스 인지 검증하는 annotation
@FunctionalInterface
public interface MyInterface {
	void run();
}

// 매개변수가 있는 interface의 추상 메소드
interface MyParamInterface{
	void sum(int x, int y);
}

// 매개변수와 리턴타입이 있는 함수형 인터페이스
interface MyReturnInterface{
	int method(int x, int y, String str);
}