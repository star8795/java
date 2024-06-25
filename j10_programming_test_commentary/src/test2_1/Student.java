package test2_1;

class Student {
	
	
	String school;
	int grade;
	String name;
	
	// 개발자가 정의한 생성자가 존재하면 컴파일러가 default 생성자를 추가하지 않음
	// 매개변수 없이 객체가 생성될 수 있도록 기본생성자 추가
	Student(){
	// school, grade, name 필드 초기화에 필요한
	// 3가지 인자값을 전달받아 각 필드를 초기화하는 생성자 추가	
	}

	public Student(String school, int grade, String name) {
		this.school = school;
		this.name = name;
		this.grade = grade;
	}
}


