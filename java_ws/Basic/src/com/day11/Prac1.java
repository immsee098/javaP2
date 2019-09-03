package com.day11;

public class Prac1 {

	public static void main(String[] args) {
		int[][] arr = new int[3][3]; 
	
		
		for(int i=0; i<arr.length; i++){
			System.out.println();
			for(int j=0; j<arr[i].length;j++) {
				if(i==j) {
					arr[i][j] = 1;
				}
				System.out.print(arr[i][j]+"\t");
			}
		}

	}

}
