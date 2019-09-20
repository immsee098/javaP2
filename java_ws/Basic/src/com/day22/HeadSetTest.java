package com.day22;

import java.util.TreeSet;

public class HeadSetTest {

	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<Integer>();
		
		int[] arr = {85,95,50,35,45,65,10,100};
		
		for(int i=0; i<arr.length; i++) {
			tset.add(arr[i]);
		}
		System.out.println(tset);
		System.out.println(tset.tailSet(50));
		System.out.println(tset.headSet(50));

	}

}
