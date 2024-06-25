package a_object.hashcode;

import java.util.HashSet;

public class KeyExample {

	public static void main(String[] args) {
		
		Key key1 = new Key(1);
		Key key2 = new Key(2);
		Key key3 = new Key(1);
		
		System.out.println("key1 : " + key1.hashCode());
		System.out.println("key2 : " + key2.hashCode());
		System.out.println("key3 : " + key3.hashCode());
		
		// 나중에 배움
		// java.util.HashSet
		HashSet<Key> set = new HashSet<>();
		set.add(key1);
		System.out.println("----------");
		set.add(key2);
		System.out.println("----------");
		set.add(key3);
		System.out.println(set);
	}

}
