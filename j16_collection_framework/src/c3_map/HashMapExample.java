package c3_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// <Key Type, Value Type>
		Map<String, Integer> map = new HashMap<>();
		map.put("최기근", 100);	// 100이라는 정수값이 자동 박싱 
		map.put("김동하", 59);
		map.put("정승진", 97);
		map.put("서석희", 89);
		System.out.println(map);
		map.put("최수빈", 70);
		System.out.println(map);
		
		int score = map.get("최기근");
		System.out.println("최기근 점수 : " + score);
		int size = map.size();
		System.out.println("저장된 entry 크기 : " + size);
		
		Integer scores = map.get("김동화");	// null
		System.out.println("김동화 점수 : " + scores);
		
		// 매개변수로 전달된 key값과 일치하는 entry 삭제
		map.remove("최수빈");
		System.out.println(map);
		
		// 동일한 key 값을 가진 entry 추가
		map.put("최기근", 95);
		System.out.println(map);
		
		boolean isChecked =  map.containsKey("서석희");
		System.out.println("key 서석희 존재 여부 : " + isChecked);
		
		isChecked = map.containsValue(100);
		System.out.println("value 100 존재 여부 : " + isChecked);
		
		System.out.println("Map 객체의 저장 데이터 순회 ");
		// java.util.Map.Entry import
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		
		// java.util.Iterator
		Iterator<Entry<String,Integer>> iterator = entrySet.iterator();
		
		while(iterator.hasNext()) {
			Entry<String,Integer> entry = iterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+":"+value);
		}
		System.out.println(map);
		
		System.out.println("==============================");
		
		// map 객체의 key 묶음
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			
			int value = map.get(key);
			
			System.out.printf("key : %s = value : %d,",key,value);
		}
		System.out.println();
		
		System.out.println("=====================");
		
		Collection<Integer> values = map.values();
		
		int total = 0;
		
		for(Integer i : values) {
			// value 에 저장된 점수를 total 변수에 합산
			total += i;
		}
		System.out.println("총점 : " + total);
		// 평균
		size = map.size();
		System.out.println("size : " + size);
		double avg = total / (double)size;
		System.out.println(avg);
		
		// 전체 entry 삭제
		map.clear();
		
		System.out.println("isEmpty : " + map.isEmpty());
		
	}

}
