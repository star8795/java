package a_object.clone;

public class Car {

	String model;
	
	// 생성자, toString 추가
	// alt + s, a
	public Car(String model) {
		this.model = model;
	}

	// alt +s, s, s
	@Override
	public String toString() {
		return "Car [model=" + model + "]";
	}
	
}