package b_field;

/**
 * 객체 모델링 - 추상화
 * 필요한 부분만 표현하고
 * 불필요한 부분을 제거하고 간결하고 이해하기 쉽게 만드는 작업
 * 
 * 프로그래밍에 필요한 속성 및 동작을 추출하는 과정
 * 공통의 속성이나 기능을 묶어서 이름을 붙이는 것.
 */
public class Person {

	String job;			// 직업
	int age;			// 나이
	String name;		// 이름
	double height;		// 키
	double weihgt;		// 몸무게
	char gender;		// 성별
	boolean isMarried;	// 초혼 재혼
	
}

class Student{
	int StudentID;		// 학번
	String name;		// 이름
	int grade;			// 학년
	String[] subject;	// 수강 과목
}
