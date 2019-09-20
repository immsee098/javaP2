package com.java0919;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<Float> arr = new ArrayList<Float>(4);
		
		for(int i=0; i<4; i++) {
			arr.add((float)(i+1.7));
		}
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		for(Float n: arr) {
			System.out.println(n);
		}

	}

}
