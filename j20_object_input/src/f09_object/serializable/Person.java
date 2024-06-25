package f09_object.serializable;

import java.io.Serializable;

public class Person implements Serializable{

	private static final long serialVersionUID = 1900665874200173592L;

	public static String nation;
	
	private String name;
	private int age;
	private String id;
	private String pw;
	
	public Person() {}

	public Person(String name, int age, String id, String pw) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.pw = pw;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", id=" + id + ", pw=" + pw + "]";
	}
	
}