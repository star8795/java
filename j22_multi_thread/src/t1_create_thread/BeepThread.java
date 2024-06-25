package t1_create_thread;
// abstract window toolkit
import java.awt.Toolkit;

// 방법 1. Thread를 상속받아 스레드가 수행할 작업을 재정의 
public class BeepThread extends Thread{
	@Override
	public void run() {
		Toolkit tool = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			Thread t = Thread.currentThread();
			System.out.println(t);
			tool.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		System.out.println("Beep Thread 종료");
	} // end run

}
