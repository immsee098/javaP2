package com.day10;

public class Array2Prac1 {

	public static void main(String[] args) {
		String[][] arr;
		arr = new String[2][4];
		
		arr[0][0]="가";
		arr[0][1]="나";
		arr[0][2]="다";
		arr[0][3]="라";
		arr[1][0]="마";
		arr[1][1]="바";
		arr[1][2]="사";
		arr[1][3]="아";
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		
		String[][] arr2 = {{"a", "b"}, {"c", "d"}, {"e", "f"}};
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}
	}

}
