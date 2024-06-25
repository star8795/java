package practice_01_03;

import java.util.Arrays;
import java.util.Random;

public class Practice_03 {
    public static void main(String[] args) {
        // 배열 선언 및 생성
    	// 길이가 10인 정수형 배열 선언
        int[] array = new int[10];
        Random random = new Random();

        // 배열에 난수 값 담기
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1; // 1부터 100 사이의 난수 발생
        }

        // 배열 출력
        System.out.print("최초의 리스트 : ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 배열 내림차순 정렬
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        // 정렬된 배열 출력
        System.out.print("정렬된 리스트 : ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}