package test;

public class ForthPractice {

	public static void main(String[] args) {
		
		int oddSum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				oddSum += i;
			}
		}
		System.out.println("1부터 100짜지의 홀수의 합 : " + oddSum);
	}

}
