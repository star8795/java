package test;

import java.util.Scanner;

public class TenthPractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();

        while (score < 0 || score > 100) {
            System.out.println("점수는 0부터 100까지의 범위 내에서 입력해주세요.");
            System.out.print("점수를 다시 입력하세요: ");
            score = scanner.nextInt();
        }

        if (score >= 90 && score <= 100) {
            System.out.println("A학점");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B학점");
        } else if (score >= 70 && score <= 79) {
            System.out.println("C학점");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D학점");
        } else {
            System.out.println("F학점");
        }

        scanner.close();
    }
}
