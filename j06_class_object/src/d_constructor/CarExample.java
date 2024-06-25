package d_constructor;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.nation);
		System.out.println(car.company);
		car.company = "Benz";
		car.model = "Maybach";
		car.color = "Black";
		car.maxSpeed = 300;
		car.speed = 0;
		
		System.out.println("---------------------");
		
		Car k5 = new Car("KIA","K5",210);
		System.out.println(k5.nation);
		System.out.println(k5.company);
		System.out.println(k5.model);
		System.out.println(k5.color);
		System.out.println(k5.maxSpeed);
		System.out.println(k5.speed);
		
		System.out.println("----------------------");
		
		Car k7 = new Car("KIA","k7","white");
		System.out.println(k7);
		
		System.out.println("----------------------");
		Car avante = new Car("대한민국","현대","avante","white",300,0);
		System.out.println(avante.nation);
		System.out.println(avante.company);
		System.out.println(avante.model);
		System.out.println(avante.color);
		System.out.println(avante.maxSpeed);
		System.out.println(avante.speed);
	}

}
