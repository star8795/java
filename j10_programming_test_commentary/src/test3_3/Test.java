package test3_3;

public class Test {

	public static void main(String[] args) {
		// int type의 정수 10개를 저장하는 배열 numbers
		// numbers 배열의 각 항목의 초기값은 0
		int[] numbers = new int[10];
		
		System.out.print("최초의 리스트 : ");
		for(int i = 0; i < numbers.length; i++) {
			// numbers 배열 각 항목에 1 ~ 100까지의 난수를 저장
			numbers[i] = (int)(Math.random() * 100) + 1;
			// 줄바꿈 하지 않고 각 배열의 항목에 저장된 난수들 출력 후 공백 추가
			System.out.print(numbers[i] + " ");
		} // end 전체 배열 순회 for
		
		for(int i = 0; i < numbers.length; i++) {
			// i번째 인덱스 항목의 다음 인덱스부터 마지막 인덱스까지의
			// 항목을 비교
			for(int j = i + 1; j < numbers.length; j++) {
				if(numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				} // end swap if
			} // end inner for
		} // end outer for
		
		System.out.println();
		
		// 정렬된 리스트 정보 출력
		System.out.print("정렬된 리스트 : ");
		for(int i : numbers) {
			System.out.print(i + " ");
		} // end for each
		
	} // end main method

}
