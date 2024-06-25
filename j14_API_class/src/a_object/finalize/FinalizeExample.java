package a_object.finalize;

public class FinalizeExample {

	public static void main(String[] args) {
		
		Counter counter = null;
		for(int i = 1; i <= 50; i++) {
			counter = new Counter(i);
			// Garbage Collector 에게 메모리 정리 요청
			System.gc();
		}
		
	}

}
