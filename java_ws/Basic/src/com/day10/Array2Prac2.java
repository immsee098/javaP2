package com.day10;

public class Array2Prac2 {

	public static void main(String[] args) {
		String[] arr = new String[4];
		arr[0] = "봄";
		arr[1] = "여름";
		arr[2] = "가울";
		arr[3] = "겨울";
		
		for(String n : arr) {
			System.out.println(n);
		}
		
		double[][] arr2 = {{10.1, 10.2}, {10.3, 10.4}, {10.5, 10.6}};
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}
		
		double[] arr3 = {10.1, 10.2, 10.3, 10.4, 10.5, 10.6};
		for(double n : arr3) {
			System.out.print(n + " ");
		}
	}

}
