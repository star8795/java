package practice_01_03;

import java.util.Scanner;

public class Practice_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// sample id
		String myId = "id001";
		
		System.out.print("아이디 입력>");
		String id = sc.next();

		if(myId.equals(id)) {
			// `==`연산자는 두 문자열이 같은 객체를 가리키는지 비교함.
			// 입력한 문자열과 myId는 서로 다른 문자열로 false임
			// 문자열과 내용을 비교하려면 `==`가 아닌 equals메소드를 이용해야함
			System.out.println("아이디가 일치합니다.");
		}else {
			System.out.println("아이디가 일치하지 않습니다.");
		}
		sc.close();
	}
}