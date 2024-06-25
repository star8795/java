package test;

import java.util.Scanner;

public class SecondPratice {
	public static void main(String[] arsg) {
		
		// java.util package에 존재하므로 위치를 명시
		Scanner scanner = new Scanner(System.in);
		
		// 반지름을 저장하는 변수 radius 선언 및 입력 받기
		System.out.println("반지름을 입력하세요");
		double radius = scanner.nextDouble();
			
		// 원의 면적을 저장하는 변수 area 선언 및 계산
		double area = radius * radius * Math.PI;

		// 원의 면적 출력
		System.out.println("원의 면적 : " + area);
		
		scanner.close();
	}
	
}
