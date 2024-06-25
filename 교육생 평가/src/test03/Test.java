package test03;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

        while (true) { // 무한 루프 시작
            System.out.println("문자열을 입력하세요: "); // 사용자에게 문자열 입력 요청
            String input = scanner.nextLine(); // 사용자가 입력한 문자열을 읽어옴

            if (input.contains("java")) { // 사용자가 입력한 문자열에 "java"가 포함되어 있는지 확인
                System.out.println("java가 존재합니다."); // "java가 존재합니다." 메시지 출력
                System.out.println("프로그램을 종료합니다."); // "프로그램을 종료합니다." 메시지 출력
                break; // 무한 루프 종료
            } else { // "java"가 포함되어 있지 않은 경우
                System.out.println("\"java\" 문자열이 존재하지 않습니다. 다시 입력해주세요."); // "\"java\" 문자열이 존재하지 않습니다. 다시 입력해주세요." 메시지 출력
            }
        }

        scanner.close(); // Scanner 객체 닫기
    }
}