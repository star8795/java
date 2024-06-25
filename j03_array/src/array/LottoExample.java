package array;

public class LottoExample {

	public static void main(String[] args) {
		// 1 - 45까지의 수를 6개 + 보너스 1개
		// 1 - 45까지의 난수를 6개 추출해서 행운번호 저장
		
		// 난수 추출
		// Math 수학 관련된 계산기능을 저장하는 객체
		// Math.random(); 호출되는 시점에 랜덤한 난수를 반환하는 함수
		// 0 ~ 0.99999999999999
		// 0이상 1미만의 실수를 전달
		// 0.99999999999999; * 45 == 44.9999999
		// 0.0 * 45 == 0
		double random = Math.random();
		System.out.println(random);
		double next = random * 45;
		System.out.println(next);
		int number = (int)next;
		System.out.println(number);
		System.out.println(number + 1);
		number = (int)(Math.random() * 45) + 1;
		System.out.println(number);
		
		// 당첨번호 - 행운번호를 저장할 배열
		int[] lotto = new int[6];
		// lotto[0] = (int)(Math.random() * 45) + 1;
		for(int i = 0; i < lotto.length; i++) {
			// lotto 배열 각 인덱스 항목에 1 ~ 45까지의 난수를 저장
			lotto[i] = (int)(int)(Math.random() * 45) + 1;
		}// 행운번호 생성 저장 완료
		int count = 0;
		for(int i = 0; i < lotto.length; i++) {
			count++;
			lotto[i] = (int)(Math.random() * 45) + 1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			System.out.println("count : " + count);
		}// 저장된 행운 번호 확인
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}//end for
		System.out.println();
		/*
		if(lotto[0] > lotto[1]) {
			int temp = lotto[0];
			lotto[0] = lotto[1];
			lotto[1] = temp;
		}
		*/
		
		// 앞의 값이 크면 뒤에 있는 값과 자리를 변경하여 
		// 오름차순으로 정렬
		for(int i = 0; i < lotto.length; i++) {
			for(int j = i+1; j < lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		for(int i : lotto) {
			System.out.print(i + " ");
		}
		System.out.println();
	}// end main

}// end class
