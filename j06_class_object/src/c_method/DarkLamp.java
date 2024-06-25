package c_method;

public class DarkLamp {
	
	// 인스턴트 멤버 변수 - field 정의
	// lamp의 상태 켜짐과 꺼짐과 같은 정보를 저장
	boolean isOnOff;
	
	// 램프를 끄고 켜는 기능
	void turnOnOff() {
		if(isOnOff) {
			isOnOff = false;
			System.out.println("램프를 끕니다.");
		}else {
			isOnOff = true;
			System.out.println("램프를 켭니다.");
		}
	}

	
}
