package a7_encapsulation;

/**
 * encapsulation - 캡슐화
 */
public class Student {

	String name;		// 이름
	private int age;	// 나이
	int grade;			// 학년
	
	public static final int MIN_GRADE = 1;
	public final static int MAX_GRADE = 4;
	
	public void setGrade(int grade) {
		if(grade < MIN_GRADE || grade > MAX_GRADE) {
			this.grade = MIN_GRADE;
			return;
		}
		this.grade = grade;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
	public void setAge(int age) {
		if(age < 1) {
			this.age = 1;
			return;
		}
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
}
