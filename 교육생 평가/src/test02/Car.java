package test02;

public class Car {

	String color;
	int speed;
	int gear;
	
	// 기본 생성자
	public Car() {
	}
	
	// 속도를 증가시키는 메소드
	public void speedUp() {
		speed += 10;
	}
	
	// 속도를 감소시키는 메소드
	public void speedDown() {
		speed -= 10;
	}
	
	// 현재 상태 정보를 문자열로 반환하는 메소드
	public String showInfo() {
		return "color : " + color + ", speed : " + speed + ", gear : " +gear;
	}
}
	
