package c_string.method;

public class String07FormatExample {

	public static void main(String[] args) {
		// 지정된 패턴에 따라 대입된 값으로 문자열을 완성하는 메소드
		String str = "freelife";
		boolean bool = true;
		int i = 127;
		
		String result1 = String.format("문자열 서식 %S, %s", str, str);
		result1 = String.format("문자열 서식 %S, %<s", str);
		System.out.println(result1);
		// < 앞의 형식에 대입된 값과 동일한 값을 다른 형식으로 표현
		String result2 = String.format("boolean 서식 문자열 %B, %<b", bool);
		System.out.println(result2);
		String result3 = String.format("숫자 형식 : %d, %<o, %<x, %05d", i);
		System.out.println(result3);
	}

}
