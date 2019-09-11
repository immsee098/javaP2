package com.day17;


public class ArrayExam {

	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int n : arr) {
			System.out.println(n);
		}
		
		Cat[] cat = new Cat[3];
		cat[0] = new Cat();
		cat[1] = new Cat();
		cat[2] = new Cat();
		for(int i =0; i<arr.length; i++) {
			cat[i].bark();
		}
		
		for(Cat n : cat) {
			n.bark();
		}

	}

}
