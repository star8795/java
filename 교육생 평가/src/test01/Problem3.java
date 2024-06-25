package test01;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요. ");
		int number = scanner.nextInt();
		
		if(number > 0) {
			System.out.println("입력한 정수는 양수입니다.");
		}else if(number < 0) {
			System.out.println("입력한 정수는 음수입니다.");
		}else {
			System.out.println("입력한 정수는 0입니다.");
		}
	}

}
