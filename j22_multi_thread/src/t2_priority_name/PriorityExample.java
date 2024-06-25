package t2_priority_name;

public class PriorityExample {

	public static void main(String[] args) {
		// priority - 우선 순위
		Thread t = Thread.currentThread();
		System.out.println(t);
		// 스레드 이름
		System.out.println(t.getName());
		// 스레드 우선순위
		System.out.println(t.getPriority());
		
		// Thread 가 제공해주는 우선순위 지정 가능 정수값
		System.out.println();
	}

}
