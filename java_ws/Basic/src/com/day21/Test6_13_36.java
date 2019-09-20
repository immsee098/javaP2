package com.day21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test6_13_36 {

	public static void main(String[] args) {
		ArrayList<Character> ar = new ArrayList<Character>();
		
		for(int i='a'; i<'z'; i++) {
			char alpha = (char)i;
			ar.add(new Character(alpha));
		}
		System.out.println("----ArrayList 이용----");
		for(Character n: ar) {
			System.out.print(n + " ");
		}
		
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		for(int i='a'; i<='z'; i++) {
			String s = Character.toString((char)i);
			hm.put(new Integer(i), s);
		}
		Set<Integer> kset = hm.keySet();
		Iterator<Integer> iter = kset.iterator();
		System.out.println("\n\n----HashMap 이용----");
		while(iter.hasNext()) {
			int key = iter.next();
			String val = hm.get(key);
			System.out.print(val + " ");
		}
		
		HashSet<String> hs = new HashSet<String>();
		
		for(int i='a'; i<='z'; i++) {
			String s = Character.toString((char)i);
			hs.add(s);
		}
		
		System.out.println("\n\n----HashSet 이용----");
		Iterator<String> iter2 = hs.iterator();
		
		while(iter2.hasNext()) {
			String al = iter2.next();
			System.out.print(al + " ");
		}
		

	}

}
