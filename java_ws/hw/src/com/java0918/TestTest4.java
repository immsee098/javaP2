package com.java0918;

public class TestTest4 {

	public static void main(String[] args) {
		int[] arr = new int[7];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
			sum += arr[i];
		}
		
		for(int n : arr) {
			System.out.println(n);
		}
		System.out.println("รัวี:"+sum);

	}

}
