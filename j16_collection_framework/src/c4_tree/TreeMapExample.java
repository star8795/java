package c4_tree;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(100, "최기근");
		map.put(15, "임꺽정");
		map.put(88, "이유리");
		map.put(97, "이다한");
		map.put(80, "김동하");
		System.out.println(map);
		
		// java.util.Map.Entry
		Entry<Integer, String> entry = null;
		
		entry = map.firstEntry();
		System.out.println("가장 앞에 있는 key entry : " + entry);
		
		entry = map.lastEntry();
		System.out.println("가장 마지막에 있는 key entry : " + entry);
		
		/*
		 * higherEntry(), lowerEntry(), ceilingEntry(), floorEntry();
		 */
		
		int  key = map.firstKey();
		System.out.println("첫번째 key : " + key);
		key = map.lastKey();
		System.out.println("마지막 key : " + key);
		
		// 역순으로 정렬된 새로운 맵
		Map<Integer,String> sortMap = map.descendingMap();
		System.out.println(sortMap);
		
		
	}

}