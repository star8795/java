package practice_04;

public class Car {
    public String color;	// 자동차의 색상을 나타내는 문자열
    public int speed;		// 자동차의 속도를 나타내는 문자열
    public int gear; 		// 자동차의 기어를 나타내는 문자열

    // 메소드: 기어 변경
    public void changeGear(int newGear) {
        gear = newGear;
    }

    // 자동차의 속도 증가 메소드: 속도 증가
    public void speedUp() {
        speed += 10;
    }

    // 자동차의 속도 감소 메소드: 속도 감소
    public void speedDown() {
        speed -= 10;
    }

    // toString 메소드를 재정의하여 객체의 문자열 표현을 제공.
    @Override
    public String toString() {
        return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
    }
}