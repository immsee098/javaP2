package com.day21;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<Float> alist = new ArrayList<Float>(3);
		alist.add(2.34f);
		alist.add(2f);
		alist.add(4.56f);
		for(int i=0; i<alist.size();i++) {
	
			System.out.println(alist.get(i));
		}
			
	}

}
