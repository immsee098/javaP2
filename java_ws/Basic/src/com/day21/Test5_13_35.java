package com.day21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test5_13_35 {

	public static void main(String[] args) {
		HashMap<String, String> dict = new HashMap<String, String>();
		
		dict.put("school", "�б�");
		dict.put("girl", "�ҳ�");
		dict.put("boy", "�ҳ�");
		
		Set<String> kset = dict.keySet();
		Iterator<String> iter = kset.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			
			String val = dict.get(key);
			System.out.println(key+"=>"+val);
		}
	
	}

}
