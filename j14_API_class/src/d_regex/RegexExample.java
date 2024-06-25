package d_regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		String regeExp = "(02|010)-\\d{3,4}-\\d{4}";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호를 입력해주세요. 예) 010-0000-0000");
		String phone = sc.next();
		
		boolean result = Pattern.matches(regeExp, phone);
		if(result) {
			System.out.println("전화번호가 정규식과 일치합니다.");
		}else {
			System.out.println("입력하신 번호가 정규식과 일치하지 않습니다.");
		}
		
		regeExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		String data = "angel@naver.com";
		
		if(Pattern.matches(regeExp, data)) {
			System.out.println("이메일 형식입니다.");
		}else {
			System.out.println("이메일 형식이 아닙니다.");
		}
		
	}

}
