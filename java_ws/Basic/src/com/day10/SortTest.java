package com.day10;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		// 배열 요소 정렬 - 오름차순 정렬
		// public static void sort(int[] a)
		
		int[] arr = {55,36,44,78,99,21,3};
		
		for(int n : arr) {
			System.out.println(n+"\n");
		}
		
		//정렬
		Arrays.sort(arr);
		
		System.out.println("\n\n----정렬후-----");
		
		for(int n : arr) {
			System.out.println(n+"\n");
		}		

	}

}
