package com.day10;

public class EnhancedPrac1 {

	public static void main(String[] args) {
		char[] arr = {'a', 'c', 'f', 'b'};
		
		for(char c : arr) {
			System.out.println(c);
		}
		
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		float[] arr2 = new float[2];
		arr2[0] = 2.3f;
		arr2[1] = 3f;
		
		for(float f : arr2) {
			System.out.println(f);
		}
		
		for(int i =0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
	}

}
