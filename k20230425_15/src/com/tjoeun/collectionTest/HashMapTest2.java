package com.tjoeun.collectionTest;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapTest2 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hmap = new HashMap<>();
		
		hmap.put("apple", 1000);
		hmap.put("banana", 2000);
		hmap.put("orange", 3000);
		hmap.put("melon", 20000);
		hmap.put("watermelon", 15000);
		System.out.println(hmap.size() + ": " + hmap);

//		keySet() 메소드는 HashMap에 저장된 데이터의 key만 얻어온다.
		System.out.println(hmap.keySet());
//		values() 메소드는 HashMap에 저장된 데이터의 key만 얻어온다.
		System.out.println(hmap.values());
		
//		HashMap에 저장된 데이터의 key만 얻어와서 ArrayList에 저장하기
		ArrayList<String> list = new ArrayList<>();
		for(String str : hmap.keySet()) {
			list.add(str);
		}
		System.out.println(list);
		
//		HashMap에 저장된 데이터의 value만 얻어와서 ArrayList에 저장하기
		ArrayList<Integer> list2 = new ArrayList<>();
		for(Integer key : hmap.values()) { // Integer key 혹은 int key 둘 다 된다.
			list2.add(key);
		}
		System.out.println(list2);
		
		
//		HashMap에 저장된 데이터의 key를 이용해서 value를 얻어와서 ArrayList에 저장하기
		ArrayList<Integer> list3 = new ArrayList<>();
		for(String key : hmap.keySet()) {
			list3.add(hmap.get(key));
		}
		System.out.println(list3);

		
	}
}
