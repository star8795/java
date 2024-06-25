package test3;

import java.util.Scanner;

public class TheaterSeating {

	public static void main(String[] args) {
		final int size = 10;
		// 예약 좌석 정보를 저장할 배열
		int[] seats = new int[size];
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("------------------------------------");
			// 좌석을 입력하기 위한 좌석 번호를 출력
			for(int i = 0; i < seats.length; i++) {
				System.out.print((i+1)+" ");
			}
			System.out.println();
			System.out.println("------------------------------------");
			//예약가능 예약완료 여부를 출력, 예약가능 : 0, 예약완료 : 1
			for(int i : seats) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("------------------------------------");
			
			// 예약좌석 번호 입력받기
			System.out.println("원하시는 좌석번호를 입력하세요.(종료는 -1)");
			// 사용자가 입력한 좌석번호를 seat변수를 저장
			int seat = sc.nextInt();
			
			// -1이 입력되면 프로그램 종료
			// 입력받은 좌석 번호로 예약 등록
			// 예약이 완료된 자리는 예약 할수 없음. 중복예약 제거
			 // -1이 입력되면 프로그램 종료
            if (seat == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 예약이 완료된 자리는 예약 할수 없음. 중복예약 제거
            if (seats[seat - 1] == 0) { // 해당 좌석이 예약 가능한 상태인지 확인
                seats[seat - 1] = 1; // 해당 좌석을 예약 완료 상태로 변경
                System.out.println("좌석 " + seat + "번이 예약되었습니다.");
            } else {
                System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택해주세요.");
            }
		}	// end while
	}	// end main
}	// end class
