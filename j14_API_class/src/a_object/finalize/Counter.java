package a_object.finalize;

public class Counter {
	
	private int no;
	
	public Counter(int no) {
		this.no = no;
		System.out.println("Counter 객체 생성 : " + this.no);
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.no + " Counter 객체 메모리 제거 finalize");
	}
	
}