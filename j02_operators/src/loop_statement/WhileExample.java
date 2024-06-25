package loop_statement;

import java.util.Scanner;

/**
 * while, do while
 * 반복 횟수가 정해져 있지 않을때 자주 사용
 */
public class WhileExample {

	public static void main(String[] args) {
		// 0~ 100까지의 정수를 사용자에게 원하는 개수만큼 입력받아서
		// 평균을 구하시오.
		
		// 사용자에게 console을 통해서 값을 입력
		// ctrl + shift + o
		Scanner scanner = new Scanner(System.in);
		
		int total = 0;
		// 점수를 입력한 횟수
		int count = 0;
		System.out.println("0 ~ 100까지의 정수를 원하는 개수만큼 입력하세요.");
		System.out.println("-1 입력 완료");
		while(true) {
			
			int number = scanner.nextInt();
			// 사용자가 입력한 정수 값이 -1이면 while loop 탈출/종료
			if(number == -1) {
				break; // 반복문 즉시 종료
			}
			// total 변수에 사용자가 입력한 점수를 누적해서 합산
			total = total + number;
			// 누적합산되 점수의 개수마틈 증
			count++;
			
		} // end while
		
		double average = total / (double)count;
		System.out.printf("입력개수 %d 총합 : %d 평균 : %.2f 입니다.", count, total, average);
		// while(true) {} 탈출조건이 없는 무한 루프
		System.out.println("Main 종료");
	}

}
