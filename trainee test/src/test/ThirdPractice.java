package test;

public class ThirdPractice {

	public static void main(String[] args) {
		
		int totalSum = 0;
		
		for(int i = 1; i <= 10; i++) {
			totalSum += i;
			System.out.println("더해진 수 : " + i);
			System.out.println(", 전제 합계 : " + totalSum);
		}
		
	}

}
