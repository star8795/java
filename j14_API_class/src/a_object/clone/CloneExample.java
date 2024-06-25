package a_object.clone;

public class CloneExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Member member = new Member("최기근",26, new int[] {100,98,99}, new Car("캐스퍼"));
		System.out.println(member);
		Member another = new Member();
		another.name = member.name;
		another.age = member.age;
		another.scores = member.scores;
		another.car = member.car;
		System.out.println(another);
		
		Member cloned = (Member) member.clone();
		System.out.println(cloned);
		
		cloned.scores[0] = 70;
		cloned.car.model = "benz";
		
		System.out.println("복제 객체");
		System.out.println(cloned);
		System.out.println("원본 객체");
		System.out.println(member);
		
	}

}
