package test;

import java.util.Scanner;

public class FifthPractice {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double top, bottom, height;
		
		System.out.print("윗변의 길이를 입력하세요.");
		top = scanner.nextDouble();
		System.out.print("아랫변의 길이를 입력하세요.");
		bottom = scanner.nextDouble();
		System.out.print("높이를 입력하세요.");
		height = scanner.nextDouble();
		
		double area = (top + bottom) * height / 2;
		
		System.out.println("사다리꼴의 넓이는 " + area + "입니다.");
		scanner.close();
	}

}
