package h_arrays;

import java.util.Arrays;

public class ArraysEqualsExample {

	public static void main(String[] args) {
		int[][] original = {
				{1,2},	// original[0]
				{3,4}	// original[1]
		};
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.deepToString(original));
		
		int[][] copy = Arrays.copyOf(original, original.length);
		System.out.println(original.equals(copy));
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.equals(original, copy));
		
		copy[0] = Arrays.copyOf(original[0], original[0].length);
		copy[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.equals(original, copy));
		
		// 이차원배열에 저장된 각 항복의 1차원 배열항목 값을 비교
		copy[0][1] = 100;
		System.out.println(Arrays.deepEquals(original, copy));
		System.out.println(Arrays.deepToString(original));
		System.out.println(Arrays.deepToString(copy));
	}

}
