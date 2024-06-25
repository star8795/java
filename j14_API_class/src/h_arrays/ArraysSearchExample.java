package h_arrays;

import java.util.Arrays;

public class ArraysSearchExample {

	public static void main(String[] args) {
		
		// binarySearch - 이진 탐색
		// 지정된 갓이 배열의 몇번째 인덱스에 존재하는지 검색하여
		// 인덱스 번호를 반환
		
		int[] scores = {1, 5, 3, 10, 7, 9, 8};
		//				0  1  2  3   4  5  6
		//			   -1 -2 -3 -4  -5 -6 -7 | -8
		int index = Arrays.binarySearch(scores, 7);
		System.out.println("search 7 : " + index);
		
		// 배열에 저장된 항목들을 오름차순으로 정렬
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
		index = Arrays.binarySearch(scores, 10);
		System.out.println("search 10 : " + index);
		
		index = Arrays.binarySearch(scores, 7);
		System.out.println("search 7 : " + index);
		
		System.out.println("===============================");
		
		// 순차 탐색
		// 리스트 안에 있는 특정한 데이터를 찾기 위해
		// 앞에서부터 데이터를 하나씩 차례대로 확인 하는 방법
		// 일반적으로 정렬되지 않은 배열에서 데이터를 검색할 때 사용
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] == 10) {
				System.out.println("scores 배열에 10은 : " + i +"인덱스에 있습니다.");
				break;
			}
			
		}
		
		// sort 배열 항목 정렬
		String[] names = {"홍길동", "김기환", "이다한", "최기근"};
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));
		
		// fill - 배열 항목의 특정 위치에 있는 항목을 지정된 값으로 변경 메소드
		// names라는 배열 항목의 값 중에 1번째 인덱스부터 3번째 인덱스 이전까지 "최기근"문자열로 채움
		Arrays.fill(names, 1, 3, "최기근");
		System.out.println(Arrays.toString(names));
		
		// 모든 항목을 지정된 값으로 변경
		Arrays.fill(names, null);
		System.out.println(Arrays.toString(names));
		
	}

}
