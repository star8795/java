package t2_priority_name;

public class CalcThread extends Thread{
	// 생성자의 매개변수로 Thread 이름 전달
	public CalcThread(String name) {
		// Thread class의 생성자를 통해 Thread 이름 초기화
		super(name);
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 2100000000; i++) {
			
		} // end for
		String name = getName();		// 작업 스레드 이름
		int priority = getPriority(); 	// 작업 우선 순위
		System.out.println(name+" : "+priority);
	}

}