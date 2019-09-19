package com.day21;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		
		hset.add("first");
		hset.add("seconnd");
		hset.add("third");
		hset.add("first");
		
		System.out.println(hset.size());
		
		Iterator<String> iter = hset.iterator();
		
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}

	}

}
