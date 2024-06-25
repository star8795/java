package exception_01_try_catch;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) {
		
		System.out.println("Main START");
		
		// 4개의 정수값을 저장할 배열 생성
		int[] scores = new int[4];
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("배열에 삽입하려는 인덱스 번호를 입력 > ");
				int index = sc.nextInt();
				System.out.println("점수를 입력하세요 > ");
				int score = sc.nextInt();
				scores[index] = score;
				
				// 사용할 수 없는 인덱스 번호(음수) 일 경우 while 문 종료
				if(index < 0) break;
			}catch(ArrayIndexOutOfBoundsException e) {
				// 배열에 사용할 수 있는 인덱스 번호를 벗어남
				System.out.println("배열에 사용할 수 없는 인덱스 번호입니다.");
				System.out.println("다시 입력해 주세요.");
				continue;
			}catch(InputMismatchException e) { // java.util package import 추가
				System.out.println("정수가 입력되지 않음");
				continue;
			}finally {
				System.out.println(Arrays.toString(scores));
				System.out.println("항상 실행");
			}
			
		} // end while
		
		// scores 배열에 저장된 항목 값 출력
		System.out.println(Arrays.toString(scores));
		System.out.println("Main END");
		
	}

}