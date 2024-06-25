package test01;

public class Problem09 {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int oddCount = 0;
		
		for(int number : numbers) {
			if(number % 2 != 0) {
				oddCount++;
			}
		}
		System.out.println("주어진 배열에서 홀수의 개수 : " + oddCount);
	} // end main

} // end class
