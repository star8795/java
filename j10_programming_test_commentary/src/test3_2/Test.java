package test3_2;

public class Test {

	public static void main(String[] args) {
		
		// method가 호출된 시점에서 컴퓨터 시간정보를 이용해서
		// random한 실수를 0부터 1미만
		//0.00000000000000 ~ 0.999999999999999
		double result = Math.random();
		// 1 ~ 100까지의 랜덤한 정수
		// 0.0 ~ 99.999999
		// 0 ~ 99
		int randomNumber = (int)(result * 100) + 1;
		System.out.println(randomNumber);
		
		// 총합을 저장하는 변수 선언
		int sum = 0;
		
		// 10회 반복하는 반복문
		// i값이 0부터 10보다 작을 때 1씩 증가하면서 반복
		for(int i = 0; i < 10; i++) {
			// 1 ~ 100까지의 난수를 num이라는 변수에 저장
			int num = (int)(Math.random() * 100) + 1;
			// 반복하면서 발생된 난수를 콘솔에 줄바꿈하지 않고 공백을 추가하여 출력
			System.out.print(num+" ");
			sum = sum + num;
		} // end for
		
		System.out.println("난수 총합계 : " + sum);
		
	} // end main method
}


