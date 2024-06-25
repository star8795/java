package final_test;

public class FinalTest {

	public static void main(String[] args) {
		int v = 100;
		v = 101;
		System.out.println(v);
		
		// read-only 할당된 값을 변경할 수 없고
		// 읽기만 가능
		final int c = 100;
		// c = 10000;
		System.out.println(c);
		
		Car car = new Car("모닝",160);
		// car.maxSpeed = 280;
		System.out.println(car.model);
		System.out.println(car.maxSpeed);
		car.company = "KIA";
		car.company = "KIN";
		
		Car k3 = new Car("k3",180);
		System.out.println(k3.model);
		System.out.println(k3.maxSpeed);
		k3.company = "KIA";
		k3.company = "KIN";
		System.out.println(k3.company);
		
		System.err.println(Car.MIN_SPEED);
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		System.out.println(Math.random());
	}

}
