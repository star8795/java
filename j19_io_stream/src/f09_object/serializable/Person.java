package f09_object.serializable;

import java.io.Serializable;

public class Person implements Serializable{
	
	private static final long serialVersionUID = 1900665874200173592L;

	// static 정적 멤버는 직렬화 에서 제외
	public static String nation;
	
	private String name;
	private int age;
	private String id;
	// transient : 직렬화에서 제외되는 인스턴스 멤버
	transient private String pw;
	
	// getter setter toString
	// alt + s , r
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
	
	// alt +s , s , s 
	@Override
	public String toString() {
		return "nation = "+Person.nation+"Person [name=" + name + ", age=" + age + ", id=" + id + ", pw=" + pw + "]";
	}
	
}









