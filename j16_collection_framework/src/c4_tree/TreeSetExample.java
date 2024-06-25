package c4_tree;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(87);	// 자동 boxing
		treeSet.add(75);
		treeSet.add(90);
		treeSet.add(80);
		treeSet.add(87); // 중복 , 저장에서 제외
		System.out.println(treeSet);
		
		int score = 0;
		// [75, 80, 87, 90]
		score = treeSet.first();
		System.out.println("treeSet 첫번째 값 : " + score);	// 최소값
		
		score = treeSet.last();
		System.out.println("treeSet 마지막 값 : " + score);	// 최대값		
		
		score = treeSet.lower(87);
		System.out.println("87보다 낮은 수(바로 아래) : " + score); // 80
		
		score = treeSet.higher(87);
		System.out.println("87보다 높은 수(바로 위) : " + score);  // 90
		
		score = treeSet.floor(85);
		System.out.println("85이거나 그 아래 수 : " + score);	   // 80
		
		score = treeSet.ceiling(85);
		System.out.println("85이거나 그 위의 수 : " + score);	   // 87
		
		// [75, 80, 87, 90]
		score = treeSet.pollFirst();
		System.out.println("첫번째 값을 꺼내오고 set에서는 삭제 : " + score);
		System.out.println(treeSet); // [80, 87, 90]		
		
		score = treeSet.pollLast();
		System.out.println("마지막 값을 꺼내오고 set에서는 삭제 : " + score);
		System.out.println(treeSet); // [80, 87]
		
		treeSet.add(75);
		treeSet.add(90);
		System.out.println(treeSet);
		
		// [75, 80, 87, 90]
		// 범위 검색 - headSet() - 매개변수로 전달된 값보다 이전의 항목으로 새로운 set 생성
		Set<Integer> newSet = treeSet.headSet(81);
		System.out.println(newSet);
		
		// 81 이후의 항목으로 새로운 Set 생성
		newSet = treeSet.tailSet(81);
		System.out.println(newSet);
		
		// 81이후 88이전 특정 위치의 항목으로 새로운 Set 생성
		newSet = treeSet.subSet(81, 88);
		System.out.println(newSet);
		
		// 정렬 method
		// 역순으로 값을 꺼내올 수 있는 반복자 제공
		// Ascending : 오름차순
		// Descending : 내림차순
		// Iterator import
		Iterator<Integer> itr = treeSet.descendingIterator();
		while(itr.hasNext()) {
			int i = itr.next();
			System.out.print(i+" ");
		}// end while
		
		System.out.println();
		
		// 역순으로 정렬된 Set 반환
		Set<Integer> descSet = treeSet.descendingSet();
		System.out.println(descSet);
		
	} 

}