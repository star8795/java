package test02;
import java.util.Arrays;

public class Test04 {

    public static void main(String[] args) {
        // 10개의 정수값을 저장할 수 있는 int형 배열 생성
        int[] randomNumberArray = new int[10];
        
        // 난수를 발생시켜 배열에 10개의 값을 저장
        for (int i = 0; i < 10; i++) {
            randomNumberArray[i] = (int) (Math.random() * 100) + 1;
        }
        
        // 배열에 저장된 값을 출력 (최초의 리스트)
        System.out.print("최초의 리스트 : ");
        for (int number : randomNumberArray) {
            System.out.print(number + " ");
        }
        System.out.println();
        
        // 배열을 오름차순으로 정렬
        Arrays.sort(randomNumberArray);
        
        // 정렬된 배열의 항목값을 출력 (정렬된 리스트)
        System.out.print("정렬된 리스트 : ");
        for (int number : randomNumberArray) {
            System.out.print(number + " ");
        }
    }
}