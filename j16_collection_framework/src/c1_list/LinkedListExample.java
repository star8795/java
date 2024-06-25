package c1_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Board{
	
	String subject;
	String content;
	String writer;
	
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
}

public class LinkedListExample {

	public static void main(String[] args) {
		// Board[] 
		List<Board>  arrayList = new ArrayList<>(); // import 추가
		List<Board> linkedList = new LinkedList<>(); // import 추가
		
		long startTime = 0;		// 작업 시작 시간
		long endTime = 0;		// 작업 종료 시간
		
		System.out.println("[ 추가 작업 ]");
		int size = 1000000;
		
		startTime = System.nanoTime();
		for(int i = 0; i < size; i++) {
			arrayList.add(0, new Board("제목","내용","최기근"));
		}
		endTime = System.nanoTime();
		System.out.println("array 추가 시간 : " +(endTime - startTime)+"ns");
		
		startTime = System.nanoTime();
		for(int i = 0; i < size; i++) {
			linkedList.add(0, new Board("제목","내용","최기근"));
		}
		endTime = System.nanoTime();
		System.out.println("linked 추가 시간 : " +(endTime - startTime)+"ns");
		
		System.out.println("[ 검색 작업 ]");
		
		startTime = System.nanoTime();
		for(int i = 0; i < size; i++) {
			arrayList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("list 검색 시간 : " +(endTime - startTime)+"ns");
		//   1127400ns
		//3239508500ns
		startTime = System.nanoTime();
		for(int i = 0; i < size; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("linked 검색 시간 : " +(endTime - startTime)+"ns");
		
	} // end main

}











