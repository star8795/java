package test3;

import java.util.Scanner;

public class TheaterResevation {

	public static void main(String[] args) {
		// 해당 자리에 저장된 값이 0이면 빈자리
		// 예약이 완료된 자리는 1로 표현
		byte[][] seats = new byte[10][10];
		/*
		seats[1][2] = 1;
		for(byte[] line : seats) {
			for(byte column : line) {
				if(column == 0) {
					System.out.print(■);
				}else {
					System.out.print("[■]");
				}
				// System.out.printf("[%d]", column);
			}	// 한라인 출력
			System.out.println();
		}	// end for
		*/
		boolean isRun = true;
		// 예약좌석 정보를 입력받기 위한 Scanner 선언 및 초기화
		Scanner sc = new Scanner(System.in);
		
		while(isRun) {
			System.out.println("          [SCREEN]");
			// 열번호를 출럭
			for(int i = 0; i < seats.length; i++) {
				System.out.print("["+i+"]");
			}
			System.out.println();
			for(int i= 0; i < seats.length; i++) {
				for(int j = 0; j < seats[i].length; j++) {
					if(seats[i][j] == 0) {
						System.out.print("[□]");
					}else {
						System.out.print("[■]");
					}
				}	// end한 행의 열정보 출력
				System.out.println(" ["+(char)(i+65)+"행]");
			}	// end 10개의 행 정보 출력, 상영관 그리기 완료
			System.out.println("예약하실 좌석의 알파벳이름을 입력해주세요.(A ~ J)");
			String s = sc.next(); // A~J
			System.out.println(s);
			// "ABCDEF".charAt(0) == 'A'
			char inputRow =s.charAt(0);
			System.out.println(inputRow);
			if(inputRow < 65 || inputRow > 74) {
				System.out.println("선택할 수 없는 행입니다.");
				continue;
			}
			System.out.println("선택하신 행 이름은 : " + inputRow);
			System.out.println("예약하실 좌석의 열번호를 입력해주세요.(1~9)");
			boolean isNumber = sc.hasNextInt();
			if(!isNumber) {
				System.out.println("예약할 수 있는 열 번호를 입력하세요.");
				continue;
			}
			int inputColumn = sc.nextInt();
			if(inputColumn < 1 || inputColumn > 10) {
				System.out.println("사용할 수 없는 열번호 입니다");
			}
		}	// end while
		
	}	// end main

}	// end class
