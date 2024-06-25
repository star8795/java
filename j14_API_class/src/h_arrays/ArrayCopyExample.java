package h_arrays;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		int[] scores = {100, 60, 71, 80, 90};
		System.out.println(scores.length);
		int[] scores2 = new int[scores.length + 1];
		for(int i = 0; i < scores.length; i++) {
			scores2[i] = scores[i];
		}
		System.out.println(Arrays.toString(scores));
		scores2[scores2.length - 1] = 100;
		System.out.println(Arrays.toString(scores2));
		
		// 타입 newArray = Arrays.copyOf(원본배열, 복사할 길이); 
		// 새롭게 배열을 생성해서 반환
		
		char[] arr1 = {'J','A','V','A'};
		System.out.println(Arrays.toString(arr1));
		
		char[] arr2 = Arrays.copyOf(arr1, 2);
		System.out.println(Arrays.toString(arr2));
		
		char[] arr3 = Arrays.copyOf(arr1, arr1.length + 1);
		System.out.println(Arrays.toString(arr3));
		//		   0  1  2  3
		// array1 [J][A][V][A]
		
		// Arrays.copyOfRange(원본배열, 시작인덱스, 마지막인덱스 번호 - 1);
		char[] arr4 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr4));
		
		// 배열복제
		// System.arraycopy(원본배열,시작인덱스,복제할 배열,시작인덱스);
		char[] arr5 = new char[arr1.length + 1];
		System.arraycopy(arr1, 0, arr5, 1, arr1.length);
		System.out.println(Arrays.toString(arr5));
		
	}

}
