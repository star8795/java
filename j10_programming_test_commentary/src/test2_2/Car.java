package test2_2;

public class Car {

	public String color;
	public int speed;
	public int gear;
	
	public String showInfo() {
		return "Car[color = "+this.color+", gear = "+this.gear+", speed = "+this.speed+"]";
	}

	public void speedUp() {
		// 객체가 가진 speed field의 값을 10 증가
		this.speed += 10;
	}
	
	public void speedDown() {
		// 객체가 가진 speed field의 값을 10 증가
		this.speed -= 10;
	}
}
