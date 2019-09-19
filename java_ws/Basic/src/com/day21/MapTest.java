package com.day21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>(5);
		
		map.put(10, "ȫ�浿");
		map.put(7, "��浿");
		map.put(12, "�̱浿");
		
		System.out.println("������ ����:"+map.size());
		
		Set<Integer> kset = map.keySet();
		System.out.println(kset);
		Iterator<Integer> iter = kset.iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			
			String val = map.get(key);
			System.out.println(key+"=>"+val);
		}
		
		//����
		map.remove(7); //key�� 7 ����
		String value = map.get(7);
		System.out.println("key 7�� ���:"+value);
		System.out.println("key 10�� ���:"+map.get(10));
		
		Iterator<Integer> iter2 = map.keySet().iterator();
		while(iter2.hasNext()) {
			int key = iter2.next();
			String val = map.get(key);
			System.out.println(key+"  :  "+ val);
		}
	}

}
