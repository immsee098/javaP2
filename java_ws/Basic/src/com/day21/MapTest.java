package com.day21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>(5);
		
		map.put(10, "홍길동");
		map.put(7, "김길동");
		map.put(12, "이길동");
		
		System.out.println("데이터 개수:"+map.size());
		
		Set<Integer> kset = map.keySet();
		System.out.println(kset);
		Iterator<Integer> iter = kset.iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			
			String val = map.get(key);
			System.out.println(key+"=>"+val);
		}
		
		//삭제
		map.remove(7); //key가 7 삭제
		String value = map.get(7);
		System.out.println("key 7의 요소:"+value);
		System.out.println("key 10의 요소:"+map.get(10));
		
		Iterator<Integer> iter2 = map.keySet().iterator();
		while(iter2.hasNext()) {
			int key = iter2.next();
			String val = map.get(key);
			System.out.println(key+"  :  "+ val);
		}
	}

}
