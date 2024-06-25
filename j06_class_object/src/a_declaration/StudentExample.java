package a_declaration;

/**
 * OOP(Object Oriented Programming)
 * 우리가 실생활에서 쓰는 모든 것을 객체라고 하며
 * 객체 지향 프로그래밍은 프로그램 구현에 필요한 객체를 파악하고 
 * 상태와 행위를 가진 객체를 만들고
 * 각각의 객체들의 역할이 무엇인지를 정의하여 객체들 간의 상호작용을 통해
 * 프로그램을 만드는것을 말함.
 * 기능이 중심이 아닌 객체가 중심.
 * 
 * <==> 절차 프로그래밍(Procedure Programming)
 * 절차 지향 - 일어나는 일을 시간순으로 프로그래밍한 것.
 * 
 * 아침에 일어난다.
 * 씻는다.
 * 밥을 먹는다.
 * 버스나 지하철을 탄다.
 * 요금을 지불한다.
 * 학교에 도착한다.
 * 논다.
 * 공부를 한다.
 * 
 * 객체지향
 * 대상이 될 수 있는 객체
 * 
 * 학생			탈것
 * 
 * 밥			학교
 * 
 * 객체인 학생, 밥, 탈것, 학교 사이에 일어나는 일을 프로그램으로 구현하는 것
 * 객체를 먼저 정의하고 객체가 어떤 기능을 제공하고
 * 객체간 협력을 어떻게 구현할 것인지를 고민.
 * 
 * 	- 변수 : 하나의 데이터를 저장할 수 있는 공간
 * 	- 배열 : 동일한 타입의 데이터를 연속적으로 저장할 수 있는 공간
 * 	- 구조체 : 타입에 관계없이 서로 연관된 데이터들을 저장할 수 있는 공간
 * 	- class : 데이터와 기능(함수)의 결합
 */

/**
 * main method가 포함된 class는
 * 실행 가능한 클래스로서 실행 클래스라고 한다.
 * 자바 프로그램은 1개의 실행 클래스와 n개의 API 클래스로 이루어짐.
 */
public class StudentExample {

	public static void main(String[] args) {
		Student s1; // Student 타입의 객체를 저장할 변수 s1 선언
		s1 = new Student(); // 인스턴트 생성 후 위치를 s1 변수에 저장
		System.out.println(s1);
		
		Student s2 = new Student(); // 선언과 동시에 객체생성과 초기화
		System.out.println(s1 == s2);
		
		Teacher t1 = null; // 참조타입은 null로 초기화 가능
		if(t1 == null) {
			t1 = new Teacher();
		}
		System.out.println(t1);
		
		Teacher t2 = new Teacher();
		System.out.println(t2);
		System.out.println(t1 == t2);
	}

}
