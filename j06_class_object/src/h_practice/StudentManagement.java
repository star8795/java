package h_practice;

import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		// 학생 정보를 저장할 배열
		Student[] students = null;
		
		while(true) {
			System.out.println("=======================================");
			System.out.println("1. 학생수|2. 정보입력|3. 정보확인|4. 분석|5. 종료");
			System.out.println("=======================================");
			System.out.println("실행하여 결과를 볼 메뉴번호를 입력해주세요.(1 ~ 5번)");
			int selectNo = sc.nextInt();
			/*
			 1. 학생수를 입력받아 Student객체가 저장될 student배열 생성
			 	- 입력받은 학생 수만큼의 크기를 가짐.
			 2. 생성된 student 배열의 항목 수만큼(배열의 크기만큼) 학생의 정보를 입력받아
			 	student객체를 생성하여 저장하고 배열 항목에 저장
			 	-int(number), String(name), int(score), sc.next(); // console을 통해 문자열 입력받음
			 3. student 배열에 저장된 학생들의 정보를 출력(field 정보 출력)
			 4. 1.students 배열에 저장된 학생들의 점수를 전체합계, 평균을 구해서 출력
			 	2.students 배열에 저장된 학생들의 점수를 연산하여 최고득점자 이름, 최저득점자 이름을 출력
			 5. 프로그램 종료
			 */
			
			switch(selectNo) {
            case 1:
                System.out.println("학생 수를 입력하세요:");
                int studentCount = sc.nextInt();
                students = new Student[studentCount];
                break;
            case 2:
                if(students == null) {
                    System.out.println("학생 수를 먼저 입력하세요.");
                    break;
                }
                for(int i = 0; i < students.length; i++) {
                    System.out.println("학생 정보를 입력하세요(학번 이름 점수 순서로 입력):");
                    int number = sc.nextInt();
                    String name = sc.next();
                    int score = sc.nextInt();
                    students[i] = new Student(number, name, score);
                }
                break;
            case 3:
                if(students == null) {
                    System.out.println("학생 정보가 없습니다.");
                    break;
                }
                System.out.println("학생 정보를 확인합니다:");
                for(Student student : students) {
                    System.out.println(student.getInfo());
                }
                break;
            case 4:
                if(students == null) {
                    System.out.println("학생 정보가 없습니다.");
                    break;
                }
                int totalScore = 0;
                int highestScore = Integer.MIN_VALUE;
                int lowestScore = Integer.MAX_VALUE;
                String highestScorer = "";
                String lowestScorer = "";

                for(Student student : students) {
                    int score = student.score;
                    totalScore += score;
                    if(score > highestScore) {
                        highestScore = score;
                        highestScorer = student.name;
                    }
                    if(score < lowestScore) {
                        lowestScore = score;
                        lowestScorer = student.name;
                    }
                }

                double averageScore = (double) totalScore / students.length;

                System.out.println("전체 합계: " + totalScore);
                System.out.println("평균: " + averageScore);
                System.out.println("최고 점수: " + highestScore + " (최고 점수자: " + highestScorer + ")");
                System.out.println("최저 점수: " + lowestScore + " (최저 점수자: " + lowestScorer + ")");
                break;
            case 5:
                System.out.println("프로그램을 종료합니다.");
                sc.close(); // 스캐너 닫기
                System.exit(0);
                break;
            default:
                System.out.println("잘못된 입력입니다. 1 ~ 5 사이의 숫자를 입력해주세요.");
				}
			}
		
		} // end main

} // end StudentManagement class
		/*
		Student s1 = new Student();
		s1.number = 1;
		s1.name = "김동찬";
		s1.score = 100;
		
		System.out.println(s1.getInfo());
		
		Student s2 = new Student(2,"이다한",98);
		String info = s2.getInfo();
		System.out.println(info);
		*/