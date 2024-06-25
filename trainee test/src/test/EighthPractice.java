package test;

import java.util.Scanner;

public class EighthPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요.");
		int firstNumber = scanner.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요.");
		int secondNumber = scanner.nextInt();
		
		int maxNumber;
		
		if(firstNumber > secondNumber) {
			maxNumber = firstNumber;
		}else {
			maxNumber = secondNumber;
		}
		System.out.println("입력한 두 정수 중에서 큰 수는 : " + maxNumber);
		scanner.close();
	}

}
