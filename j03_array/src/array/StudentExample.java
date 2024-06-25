package array;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		System.out.println("Main START");
		
		Scanner sc = new Scanner(System.in);
		
		// 프로그램 종료 flag
		boolean isRun = true;
		
		// 학생들의 점수를 저장할 배열
		int[] scores = null;
		
		while(isRun) {
			System.out.println("====================================");
			System.out.println("1.학생수|2.점수입력|3.전체점수|4.분석|5.종료");
			System.out.println("====================================");
			System.out.println("선택하실 기능의 번호를 입력하시오 > ");
			int selectNo = sc.nextInt();
			System.out.println("선택하신 번호는 " + selectNo + "번 입니다.");
			/*
				1. 학생수
					점수를 입력할 학생수를 입력받음
			 		입력받은 학생수 만큼 배열을 생성하여 scores에 저장
			 		
			 	2. 1번에서 생성된 학생 수만큼 학생의 점수를 입력받아
			 		scores배열의 각 항목에 저장(0 ~ scores.length -1)
			 		
			 	3. scores 배열에 저장된 각 학생의 점수를 출력
			 	
			 	4. 분석 - scores 배열에 저장된 학생의 점수를 계산하여
			 			전체 총점, 평균, 최고점수, 최저점수 출력
			 			
			 	5. while문을 종료하여 프로그램 종료
			 */
			
			switch(selectNo) {
			case 1 :
				System.out.println("학생수를 입력하세요");
				int numStudents = sc.nextInt();
				scores = new int[numStudents];
				break;
			case 2 :
				if(scores == null) {
					System.out.println("학생수를 먼저 입력하세요");
					break;
				}
				for(int i = 0; i < scores.length; i++) {
					System.out.println((i+1) + "번째 학생의 점수를 입력해주세요");
					scores[i] = sc.nextInt();
				}
				break;
			case 3 :
			    if (scores == null) {
                    System.out.println("학생수를 먼저 입력하세요.");
                    break;
                }
                System.out.println("전체 학생의 점수는 다음과 같습니다:");
                for (int i = 0; i < scores.length; i++) {
                    System.out.println((i+1) + "번째 학생: " + scores[i]);
                }
                break;
			case 4 : 
				if(scores == null) {
					System.out.println("학생수를 먼저 입력하세요.");
					break;
				}
				int sum = 0;
				int max = Integer.MIN_VALUE;
				int min = Integer.MAX_VALUE;
				for(int score : scores) {
					sum += score;
					if(score > max) {
						max = score;
					}
					if(score < min) {
						min = score;
					}
				}
				double average = (double)sum / scores.length;
				System.out.println("총점" + sum);
				System.out.println("평균" + average);
				System.out.println("최고점수 : " + max);
				System.out.println("최저점수 : " + min);
				break;
			case 5 :
				isRun = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		} // end while
		
		System.out.println("Main END");
	} // end main
} // end class