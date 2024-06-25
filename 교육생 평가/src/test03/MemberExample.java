package test03;

public class MemberExample {

	public static void main(String[] args) {
		Member choi = new Member();
		choi.setId("id001");
		choi.setPassword("pw001");
		choi.setName("최기근");
		System.out.println(choi);
		
		Member kim = new Member();
		kim.setId("id001");
		kim.setPassword("pw001");
		kim.setName("김유신");
		System.out.println(kim);
		
		// id와 password가 일치하면 동일한 객체
		System.out.println(kim.equals(choi));
	}

}
