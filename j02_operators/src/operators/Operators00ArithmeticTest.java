package operators;

// class block 외부에 작성할 수 있는 code는 다른 class정의
/*
 * package 명시
 * import 명시
 * 만 가능하다.
 */
/**
 * 문서 주석
 * @author kim
 * @since 2024-04-25
 * @apiNote 현재 문서에서는 연산자 중에 <b>산술연산자</b>를 학습한다.
 */
public class Operators00ArithmeticTest {
	// 메인 method가 포함되어 있는 문서에 focus가 있을 경우에는
	// ctrl + f11키로 실행가능
	public static void main(String[] args) {
		System.out.println("--- Main 프로그램 실행");
		
		int num1 = +10;
		int num2 = +20; // + 기호는 생략해도 양의 정수를 표현
		System.out.println(num1);
		System.out.println(num2);
		
		int num3 = -40;
		System.out.println(num3);
		System.out.println(+num3); // (+1 * num3)
		System.out.println(-num3); // (-1 * num3)
		System.out.println(num3);
		
		num3 = -num3;
		
		System.out.println("-----------------------------------------------------------------------");
		int result = num1 + num2;
		// 산술연산자 : +, -, *, /, %
		/*
		 	- * / %
		 	TODO num1과 num2의 나머지 산술연산결과를 result 변수에 저장하여 출력
		 */
		System.out.println("result : " + result);
		
		num1 = 10;
		num2 = 3;
		
		// 선언되지 않은 변수는 사용할 수 없음.
		// num4 = 10;
		result = num1 / num2;
		System.out.println("정수 연산 : " + result);
		// 정수와 정수의 산술 연산의 결과는 int type
		double dResult = num1 / num2;
		System.out.println("연산 결과 : " + dResult);
		// dResult == 3.0
		//					(int) /	(double)
		// 산술연산의 피연산자의 데이터 타입이 하나라도 실수타입이 되면 결과는 double타입
		double typeResult = num1 / dResult;
		//					10	/	3.0
		System.out.println("double result : " + typeResult);
		
		// 문자열이 저장하는 데이터 타입 String
		// 문자열이 포함된 연산은 +(접합연산)만 가능
		String s = "김동찬";
		String strResult = num1 + num2 + s;
		// strResult = num1 * num2 / s;
		strResult = (num1 + num2) + s;
		strResult = s + (num1 + num2);
		System.out.println(strResult);
		
		// 증감연산자
		int a = 1;
		int b = a++; // b = a; a = a + 1;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		b = --a; // a = a - 1; b = a;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		System.out.println("--- Main 프로그램 종료");
		
	}

}
