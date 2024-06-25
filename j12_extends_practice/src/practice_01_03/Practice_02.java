package practice_01_03;

import java.util.Arrays;

public class Practice_02 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		int count = 0;
		
		while(count < 6) {
			int number = (int)(Math.random() * 45 + 1);
			boolean isDuplicate = false;
			
			// 중복체크
			for(int i = 0; i < count; i++) {
				if(lotto[i] == number) {
					isDuplicate = true;
					break;
				}
			}
			
			// 중복이 아닐 경우 배열에 추가
			if(!isDuplicate) {
				lotto[count] = number;
				count++;
			}
		}
		
		// 배열에 오름차순으로 정렬
		Arrays.sort(lotto);
		
		// 위의 랜덤메소드를 이용하여 1~45까지 난수를 생성하고 'isDuplicate'라는 변수를 사용하여
		// 난수가 배열에 있는지 확인 후 중복되지 않는 경우 배열에 추가
		// Arrays.sort(lotto)를 사용하여 배열을 오름차순으로 정렬
		// int number = (int) (Math.random() * 45 + 1); // 참고
		// 작성
		
		
		
		// 결과 출력 코드 수정 x
		System.out.println("[ 결과 ]");
		for (int i : lotto) {
			System.out.print("[" +i+ "]");
		}
	}
}