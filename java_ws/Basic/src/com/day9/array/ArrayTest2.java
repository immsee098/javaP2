package com.day9.array;

public class ArrayTest2 {
		

	public static void main(String[] args) {
		//[1]
		//선언
		int[] arr;
		
		//메모리 할당
		arr = new int[3];
		
		//초기화
		arr[0] = 15;
		arr[1] = 26;
		arr[2] = 70;
		
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//[2]
		String[] arr2 = new String[2];
		arr2[0] = "java";
		arr2[1] = "jsp";
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
		char[] arr3 = {'o','r','a','c','l','e'};
		
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]+ " ");
		}
		

	}

}
