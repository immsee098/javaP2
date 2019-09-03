package com.day11;

public class JaggedArray {

	public static void main(String[] args) {
		//2차원 배열
		int[][] arr2 = new int[3][2];
		arr2[0][0] = 10;

		//가변배열
		int[][] arr = new int[3][];
		arr[0] = new int[4];
		arr[1] = new int[5];
		arr[2] = new int[3];
		
		//출력도 동일
		for (int i=0; i < arr.length; i++) { System.out.print("(" + i + ")번째 배열의 요소 : ");
		for (int j=0; j < arr[i].length; j++) System.out.print(arr[i][j] +" ");
		System.out.println();
		}//for
		
		
		int[][] arr3 = new int[2][];
		arr3[0] = new int[] {11,22,33};
		arr3[1] = new int[] {3, 2};
		
		for (int i=0; i < arr3.length; i++) {
			System.out.println();
		for (int j=0; j < arr3[i].length; j++) System.out.print(arr3[i][j] +"\t");
		}//for

	}

}
