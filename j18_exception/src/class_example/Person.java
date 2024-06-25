package class_example;

public class Person {

	public static String school;
	
	private String name;
	private int age;
	
	// alt + s , a
	public Person() {}

	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getter setter alt + s , r
	public static String getSchool() {
		return school;
	}

	public static void setSchool(String school) {
		Person.school = school;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// toString alt + s, s, s
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}