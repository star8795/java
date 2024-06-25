package c_string.method;

public class String03SubstringExample {

	public static void main(String[] args) {
		
		String ssn = "820607-1234567";
		// ssn 문자열에 "-"이 위치하고 있는 인덱스 번호 반환
		int index = ssn.indexOf("-");
		
		String birth = ssn.substring(0,index);
		System.out.println("생년월일은 " + birth +"입니다.");
		
		String rrn = ssn.substring(index+1);
		System.out.println(rrn);
		
	}

}