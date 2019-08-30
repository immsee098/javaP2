package com.day9.array;

public class ArrayPrac1 {

	public static void main(String[] args) {
		float [] arr = {12.5f, -24.3f, 0.76f};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		double[] arr2;
		arr2 = new double[4];
		arr2[0]=10;
		arr2[1]=98;
		arr2[2]= 56;
		arr2[3]= 62;
		
		double sum = 0;
		for(int i=0; i<arr2.length; i++) {
			sum += arr2[i];
		}
		
		System.out.println("ÃÑÁ¡ : " + sum);
		System.out.println("Æò±Õ : " + (sum/arr2.length));

	}

}
