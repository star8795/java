package j04_test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// 사용자에게 console을 통해서 원하는 타입의 값을 입력받는 class
		Scanner sc= new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("입력한 수는 양수입니다.");
		}else if(num < 0) {
			System.out.println("입력한 수는 음수입니다.");
		}else {
			System.out.println("입력한 수는 0입니다.");
		}
	}

}
