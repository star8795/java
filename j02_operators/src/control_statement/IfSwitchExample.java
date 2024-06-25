package control_statement;

public class IfSwitchExample {

	public static void main(String[] args) {
		// 조건문
		// if, switch
		int num1 = 10;
		int num2 = 20;
		
		if(num1 > num2) System.out.println("num1이 num2보다 큽니다.");
		
		if(num1 == num2) {
			System.out.println("num1과 num2의 값이 일치합니다.");
		}
		
		int score = 75;
		
		if(score >= 60) {
		//if(score >= 90) {
			System.out.println("A");
			if(score >= 97) {
				System.out.println("A+");
			}else if(score >= 94) {
				System.out.println("A0");
			}else {
				System.out.println("A-");
			}
		}else if(score >= 80) {
			System.out.println("B");
		}else if(score >= 70){
			System.out.println("C");
		}else if(score >= 60){
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		System.out.println(score);
		switch(score / 10) {
			case 10 : case 9 :
				System.out.println("A학점입니다.");
				break;
			case 8 :
				System.out.println("B학점입니다.");
				break;
			case 7 : 
				System.out.println("C학점입니다.");
				break;
			case 6 : 
				System.out.println("D학점입니다.");
				break;
			default : 
				System.out.println("F학점입니다.");
		} // switch end
		
		System.out.println("Main 종료");
	} // end main method
	
	// System.out.println("aaaa");
	
} // end class
