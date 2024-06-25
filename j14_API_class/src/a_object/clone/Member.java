package a_object.clone;

import java.util.Arrays;

public class Member implements Cloneable{
	
	String name;
	int age;
	int[] scores;
	
	Car car;
	
	public Member() {}

	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Member cloned =(Member)super.clone(); // 얕은 복제
		// 참조타입의 scores, car 동일한 위치를 바라보고 있음
		System.out.println(this.scores == cloned.scores);
		System.out.println(this.car == cloned.car);
		
		// 새로운 scores 배열 공간 생성
		int[] scores = new int[this.scores.length];
		for(int i = 0; i < this.scores.length; i++) {
			scores[i] = this.scores[i];
		}
		cloned.scores = scores;
		
		Car car = new Car(this.car.model);
		cloned.car = car;
		
		return super.clone();
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", scores=" + Arrays.toString(scores) + ", car=" + car + "]";
	}
	
}