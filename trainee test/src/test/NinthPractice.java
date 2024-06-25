package test;

import java.util.Scanner;

public class NinthPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3, num4, num5;

        System.out.println("5개의 정수를 입력하세요:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num4 = scanner.nextInt();
        num5 = scanner.nextInt();

        int sum = num1 + num2 + num3 + num4 + num5;

        int average = sum / 5;

        System.out.println("입력한 5개의 정수의 평균은 " + average + "입니다.");

        scanner.close();
    }
}
