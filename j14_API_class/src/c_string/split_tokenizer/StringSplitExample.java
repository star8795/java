package c_string.split_tokenizer;

public class StringSplitExample {

	public static void main(String[] args) {
		// 정규식 패턴으로 등록된 구분자로 문자열로 분리해서 분리된 문자열이 저장된 배열을 반환
		String text = "이순신&최기근,김유신\\페이커-빛강선";
		
		String[] names = text.split("&|,|\\\\|-");

	}

}
