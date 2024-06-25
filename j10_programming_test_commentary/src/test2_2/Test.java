package test2_2;

public class Test {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.color = "red";
		myCar.speed = 0;
		myCar.gear = 1;
		String result = myCar.showInfo();
		System.out.println(myCar.showInfo());
		
		// speedUp method 호출 시 speed field의 값 10 증가
		myCar.speedUp();
		myCar.gear = 2;
		System.out.println(myCar.showInfo());
		
		// speedDown method 호출 시 speed field의 값 10 감소
		myCar.speedDown();
		myCar.gear = 1;
		System.out.println(myCar.showInfo());
		
	} // end main method

}
