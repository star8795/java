package t1_create_thread;

import java.awt.Toolkit;

public class SingleThreadExample {

	/**
	 * main method
	 * JVM(자바 가상머신)이 프로그램 실행 시 생서한
	 * main thread에서 호출되는 메소드
	 * main thread에서 호출된 메인 메소드가 종료되면 프로세스도 종료
	 * 
	 * 메인 스레드 하나로 작업을 처리할 경우
	 * 싱글 스레드 환경이라고 함
	 */
	public static void main(String[] args) {
		System.out.println("Main 시작!!!");
		// 프로세스란 운영체제에서 실행중에 있는 프로그램을 의미
		// thread 하나의 프로세스 내부에서 실행되는 작업
		// 자바에서 멀티스레드 지원을 위해 제공되는 객체 : Thread
		Thread t = Thread.currentThread();
		System.out.println(t);
		// id는 자바 19에 추가됨
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵!!!");
			// 현재 작업 중인 스레드를 매개변수로
			// 전달된 밀리세컨드 만큼 작업 대기
			try {
				Thread.sleep(500); // 0.5초만큼 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}	// end for
		System.out.println("출력 완료!");
		
		Toolkit tool = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i < 5; i++) {
			tool.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		
		System.out.println("Main 종료!!!");
	}	// end main

}
