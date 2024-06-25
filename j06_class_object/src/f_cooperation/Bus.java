package f_cooperation;

public class Bus {
	
	int busNumber;			// 버스 번호
	int passengerCount;		// 승객 수
	int money;				// 버스의 수입
	
	// 버스가 생성될 때 버스 번호 지정
	Bus(int busNumber){
		// 객체 생성 시 전달된 버스번호를 필드에 저장
		this.busNumber = busNumber;
	}
	
	// 승객 탑승 시 금액 지불
	void take(int money) {
		this.money += money;
		// 승객 수 증가
		passengerCount++;
	}
	
	// 버스의 현재 정보를 출력
	void showInfo() {
		System.out.printf(
			"버스 %d번의 승객은 %d명이고 수입은 %d입니다.%n",
			busNumber, passengerCount, money
		);
	}
	
} // end Bus class
