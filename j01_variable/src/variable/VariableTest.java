package variable;

public class VariableTest {

	// main : ctrl + space
	// 자바 프로그램의 시작 끝을 명시하는 method(함수)
	// main method가 호출되고 기능이 완료되면 자바 프로그램도 종료
	public static void main(String[] args) {
		// 변수 선언부
		// byte는 키워드로 사용되므로 식별자로 사용불가
		// byte byte;
		// 1byte의 크기의 정수를 저장할 공간을 마련하고
		// num이라는 식별자로 접근할 수 있도록 선언
		byte num;
		
		// 초기화가 되지 않은 변수는 사용불가
		// System.out.println(num);
		
		// num 위치의 저장공간에 10이라는 값으로 저장 - 초기화
		num = 10;
		System.out.println(num);
		
		// 식별자는 중복해서 사용불가
		// byte num = 20;
		/*
		 범위주석
		 byte type의 num이라는 변수에 10이라는 값을 대입(저장)
		 num == 10
		 
		 byte == 1byte 크기의 정수값을 저장
		 1byte == 8bit
		 
		 	1byte 표현 할 수 있는 값의 개수는 256개
		 	[0 or 1][0 or 1][0 or 1][0 or 1][0 or 1][0 or 1][0 or 1][0 or 1]
		 	  256	   128	   64	   32	   16		8		4		2
	부호(양수,음수) [2^6][2^5][2^4][2^3][2^2][2^1][2^0]
		 	[0]  [1]  [1]  [1]  [1]  [1]  [1]  [1]
		 	  (64*1)(32*1)(16*1)(8*1)(4*1)(2*1)(1*1)
		 	  ==64 + 32 + 16 + 8 + 4 + 2 + 1 == 0 ~ 127
		 	  
		 	302 == 10진법
		 	10^2*3 + 10^1*0 + 10^0*2
		 	300 + 0 + 2
		*/
			// 정수를 이진수로 표현
			byte bNum = 0B00001010; // 10
			// octa 앞에 0이 붙으면 8진수
			byte oNum = 012;
			// (8^1*1) + (8^0*2) == 10
			
			// 0X는 16진수 A == 10
			byte xNum = 0XA; // 10
			
			// short 2byte 크기의 정수
			// 65536개의 수를 표현
			// -32768 ~ 32768
			// 범위를 벗어나는 데이터는 저장이 불가
			short s1 = 3268;
			System.out.println(s1);
			
			// 문자타입(character)
			// 아스키코드 0 ~ 127의 문자를 표현
			// 아스키코드를 확장시킨 유니코드(UTF-8) 문자정보를 사용하는 데이터 타입
			// 0 ~ 65535의 양의 정수값으로 문자 표현
			// 한개의 문자를 표현하는 표현식	'A'			'B'
			char c = 'A';
			// c = 'AB';
			c = 65;
			System.out.println(c);
			// c = -1; // 0에서 부터 양의 정수만 가능
			// c ='최고'; // 데이터 타입이 틀리면 저장 불가
			
			// int 4byte 공간에 정수값을 저장(Integer)
			// 변수에 저장하고 사용하기 위해서 명시 또는 표기된 값을 리터럴이라고 한다.
			// 정수형 리터럴은 기본적으로 int type
			// 21억어쩌고 ~ 21억어쩌고까지 저장
			int i = 100000;
			// i = 222222222;
			i = 10;
			System.out.println(Integer.MAX_VALUE);
			System.out.println(Integer.MIN_VALUE);
			
			// long 8byte이 정수 저장
			long l = 2222222222L;
			l = 10;
			
			// 실수
			// 4byte float, 8byte double
			
			// 8byte - 소수점 15자리 좀더 정밀한 연산을 수행
			// 실수형 기본 리터럴
			double d = 3.141592;
			// double 타입의 실수형 리터럴을
			// 4byte의 저장공간에 저장하는 기호 f, F
			float f = 30141592;
			
			// 논리형 데이터 타입 저장
			boolean bool = true;
			boolean isRun = false;
			
			// 변수 선언 및 초기화 방식
			int il; // 변수 선언
			il = 100; // 초기화
			il = 200; // 재할당
			
			// 변수 선언과 동시에 초기화
			int i2 = 200;
			
			// 여러개 변수를 동시에 선언
			int i3, i4, i5;
			// 한번에 초기화
			i3 = i4= i5 = 100;
			
			// 여러 변수를 선언과 동시에 초기화
			int i6 = 0, i7 = 0, i8 = 0;
			
			// 기본타입은 아니지만 개발에 자주 사용되는 문자열을 저장하는 타입
			String str = "개피곤";
			
	}	// end main method
	
}
