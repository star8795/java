package singleton;

/**
 * code design pattern
 * 소프트웨어를 설계할 때 특정 맥락에서 자주 발생하는
 * 고질적인 문제들이 또 발생했을 때 재사용할 수 있는 해결책
 * 
 * singleton pattern
 * 객체의 인스턴스가 여러개일 필요가 없을 때
 * 하나의 인스턴스를 공유하여 메모리를 절약하도록
 * 강제하는 코드기법
 */
public class SingletonTest {

	public static void main(String[] args) {
		/*
		Printer printer = new Printer();
		printer.print("대충 업무가 많다는 글..");
		
		Printer printerChoi = new Printer();
		printerChoi.print("대충 일 잘한다는 글...");
		*/
		Printer printerA = Printer.getInstance();
		System.out.println(printerA);
		Printer printerB = Printer.getInstance();
		System.out.println(printerB);
		
		printerA.print("대충 배고프다는 얘기");
		printerB.print("잠온다는 얘기");
	}

}
