package com.java0923;

import java.util.Iterator;
import java.util.TreeSet;

public class Test1 {

	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<Integer>();
	
		for(int i=0; i<10; i++) {
			int num = (int)(Math.random()*45+1); 
			lotto.add(num);
			if(lotto.size()==6) {
				break;
			}
		}
		Iterator<Integer> itr=lotto.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			}
		
		
		String str = "010-100-3000";
		String[] word = str.split("-");
		for(String n:word) {
			System.out.println(n);
		}
		
		}
	}

