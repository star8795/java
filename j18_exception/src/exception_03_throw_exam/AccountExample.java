package exception_03_throw_exam;

import java.util.Scanner;

public class AccountExample {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.입금|2.출금|3.확인|4.종료");
			System.out.println("메뉴 번호 입력 > ");
			int num = sc.nextInt();
			switch(num) {
				case 1 : 
					System.out.println("입금할 금액을 입력해 주세요 >");
					int money = sc.nextInt();
					account.deposit(money);
					System.out.println("입금 완료");
					break;
				case 2 : 
					System.out.println("출금할 금액을 입력해 주세요 > ");
					money = sc.nextInt();
					
					try {
						account.withdraw(money);
					} catch (BalanceInsufficientException e) {
						String message = e.getMessage();
						System.out.println(message);
						continue;
					}
					System.out.println("출금 완료");
					break;
				case 3 : 
					System.out.println(account);
					break;
				case 4 : 
					System.out.println("프로그램 종료");
					return; // main method 종료
				default : 
					System.out.println("없는 메뉴 입니다.");
			}
		} // end while
	} // end main

}