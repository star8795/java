package guide_answer.practice02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CapitalQuiz {
	
	private List<Nation> store = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	/**
	 * 객체 생성시 store ArrayList에 8개의 국가에 대한 기본적인 정보 입력 
	 */
	public CapitalQuiz() {
		store.add(new Nation("대한민국", "서울"));
		store.add(new Nation("그리스", "아테네"));
		store.add(new Nation("중국", "베이징"));
		store.add(new Nation("미국", "워싱턴"));
		store.add(new Nation("영국", "런던"));
		store.add(new Nation("프랑스", "파리"));
		store.add(new Nation("독일", "베를린"));
		store.add(new Nation("스페인", "마드리드"));
	}
	
	/**
	 * 수도 맞추기 게임 시작
	 */
	public void run() {
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		while(true) {
			System.out.println("입력 : 1, 퀴즈 : 2, 종료 : 3");
			int menu = sc.nextInt();
			switch(menu) {
				case 1 :
					// 국가별 수도 정보 추가
					input();
					break;
				case 2 : 
					// 국가 이름으로 수도 정보 맞추기
					quiz();
					break;
				case 3 : 
					System.out.println("게임을 종료합니다.");
					return;
				default :
					System.out.println("잘못된 입력입니다.");
			}
		}
	}
	
	/**
	 * 국가 등록 - 국가 이름, 수도 이름 Nation 정보 등록 
	 */
	private void input() {
		System.out.println("국가 이름을 입력하세요");
		String country = sc.next();
		System.out.println("수도 이름을 입력하세요");
		String capital = sc.next();
		
		for(Nation nation : store) {
			if(nation.getCountry().equals(country));{
				System.out.println("이미 존재하는 국가입니다.");
				return;
			}
		}
		
		store.add(new Nation(country, capital));
		System.out.println("국가와 수도가 추가되었습니다.");
		
	}
	
	/**
	 * 국가 별 수도 이름 맞추기 게임 
	 */
	private void quiz() {
		int score = 0;
		for(Nation nation : store) {
			System.out.println(nation.getCountry() + "의 수도는? ");
			String answer = sc.next();
			if(nation.getCapital().equals(answer)) {
				System.out.println("정답입니다.");
				score++;
			}else {
				System.out.println("틀렸습니다. 정답은 " + nation.getCapital() + "입니다.");
			}
		}
		
		System.out.println("퀴즈가 끝났습니다. 점수 : " + score + "/" + store.size());
		
	}

	public static void main(String[] args) {
		CapitalQuiz quize = new CapitalQuiz();
		quize.run();
	}

}