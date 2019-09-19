package com.day21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Test4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>(4);
		
		for(int i=1; i<ar.size()+1; i++) {
			ar.add(new Integer(i));
		}
		
//		ar.add(1);
//		ar.add(2);
//		ar.add(3);
//		ar.add(4);
		
		System.out.println("----ArrayListÀÌ¿ë----");
		
		for(int i=0; i<ar.size(); i++) {
			int a = ar.get(i);
			System.out.println(a);
		}
		
		
		HashSet<Integer> hs = new HashSet<Integer>(4);
		
		for(int i=0; i<hs.size(); i++) {
			hs.add(5);
		}

		Iterator<Integer> iter2 = hs.iterator();
		
		while(iter2.hasNext()) {
			int b = iter2.next();
			System.out.println(b);
		}
		
	}

}
