package f_cooperation;

public class Student {

	String name;		// 학생 이름
	int grade;			// 학년등급 : 1. 초등 2. 중등 3. 고등
	int money;			// 학생이 가지고 있는 보유금액
	// 학생 이름 등급 보유금액을 전달받아 각 필드의 값을 초기화
	Student(String name, int grade, int money){
		this.name = name;
		this.grade = grade;
		this.money = money;
	}
	
	void takeVehicle(Bus bus) {
		int pay = 0;
		pay = getPay();
		/*
		switch(this.grade) {
			case 1 : pay = 400;
				break;
			case 2 : case 3 :
				pay = 1000;
				break;
		}
		*/
		// pay만큼 버스에 금액지불
		bus.take(pay);
		this.money = this.money - pay;
	}
	
	void takeVehicle(Subway subway) {
		int pay = this.getPay();
		subway.take(pay);
		this.money -= pay;
	}
	
	int getPay() {
		int pay = 0;
		switch(this.grade) {
			case 1 : pay = 400;
				break;
			case 2 : case 3 :
				pay = 1000;
				break;
		}
		return pay;
	}
	void showInfo() {
		System.out.printf(
				"%학생의 등급은 %d이며 보유금액은 %d입니다. %n, name, grade, money");
	}
} // end Student class
