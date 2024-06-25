package test;

import java.util.Scanner;

public class TwelvthPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRun = true;
        int money = 0;

        while (isRun) {
            System.out.println("==============================");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔액확인 | 4. 종료");
            System.out.println("==============================");
            System.out.print("번호를 입력해주세요(1 ~ 4) > ");
            int selectNo = sc.nextInt();

            if (selectNo == 1) {
                // 예금 기능
                System.out.print("예금할 금액을 입력하세요: ");
                int deposit = sc.nextInt();
                money += deposit;
                System.out.println(deposit + "원이 예금되었습니다.");
            } else if (selectNo == 2) {
                // 출금 기능
                System.out.print("출금할 금액을 입력하세요: ");
                int withdraw = sc.nextInt();
                if (withdraw > money) {
                    System.out.println("잔액이 부족합니다.");
                } else {
                    money -= withdraw;
                    System.out.println(withdraw + "원이 출금되었습니다.");
                }
            } else if (selectNo == 3) {
                // 잔액 확인 기능
                System.out.println("현재 잔액은 " + money + "원 입니다.");
            } else if (selectNo == 4) {
                // 종료
                isRun = false;
                System.out.println("프로그램을 종료합니다.");
            } else {
                // 잘못된 입력 처리
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
        sc.close();
        System.out.println("Main 종료");
    }
}
