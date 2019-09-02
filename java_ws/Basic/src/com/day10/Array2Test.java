package com.day10;

public class Array2Test {

	public static void main(String[] args) {
		// 2차원 배열
		// [1]
		// 배열 선언
		int[][] arr;
		
		//메모리할당
		arr = new int[2][3]; //2행 3열
		
		//초기화
		arr[0][0]=10;
		arr[0][1]=30;
		arr[0][2]=24;
		arr[1][0]=50;
		arr[1][1]=60;
		arr[1][2]=88;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]+"\t");
			}
			System.out.println();
		}

		// [2]
		//배열의선언과 메모리 할당을 동시에
		int[][] arr2 = new int[3][2];
		
		//int arr3 [][]; //가능
		//int[] arr4[]; //가능
		
		// [3] 배열선언, 메모리할당, 초기화도 모두 동시에
		int[][] arr3 = {{1,3,4}, {3,6,7}, {4,8,3},{3,6,9}}; //4행 3열
		
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				System.out.println(arr3[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("행의 개수: " +arr3.length);
		System.out.println("열의 개수: " +arr3[0].length);
	}

}
