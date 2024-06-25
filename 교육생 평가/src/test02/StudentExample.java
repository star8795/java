package test02;

public class StudentExample {

	public static void main(String[] args) {
		Student kim = new Student();
		kim.school = "Computer Studt";
		kim.grade = 4;
		kim.name = "홍길동";
		
		Student choi = new Student("부산아카데미",1,"최기근");
		System.out.println(choi.school);
		System.out.println(choi.grade);
		System.out.println(choi.name);
	}

}
