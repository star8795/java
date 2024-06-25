package test02;

public class Test03 {

	public static void main(String[] args) {
		int sum= 0;
		for(int i = 0; i < 10; i++) {
			// 1부터 100까지의 난수 생성
			int randomNumber = (int) (Math.random() * 100) + 1;
			// 생성된 난수 출력
			System.out.print(randomNumber + " ");
			// 생성된 난수를 합산
			sum += randomNumber;
		}
		System.out.println("난수 총합계 : " +sum);
	}

}
