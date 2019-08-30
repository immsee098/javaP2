package com.day9.array;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		// for문 안에서 배열 초기화
		// 5, 10, 15, 20, 25
		int[] arr = new int[5];
		
		//초기화
		for(int i=0; i<arr.length; i++) {
			arr[i]=5*(i+1);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//사용자로부터 입력받은 실수를 배열에 넣기
		
		double[] darr = new double[3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("실수 4개를 입력하세요");
		
		for(int i=0; i<darr.length; i++) {
			darr[i]=sc.nextDouble();
		}
		
		//출력
		for(int i =0; i<darr.length; i++) {
			System.out.println(darr[i]+'\t');
		}

	}

}
