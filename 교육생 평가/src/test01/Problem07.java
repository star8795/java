package test01;

import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("숫자를 입력하세요. ");
            n = scanner.nextInt();
        } while (n <= 0);

        int totalSum = 0; 
        int multipleOfThreeSum = 0; 

        for (int i = 1; i <= n; i++) {
            totalSum += i; 
            if (i % 3 == 0) {
                multipleOfThreeSum += i; 
            }
        }

        System.out.println("1부터 " + n + "까지의 총 합계: " + totalSum);
        System.out.println("1부터 " + n + "까지의 3의 배수의 합계: " + multipleOfThreeSum);

        scanner.close();
    }
}
