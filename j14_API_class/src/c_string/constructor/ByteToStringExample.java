package c_string.constructor;

import java.io.UnsupportedEncodingException;

public class ByteToStringExample {

	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] bytes = new byte[] {
//				H	e	 l	  l     o  공백	J	a	v	 a
				72, 101, 108, 108, 111, 32, 74, 97, 118, 97
		};
		
		String str = new String(bytes);
		System.out.println(str);
		// bytes 배열의 6번째 인덱스부터 4개만큼 UTF-8언어 셋으로 디코딩된 문자열 생성
		String str2 = new String(bytes, 6, 4, "UTF-8");
		System.out.println(str2);
		
		char[] strs = new char[] {'안','녕','하','세','요'};
		str = new String(strs);
		System.out.println(str);
		
		// String Class에 저장된 문자열을 char배열로 반환
		char[] charArray = str.toCharArray();
		for(char c : charArray) {
			System.out.print(c);
		}
		System.out.println();
		// strs Character 배열에 저장된 항목 중에
		// 0번째 인덱스부터 2개만큼의 항목으로 문자열 생성
		// 언어셋을 지정하지 않으면 자바는 기본적으로 UTF-8사용
		str = new String(strs, 0, 2);
		System.out.println(str);
		
		str = "한글표현";
		System.out.println(str.length());
		// UTF-8 문자셋은 한글 한문자를 3byte로 표현
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1.length);
		
		// String class에 저장된 문자열을 EUC-KR 언어셋으로 인코딩해서 반환
		byte[] bytes2 = str.getBytes("EUC-KR");
		System.out.println(bytes2.length);
		
		String result1 = new String(bytes2);
		System.out.println(result1);
		
		String result2 = new String(bytes2,"EUC-KR");
		System.out.println(result2);
		
		String result3 = new String(bytes1);
		System.out.println(result3);
	}

}
