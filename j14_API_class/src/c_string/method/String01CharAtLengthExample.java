package c_string.method;

public class String01CharAtLengthExample {

	public static void main(String[] args) {
		
		String rrn = "010607-1230123";
		
		char gender = rrn.charAt(7);
		switch(gender) {
			case '1' : case '3' :
				System.out.println("남성입니다.");
				break;
			case '2' : case '4' : 
				System.out.println("여성입니다.");
				break;
			case '5' : case '7' : 
				System.out.println("외국인 남자입니다.");
				break;
			case '6' : case '8' : 
				System.out.println("외국인 여자입니다.");
				break;
			default : 
				// 0 여, 9 남
				System.out.println("1899년 이전 출생자");
		} // end switch
		
		rrn = "8206071134567";
		// length() == 저장된 문자의 길이
		int length = rrn.length();
		System.out.println("rrn이 문자 길이 : " + length);
		if(length == 13 ) {
			System.out.println("정상적으로 입력되었습니다.");
		}else {
			System.out.println("주민등록번호가 아닙니다.");
		}
		
		
	}

}