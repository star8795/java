package array;

public class ArrayRefExample {

	public static void main(String[] args) {
		// 배열 선언과 동시에 초기화
		int[] scores = new int[]{70,60,50,40,60,60};
		//	0	1	2	3	4	5
		// [70][60][50][40][60][60]
		// 배열의 시작 인덱스 번호 : 0
		// 할당된 배열의 마지막 인덱스 번호 : 배열의 항목 크기 - 1
		//								5
		System.out.println(scores.length);
		// scores 배열의 0번째 인덱스를 가진 항목의 값을 80으로 변경
		scores[0] = 80;
		// [80][60][50][40][60][60]
		
		int score = scores[0];
		System.out.println(score);
		
		int [] scores2 = null;
		if(scores2 == null) {
			scores2 = scores;
		}
		System.out.println(scores2 == scores);
		scores2[1] = 70;
		System.out.println(scores[1]);
		
		int a = 10;
		int b = 20;
		
		b = a;
		b = 30;
		System.out.println(a);
		System.out.println(b);
		
		char chars[] = new char[26];
		// 0 ~ 65535 양의 정수
		char c = 'A'; // 65,	'a' == 97
		for(int i = 0; i < chars.length; i++, c++) {
			chars[i] = c;
		}
		
		for(int i = 0; i < chars.length; i++) {
			System.out.println(chars[i] + " ");
		}
		System.out.println();
		
		// 향상된 for문
		for(char cha : chars) {
			System.out.print("["+cha+"]");
		}
		System.out.println();
		
		// 실수 타입
		// 8byte의 실수를 3개를 저장하는 배열 생겅
		double[] doubles = new double[3];
		doubles[1] = 3.141592;
		for(double d : doubles) {
			System.out.println(d+" ");
		}
		System.out.println();
		
		// 논리 타입
		boolean[] tasks = new boolean[5];
		for(boolean bool : tasks) {
			System.out.println(bool+" ");
		}
		System.out.println();
		
		// 참조 타입
		String[] strs = new String[3];
		//[null][null][null]
		String subject = new String("java");
		strs[1] = subject;
		// [null]["java"][null]
		for(String s : strs) {
			System.out.println(s+" ");
		}
		System.out.println();
		
		// 다차원 배열 - 참조 타입
		// 2차원 배열의 선언
		// int[][] arrays;
		// int arrays[][];
		// 배열 안에 int type의 배열을 저장
		int[] arrays[] = new int[3][];
		
		for(int[] arr : arrays) {
			System.out.println(arr+" ");
		}
		System.out.println();
		
		arrays[0] = new int[4];
		arrays[1] = new int[3];
		arrays[2] = new int[3];
		
		int num = arrays[0][0];
		/*
			arrays[0]	[0][0][0][0] int[]
			arrays[1]	[0][0][0]	 int[]
			arrays[2]   [0][0][0]  	 int[]
		 */
		
		int[][] arrays2 = new int[2][3];
		// arrays2
		// 0 1
		// [][]
		
		for(int i = 0; i < arrays2.length; i++) {
			System.out.println(arrays2[i]);
			for(int j = 0; j < 3; j++) {
				System.out.println(arrays[i][j]);
			}
			
			/*
			System.out.println(arrays[i][0]);
			System.out.println(arrays[i][1]);
			System.out.println(arrays[i][2]);
			*/
		}// 이차원 배열의 각 항목 순회
		// 이차원 배열의 선언과 동시에 초기화
		int[][] scoresArray = new int[][]{//scroesArray.length : 2};
			{10, 20, 30},			 	  //scoresArray[]0.length : 3
			{70, 80, 90, 100}			  //scoresArray[]0.length : 4
		};
		
		for(int i = 0; i < scoresArray.length; i++) {
			System.out.println(scoresArray[i]+" ");
			for(int j = 0; j < scoresArray[i].length; j++) {
				System.out.println(scoresArray[i][j]+" ");
			}
			System.out.println();
		

			
			
		}
	}// end main

}// end class
