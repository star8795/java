package test;

import java.util.Scanner;

public class SixthPractice {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("사원명을 입력하세요.");
		String employeeName = scanner.nextLine();
		
		System.out.print("시급을 입력하세요.");
		int hourlyWage = scanner.nextInt();
		
		System.out.print("근무 시간을 입력하세요.");
		int workHours = scanner.nextInt();
		
		int salaryAmount = hourlyWage * workHours;
		int deductionTotal = (int) (salaryAmount * 0.03);
		int actualPayment = salaryAmount - deductionTotal;
		
		System.out.println("===== 급여명세서 =====");
		System.out.println("사원명 : " + employeeName);
		System.out.println("급여금액 : " + salaryAmount + "원");
		System.out.println("공제합계 : " + deductionTotal + "원");
		System.out.println("실지금액 : " + actualPayment + "원");
		
		scanner.close();
		
	}

}
