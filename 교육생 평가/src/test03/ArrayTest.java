package test03;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 6, 7, 8, 9, 10 };
		
		int[] mergedArray = new int[array1.length + array2.length];
		
		// array1의 요소를 복사
		System.arraycopy(array1, 0, mergedArray, 0, array1.length);
		
		// array2의 요소를 복사
		System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

		System.out.print("array1 : ");
		System.out.println(Arrays.toString(array1));
		System.out.print("array2 : ");
		System.out.println(Arrays.toString(array2));
		System.out.print("병합된 배열 : ");
		System.out.println(Arrays.toString(mergedArray));
	}	// main method

}
