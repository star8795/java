package type_cast_print;

/**
 * System : java에서 연결된 운영체제의 하드웨어를 제어하기 위한 class
 * System.in : 실행된 운영체제의 console을 이용해서 값을 입력받음
 * System.out : 실행된 운영체제의 console을 이용해서 값을 출력함
 * 
 * out.println(); -> ()안의 내용을 출력한 후 줄바꿈
 * out.print(); -> ()안의 내용을 출력한 후 줄바꿈하지 않음
 * out.printf(); -> ()안의 양식(pattern)화된 지시어를 통해 출력(format 형식)
 * 
 */
public class PrintExample {

	public static void main(String[] args) {
		java.lang.System.out.println("안녕하세요!");
		System.out.print("저는 ");
		System.out.print("김동찬 ");
		System.out.print("입니다!!!");
		// 출력할 내용을 명시하지 않으면 print();는 사용할 수 없음
		// System.out.print();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("print line test");
		/*
		 	이스케이프 문자
		 	\'	홀따움표 출력
		 	\"	쌍따움표 출력
		 	\t	탭문자(들여쓰기)
		 	\n	다음줄로 이동됨
		 	\\	\출력
		*/
		
		String str = "나는 오늘 \"오만과 편견\"이라는 책을 읽었습니다.";
		System.out.println(str);
		
		/*
		 * 약속된 형식을 지정해 놓고 사용하는 출력
			printf - 줄바꿈이 이루어지지 않음
			출력하려는 지시자의 수만큼 필요한 값을 알려줘야함
			
			// 문자열 내부에서 사용할 수 있는 지시자 목록
			%d	int(decimal) 10진법의 정수
			%b	boolean 논리값
			%o	octa 8진법
			%x	hexa 16진법
			%f	float(부동소수점 실수)
			%c	characted - 문자
			%s	string 문자열
			%n	new line 줄바꿈(line-feed, carriage return)
			
			ex) ("영수는 %d 가격의 책인 %s를 구입했습니다.", 30000, "자바")
		*/
		
		int score = 100;
		String name = "김동찬";
		// ~~님의 점수는 ~점 입니다.
		System.out.println(name+"님의 점수는 "+score+"입니다.");
		System.out.printf("%s님의 점수는 %d입니다. \n %n", name, score);
		
	/*
		Optional
		%[-][0][.n][.m][,m]
		 
		%[n] : 출력할 전체 자리수가 n만큼 지정(오른쪽 정렬)
		%5d, 1000 == [ ][1][0][0][0]
		%[-] : 전체 자리수가 지정된 경우 왼쪽으로 정렬하고 빈칸에 공백 출력
		%-5d, 1000 : [1][0][0][0][ ]
		%[0] : 전체 자리수가 지정되어 있을때 빈자리를 0으로 표현
		%05d, 1000 == [0][1][0][0][0]
		%[.m] : 소수점 아래 자리수를 지정. 잘리는 소수점 자리는 반올림
		$.2f, 82.687 == 82.69
		%[,] : 정수의 자리수 지정
		%,08d, 1000000 == 01,000,000, 
	*/
		String title = "Java";
		int price = 10000000;
		System.out.printf("%s교재는 %,020d입니다 %n",title,price);
		// 소수점 2자리까지 표현 3의 자리에서 반올림
		System.out.printf("%,.2f %n",1234.123);
		
		System.out.println("Main 종료");
	} // end main

} // end class