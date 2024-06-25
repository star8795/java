package j04_test;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total, sum;
		total = sum =0;
		System.out.println("숫자를 입력하세요.");
		
		int num = sc.nextInt();
		for(int i = 1; i <= num; i++) {
			total += i;	// 총합계
			if(i % 3 ==0) {
				sum += i;	// 3의 배수 총합계
			}
		} // end for
		System.out.printf("1부터 %d까지의 총합계 : %d \n", num, total);
		System.out.printf("1부터 %d까지의 3의 배수의 총합계 : %d \n", num, sum);
	} // end main

}
