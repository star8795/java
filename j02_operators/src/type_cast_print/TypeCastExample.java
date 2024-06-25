package type_cast_print;

/**
 * @since 20240425 - 1
 * <br/>
 * 데이터 타입 변환 <br/>
 * 변수 또는 리터럴의 데이터 타입을 변환하는 것 <br/>
 * <b>종류</b>
 * 묵시적(자동) 형변환 : promotion
 * 강제(명시적) 형변환 : Casting
 * 타입 변환, type casting, 형변환 등등....으로 불림
 */
public class TypeCastExample {

	public static void main(String[] args) {
		
		byte b = 100;
		
		// 묵시적(자동) 형변환
		// 1byte의 변수 b는 4byte의 int type으로 표현 했을때
		// data의 손실이 없으므로 자동으로 형변환
		int i = b;
		
		long longData = 70000;
		// 명시적 형변환
		// 개발자가 데이터의 손실이 일어남을 인지하고 있다는 걸 컴파일러에게
		// 알려줌
		i = (int)longData;
		System.out.println(i);
		
		int subjectCount = 3;
		
		int engScore = 100;
		int mathScore = 85;
		int korScore = 90;
		
		// 전체 과목 점수의 평균
		// 총점
		int sum = engScore + mathScore + korScore;
		System.out.println("전체 총점 : " + sum);
		double avg = sum / (double)subjectCount;
		System.out.println("전체 평균 : " + avg);
		
		// i = 70000;
		short result = (short)i;
// 70000
// 65536				4096			256			64	32	16	
// 1	|	0	0	0	1	0	0	0	1	|	0	1	1	1	0	0	0	0
		
// 					4096			256			64	32	16	
// |	0	0	0	1	0	0	0	1	|	0	1	1	1	0	0	0	0
		System.out.println(result);
	}

}