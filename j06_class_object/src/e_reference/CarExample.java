package e_reference;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.model);
		System.out.println(car.speed);
		System.out.println(car.engine);
		
		// d_constructor.Car carCom;
		car.model = "싼타페";
		Engine engine = new Engine();
		car.engine = engine;
		
		car.engine.maxSpeed = 280;
		car.engine.rpm = 2000;
		
		System.out.println(car.engine == engine);
		
		System.out.println(engine.maxSpeed);
		System.out.println(engine.rpm);
		
		System.out.println("=========================");
		Car car2 = new Car();
		car2.model = "모닝";
		car2.engine = new Engine();
		
		car2.engine.maxSpeed = 1800;
		car2.engine.rpm = 1000;
		
		System.out.println(car2.engine.maxSpeed);
		System.out.println(car.engine.rpm);
		
		// engine을 참조하는 곳이 없어짐
		// 갈비지 콜렉터 == gc가 메모리 정리하여 재사용할 수 있도록 공간확보
		car2.engine = null;
		// System.gc();
	}

}
