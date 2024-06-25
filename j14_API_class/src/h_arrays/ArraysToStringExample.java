package h_arrays;

import java.util.Arrays;

/**
 * java.util.Array utility class
 * 배열을 쉽게 조작할 수 있도록 기능을 정의해 놓은 클래스
 */
public class ArraysToStringExample {

	public static void main(String[] args) {
		int[] scores = {99, 10, 97, 96, 98};
		System.out.println(scores);
		for(int i : scores) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 배열 항목의 값을 연사에 사용하지 않고
		// 문자열로 출력하고자 또는 확인하고자 할때 유용한 메소드
		String result = Arrays.toString(scores); // import 추가
		System.out.println(result);
	}

}
