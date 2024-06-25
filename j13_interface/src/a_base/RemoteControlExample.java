package a_base;

/**
 * interface test class
 */
public class RemoteControlExample {

	public static void main(String[] args) {
		
		int maxValue = RemoteControl.MAX_VALUE;
		System.out.println(maxValue);
		
		// 인터페이스의 모든 field는 public static final
		int minValue = RemoteControl.MIN_VALUE;
		System.out.println(minValue);
		// RemoteControl.MIN_VALUE = 1;
		
		RemoteControl tvRemote; // = new RemoteControl();
		tvRemote = new TVRemoteControl();
		tvRemote.turnOn();
		tvRemote.setValue(11);
		tvRemote.turnOff();
		
		RemoteControl radioRemote = new RadioRemoteControl();
		radioRemote.turnOn();
		radioRemote.setValue(99);
		radioRemote.turnOff();
		
		// 스마트 TV
		RemoteControl smartTV = new SmartTVRemoteControl();
		smartTV.turnOn();
		smartTV.setValue(15);
		
		Searchable searchTV = (Searchable)smartTV;
		searchTV.search("자바");
		
		
		// 변수에 저장된 객체가 해당 타입으로 변경가능한 객체인지 인스턴스 확인
		// 객체 타입 비교 연산 instanceof
		/*
		// java 17 이전버전 까지
		if(searchTV instanceof SmartTVRemoteControl) {
			SmartTVRemoteControl stc = (SmartTVRemoteControl)searchTV;
		*/
		// java 17 이후
		if(searchTV instanceof SmartTVRemoteControl stc) {
			stc.search("자바!");
			stc.setChannel(1000);
			stc.turnOff();
		}
		
		
	}

}