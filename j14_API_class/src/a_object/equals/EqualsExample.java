package a_object.equals;

public class EqualsExample {

	public static void main(String[] args) {
		
		Member member1 = new Member("id001");
		System.out.println(member1);
		Member member2 = new Member("id002");
		System.out.println(member2);
		// Member 객체가 생성된 주소값 비교
		System.out.println(member1 == member2);
		
		Member member3 = new Member("id001");
		System.out.println(member1 == member3);
		
		// Member객체의 id 필드의 값이 일치하면 동등한 객체
		System.out.println(member1.equals(member3));
		System.out.println(member1.equals(member2));
		System.out.println(member1.equals(null));
		System.out.println(member1.equals(new EqualsExample()));
		
	}

}
