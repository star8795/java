package f_cooperation;

public class Subway {
	
	String line;		// 지하철 노선 색상
	int passengerCount;	// 승객 수
	int money;			// 수입 금액
	
	// alt + s , a
	// 객체 생성 시 라인 색상을 전달받아 line 필드를 초기화
	public Subway(String line) {
		super(); // 상속에서 배움
		this.line = line;
	}
	
	// 승객 탑승 시 금액 지불, 승객 수 증가
	void take(int money) {
		passengerCount++;
		this.money += money;
	}
	
	/**
	 * 지하철 정보를 출력하는 method
	 */
	void showInfo() {
		System.out.printf(
			"%s색상의 지하철 승객은 %d명이고 현재 수입은 %d입니다. %n",
			line, passengerCount, money
		);
	}
	
} // end Subway class