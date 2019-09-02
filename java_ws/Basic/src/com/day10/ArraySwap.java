package com.day10;

public class ArraySwap {

	public static void main(String[] args) {
		//배열의 변수의 복사를 이용해서 배열 swap
		int[] arr = {70,80,90};
		int[] copy = {1, 5, 8, 3};

		System.out.println("----arr배열의 요소----");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+"\t");
		}
		
		System.out.println("----copy배열의 요소----");
		for(int i=0; i<copy.length; i++) {
			System.out.println(copy[i]+"\t");
		}
		
		//swap
		int[] temp = arr;
		arr = copy;
		copy = arr;
		copy = temp;
		
		System.out.println("----swap 후 arr배열의 요소----");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+"\t");
		}
		
		System.out.println("----swap 후 00000000000000copy배열의 요소----");
		for(int i=0; i<copy.length; i++) {
			System.out.println(copy[i]+"\t");
		}
	}

}
